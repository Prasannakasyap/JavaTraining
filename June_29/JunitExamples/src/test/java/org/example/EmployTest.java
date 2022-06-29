package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class EmployTest {

    @Test
    public void testToString() {
        Employ employ2 = new Employ(12, "Sreelatha", Gender.FEMALE, "Java", "Programmer", 84824);
        String result ="Employ{empno=12, name='Sreelatha', gender=FEMALE, dept='Java', desig='Programmer', basic=84824.0}";
        assertEquals(result, employ2.toString());
    }
    @Test
    public void testGettersAndSetters() {
        Employ employ1 = new Employ();
        employ1.setEmpno(1);
        employ1.setName("Basha");
        employ1.setGender(Gender.MALE);
        employ1.setDept("Java");
        employ1.setDesig("Programmer");
        employ1.setBasic(99424.0);
        assertEquals(1, employ1.getEmpno());
        assertEquals("Basha", employ1.getName());
        assertEquals(Gender.MALE, employ1.getGender());
        assertEquals("Java", employ1.getDept());
        assertEquals("Programmer", employ1.getDesig());
        assertEquals(99424.0, employ1.getBasic(), 0);
    }
    @Test
    public void testConstructor() {
        Employ employ1 = new Employ();
        assertNotNull(employ1);
        Employ employ2 = new Employ(12, "Sreelatha", Gender.FEMALE, "Java", "Programmer", 84824);
        assertEquals(12 , employ2.getEmpno());
        assertEquals("Sreelatha", employ2.getName());
        assertEquals(Gender.FEMALE, employ2.getGender());
        assertEquals("Java", employ2.getDept());
        assertEquals("Programmer", employ2.getDesig());
        assertEquals(84824.0, employ2.getBasic(), 0);
    }
}
