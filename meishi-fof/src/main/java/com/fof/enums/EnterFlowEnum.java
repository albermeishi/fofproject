/**  
 * @Description:准入流程枚举类
 * @author zhaohy
 * @date 2020年2月25日 下午5:43:12  
 */
package com.fof.enums;
public enum EnterFlowEnum {
	/**  准入信息流程 **/
	BASE_INFO_COMPLETE(1010,"基本信息填写完成"),
	/**  材料信息已提交 **/
	ENTER_CHECK(1020,"准入申请审核通过"),
	/** 客户信息填写完成 **/
	ENTER_NO_CHECK (1030,"申请已拒绝"),
	/** 客户信息填写完成 **/
	COMPANY_IMPOWER(1040,"公司基础准入资料授权已完成"),
	/** 风险揭示书签署完成 **/
	PRODUCT_IMPOWER(1050,"产品准入资料授权已完成"),
	/** 合同协议书签署完成 **/
	COMPANY_IMPOWER_CHECK(1060,"管理人资料评分审核通过"),
	/** OA流程已完成 **/
	COMPANY_IMPOWER_NO_CHECK(1070,"管理人资料评分审核不通过"),
	/** 统一审核用印已完成  **/
	PRODUCT_IMPOWER_CHECK(1080,"基金评分审核通过 "),
	/** 打款信息已完成  **/
	PRODUCT_IMPOWER_NO_CHECK(1090,"基金评分审核不通过"),
	/** 运营划款完成  **/
	CONFORM_ENTER_WAY(1100,"确认准入方式"),
	/** 管理人确权完成 **/
	OA_COMPLETE(1200,"OA流程已完成"),


	;
	EnterFlowEnum(Integer codeValue, String codeText){
		this.codeValue = codeValue;
		this.codeText = codeText;
	}
	
	private Integer codeValue;
	
	private String codeText;

	public Integer getCodeValue() {
		return codeValue;
	}

	public String getCodeText() {
		return codeText;
	}
}
