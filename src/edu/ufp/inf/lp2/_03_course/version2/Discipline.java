package edu.ufp.inf.lp2._03_course.version2;

import java.util.ArrayList;

public class Discipline {

  private final ArrayList<CourseClass> courseClass;

  public String name;

  public int ects;

  public int courseSemester;

  public int courseYear;

  private ArrayList<Grade> grades;

  public Student student;

  public Discipline(String name, int ects, int courseSemester, int courseYear) {

    this.name = name;
    this.ects = ects;
    this.courseSemester = courseSemester;
    this.courseYear = courseYear;
    this.grades = new ArrayList<Grade>();
    this.courseClass = new ArrayList<CourseClass>();
  }

  public float averageGrade(){

    return 0.0f;
  }

  public void associateGrade(Grade g) {

    for (Grade i : grades){

      if (g.student.equals(i.student) && g.discipline.equals(i.discipline) && g.date.equals(g.date) && g.grade == i.grade){

        return;
      }
    }

    this.grades.add(g);
  }

  public void registerStudents(Student s) {
  }

  public Student unregisterStudent() {

    return null;
  }

  public String getName() {

    return name;
  }

  public void setName(String name) {

    this.name = name;
  }

  public int getEcts() {

    return ects;
  }

  public void setEcts(int ects) {

    this.ects = ects;
  }

  public int getCourseSemester() {

    return courseSemester;
  }

  public void setCourseSemester(int courseSemester) {

    this.courseSemester = courseSemester;
  }

  public int getCourseYear() {

    return courseYear;
  }

  public void setCourseYear(int courseYear) {

    this.courseYear = courseYear;
  }

  public ArrayList<Grade> getGrades() {

    return grades;
  }

  public void setGrades(ArrayList<Grade> grades) {

    this.grades = grades;
  }

  public Student getStudent() {

    return student;
  }

  public void setStudent(Student student) {

    this.student = student;
  }

  public ArrayList<CourseClass> getCourseClass() {
    return courseClass;
  }

  public ArrayList<Grade> getGrade() {
    return grades;
  }

  public void setGrade(ArrayList<Grade> grade) {
    this.grades = grade;
  }
}