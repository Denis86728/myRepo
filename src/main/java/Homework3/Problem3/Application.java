package Homework3.Problem3;

import org.openqa.selenium.json.JsonOutput;

public class Application {
    public static void main(String[] args) {
        Group group1 = new Group(1, "Group1");
        Group group2 = new Group(2, "Group2");
        Teacher teacher1 = new Teacher(1, "Teacher1");
        Teacher teacher2 = new Teacher(2, "Teacher2");
        Teacher teacher3 = new Teacher(3, "Teacher3");
        Teacher teacher4 = new Teacher(4, "Teacher4");
        Student student1 = new Student(1, "Student1");
        Student student2 = new Student(2, "Student2");
        Student student3 = new Student(3, "Student3");
        Course course1 = new Course(1, "Course1");
        Course course2 = new Course(2, "Course2");

        group1.addTeacher(teacher1);
        group1.addTeacher(teacher2);
        group1.addTeacher(teacher3);
        group1.addTeacher(teacher4);
        group2.addTeacher(teacher1);
        group2.addTeacher(teacher2);
        group2.addTeacher(teacher3);
        group2.addTeacher(teacher4);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);
        group2.addStudent(student1);
        group2.addStudent(student2);
        group2.addStudent(student3);

        teacher1.addCourse(course1);
        teacher1.addCourse(course2);
        teacher2.addCourse(course1);
        teacher2.addCourse(course2);

        //before update
        System.out.println(
            "The group " + group1.getName() + " with teacher " + group1.getTeacherById(1).getName()
                + " has the following courses " + teacher1
                .getCourseById(1).getName() + " " + teacher1.getCourseById(2).getName() + " and students " + group1
                .getStudentById(1).getName() + " " + group1.getStudentById(2).getName() + " " + group1.getStudentById(3)
                .getName() + ".");
        //before update
        System.out.println(
            "The group " + group2.getName() + " with teacher " + group2.getTeacherById(2).getName()
                + " has the following courses " + teacher2
                .getCourseById(1).getName() + " " + teacher2.getCourseById(2).getName() + " and students " + group2
                .getStudentById(1).getName() + " " + group2.getStudentById(2).getName() + " " + group2.getStudentById(3)
                .getName() + ".");

        //update Course1 from Teacher1
        //update Student1 from Group2
        //update Teacher2 from Group2
        teacher1.updateCourse(course1, 4, "Course3");
        group2.updateStudent(student1, 5, "Student4");
        group2.updateTeacher(teacher2, 9, "Teacher6");

        System.out.println(" ");
        System.out.println("The course for " + teacher1.getName() + " has been modified!");
        System.out.println("The student from " + group2.getName() + " has been modified!");
        System.out.println("The teacher from " + group2.getName() + " has been modified!");
        System.out.println(" ");

        //afterUpdate
        System.out.println(
            "The group " + group1.getName() + " with teacher " + group1.getTeacherById(1).getName()
                + " has the following courses " + teacher1
                .getCourseById(4).getName() + " " + teacher1.getCourseById(2).getName() + " and students " + group1
                .getStudentById(1).getName() + " " + group1.getStudentById(2).getName() + " " + group1.getStudentById(3)
                .getName() + ".");

        //afterUpdate
        System.out.println(
            "The group " + group2.getName() + " with teacher " + group2.getTeacherById(9).getName()
                + " has the following courses " + teacher2
                .getCourseById(1).getName() + " " + teacher2.getCourseById(2).getName() + " and students " + group2
                .getStudentById(5).getName() + " " + group2.getStudentById(2).getName() + " " + group2.getStudentById(3)
                .getName() + ".");
        System.out.println(" ");

        //before remove
        System.out.println(group2.getTeachers());
        System.out.println(group2.getStudents());
        System.out.println(teacher1.getCourses());
        System.out.println(" ");

        teacher1.removeCourse(1);
        group2.removeStudent(5);
        group2.removeTeacher(9);

        //after remove
        System.out.println(
            group2.getTeachers());
        System.out.println(group2.getStudents());
        System.out.println(teacher1.getCourses());

    }

}
