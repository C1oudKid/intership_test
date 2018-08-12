package institution;

import person.Student;
import person.consciousness.Knowledge;
import java.util.ArrayList;
import java.util.List;

public class Create_students {
    public List<Student> create_students(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Andrew Kostenko", new Knowledge(44)));
        students.add(new Student("Julia Veselkina" , new Knowledge(55)));
        students.add(new Student("Maria Perechrest", new Knowledge(66)));
        return students;
    }
}

