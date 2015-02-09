package com.howbuy.costestimate.memory.entity;

import java.math.BigDecimal;

/**
 * bp_fund_basic_info表60万记录全部加载到内存内存消耗估算.见本类的main方法.
 * 
 * 大概消耗40M内存.
 */
public class BpFundBasicInfo
{
    private String fundCode;
    private String fundName;
    private String taCode;
    private String fundManCode;
    private String categoryId;
    private String currency;
    private String dfltDivMode;
    private String chgTrusteeMode;
    private String startTm;
    private String endTm;
    private String suppleSubsRule;
    private BigDecimal faceValue;
    private String feeCalMode;
    private BigDecimal minAcctVol;
    private String fundRiskLevel;
    private String recStat;
    private String checkFlag;
    private String creator;
    private String modifier;
    private String checker;
    private String creDt;
    private String modDt;
    private String fundType;
    private String fundClass; // 基金分类�?例如快钱有一个货币类基金和非货币类基金的概念.
    private String fundAttrPinyin;
    private String ipoEndTm;
    private String mainFundCode;
    private BigDecimal distributeSize;
    private String ipoStartDt;
    private String ipoEndDt;
    private String establishDt;
    private String fundCustodianCode;
    private String fundAttr;
    private String partCode;
    private String fundAttrHb;
    private String fundSubType;
    private String redeOpenTerm;
    private String summary;
    private String fundOpenMode;
    private String yieldType;
    private String recommInfo;
    private Integer fundStatPresetDays;
    private String settleType;
    private String openDt;// OPEN_DT VARCHAR2(8) �??日期
    private String openFlag;// OPEN_FLAG VARCHAR2(1) �??标志 0-未开通；1-已开�?

    public String getOpenDt()
    {
        return openDt;
    }

    public void setOpenDt(String openDt)
    {
        this.openDt = openDt;
    }

    public String getOpenFlag()
    {
        return openFlag;
    }

    public void setOpenFlag(String openFlag)
    {
        this.openFlag = openFlag;
    }

    public Integer getFundStatPresetDays()
    {
        return fundStatPresetDays;
    }

    public void setFundStatPresetDays(Integer fundStatPresetDays)
    {
        this.fundStatPresetDays = fundStatPresetDays;
    }

    public BpFundBasicInfo()
    {
    }

    public String getFundCode()
    {
        return this.fundCode;
    }

    public void setFundCode(String fundCode)
    {
        this.fundCode = fundCode;
    }

    public String getFundName()
    {
        return this.fundName;
    }

    public void setFundName(String fundName)
    {
        this.fundName = fundName;
    }

    public String getTaCode()
    {
        return this.taCode;
    }

    public void setTaCode(String taCode)
    {
        this.taCode = taCode;
    }

    public String getFundManCode()
    {
        return this.fundManCode;
    }

    public void setFundManCode(String fundManCode)
    {
        this.fundManCode = fundManCode;
    }

    public String getCategoryId()
    {
        return this.categoryId;
    }

    public void setCategoryId(String categoryId)
    {
        this.categoryId = categoryId;
    }

    public String getCurrency()
    {
        return this.currency;
    }

    public void setCurrency(String currency)
    {
        this.currency = currency;
    }

    public String getDfltDivMode()
    {
        return this.dfltDivMode;
    }

    public void setDfltDivMode(String dfltDivMode)
    {
        this.dfltDivMode = dfltDivMode;
    }

    public String getChgTrusteeMode()
    {
        return this.chgTrusteeMode;
    }

    public void setChgTrusteeMode(String chgTrusteeMode)
    {
        this.chgTrusteeMode = chgTrusteeMode;
    }

    public String getStartTm()
    {
        return this.startTm;
    }

    public void setStartTm(String startTm)
    {
        this.startTm = startTm;
    }

    public String getEndTm()
    {
        return this.endTm;
    }

    public void setEndTm(String endTm)
    {
        this.endTm = endTm;
    }

    public String getSuppleSubsRule()
    {
        return this.suppleSubsRule;
    }

    public void setSuppleSubsRule(String suppleSubsRule)
    {
        this.suppleSubsRule = suppleSubsRule;
    }

    public BigDecimal getFaceValue()
    {
        return this.faceValue;
    }

    public void setFaceValue(BigDecimal faceValue)
    {
        this.faceValue = faceValue;
    }

    public String getFeeCalMode()
    {
        return this.feeCalMode;
    }

    public void setFeeCalMode(String feeCalMode)
    {
        this.feeCalMode = feeCalMode;
    }

    public BigDecimal getMinAcctVol()
    {
        return this.minAcctVol;
    }

    public void setMinAcctVol(BigDecimal minAcctVol)
    {
        this.minAcctVol = minAcctVol;
    }

    public String getFundRiskLevel()
    {
        return this.fundRiskLevel;
    }

    public void setFundRiskLevel(String fundRiskLevel)
    {
        this.fundRiskLevel = fundRiskLevel;
    }

    public String getRecStat()
    {
        return this.recStat;
    }

    public void setRecStat(String recStat)
    {
        this.recStat = recStat;
    }

    public String getCheckFlag()
    {
        return this.checkFlag;
    }

    public void setCheckFlag(String checkFlag)
    {
        this.checkFlag = checkFlag;
    }

    public String getCreator()
    {
        return this.creator;
    }

    public void setCreator(String creator)
    {
        this.creator = creator;
    }

    public String getModifier()
    {
        return this.modifier;
    }

    public void setModifier(String modifier)
    {
        this.modifier = modifier;
    }

    public String getChecker()
    {
        return this.checker;
    }

    public void setChecker(String checker)
    {
        this.checker = checker;
    }

    public String getCreDt()
    {
        return this.creDt;
    }

    public void setCreDt(String creDt)
    {
        this.creDt = creDt;
    }

    public String getModDt()
    {
        return this.modDt;
    }

    public void setModDt(String modDt)
    {
        this.modDt = modDt;
    }

    public String getFundType()
    {
        return this.fundType;
    }

    public void setFundType(String fundType)
    {
        this.fundType = fundType;
    }

    public String getFundAttrPinyin()
    {
        return this.fundAttrPinyin;
    }

    public void setFundAttrPinyin(String fundAttrPinyin)
    {
        this.fundAttrPinyin = fundAttrPinyin;
    }

    public String getIpoEndTm()
    {
        return this.ipoEndTm;
    }

    public void setIpoEndTm(String ipoEndTm)
    {
        this.ipoEndTm = ipoEndTm;
    }

    public String getMainFundCode()
    {
        return this.mainFundCode;
    }

    public void setMainFundCode(String mainFundCode)
    {
        this.mainFundCode = mainFundCode;
    }

    public BigDecimal getDistributeSize()
    {
        return this.distributeSize;
    }

    public void setDistributeSize(BigDecimal distributeSize)
    {
        this.distributeSize = distributeSize;
    }

    public String getIpoStartDt()
    {
        return this.ipoStartDt;
    }

    public void setIpoStartDt(String ipoStartDt)
    {
        this.ipoStartDt = ipoStartDt;
    }

    public String getIpoEndDt()
    {
        return this.ipoEndDt;
    }

    public void setIpoEndDt(String ipoEndDt)
    {
        this.ipoEndDt = ipoEndDt;
    }

    public String getEstablishDt()
    {
        return this.establishDt;
    }

    public void setEstablishDt(String establishDt)
    {
        this.establishDt = establishDt;
    }

    public String getFundCustodianCode()
    {
        return this.fundCustodianCode;
    }

    public void setFundCustodianCode(String fundCustodianCode)
    {
        this.fundCustodianCode = fundCustodianCode;
    }

    public String getFundAttr()
    {
        return this.fundAttr;
    }

    public void setFundAttr(String fundAttr)
    {
        this.fundAttr = fundAttr;
    }

    public String getPartCode()
    {
        return this.partCode;
    }

    public void setPartCode(String partCode)
    {
        this.partCode = partCode;
    }

    public String getFundAttrHb()
    {
        return this.fundAttrHb;
    }

    public void setFundAttrHb(String fundAttrHb)
    {
        this.fundAttrHb = fundAttrHb;
    }

    public String getFundSubType()
    {
        return this.fundSubType;
    }

    public void setFundSubType(String fundSubType)
    {
        this.fundSubType = fundSubType;
    }

    public String getRedeOpenTerm()
    {
        return this.redeOpenTerm;
    }

    public void setRedeOpenTerm(String redeOpenTerm)
    {
        this.redeOpenTerm = redeOpenTerm;
    }

    public String getSummary()
    {
        return this.summary;
    }

    public void setSummary(String summary)
    {
        this.summary = summary;
    }

    public String getFundOpenMode()
    {
        return this.fundOpenMode;
    }

    public void setFundOpenMode(String fundOpenMode)
    {
        this.fundOpenMode = fundOpenMode;
    }

    public String getYieldType()
    {
        return this.yieldType;
    }

    public void setYieldType(String yieldType)
    {
        this.yieldType = yieldType;
    }

    public String getRecommInfo()
    {
        return this.recommInfo;
    }

    public void setRecommInfo(String recommInfo)
    {
        this.recommInfo = recommInfo;
    }

    public String getSettleType()
    {
        return settleType;
    }

    public void setSettleType(String settleType)
    {
        this.settleType = settleType;
    }

    public String getFundClass()
    {
        return fundClass;
    }

    public void setFundClass(String fundClass)
    {
        this.fundClass = fundClass;
    }
}
