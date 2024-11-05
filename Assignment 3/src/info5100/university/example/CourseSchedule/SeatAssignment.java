/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseSchedule;

import info5100.university.example.CourseCatalog.Course;

/**
 *
 * @author kal bugrara
 */
public class SeatAssignment {
    public float grade; //(Letter grade mappings: A=4.0, A-=3.7, B+=3.3, B=3.0, )
    public Seat seat;
    public boolean like; //true means like and false means not like
    public CourseLoad courseload;

    public SeatAssignment(CourseLoad cl, Seat s) {
        seat = s;
        courseload = cl;
    }
     
    public boolean getLike() {
        return like;
    }

    public void assignSeatToStudent(CourseLoad cl) {
        courseload = cl;
    }
    
    public int getCreditHours() {
        return seat.getCourseCredits();
    }

    public Seat getSeat() {
        return seat;
    }

    public CourseOffer getCourseOffer() {
        return seat.getCourseOffer();
    }

    public Course getAssociatedCourse() {
        return getCourseOffer().getSubjectCourse();
    }
    
    public float GetCourseStudentScore() {
        return getCreditHours() * grade;
    }

    public String getLetterGrade() {
        if (grade >= 3.95) {
            return "A";
        } else if (grade >= 3.65) {
            return "A-";
        } else if (grade >= 3.25) {
            return "B+";
        } else if (grade >= 2.95) {
            return "B";
        } else if (grade >= 2.65) {
            return "B-";
        } else if (grade >= 2.25) {
            return "C+";
        } else if (grade >= 1.95) {
            return "C";
        } else if (grade >= 1.65) {
            return "C-";
        } else {
            return "F";
        }
    }
}
