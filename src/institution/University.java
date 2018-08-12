package institution;

import java.util.ArrayList;
import java.util.List;

import person.Student;

public class University {

    
    private String name;
    private ArrayList<Student> studentsList;
    private List<Student> students = students = new ArrayList<>();
    
    private double avg;
    
    public University(String name) {
        this.name = name;
    }

    public void add_student(List students) {
        this.students = students;
    }

    public double get_avg() {
        int counter = 0;
        for (Student student : students)
            counter += student.get_knowledge().get_lvl();
        avg = (double) counter / students.size();
        return avg;
    }

    public List<Student> get_students(){
        return students;

    }
}
