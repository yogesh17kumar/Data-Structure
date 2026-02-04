package ConditionalStatement;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter total units consumed:");
        int units = sc.nextInt();
        double bill;
        if (units<=100){
            bill = units;//kyuki humne 0-100 units ko Rs.1per unit liya hai
        } else if (units<=200) {
            bill = (100)+(units-100)*2;// 101-200 tk Rs.2per units
        } else if (units<=300) {
            bill = (100)+(100*2)+(units-200)*3;//201-300 tk Rs.3per units
        }else{
            bill = (100)+(100*2)+(100*3)+(units-300)*5;// above 300 --> Rs.5per units
        }
        System.out.println("Electricity Bill=Rs"+bill);
    }
}
