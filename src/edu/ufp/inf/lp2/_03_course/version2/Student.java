package edu.ufp.inf.lp2._03_course.version2;

import java.util.ArrayList;
import edu.ufp.inf.lp2._01_intro.pl.Date;

public class Student {

  public int number;

  public String name;

  public Date registration;

  public String email;

  public String password;

  public CourseClass course;

  public ArrayList<Grade> grades;

  public ArrayList<Discipline> disciplines;

  private float ng;   //new grade

  public Student(int number, String name, Date registration, String email, String password) {

    this.number = number;
    this.name = name;
    this.registration = registration;
    this.email = email;
    this.password = password;
  }

  public void addGrade(Grade g) {

    for (Grade grade : this.grades){

      if (grade.equals(g)){

        return;
      }
    }
    this.grades.add(g);
  }

  public Grade removeGrade(float g, String nd, Date d) {

    return null;
  }

  public Grade changeGrade(float g, String nd, Date d) {

    for (Grade grade : this.grades){

      if (grade.grade == g && grade.date.equals(d) && grade.discipline.equals(nd)){

        grade.grade = ng;
      }
    }
    return null;
  }

  public float averageGrades() {

    int soma = 0;

    for (Grade grade : this.grades){

      soma += grade.grade;
    }

    return (soma)/grades.size();
  }

  public Discipline registerFromDiscipline(Discipline d) {

    return null;
  }

  public Grade maxGrade() {

    return null;
  }

  private Grade minGrade() {

    return null;
  }

  public void printGrades() {

    for (Grade grade : grades){

      System.out.println("Grades: " + grade.grade + " " + grade.date.toString() + " " + grade.student.toString() + " " + grade.discipline.toString());
    }
  }

  public void registerInDiscipline(Discipline d) {
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

  public CourseClass registerInCourseClass(CourseClass cc) {

    this.course = cc;

    cc.registerStudent(this);

    return cc;
  }

  public void unregisterFromCourseClass() {

    if (this.course != null){

      this.course.unregisterStudent(this.number);
    }
    this.course = null;
  }

  public String toString() {

    return null;
  }


  public long getNumber() {
    return number;
  }

  public void setNumber(int number) {
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

  public CourseClass getCourse() {
    return course;
  }

  public void setCourse(CourseClass course) {
    this.course = course;
  }

  public ArrayList<Grade> getGrades() {
    return grades;
  }

  public void setGrades(ArrayList<Grade> grades) {
    this.grades = grades;
  }

  public ArrayList<Discipline> getDisciplines() {
    return disciplines;
  }

  public void setDisciplines(ArrayList<Discipline> disciplines) {
    this.disciplines = disciplines;
  }
}