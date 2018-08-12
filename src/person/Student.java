package person;

import institution.University;
import person.consciousness.Knowledge;

public class Student {
    
    private String name;
    private Knowledge knowledge;
    private University university;
    
    public Student(String name) {
        this.name = name;
    }
    
    public Student(String name, Knowledge knowledge) {
        this.name = name;
        this.knowledge = knowledge;
    }

    public String get_name() {
        return name;
    }

    public Knowledge get_knowledge(){
        return knowledge;
    }

    public University get_university(){
        return university;
    }

    public void set_university(University university) {
        this.university = university;
    }
}
