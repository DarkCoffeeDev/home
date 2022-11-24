
import javax.swing.*;

public class home {
    public static void main(String[] args) {
        //create access with password using JOptionPane and hide password
        String password = JOptionPane.showInputDialog("Enter password");
        if (password.equals("1234")) {
            //if password is correct, open the main menu
            mainMenu();
        } else {
            //if password is incorrect, show error message and close program
            JOptionPane.showMessageDialog(null, "Incorrect password");
            System.exit(0);
        }

    }
    //create main menu
    public static void mainMenu() {
        //create menu
        String[] menu = {"Add", "Edit", "Delete", "View", "Exit"};
        //create menu with options
        int option = JOptionPane.showOptionDialog(null, "Choose an option", "Main Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);
        //if option is add, open add menu
        if (option == 0) {
            addMenu();
        }
        //if option is edit, open edit menu
        if (option == 1) {
            editMenu();
        }
        //if option is delete, open delete menu
        if (option == 2) {
            deleteMenu();
        }
        //if option is view, open view menu
        if (option == 3) {
            viewMenu();
        }
        //if option is exit, close program
        if (option == 4) {
            System.exit(0);
        }
    }

    private static void viewMenu() {
        // TODO Auto-generated method stub

    }

    private static void editMenu() {
        // TODO Auto-generated method stub

    }

    private static void addMenu() {
        //create menu
        String[] menu = {"Add Student", "Add Teacher", "Add Course", "Add Class", "Back"};
        //create menu with options
        int option = JOptionPane.showOptionDialog(null, "Choose an option", "Add Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);
        //if option is add student, open add student menu
        if (option == 0) {
            addStudentMenu();
        }
        //if option is add teacher, open add teacher menu
        if (option == 1) {
            addTeacherMenu();
        }
        //if option is add course, open add course menu
        if (option == 2) {
            addCourseMenu();
        }
        //if option is add class, open add class menu
        if (option == 3) {
            addClassMenu();
        }
        //if option is back, open main menu
        if (option == 4) {
            mainMenu();
        }
    }

    private static void addCourseMenu() {
        // TODO Auto-generated method stub
        //ADD COURSE NAME
        String courseName = JOptionPane.showInputDialog("Enter course name");
        //ADD COURSE CODE
        String courseCode = JOptionPane.showInputDialog("Enter course code");
        //ADD COURSE TEACHER
        String courseTeacher = JOptionPane.showInputDialog("Enter course teacher");
        //ADD COURSE CLASS
        String courseClass = JOptionPane.showInputDialog("Enter course class");
        //ADD COURSE STUDENTS
        String courseStudents = JOptionPane.showInputDialog("Enter course students");
        //ADD COURSE DESCRIPTION
        String courseDescription = JOptionPane.showInputDialog("Enter course description");
        //ADD COURSE DURATION
        String courseDuration = JOptionPane.showInputDialog("Enter course duration");
        //ADD COURSE START DATE
        String courseStartDate = JOptionPane.showInputDialog("Enter course start date");
        //ADD COURSE END DATE
        String courseEndDate = JOptionPane.showInputDialog("Enter course end date");


    }

    private static void addClassMenu() {
        // TODO Auto-generated method stub
        //name class JOptionPane
        String name = JOptionPane.showInputDialog("Enter class name");
        //name teacher JOptionPane
        String teacher = JOptionPane.showInputDialog("Enter teacher name");
        //name student JOptionPane
        String student = JOptionPane.showInputDialog("Enter student name");
        //name course JOptionPane
        String course = JOptionPane.showInputDialog("Enter course name");
        //SHOW CLASS NAME
        JOptionPane.showMessageDialog(null, "Class name: " + name);
        //SHOW TEACHER NAME
        JOptionPane.showMessageDialog(null, "Teacher name: " + teacher);
        //SHOW STUDENT NAME
        JOptionPane.showMessageDialog(null, "Student name: " + student);
        //SHOW COURSE NAME
        JOptionPane.showMessageDialog(null, "Course name: " + course);


    }

    private static void addTeacherMenu() {
        // TODO Auto-generated method stub
        //teacher name JOptionPane
        String teacherName = JOptionPane.showInputDialog("Enter teacher name");
        //teacher surname JOptionPane
        String teacherSurname = JOptionPane.showInputDialog("Enter teacher surname");
        //teacher age JOptionPane
        String teacherAge = JOptionPane.showInputDialog("Enter teacher age");



    }

    private static void addStudentMenu() {
        // TODO Auto-generated method stub
        //student name JOptionPane
        String studentName = JOptionPane.showInputDialog("Enter student name");
        //student surname JOptionPane
        String studentSurname = JOptionPane.showInputDialog("Enter student surname");
        //student age JOptionPane
        String studentAge = JOptionPane.showInputDialog("Enter student age");

    }

    private static void deleteMenu() {
        // TODO Auto-generated method stub

    }
    //ADD SHOW MENU METHOD
    public static void showMenu() {
        //create menu
        String[] menu = {"Add", "Edit", "Delete", "View", "Exit"};
        //create menu with options
        int option = JOptionPane.showOptionDialog(null, "Choose an option", "Main Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, menu, menu[0]);
        //if option is add, open add menu
        if (option == 0) {
            addMenu();
        }
        //if option is edit, open edit menu
        if (option == 1) {
            editMenu();
        }
        //if option is delete, open delete menu
        if (option == 2) {
            deleteMenu();
        }
        //if option is view, open view menu
        if (option == 3) {
            viewMenu();
        }
        //if option is exit, close program
        if (option == 4) {
            System.exit(0);
        }
    }

}
