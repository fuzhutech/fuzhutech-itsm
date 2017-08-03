package com.fuzhutech.entity.itsm;

import com.fuzhutech.common.entity.BaseEntity;

public class Computer implements BaseEntity {
    private Integer id;

    private Integer identifier;

    private String site;

    private String kind;

    private String brand;

    private String model;

    private String serialNumber;

    private Integer assetNumber;

    private String assetTag;

    private Integer manufacturingDate;

    private Integer expiringDate;

    private Integer receiptDate;

    private Integer deliveryDate;

    private Integer assignDate;

    private String applyReason;

    private String user;

    private Integer useState;

    private String memo;

    private String warranty;

    private String macAddress;

    private String usageLog;

    private String hardware;

    private String software;

    private String configuration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site == null ? null : site.trim();
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber == null ? null : serialNumber.trim();
    }

    public Integer getAssetNumber() {
        return assetNumber;
    }

    public void setAssetNumber(Integer assetNumber) {
        this.assetNumber = assetNumber;
    }

    public String getAssetTag() {
        return assetTag;
    }

    public void setAssetTag(String assetTag) {
        this.assetTag = assetTag == null ? null : assetTag.trim();
    }

    public Integer getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(Integer manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public Integer getExpiringDate() {
        return expiringDate;
    }

    public void setExpiringDate(Integer expiringDate) {
        this.expiringDate = expiringDate;
    }

    public Integer getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Integer receiptDate) {
        this.receiptDate = receiptDate;
    }

    public Integer getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Integer deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Integer getAssignDate() {
        return assignDate;
    }

    public void setAssignDate(Integer assignDate) {
        this.assignDate = assignDate;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason == null ? null : applyReason.trim();
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    public Integer getUseState() {
        return useState;
    }

    public void setUseState(Integer useState) {
        this.useState = useState;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty == null ? null : warranty.trim();
    }

    public String getMacAddress() {
        return macAddress;
    }

    public void setMacAddress(String macAddress) {
        this.macAddress = macAddress == null ? null : macAddress.trim();
    }

    public String getUsageLog() {
        return usageLog;
    }

    public void setUsageLog(String usageLog) {
        this.usageLog = usageLog == null ? null : usageLog.trim();
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware == null ? null : hardware.trim();
    }

    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software == null ? null : software.trim();
    }

    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration == null ? null : configuration.trim();
    }
}