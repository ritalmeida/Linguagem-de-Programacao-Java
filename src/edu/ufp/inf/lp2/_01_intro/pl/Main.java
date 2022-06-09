/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ufp.inf.lp2._01_intro.pl;

/**
 * @author beatrizgomes
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date d1 = new Date(4, 1, 2000);
        Date d2 = new Date(5, 3, 2015);
        Date d3 = new Date();
        Date d4 = new Date();

        Person p1 = new Person("1", "João", "Rua X", d1);
        Person p2 = new Person("2", "José", "Rua Y", d2);
        System.out.println(p1.toString());
        System.out.println(p2);
        System.out.println("Age " + p1.getName() + ": " + p1.age());
        System.out.println("Age " + p2.getName() + ": " + p2.age());
        System.out.println("Date: " + d3.toString());
        System.out.println("DifferenceYears: " + d1.differenceYears(d2));
        System.out.println(d1.toString() + " before " + d2 + ": " + d1.beforeDate(d2));
        System.out.println(d3.toString() + " before " + d4 + ": " + d3.beforeDate(d4));
        System.out.println(d3.toString() + " after " + d4 + ": " + d3.afterDate(d4));
        System.out.println(p2.getName() + " older than " + p1.getName() + ": " + p2.olderThan(p1));
        System.out.println(p1.getName() + " older than " + p2.getName() + ": " + p1.olderThan(p2));
        System.out.println("Number days of month " + d1.getMonth() + "/" + d1.getYear() + ": " + (d1.daysMonth(d1.getMonth(), d1.getYear())));
        System.out.println("Number days of month " + d3.getMonth() + "/" + d3.getYear() + ": " + (d3.daysMonth(d3.getMonth(), d3.getYear())));

        int month = 2, year = 2019;
        System.out.println("Number days of month " + month + "/" + year + ": " + (Date.daysMonth(month, year)));

        //OUTPUT
        /*
        Person {Name: João, Address: Rua X, Birth: 4/1/2000, Age: 21}
        Person {Name: José, Address: Rua Y, Birth: 5/3/2015, Age: 6}
        Age João: 21
        Age José: 6
        Date: 24/3/2021
        DifferenceYears: 15
        4/1/2000 before 5/3/2015: true
        28/2/2020 before 28/2/2020: false
        28/2/2020 after 28/2/2020: false
        José older than João: false
        João older than José: true
        Number days of month 1/2000: 31
        Number days of month 2/2020: 29
        Number days of month 2/2019: 28
        */

    }

}
