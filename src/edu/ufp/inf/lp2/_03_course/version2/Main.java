package edu.ufp.inf.lp2._03_course.version2;

import edu.ufp.inf.lp2._01_intro.pl.Date;

public class Main {

    public static void main(String[] args) {

        // Create a new Date
        Date d1 = new Date(1, 1, 2018);

        // Create new students
        /*Student s1 = new Student(1, d1, "password", "12345678", "João");
        Student s2 = new Student(2, d1, "password", "19876543", "José");
        Student s3 = new Student(3, d1, "password", "18734280", "João");*/
        Student s1 = new Student(35456, "Rita", d1, "rita@email.com", "password");
        Student s2 = new Student(35457, "Joao", d1, "joao@email.com", "password");
        Student s3 = new Student(35458, "Pedro", d1, "pedro@email.com", "password");

        // Create new CourseClass
        CourseClass cc1 = new CourseClass("Engenharia Informática");

        // register students in the courseclass
        cc1.registerStudent(s1);
        cc1.registerStudent(s2);
        cc1.registerStudent(s3);

        // search for students by name
        for (Student s : cc1.searchStudent("João")) {
            System.out.println(s.getName() + " Nº: " + s.getNumber());
        }

        // create new disciplines
        Discipline dis1 = new Discipline("LP2", 7, 2, 2);
        Discipline dis2 = new Discipline("AED2", 6, 1, 1);

        //register discipline in the courseclass
        cc1.associateDiscipline(dis1);
        cc1.associateDiscipline(dis2);

        //create grades for a discipline, a student and a specific date
        //cc1.launchGrade(dis1.getName(), s1.getNumber(), 3.1f, new Date(1, 3, 2018));
        //cc1.launchGrade(dis2.getName(), s1.getNumber(), 16.1f, new Date(1, 3, 2018));
        //cc1.launchGrade(s1.name, s1.getNumber(), s1.getGrades(), new Date(24,3,2021));

        //create grade for a discipline, a student and today
        //cc1.launchGrade(dis1.getName(), s2.getNumber(), 11.1f);
        //cc1.launchGrade(dis2.getName(), s2.getNumber(), 18.1f);

        // Print grades of student
        //System.out.println("Grades of Student " + s1.getName() + ":" + s1.printGrades());
        //System.out.println("Grades of Student " + s2.getName() + ":" + s2.printGrades());

        // Minimum grade
        //System.out.println("MIN: " + s1.minGrade().getGrade());
        //System.out.println("MAX: " + s1.maxGrade().getGrade());

        // Average grade of student
        System.out.println("AVERAGE: " + s1.averageGrades());

        // Change the value of a given grade
        //s1.changeGrade(10.1f, 3.1f, dis1.getName());


        // Minimum grade
        //System.out.println("MIN: " + s1.minGrade().getGrade());

        // Average grade of student
        System.out.println("AVERAGE: " + s1.averageGrades());

//        Student - associateStudent(): João already associated with this course!
//        João Nº: 1
//        Grades of Student João:{grade=3.1, date=Date{day=1, month=3, year=2018}, discipline=LP2}{grade=16.1, date=Date{day=1, month=3, year=2018}, discipline=AED2}
//        Grades of Student José:{grade=11.1, date=Date{day=16, month=3, year=2018}, discipline=LP2}{grade=18.1, date=Date{day=16, month=3, year=2018}, discipline=AED2}
//        MIN: 3.1
//        MAX: 16.1
//        AVERAGE: 9.6
//        MIN: 10.1
//        AVERAGE: 13.1
    }
}
