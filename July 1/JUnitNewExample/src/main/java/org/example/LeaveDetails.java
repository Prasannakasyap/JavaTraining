package org.example;

import java.util.Date;
import java.util.Objects;

public class LeaveDetails {
    private int leavId;
    private int empId;
    private Date leaveStartDate;
    private Date leaveEndDate;
    private int noOfDays;
    private String leaveReason;

    public int getLeavId() {
        return leavId;
    }

    public void setLeavId(int leavId) {
        this.leavId = leavId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public Date getLeaveStartDate() {
        return leaveStartDate;
    }

    public void setLeaveStartDate(Date leaveStartDate) {
        this.leaveStartDate = leaveStartDate;
    }

    public Date getLeaveEndDate() {
        return leaveEndDate;
    }

    public void setLeaveEndDate(Date leaveEndDate) {
        this.leaveEndDate = leaveEndDate;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public String getLeaveReason() {
        return leaveReason;
    }

    public void setLeaveReason(String leaveReason) {
        this.leaveReason = leaveReason;
    }

    public LeaveDetails(int leavId, int empId, Date leaveStartDate, Date leaveEndDate, int noOfDays, String leaveReason) {
        this.leavId = leavId;
        this.empId = empId;
        this.leaveStartDate = leaveStartDate;
        this.leaveEndDate = leaveEndDate;
        this.noOfDays = noOfDays;
        this.leaveReason = leaveReason;
    }

    public LeaveDetails() {}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeaveDetails that = (LeaveDetails) o;
        return leavId == that.leavId && empId == that.empId && noOfDays == that.noOfDays
                && Objects.equals(leaveStartDate, that.leaveStartDate)
                && Objects.equals(leaveEndDate, that.leaveEndDate) && Objects.equals(leaveReason, that.leaveReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(leavId, empId, leaveStartDate, leaveEndDate, noOfDays, leaveReason);
    }

    @Override
    public String toString() {
        return "LeaveDetails{" +
                "leavId=" + leavId +
                ", empId=" + empId +
                ", leaveStartDate=" + leaveStartDate +
                ", leaveEndDate=" + leaveEndDate +
                ", noOfDays=" + noOfDays +
                ", leaveReason='" + leaveReason + '\'' +
                '}';
    }
}
