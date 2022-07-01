package org.example;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class LeaveDetailsTests {

    @Test
    public void testToString() throws ParseException {
      String result ="LeaveDetails{leavId=1, empId=1000, leaveStartDate=Mon Jul 04 00:00:00 IST 2022, leaveEndDate=Wed Jul 06 00:00:00 IST 2022, noOfDays=2, leaveReason='Going Home'}";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = sdf.parse("2022-07-04");
        Date endDate = sdf.parse("2022-07-06");
        LeaveDetails ld3 = new LeaveDetails(1, 1000, startDate, endDate, 2, "Going Home");
        assertEquals(result, ld3.toString());
    }
    @Test
    public void testHashCode() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = sdf.parse("2022-07-04");
        Date endDate = sdf.parse("2022-07-06");
        LeaveDetails ld3 = new LeaveDetails(1, 1000, startDate, endDate, 2, "Going Home");
        LeaveDetails ld4 = new LeaveDetails(1, 1000, startDate, endDate, 2, "Going Home");
        assertEquals(ld3.hashCode(), ld4.hashCode());
    }

    @Test
    public void testEquals() throws ParseException {
        LeaveDetails ld1 = new LeaveDetails();
        assertTrue(ld1.equals(ld1));
        LeaveDetails ld2 = null;
        assertFalse(ld1.equals(ld2));
        App obj = new App();
        assertFalse(ld1.equals(obj));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = sdf.parse("2022-07-04");
        Date endDate = sdf.parse("2022-07-06");
        LeaveDetails ld3 = new LeaveDetails(1, 1000, startDate, endDate, 2, "Going Home");
        LeaveDetails ld4 = new LeaveDetails(1, 1000, startDate, endDate, 2, "Going Home");
        assertTrue(ld3.equals(ld4));
    }
    @Test
    public void testGettersAndSetters() throws ParseException {
        LeaveDetails ld = new LeaveDetails();
        ld.setLeavId(1);
        ld.setEmpId(1000);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = sdf.parse("2022-07-04");
        Date endDate = sdf.parse("2022-07-06");
        ld.setLeaveStartDate(startDate);
        ld.setLeaveEndDate(endDate);
        ld.setNoOfDays(12);
        ld.setLeaveReason("Going Home");

        assertEquals(1, ld.getLeavId());
        assertEquals(1000, ld.getEmpId());
        assertEquals(startDate, ld.getLeaveStartDate());
        assertEquals(endDate, ld.getLeaveEndDate());
        assertEquals(12, ld.getNoOfDays());
        assertEquals("Going Home", ld.getLeaveReason());
    }
    @Test
    public void testConstructor() throws ParseException {
        LeaveDetails ld = new LeaveDetails();
        assertNotNull(ld);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = sdf.parse("2022-07-04");
        Date endDate = sdf.parse("2022-07-06");
        LeaveDetails ld1 = new LeaveDetails(1, 1000, startDate, endDate, 2, "Going Home");
        assertEquals(1, ld1.getLeavId());
        assertEquals(1000, ld1.getEmpId());
        assertEquals(startDate, ld1.getLeaveStartDate());
        assertEquals(endDate, ld1.getLeaveEndDate());
        assertEquals(2, ld1.getNoOfDays());
        assertEquals("Going Home", ld1.getLeaveReason());
    }
}
