package person;

import institution.University;
import person.consciousness.Knowledge;

public class Student {
    
    public String name;
    public Knowledge knowledge;
    public University university;
    
    public Student(String name) {
        this.name = name;
    }
    
    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }

    public void set_university(University university) {
        this.university = university;
    }
}
