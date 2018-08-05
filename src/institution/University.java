package institution;

import java.util.ArrayList;
import person.Student;

public class University {

    
    private String name;
    private ArrayList<Student> studentsList;
    
    public double avg;
    
    public University(String name) {
        this.name = name;
        studentsList = new ArrayList<>();
    }

    public void add_student(Student student) {
        studentsList.add(student);
        student.set_university(this);
        get_avg();
    }
    
    private void get_avg() {
        int counter = 0;
        for (Student student : studentsList)
            counter += student.knowledge.level;
         avg = (double) counter / studentsList.size();
    }
}
