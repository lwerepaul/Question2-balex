
package vu.balex;

public class Courses {
    private String course;
    private String courseID;
    private int tuition;

    public Courses(String courseID, String course, int tuition) {
        this.courseID = courseID;
        this.course = course;
        this.tuition = tuition;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return course;
    }

    public int getTuition() {
        return tuition;
    }

    public static Courses getCourseDetails(String courseID) {
        switch (courseID) {
            case "BSE":
                return new Courses("BSE", "Software Engineering", 900000);
            case "BIT":
                return new Courses("BIT", "Information Technology", 750000);
            case "BCS":
                return new Courses("BCS", "Computer Science", 800000);
            case "BCE":
                return new Courses("BCE", "Computer Engineering", 950000);
            default:
                return null;
        }
    }
}
