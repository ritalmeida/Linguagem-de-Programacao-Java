package edu.ufp.inf.lp2._03_course.version1;

import edu.ufp.inf.lp2._01_intro.pl.Person;

import java.util.ArrayList;
import edu.ufp.inf.lp2._01_intro.pl.Date;
import java.util.List;

public class Student extends Person {

  public long number;
  public String name;
  public Date registration;
  public String email;
  public String password;
  public CourseClass courseClass;
  public ArrayList<Discipline> disciplines;

  public Student(String idNumber,Date registration, String email, String password, String name, String address, Date birth) {

    super(idNumber, name, address, birth);
    this.number = number;
    this.registration = registration;
    this.email = email;
    this.password = password;

  }

  public void registerInDiscipline(Discipline d) {

    for (Discipline d2 : disciplines){

      if (d2.getName().compareTo(d.getName()) == 0){
        System.out.println("Student - registerInDiscipline(): discipline " + d.getName() + " already registered!");
        return;
      }
    }
  }

  public Discipline unregisterFromDiscipline(String sname) {
  return null;
  }

  public void setStudentGrade(String disc, float grade) {
  }

  public Discipline findDiscipline(String dname) {
  return null;
  }

  public ArrayList findDisciplinesDone() {
  return null;
  }

  public ArrayList findDisciplinesUndone() {
  return null;
  }

  public void registerInCourseClass(CourseClass cc) {
  }

  public CourseClass unregisterFromCourseClass() {
  return null;
  }

  public String toString() {
  return null;
  }

  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getRegistration() {
    return registration;
  }

  public void setRegistration(Date registration) {
    this.registration = registration;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CourseClass getCourseClass() {
    return courseClass;
  }

  public void setCourseClass(CourseClass courseClass) {
    this.courseClass = courseClass;
  }

  public ArrayList<Discipline> getDisciplines() {
    return disciplines;
  }

  public void setDisciplines(ArrayList<Discipline> disciplines) {
    this.disciplines = disciplines;
  }
}