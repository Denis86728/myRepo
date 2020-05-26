package Homework3.Problem3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Teacher {
    Set<Course> courses;

    private int id;

    private String name;

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
        courses = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public Course getCourseById(int id) {
        Course foundCourse = null;
        Iterator<Course> iterator = this.courses.iterator();
        while (iterator.hasNext()) {
            Course currentCourse = iterator.next();
            if (currentCourse.getId() == id) {
                foundCourse = currentCourse;
            }

        }
        if (foundCourse != null) {
            return foundCourse;
        } else {
            System.out.println("No course found!");
        }

        return foundCourse;
    }

    public void addCourse(Course course) {
        if (course != null) {
            courses.add(course);
        } else {
            System.out.println("This is not a course");
        }
    }

    public void updateCourse(Course course, int id, String name) {
        if (courses.contains(course)) {
            Course updatedCourse = new Course(id, name);
            courses.remove(course);
            courses.add(updatedCourse);
        } else {
            System.out.println("Course not found.");
        }
    }

    public void removeCourse(int id) {
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course removedCourse = iterator.next();
            if (removedCourse.getId() == id) {
                courses.remove(removedCourse);
            }
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Course " + id +
            ", name='" + name + '\'';
    }

}
