package com.tws.refactoring;

public class Police {
    private static int driverLimitedAge = 18;
    public boolean checkDriver(Driver driver) {

        return (driver.getAge() >= Police.driverLimitedAge)?true:false;
    }
}
