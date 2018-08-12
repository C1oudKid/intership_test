package institution.interlink;

import java.util.ArrayList;
import java.util.List;

import institution.University;
import person.Student;

public class Internship {
    
    private String name;
    private Student student;
    private University university;
    private List<Student> interns;


    public Internship(String name, University university) {
        this.name = name;
        this.university = university;
        interns = new ArrayList<>();
    }

    public void set_student(List students) {
        this.interns = students;
    }

    public List<Student> add_intern(){
        for (Student student: university.get_students()) {
            if(student.get_knowledge().get_lvl() > university.get_avg()) {
                interns.add(student);
            }
        }
        return interns;
    }

    public String get_interns() {
        String all_interns = "";
        for(Student intern : add_intern()){
            all_interns += intern.get_name() + "\n";
        }
        return all_interns;
    }
}
