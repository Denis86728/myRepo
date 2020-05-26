package Homework3.Problem3;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Course {
    Set<Course> courses;

    private int id;

    private String name;

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id){
        if(id > 0){
            this.id = id;
        }
        else{
            this.id = 0;
        }
    }

    public void setName(String name){
        if(name !=null && !name.isEmpty()){
            this.name = name;
        }
        else{
            this.name = "unknown";
        }
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Course "+ id +
            ", name='" + name + '\'';
    }


}


