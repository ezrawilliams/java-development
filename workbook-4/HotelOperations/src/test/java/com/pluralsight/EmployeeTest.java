package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void punchIn() {
        //setup/arrange:
        Employee employee2 = new Employee();
        employee2.setEmployeeId(2);
        employee2.setDepartment("Finance");
        employee2.setPayRate(25);
        double expectedPunchInTime = 6.0;

        //act
        employee2.punchIn(expectedPunchInTime);

        //assert:
        double actualPunchInTime = employee2.getPunchInTime();
        assertEquals(expectedPunchInTime, actualPunchInTime);
    }

    @Test
    void punchOut() {
        double timeIn = 6.0;
        double timeOut = 18.0;
        Employee employee2 = new Employee();
        employee2.setEmployeeId(2);
        employee2.setDepartment("Finance");
        employee2.setPayRate(25);

        double expectedHoursWorked = timeOut - timeIn; //12 hours worked

        //act:
        employee2.punchIn(timeIn);
        employee2.punchOut(timeOut);

        //assert:
        double actualHoursWorked = employee2.getHoursWorked();
        assertEquals(expectedHoursWorked, actualHoursWorked);

    }
}