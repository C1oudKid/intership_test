package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        Student studentAK = new Student("Andrew Kostenko", new Knowledge(44));
        university.add_student(studentAK);
        
        Student studentJV = new Student("Julia Veselkina", new Knowledge(76));
        university.add_student(studentJV);
        
        Student studentMR = new Student("Maria Perechrest", new Knowledge(52));
        university.add_student(studentMR);

        Internship internship = new Internship("Interlink");
        internship.set_student(studentAK);
        internship.set_student(studentJV);
        internship.set_student(studentMR);
        System.out.println("List of internship's students:");
        System.out.println(internship.get_students());
    }
}
