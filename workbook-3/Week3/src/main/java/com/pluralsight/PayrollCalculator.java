package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PayrollCalculator {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("employees.csv");
            BufferedReader br = new BufferedReader(fr);
            br.readLine(); //it will read and skip the first line
            String line;
            while ((line = br.readLine()) != null) {//starts on second line
                String[] data = line.split("\\|");
                Employee employee = new Employee(Integer.parseInt(data[0]),
                        data[1], Double.parseDouble(data[2]),
                        Double.parseDouble(data[3]));
                double pay = employee.getGrossPay();
                System.out.printf("%d %s %.2f\n", employee.getEmployeeID(),
                        employee.getName(),pay);
                fr.close();
                br.close();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
