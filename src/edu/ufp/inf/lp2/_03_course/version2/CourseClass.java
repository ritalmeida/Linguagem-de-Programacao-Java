package edu.ufp.inf.lp2._03_course.version2;

import java.util.ArrayList;
import edu.ufp.inf.lp2._01_intro.pl.Date;


public class CourseClass {

  private ArrayList<Student> students = new ArrayList<>();

  public String name;

  public ArrayList<Discipline> disciplines = new ArrayList<>();

  public CourseClass(String name) {

    this.name = name;
    this.students = new ArrayList<Student>();
    this.disciplines = new ArrayList<Discipline>();
  }

  public void associateStudents(Student s) {
  }

  public Student desassociateStudent(String sname) {

    return null;
  }

  public Student[] associatedStudents() {

    return null;
  }

  public int numberAssociatedStudents() {

    return 0;
  }

  public String getName() {

    return null;
  }

  public ArrayList<Student> getStudents() {

    return students;
  }


  public void registerStudent(Student s) {
  }

  public Student unregisterStudent(int number) {

    Student nStudent = searchStudentByNumber(number);
    if (nStudent != null){
      this.students.remove(nStudent);
    }

    return nStudent;
  }

  public void associateDiscipline(Discipline d) {

    if (d.name.equals(this.name)){

      return;
    }
    disciplines.add(d);
  }

  public Discipline desassociateDiscipline(String dname) {

    return null;
  }

  public Grade launchGrade(Student dName, long studentNumber, float grade, Date date) {

    Grade nGrade = new Grade(grade, date);
    Student nStudent = searchStudentByNumber(studentNumber);
    nStudent.addGrade(nGrade);
    Discipline nDiscipline = searchDiscipline(dName);
    nDiscipline.associateGrade(nGrade);

    return null;
  }

  private Discipline searchDiscipline(Student student) {

    return null;
  }

  public ArrayList<Student> searchStudent(String name) {

    return null;
  }

  public void associateGrade2Discipline(String dName, long studentNumber, float grade) {
  }

  public Student searchStudentByNumber(long number) {

    return null;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ArrayList<Discipline> getDisciplines() {
    return disciplines;
  }

  public void setDisciplines(ArrayList<Discipline> disciplines) {
    this.disciplines = disciplines;
  }

}