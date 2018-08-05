package institution.interlink;

import java.util.ArrayList;
import person.Student;

public class Internship {
    
    private String name;
    private ArrayList<Student> studentsList;
    
    public Internship(String name) {
        this.name = name;
        studentsList = new ArrayList<>();
    }

    public void set_student(Student student) {
        if (student.knowledge.level > student.university.avg)
            studentsList.add(student);
    }

    public String get_students() {
        StringBuilder builder = new StringBuilder();
        for (Student student : studentsList) {
            builder.append(student.name).append("\n");
        }
        return builder.toString();
    }
}
