package com.pluralsight;

public class Shipper {
    private String companyName;
    private String phone;

    public Shipper(String companyName, String phone) {
        this.companyName = companyName;
        this.phone = phone;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Shipper{" +
                "companyName='" + companyName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
