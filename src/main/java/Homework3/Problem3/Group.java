package Homework3.Problem3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Group {
    private int id;

    private String name;

    private Set<Teacher> teachers;

    private Set<Student> students;

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
        teachers = new HashSet<>();
        students = new HashSet<>();
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

    public Set<Teacher> getTeachers() {
        return this.teachers;
    }

    public Set<Student> getStudents() {
        return this.students;
    }

    public Teacher getTeacherById(int id) {
        Teacher foundTeacher = null;
        Iterator<Teacher> iterator = this.teachers.iterator();
        while (iterator.hasNext()) {
            Teacher currentTeacher = iterator.next();
            if (currentTeacher.getId() == id) {
                foundTeacher = currentTeacher;
            }
        }
        if (foundTeacher != null) {
            return foundTeacher;
        } else {
            System.out.println("No teacher found!");
        }
        return foundTeacher;
    }

    public Student getStudentById(int id) {
        Student foundStudent = null;
        Iterator<Student> iterator = this.students.iterator();
        while (iterator.hasNext()) {
            Student currentStudent = iterator.next();
            if (currentStudent.getId() == id) {
                foundStudent = currentStudent;
            }
        }
        if (foundStudent != null) {
            return foundStudent;
        } else {
            System.out.println("No student found!");
        }
        return foundStudent;
    }

    public void addTeacher(Teacher teacher) {
        if (teacher != null) {
            this.teachers.add(teacher);
        } else {
            System.out.println("This is not a teacher!");
        }
    }

    public void addStudent(Student student) {
        if (student != null) {
            this.students.add(student);
        } else {
            System.out.println("This is not a student");
        }
    }

    public void updateTeacher(Teacher teacher, int id, String name) {
        if (teachers.contains(teacher)) {
            Teacher updateTeacher = new Teacher(id, name);
            this.teachers.remove(teacher);
            this.teachers.add(updateTeacher);
        } else {
            System.out.println("No teacher found!");
        }
    }

    public void updateStudent(Student student, int id, String name) {
        if (students.contains(student)) {
            Student updateStudent = new Student(id, name);
            this.students.remove(student);
            this.students.add(updateStudent);
        } else {
            System.out.println("No student found!");
        }
    }

    public void removeTeacher(int id) {
        Iterator<Teacher> iterator = this.teachers.iterator();
        while (iterator.hasNext()) {
            Teacher removedTeacher = iterator.next();
            if (removedTeacher.getId() == id) {
                this.teachers.remove(removedTeacher);
            }
        }
    }

    public void removeStudent(int id) {
        Iterator<Student> iterator = this.students.iterator();
        while (iterator.hasNext()) {
            Student removeStudent = iterator.next();
            if (removeStudent.getId() == id) {
                this.students.remove(removeStudent);
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
