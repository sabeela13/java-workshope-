package com.java.basic.arrays;
import java.util.Arrays;
public class EmployeesDetails {
    public static void main(String[]args){
        String[][]Employees=new String[6][2];
        Employees[0][0]="1b0000";
        Employees[0][1]="50000";
        Employees[1][0]="2c000";
        Employees[1][1]="45000";
        Employees[2][0]="3d000";
        Employees[2][1]="34400";
        Employees[3][0]="9k000";
        Employees[3][1]="45000";
        Employees[4][0]="3m000";
        Employees[4][1]="90000";
        Employees[5][0]="5k000";
        Employees[5][1]="89000";
        for(String[]Employee:Employees){
            System.out.println(Arrays.toString(Employee));
        }

    }

}
