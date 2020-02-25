package com.fof.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.Set;

/**
 * HttpClientUtil
 */
public class HttpClientUtil {

    private static Logger logger = Logger.getLogger(HttpClientUtil.class);

    public static String doPost(String url, Map<String, String> params, String charset) throws UnknownHostException {
        StringBuilder response = new StringBuilder();
        HttpClient client = new HttpClient();
        PostMethod method = new PostMethod(url);
        InetAddress addr = InetAddress.getLocalHost();
        // 设置Http Post数据
        method.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=" + charset);
        method.setRequestHeader("X-Real-IP", String.valueOf(addr));
        if (params.containsKey("token")) {
            method.setRequestHeader("token", params.get("token"));
        }
        if (params != null) {
            Set<Map.Entry<String, String>> entrySet = params.entrySet();
            NameValuePair[] param = new NameValuePair[entrySet.size()];
            int i = 0;
            for (Map.Entry<String, String> entry : entrySet) {
                param[i] = new NameValuePair(entry.getKey(), entry.getValue());
                i++;
            }
            method.setRequestBody(param);
        }
        InputStream responseBodyStream = null;
        InputStreamReader streamReader = null;
        BufferedReader reader = null;
        try {
            client.executeMethod(method);
            if (method.getStatusCode() == HttpStatus.SC_OK) {
                responseBodyStream = method.getResponseBodyAsStream();
                streamReader = new InputStreamReader(responseBodyStream, charset);
                reader = new BufferedReader(streamReader);
                String line;
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
            }
        } catch (IOException e) {
            logger.error("执行HTTP Post请求" + url + "时，发生异常！", e);
        } finally {
            try {
                responseBodyStream.close();
                streamReader.close();
                reader.close();
            } catch (Exception e) {
                logger.error("执行HTTP Post请求" + url + "时，发生异常，关闭流异常！", e);
                e.printStackTrace();
            }
            method.releaseConnection();
        }
        return response.toString();
    }
}

