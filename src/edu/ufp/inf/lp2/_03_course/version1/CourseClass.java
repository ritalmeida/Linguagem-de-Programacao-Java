package edu.ufp.inf.lp2._03_course.version1;

import java.util.ArrayList;

public class CourseClass {

  private final String name;

  private final ArrayList<Student> students = new ArrayList<>();

  public CourseClass(String name) {
    this.name = name;
  }

  public static void main(String[] args) {

    //Student s1 = new Student(1111L, new Date(System.currentTimeMillis()),"","","", etc...);
    //Discipline lp1 = new Discipline("LP1", 7, 1, 2, 0.0, s1);
  }

  public void associateStudents(Student s) {
    //make sure an object with same info does not exist yet...
    for (Student saux : students){
      if (saux.getNumber() == s.getNumber()){
        System.out.println(this.getClass().getName()+" -> associateStudent(): student already registered " + s.name);
        return;
      }
    }
    this.students.add(s);   //add if does not exist
  }

  public Student desassociateStudent(String sname) {

    for (Student s:students){
      if (s.getName().compareTo(sname) == 0){

        this.students.remove(s);
        s.unregisterFromDiscipline(this.name);
        return s;
      }
    }
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
}