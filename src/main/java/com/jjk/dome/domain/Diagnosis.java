package com.jjk.dome.domain;

import java.util.Date;

/**
 * @author jq
 */
public class Diagnosis {

    public Diagnosis(String diagTypeCode,String diagTypeName,String diagnosisCode,String diagnosisName,Date diagnosisTime){
        this.diagTypeCode = diagTypeCode;
        this.diagTypeName = diagnosisName;
        this.diagnosisCode = diagnosisCode;
        this.diagTypeName = diagTypeName;
        this.diagnosisTime = diagnosisTime;
    }

    private String diagTypeCode;
    private String diagTypeName;
    private String diagnosisCode;
    private String diagnosisName;
    private Date diagnosisTime;
    private String diagnosisStandard;

    public String getDiagTypeCode() {
        return diagTypeCode;
    }

    public void setDiagTypeCode(String diagTypeCode) {
        this.diagTypeCode = diagTypeCode;
    }

    public String getDiagTypeName() {
        return diagTypeName;
    }

    public void setDiagTypeName(String diagTypeName) {
        this.diagTypeName = diagTypeName;
    }

    public String getDiagnosisCode() {
        return diagnosisCode;
    }

    public void setDiagnosisCode(String diagnosisCode) {
        this.diagnosisCode = diagnosisCode;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public Date getDiagnosisTime() {
        return diagnosisTime;
    }

    public void setDiagnosisTime(Date diagnosisTime) {
        this.diagnosisTime = diagnosisTime;
    }

    public String getDiagnosisStandard() {
        return diagnosisStandard;
    }

    public void setDiagnosisStandard(String diagnosisStandard) {
        this.diagnosisStandard = diagnosisStandard;
    }

    @Override
    public String toString() {
        return "Diagnosis{" +
                "diagTypeCode='" + diagTypeCode + '\'' +
                ", diagTypeName='" + diagTypeName + '\'' +
                ", diagnosisCode='" + diagnosisCode + '\'' +
                ", diagnosisName='" + diagnosisName + '\'' +
                ", diagnosisTime=" + diagnosisTime +
                ", diagnosisStandard='" + diagnosisStandard + '\'' +
                '}';
    }
}
