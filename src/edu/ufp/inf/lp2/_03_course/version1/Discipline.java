package edu.ufp.inf.lp2._03_course.version1;

public class Discipline {

  public String name;

  public int ects;

  public short courseSemester;

  public short courseYear;

  public float grade;

  public Student student;

  public Discipline(String name, int ects, short courseSemester, short courseYear, float grade, Student student) {
    this.name = name;
    this.ects = ects;
    this.courseSemester = courseSemester;
    this.courseYear = courseYear;
    this.grade = grade;
    this.student = student;
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

  public short getCourseSemester() {
    return courseSemester;
  }

  public void setCourseSemester(short courseSemester) {
    this.courseSemester = courseSemester;
  }

  public short getCourseYear() {
    return courseYear;
  }

  public void setCourseYear(short courseYear) {
    this.courseYear = courseYear;
  }

  public float getGrade() {
    return grade;
  }

  public void setGrade(float grade) {
    this.grade = grade;
  }

  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public void registerStudents(Student s) {
  }

  public Student unregisterStudent() {

    return null;
  }

}