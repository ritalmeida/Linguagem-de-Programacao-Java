package edu.ufp.inf.lp2._01_intro.pl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import edu.ufp.inf.lp2._01_intro.pl.Date;

public class Person {

  public String idNumber;

  public String name;

  public String address;

  public Date birth;

  public ArrayList<Date> date;

  public Person(String idNumber, String name, String address, Date birth) {

    this.idNumber = idNumber;
    this.name = name;
    this.address = address;
    this.birth = birth;
  }

  public Person() {
  }

  public int age() {

    LocalDate start_Local_date = LocalDate.of(birth.getYear(), birth.getMonth(), birth.getDay());
    LocalDate end_Local_date = LocalDate.now();

    int years = (int) ChronoUnit.YEARS.between(start_Local_date, end_Local_date);

    return years;
  }

  public boolean olderThan(Person p) {

    //!return this.birth.isAfter(p.birth) == false;
    //return this.birth.beforeDate(p.birth);
    return !this.birth.afterDate(p.birth);
  }

  public String getIdNumber() {

    return idNumber;
  }

  public void setIdNumber(String idNumber) {

    this.idNumber = idNumber;
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public String getAddress() {

    return address;
  }

  public void setAddress(String address) {

    this.address = address;
  }

  public Date getBirth() {

    return birth;
  }

  public void setBirth(Date birth) {

    this.birth = birth;
  }

  @Override
  public String toString() {
    return "Person{" +
            " Name: " + name +
            ", Address: " + address +
            ", Birth: " + birth +
            ", Age: " + age() +
            '}';
  }
}