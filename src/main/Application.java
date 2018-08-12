package main;

import institution.University;
import institution.interlink.Internship;
import institution.Create_students;

public class Application {
    public static void main(String[] args) {

        University university = new University("CH.U.I.");
        Internship internship = new Internship("Interlink", university);
        university.add_student(new Create_students().create_students());
        System.out.println("List of internship's students:");
        System.out.println(internship.get_interns());
    }
}
