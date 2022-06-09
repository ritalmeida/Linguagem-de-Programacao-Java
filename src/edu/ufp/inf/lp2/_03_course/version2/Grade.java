package edu.ufp.inf.lp2._03_course.version2;

import edu.ufp.inf.lp2._01_intro.pl.Date;

public class Grade {

  public float grade;

  public Date date;

    public Discipline discipline;
    public Student student;

  public Grade(float grade, Date date, Discipline discipline) {
    this.grade = grade;
    this.date = date;
    this.discipline = discipline;
  }

  public Grade(float grade, Date date, Student student) {
    this.grade = grade;
    this.date = date;
    this.student = student;
  }

  public Grade(float grade, Date date) {
    this.grade = grade;
    this.date = date;
  }


  public Discipline associatedDiscipline() {

    return null;
  }

  public void associateDiscipline(Discipline d) {
  }

  public Student associatedStudent() {

    return null;
  }

  public void associateStudent(Student s) {
  }

  public float getGrade() {
    return grade;
  }

  public void setGrade(float grade) {
    this.grade = grade;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Discipline getDiscipline() {
    return discipline;
  }

  public void setDiscipline(Discipline discipline) {
    this.discipline = discipline;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }
}