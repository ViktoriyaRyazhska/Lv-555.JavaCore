package HW6.Task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Student {
    private String name;
    private int course;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
    public Student (String name, int course){
        this.course=course;
        this.name=name;
    }
}
