package com.jjk.dome.domain;

/**
 * @author jq
 */
public class Detail {

    public Detail(){

    }
    public Detail(String elementCode,String labelName,String elementText){
        this.elementCode = elementCode;
        this.elementText = elementText;
        this.labelName = labelName;
    }

    private String elementCode;
    private String labelName;
    private String elementText;

    public String getElementCode() {
        return elementCode;
    }

    public void setElementCode(String elementCode) {
        this.elementCode = elementCode;
    }

    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getElementText() {
        return elementText;
    }

    public void setElementText(String elementText) {
        this.elementText = elementText;
    }

    @Override
    public String toString() {
        return "Detail{" +
                "elementCode='" + elementCode + '\'' +
                ", labelName='" + labelName + '\'' +
                ", elementText='" + elementText + '\'' +
                '}';
    }
}
