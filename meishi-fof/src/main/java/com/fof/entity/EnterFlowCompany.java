package com.fof.entity;

import java.io.Serializable;
import java.util.Date;

public class EnterFlowCompany implements Serializable {
    private Long id;

    private Long tagId;

    private Long enterFlowId;

    private String companyName;

    private String companyAddress;

    private Date foudDate;

    private Date registrationDate;

    private String legalPerson;

    private Integer regesterMoney;

    private Integer employeeNumber;

    private Integer manageScale;

    private Integer productScale;

    private Integer productNumber;

    private String webSite;

    private String awardDescribe;

    private String conactName;

    private String conactDuty;

    private String conactMobile;

    private Date createTime;

    private Date updateTime;
    private String companyProfile;

    /**
	 * @return the companyProfile
	 */
	public String getCompanyProfile() {
		return companyProfile;
	}


	public void setCompanyProfile(String companyProfile) {
		this.companyProfile = companyProfile;
	}

	/**
	 * @return the companyInvestment
	 */
	public String getCompanyInvestment() {
		return companyInvestment;
	}

	/**
	 * @param companyInvestment the companyInvestment to set
	 */
	public void setCompanyInvestment(String companyInvestment) {
		this.companyInvestment = companyInvestment;
	}

	/**
	 * @return the comapnyProcess
	 */
	public String getComapnyProcess() {
		return comapnyProcess;
	}

	/**
	 * @param comapnyProcess the comapnyProcess to set
	 */
	public void setComapnyProcess(String comapnyProcess) {
		this.comapnyProcess = comapnyProcess;
	}

	/**
	 * @return the companyRisk
	 */
	public String getCompanyRisk() {
		return companyRisk;
	}

	/**
	 * @param companyRisk the companyRisk to set
	 */
	public void setCompanyRisk(String companyRisk) {
		this.companyRisk = companyRisk;
	}

	/**
	 * @return the tradingSystem
	 */
	public String getTradingSystem() {
		return tradingSystem;
	}

	/**
	 * @param tradingSystem the tradingSystem to set
	 */
	public void setTradingSystem(String tradingSystem) {
		this.tradingSystem = tradingSystem;
	}

	private String companyInvestment;

    private String comapnyProcess;

    private String companyRisk;

    private String tradingSystem;
    private static final long serialVersionUID = 1L;

    public EnterFlowCompany(Long id, Long tagId, Long enterFlowId, String companyName, String companyAddress, Date foudDate, Date registrationDate, String legalPerson, Integer regesterMoney, Integer employeeNumber, Integer manageScale, Integer productScale, Integer productNumber, String webSite, String awardDescribe, String conactName, String conactDuty, String conactMobile, Date createTime, Date updateTime) {
        this.id = id;
        this.tagId = tagId;
        this.enterFlowId = enterFlowId;
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.foudDate = foudDate;
        this.registrationDate = registrationDate;
        this.legalPerson = legalPerson;
        this.regesterMoney = regesterMoney;
        this.employeeNumber = employeeNumber;
        this.manageScale = manageScale;
        this.productScale = productScale;
        this.productNumber = productNumber;
        this.webSite = webSite;
        this.awardDescribe = awardDescribe;
        this.conactName = conactName;
        this.conactDuty = conactDuty;
        this.conactMobile = conactMobile;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public EnterFlowCompany() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public Long getEnterFlowId() {
        return enterFlowId;
    }

    public void setEnterFlowId(Long enterFlowId) {
        this.enterFlowId = enterFlowId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public Date getFoudDate() {
        return foudDate;
    }

    public void setFoudDate(Date foudDate) {
        this.foudDate = foudDate;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getLegalPerson() {
        return legalPerson;
    }

    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson == null ? null : legalPerson.trim();
    }

    public Integer getRegesterMoney() {
        return regesterMoney;
    }

    public void setRegesterMoney(Integer regesterMoney) {
        this.regesterMoney = regesterMoney;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public Integer getManageScale() {
        return manageScale;
    }

    public void setManageScale(Integer manageScale) {
        this.manageScale = manageScale;
    }

    public Integer getProductScale() {
        return productScale;
    }

    public void setProductScale(Integer productScale) {
        this.productScale = productScale;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite == null ? null : webSite.trim();
    }

    public String getAwardDescribe() {
        return awardDescribe;
    }

    public void setAwardDescribe(String awardDescribe) {
        this.awardDescribe = awardDescribe == null ? null : awardDescribe.trim();
    }

    public String getConactName() {
        return conactName;
    }

    public void setConactName(String conactName) {
        this.conactName = conactName == null ? null : conactName.trim();
    }

    public String getConactDuty() {
        return conactDuty;
    }

    public void setConactDuty(String conactDuty) {
        this.conactDuty = conactDuty == null ? null : conactDuty.trim();
    }

    public String getConactMobile() {
        return conactMobile;
    }

    public void setConactMobile(String conactMobile) {
        this.conactMobile = conactMobile == null ? null : conactMobile.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}