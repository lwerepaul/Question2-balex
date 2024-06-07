
package vu.balex;

//import Scanner class for storing user input
 import java.util.Scanner;
public class Balex  {
   
    public static void main(String[] args) {
       Scanner save=new Scanner(System.in);
       
    
       System.out.print("Enter the CourseID: ");
        String courseID = save.nextLine().trim();

        Courses course = Courses.getCourseDetails(courseID);
        if (course != null) {
            System.out.println("CourseID: " + course.getCourseID());
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Tuition: " + course.getTuition());
        } else {
            System.out.println("");
        }
    }
    }

