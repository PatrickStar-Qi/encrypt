package com.jjk.dome.domain;

import java.util.Date;
import java.util.List;

/**
 * @author jq
 */
public class MedicalRecordHis extends TimeStamp{

    private String hospitalCode;
    private String outpatientId;
    private String idCard;
    private String patientName;
    private Date treatmentDate;
    private String visiteDoctorCode;
    private String visiteDoctorName;
    private String chiefComplaint;
    private String historyOfPresentIllness;
    private String pastHistory;
    private String clinicalDiagnosis;
    private String physicalExamination;
    private String prescriptionDisposal;
    private String remark;
    private String hisId;
    private List<Detail> detailList;
    private List<Diagnosis> diagnosisList;
    private List<Prescription> prescriptionList;

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public String getOutpatientId() {
        return outpatientId;
    }

    public void setOutpatientId(String outpatientId) {
        this.outpatientId = outpatientId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public Date getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(Date treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public String getVisiteDoctorCode() {
        return visiteDoctorCode;
    }

    public void setVisiteDoctorCode(String visiteDoctorCode) {
        this.visiteDoctorCode = visiteDoctorCode;
    }

    public String getVisiteDoctorName() {
        return visiteDoctorName;
    }

    public void setVisiteDoctorName(String visiteDoctorName) {
        this.visiteDoctorName = visiteDoctorName;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    public String getHistoryOfPresentIllness() {
        return historyOfPresentIllness;
    }

    public void setHistoryOfPresentIllness(String historyOfPresentIllness) {
        this.historyOfPresentIllness = historyOfPresentIllness;
    }

    public String getPastHistory() {
        return pastHistory;
    }

    public void setPastHistory(String pastHistory) {
        this.pastHistory = pastHistory;
    }

    public String getClinicalDiagnosis() {
        return clinicalDiagnosis;
    }

    public void setClinicalDiagnosis(String clinicalDiagnosis) {
        this.clinicalDiagnosis = clinicalDiagnosis;
    }

    public String getPhysicalExamination() {
        return physicalExamination;
    }

    public void setPhysicalExamination(String physicalExamination) {
        this.physicalExamination = physicalExamination;
    }

    public String getPrescriptionDisposal() {
        return prescriptionDisposal;
    }

    public void setPrescriptionDisposal(String prescriptionDisposal) {
        this.prescriptionDisposal = prescriptionDisposal;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHisId() {
        return hisId;
    }

    public void setHisId(String hisId) {
        this.hisId = hisId;
    }

    public List<Detail> getDetailList() {
        return detailList;
    }

    public void setDetailList(List<Detail> detailList) {
        this.detailList = detailList;
    }

    public List<Diagnosis> getDiagnosisList() {
        return diagnosisList;
    }

    public void setDiagnosisList(List<Diagnosis> diagnosisList) {
        this.diagnosisList = diagnosisList;
    }

    public List<Prescription> getPrescriptionList() {
        return prescriptionList;
    }

    public void setPrescriptionList(List<Prescription> prescriptionList) {
        this.prescriptionList = prescriptionList;
    }

    @Override
    public String toString() {
        return "MedicalRecordHis{" +
                "hospitalCode='" + hospitalCode + '\'' +
                ", outpatientId='" + outpatientId + '\'' +
                ", idCard='" + idCard + '\'' +
                ", patientName='" + patientName + '\'' +
                ", treatmentDate=" + treatmentDate +
                ", visiteDoctorCode='" + visiteDoctorCode + '\'' +
                ", visiteDoctorName='" + visiteDoctorName + '\'' +
                ", chiefComplaint='" + chiefComplaint + '\'' +
                ", historyOfPresentIllness='" + historyOfPresentIllness + '\'' +
                ", pastHistory='" + pastHistory + '\'' +
                ", clinicalDiagnosis='" + clinicalDiagnosis + '\'' +
                ", physicalExamination='" + physicalExamination + '\'' +
                ", prescriptionDisposal='" + prescriptionDisposal + '\'' +
                ", remark='" + remark + '\'' +
                ", hisId='" + hisId + '\'' +
                ", detailList=" + detailList +
                ", diagnosisList=" + diagnosisList +
                ", prescriptionList=" + prescriptionList +
                '}';
    }
}
