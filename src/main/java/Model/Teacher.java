package Model;

import Father.People;

public class Teacher extends People {
    private String name;
    private String teach;//任课

    public Teacher(String name) {
        super(name);
    }

    public Teacher(String name, String teach) {
        this.name = name;
        this.teach = teach;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeach() {
        return teach;
    }

    public void setTeach(String teach) {
        this.teach = teach;
    }
}
