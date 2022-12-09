package com.jjk.dome.domain;

import java.math.BigDecimal;

/**
 * @author jq
 */
public class Prescription {

    public Prescription() {

    }

    public Prescription(boolean packageFlag, String itemType, String itemCode, String itemName, BigDecimal totalPrice, BigDecimal unitPrice, Integer quantity, String quantityUnit, Integer totalSort, Integer isSetl, Integer finalQuantity) {
        this.packageFlag = packageFlag;
        this.itemType = itemType;
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.totalPrice = totalPrice;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.quantityUnit = quantityUnit;
        this.totalSort = totalSort;
        this.isSetl = isSetl;
        this.finalQuantity = finalQuantity;
    }

    private String groupNo;
    private Integer groupSubNo;
    private boolean packageFlag;
    private String itemType;
    private String itemCode;
    private String itemName;
    private BigDecimal totalPrice;
    private BigDecimal unitPrice;
    private Integer quantity;
    private String quantityUnit;
    private String remark;
    private Integer totalSort;
    private Integer isSetl;
    private Integer isStroage;
    private Integer finalQuantity;

    public String getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(String groupNo) {
        this.groupNo = groupNo;
    }

    public Integer getGroupSubNo() {
        return groupSubNo;
    }

    public void setGroupSubNo(Integer groupSubNo) {
        this.groupSubNo = groupSubNo;
    }

    public boolean isPackageFlag() {
        return packageFlag;
    }

    public void setPackageFlag(boolean packageFlag) {
        this.packageFlag = packageFlag;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getQuantityUnit() {
        return quantityUnit;
    }

    public void setQuantityUnit(String quantityUnit) {
        this.quantityUnit = quantityUnit;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getTotalSort() {
        return totalSort;
    }

    public void setTotalSort(Integer totalSort) {
        this.totalSort = totalSort;
    }

    public Integer getIsSetl() {
        return isSetl;
    }

    public void setIsSetl(Integer isSetl) {
        this.isSetl = isSetl;
    }

    public Integer getIsStroage() {
        return isStroage;
    }

    public void setIsStroage(Integer isStroage) {
        this.isStroage = isStroage;
    }

    public Integer getFinalQuantity() {
        return finalQuantity;
    }

    public void setFinalQuantity(Integer finalQuantity) {
        this.finalQuantity = finalQuantity;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "groupNo='" + groupNo + '\'' +
                ", groupSubNo=" + groupSubNo +
                ", packageFlag=" + packageFlag +
                ", itemType='" + itemType + '\'' +
                ", itemCode='" + itemCode + '\'' +
                ", itemName='" + itemName + '\'' +
                ", totalPrice=" + totalPrice +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", quantityUnit='" + quantityUnit + '\'' +
                ", remark='" + remark + '\'' +
                ", totalSort=" + totalSort +
                ", isSetl=" + isSetl +
                ", isStroage=" + isStroage +
                ", finalQuantity=" + finalQuantity +
                '}';
    }
}
