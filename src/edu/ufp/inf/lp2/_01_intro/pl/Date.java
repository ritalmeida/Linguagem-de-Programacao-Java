package edu.ufp.inf.lp2._01_intro.pl;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.lang.Math;

public class Date implements Comparable<Date>{

    public int day;

    public int month;

    public int year;

    public Date(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date() {

        GregorianCalendar c = new GregorianCalendar();
        this.day = c.get(Calendar.DAY_OF_MONTH);
        this.month = c.get(Calendar.MONTH) + 1;
        this.year = c.get(Calendar.YEAR);
    }

    public static void main(String[] args) {

        Date now = new Date();
        System.out.println("Day: " + now.day + " Month: " + now.month + " Year: " + now.year);

        Date next = new Date();
        next.incrementDate();

        System.out.println(now + " is before " + next + " : " + now.beforeDate(next));

        System.out.println((now.year) + " is leap year? " + isLeapYear(now.year));
    }

    public Date(Date d) {

        this.day = d.day;
        this.month = d.month;
        this.year = d.year;
    }

    public boolean beforeDate(Date d) {

        if(this.year < d.year){
            return true;
        }else if(this.year > d.year){
            return false;
        }else{
            if(this.month < d.month){
                return true;
            }else if(this.month > d.month){
                return false;
            }else{
                return this.day < d.day;
            }
        }
    }

    public boolean afterDate(Date d) {

        /*
        if(this.compareTo(d) > 0){
            return true;
        }
        return false;
        */

        //return !this.beforeDate(d);

        return compareTo(d) > 0;
    }

    public static boolean isLeapYear(int year) {

        if(year % 4 == 0){
            if(year % 100 != 0){
                return true;
            }else{
                return year % 400 == 0;
            }
        }
        return false;
        //return year % 4 == 0 && (year % 400 == 0 || year % 100 != 0);
    }

    public void incrementDate() {

        if(this.day < daysMonth(this.month, this.year)){

            day += 1;
        }else{
            if(this.month == 12){
                month = 1;
                year += 1;
                day = 1;
            }else {
                month += 1;
                day = 1;
            }
        }

        /*if (this.month == 12 && (this.day == daysMonth(this.month, this.year))){

            this.day = 1;
            this.month = 1;
            this.year++;
        }else if (this.day < Date.daysMonth(this.month, this.year)){

            this.day++;
        }else{

            this.day = 1;
            this.month++;
        }*/
    }

    public int differenceYearsRecursive(Date d) {

        return Math.abs(this.year-d.year);
    }

    public int differenceYears(Date d){

        if(this.year == d.year){

            return differenceMonths(this,d);
        }

        int ndias = differenceMonths(this, new Date(31, 12, this.year));
        while (this.year < d.year){

            if(isLeapYear(this.year)){
                ndias += 366;
            }else{
                ndias += 365;
            }
            this.year += 1;
        }
        ndias += differenceMonths(new Date(1,1,this.year), d);

        return ndias;
    }

    public static int differenceMonths(Date begin, Date end){

        if(begin.month == end.month){

            return end.day - begin.day;
        }

        int ndias = daysMonth(begin.month, end.year);
        int dayCounter = ndias - begin.day;
        begin.setMonth(begin.month+1);
        begin.setDay(1);

        while (begin.month < end.month){

            dayCounter = daysMonth(begin.month, begin.year);
            begin.setMonth(begin.month+1);
        }
        dayCounter += end.day;
        return dayCounter;
    }

    public static int daysCrawlerRecursiveAux(Date begin, Date end){

        if(begin.equals(end)){

            return 0;
        }
        begin.incrementDate();
        return 1 + daysCrawlerRecursiveAux(begin,end);
    }

    public static long daysCrawlerRecursive(Date begin, Date end){

        if (end.year - begin.year < 10){

            return daysCrawlerRecursiveAux(begin, end);
        }
        int daysCount = 0;
        while (end.year - begin.year > 10){

            Date begin2 = new Date(begin);
            begin2.year = begin2.year + 10;
            daysCount += daysCrawlerRecursiveAux(begin, begin2);
            //begin.year += 10;
        }
        daysCount += daysCrawlerRecursiveAux(begin, end);
        return daysCount;
    }

    public int compareTo(Date d) {

        if(this.year == d.year && this.month == d.month && this.day == d.day){

            return 0;
        }else{
            if(this.year == d.year){
                if(this.month == d.month){
                    return this.day = d.day / Math.abs(this.day - d.day);
                }else{
                    return this.month = d.month / Math.abs(this.month - d.month);
                }
            }else{
                return this.year = d.year / Math.abs(this.year - d.year);
            }
        }
    }

    public static int daysMonth(int month, int year) {

        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: return 31;
            case 2: return isLeapYear(year) ? 29 : 28;
            default: return 30;
        }
    }

    /**
     *
     * @param beginDay
     * @param beginMonth
     * @param endDay
     * @param endMonth
     * @param year
     * @return the number of months between two dates of a given year
     */
    public static int monthsBetweenMonths(short beginDay, short beginMonth, short endDay, short endMonth, int year){

        short month = beginMonth, monthsCount = 0;

        while ((month < endMonth) && (beginDay <= endDay)){

            monthsCount++;
            month++;
        }
        if (month == endMonth && ((endDay - beginDay + 1) ==Date.daysMonth(month, year))){

            monthsCount++;
        }
        return monthsCount++;
    }

    public int getDay() {

        return day;
    }

    public void setDay(int day) {

        if (day < 32 || day > 0) {

            this.day = day;
        }
    }

    public int getMonth() {

        return month;
    }

    public void setMonth(int month) {

        if (month > 0 || month < 13) {

            this.month = month;
        }
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }

    public boolean equals(Date d){

        if (this == d){

            return true;
        }

        if (d == null || getClass() != d.getClass())

            return false;

        Date date = (Date) d;
        return (day == date.day && month == date.month && year == date.year);
    }
}