/**  
 * @Description:认购流程枚举类
 * @author alber
 * @date 2020年2月25日 下午5:43:12  
 */
package com.fof.enums;
public enum FirstBuyFlowEnum {
	/**  认购信息已提交 **/
	BUY_INFOS(2010,"认购信息已提交"),
	/**  材料信息已提交 **/
	MATERIALS_COMMIT(2020,"材料信息已提交"),
	/** 客户信息填写完成 **/
	CLIENT_INFO(2030,"客户信息填写完成"),
	/** 客户信息填写完成 **/
	MANAGE_CHECK(2040,"管理人审核通过"),
	/** 管理人审核不通过 **/
	MANAGE_NO_CHECK(2045,"管理人审核不通过"),
	/** 风险揭示书签署完成 **/
	RISK_DISCLOSURE(2050,"风险揭示书签署完成"),
	/** 合同协议书签署完成 **/
	CONTRACT_AGREEMENT(2060,"合同协议书签署完成"),
	/** OA流程已完成 **/
	OA_COMPLETE(2070,"OA流程已完成"),
	/** 统一审核用印已完成  **/
	SEAL_COMPLETE(2080,"统一审核用印已完成 "),
	/** 打款信息已完成  **/
	REMIT_COMPLETE(2090,"打款信息已完成"),
	/** 运营划款完成  **/
	TRANSFER_MONEY(2100,"运营划款完成"),
	/** 管理人确权完成 **/
	MANAGE_CONFORM(2200,"管理人确权完成"),
	
	
	;
	FirstBuyFlowEnum(Integer codeValue,String codeText){
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
