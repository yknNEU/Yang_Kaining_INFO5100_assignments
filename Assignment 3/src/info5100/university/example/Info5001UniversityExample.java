/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.CourseSchedule.Seat;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.Persona.StudentProfile;
import info5100.university.example.Persona.Faculty.FacultyProfile;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Code Test
        // One department
        Department department = new Department("Information Systems");

        // test case should be local variables
        {
            CourseCatalog coursecatalog = department.getCourseCatalog();
            // 9 Course (1 core, 8 elective)
            Course course1 = coursecatalog.newCourse("Application Engineering and Development", "INFO 5100", 4);
            Course course2 = coursecatalog.newCourse("Data Science Engineering Methods and Tools", "INFO 6105", 4);
            Course course3 = coursecatalog.newCourse("Web Design and User Experience Engineering", "INFO 6150", 4);
            Course course4 = coursecatalog.newCourse("Business Analysis and Information Engineering", "INFO 6215", 4);
            Course course5 = coursecatalog.newCourse("Software Quality Control and Management", "INFO 6255", 4);
            Course course6 = coursecatalog.newCourse("Data Management and Database Design", "DAMG 6256", 4);
            Course course7 = coursecatalog.newCourse("Concepts of Object-Oriented Design", "CSYE 6200", 4);
            Course course8 = coursecatalog.newCourse("User Experience Design and Testing", "CSYE 7280", 4);
            Course course9 = coursecatalog.newCourse("Career Management for Engineers", "ENCP 6000", 1);
            // 10 students
            Person student1 = department.getPersonDirectory().newPerson("Kaining Yang");
            Person student2 = department.getPersonDirectory().newPerson("Zihao Liu");
            Person student3 = department.getPersonDirectory().newPerson("Kalyan Satwik Adabala");
            Person student4 = department.getPersonDirectory().newPerson("Renuka Alakunta");
            Person student5 = department.getPersonDirectory().newPerson("Shreya Jaiswal");
            Person student6 = department.getPersonDirectory().newPerson("Viswanath Raju Indukuri");
            Person student7 = department.getPersonDirectory().newPerson("Uday Kiran Dasari");
            Person student8 = department.getPersonDirectory().newPerson("Janvi Bharatkumar Chitroda");
            Person student9 = department.getPersonDirectory().newPerson("Anurag Kashyap Vadapalli");
            Person student0 = department.getPersonDirectory().newPerson("Neha Palanati");
            StudentProfile studentProfile1 = department.getStudentDirectory().newStudentProfile(student1);
            StudentProfile studentProfile2 = department.getStudentDirectory().newStudentProfile(student2);
            StudentProfile studentProfile3 = department.getStudentDirectory().newStudentProfile(student3);
            StudentProfile studentProfile4 = department.getStudentDirectory().newStudentProfile(student4);
            StudentProfile studentProfile5 = department.getStudentDirectory().newStudentProfile(student5);
            StudentProfile studentProfile6 = department.getStudentDirectory().newStudentProfile(student6);
            StudentProfile studentProfile7 = department.getStudentDirectory().newStudentProfile(student7);
            StudentProfile studentProfile8 = department.getStudentDirectory().newStudentProfile(student8);
            StudentProfile studentProfile9 = department.getStudentDirectory().newStudentProfile(student9);
            StudentProfile studentProfile0 = department.getStudentDirectory().newStudentProfile(student0);
            // 10 scheduled classes
            CourseSchedule courseschedule1 = department.newCourseSchedule("Fall 2024");
            CourseOffer courseoffer1 = courseschedule1.newCourseOffer("INFO 5100");
            CourseOffer courseoffer2 = courseschedule1.newCourseOffer("INFO 6105");
            CourseOffer courseoffer3 = courseschedule1.newCourseOffer("DAMG 6256");
            CourseOffer courseoffer4 = courseschedule1.newCourseOffer("CSYE 6200");
            CourseOffer courseoffer5 = courseschedule1.newCourseOffer("ENCP 6000");
            CourseSchedule courseschedule2 = department.newCourseSchedule("Spring 2025");
            CourseOffer courseoffer6 = courseschedule2.newCourseOffer("INFO 6150");
            CourseOffer courseoffer7 = courseschedule2.newCourseOffer("INFO 6215");
            CourseOffer courseoffer8 = courseschedule2.newCourseOffer("INFO 6255");
            CourseOffer courseoffer9 = courseschedule2.newCourseOffer("CSYE 7280");
            CourseOffer courseoffer0 = courseschedule2.newCourseOffer("INFO 5100");
            courseoffer1.generatSeats(30);
            courseoffer2.generatSeats(10);
            courseoffer3.generatSeats(10);
            courseoffer4.generatSeats(10);
            courseoffer5.generatSeats(5);
            courseoffer6.generatSeats(10);
            courseoffer7.generatSeats(10);
            courseoffer8.generatSeats(10);
            courseoffer9.generatSeats(10);
            courseoffer0.generatSeats(30);
            // 20 student registerations and assign grades for Fall 2024
            CourseLoad courseLoad1a = studentProfile1.newCourseLoad("Fall 2024");
            CourseLoad courseLoad1b = studentProfile1.newCourseLoad("Spring 2025");
            courseLoad1a.newSeatAssignment(courseoffer1).grade = 3.75f;
            courseLoad1a.newSeatAssignment(courseoffer2).grade = 3.5f;
            courseLoad1b.newSeatAssignment(courseoffer6);
            CourseLoad courseLoad2a = studentProfile2.newCourseLoad("Fall 2024");
            CourseLoad courseLoad2b = studentProfile2.newCourseLoad("Spring 2025");
            courseLoad2a.newSeatAssignment(courseoffer1).grade = 3.25f;
            courseLoad2a.newSeatAssignment(courseoffer3).grade = 3.75f;
            courseLoad2b.newSeatAssignment(courseoffer7);
            CourseLoad courseLoad3a = studentProfile3.newCourseLoad("Fall 2024");
            courseLoad3a.newSeatAssignment(courseoffer1).grade = 3.0f;
            courseLoad3a.newSeatAssignment(courseoffer4).grade = 3.0f;
            CourseLoad courseLoad4a = studentProfile4.newCourseLoad("Fall 2024");
            CourseLoad courseLoad4b = studentProfile4.newCourseLoad("Spring 2025");
            courseLoad4a.newSeatAssignment(courseoffer1).grade = 4.0f;
            courseLoad4a.newSeatAssignment(courseoffer5).grade = 4.0f;
            courseLoad4b.newSeatAssignment(courseoffer6);
            courseLoad4b.newSeatAssignment(courseoffer8);
            CourseLoad courseLoad5a = studentProfile5.newCourseLoad("Fall 2024");
            CourseLoad courseLoad5b = studentProfile5.newCourseLoad("Spring 2025");
            courseLoad5a.newSeatAssignment(courseoffer1).grade = 3.75f;
            courseLoad5a.newSeatAssignment(courseoffer2).grade = 3.5f;
            courseLoad5a.newSeatAssignment(courseoffer5).grade = 4.0f;
            courseLoad5b.newSeatAssignment(courseoffer6);
            courseLoad5b.newSeatAssignment(courseoffer7);
            CourseLoad courseLoad6b = studentProfile6.newCourseLoad("Spring 2025");
            courseLoad6b.newSeatAssignment(courseoffer0);
            CourseLoad courseLoad7a = studentProfile7.newCourseLoad("Fall 2024");
            CourseLoad courseLoad7b = studentProfile7.newCourseLoad("Spring 2025");
            courseLoad7a.newSeatAssignment(courseoffer3).grade = 2.25f;
            courseLoad7a.newSeatAssignment(courseoffer4).grade = 3.0f;
            courseLoad7b.newSeatAssignment(courseoffer0);
            CourseLoad courseLoad8a = studentProfile8.newCourseLoad("Fall 2024");
            CourseLoad courseLoad8b = studentProfile8.newCourseLoad("Spring 2025");
            courseLoad8a.newSeatAssignment(courseoffer1).grade = 3.0f;
            courseLoad8b.newSeatAssignment(courseoffer7);
            CourseLoad courseLoad9a = studentProfile9.newCourseLoad("Fall 2024");
            courseLoad9a.newSeatAssignment(courseoffer5).grade = 1.0f;
            CourseLoad courseLoad0a = studentProfile0.newCourseLoad("Fall 2024");
            CourseLoad courseLoad0b = studentProfile0.newCourseLoad("Spring 2025");
            courseLoad0a.newSeatAssignment(courseoffer1).grade = 2.75f;
            courseLoad0a.newSeatAssignment(courseoffer2).grade = 3.0f;
            courseLoad0a.newSeatAssignment(courseoffer3).grade = 3.75f;
            courseLoad0b.newSeatAssignment(courseoffer6);
            courseLoad0b.newSeatAssignment(courseoffer7);
            courseLoad0b.newSeatAssignment(courseoffer9);
            // 8 Professor assigned (each professor assigned to 1 or 2 classes)
            Person professor1 = department.getPersonDirectory().newPerson("Khaled Bugrara");
            Person professor2 = department.getPersonDirectory().newPerson("Akash Murthy");
            Person professor3 = department.getPersonDirectory().newPerson("Jayshil Jain");
            Person professor4 = department.getPersonDirectory().newPerson("Sai Kale");
            Person professor5 = department.getPersonDirectory().newPerson("Ariana Brody");
            Person professor6 = department.getPersonDirectory().newPerson("Molly Xue");
            Person professor7 = department.getPersonDirectory().newPerson("Jasmine Taylor");
            Person professor8 = department.getPersonDirectory().newPerson("Marie East");
            FacultyProfile facultyProfile1 = department.facultydirectory.newFacultyProfile(professor1);
            FacultyProfile facultyProfile2 = department.facultydirectory.newFacultyProfile(professor2);
            FacultyProfile facultyProfile3 = department.facultydirectory.newFacultyProfile(professor3);
            FacultyProfile facultyProfile4 = department.facultydirectory.newFacultyProfile(professor4);
            FacultyProfile facultyProfile5 = department.facultydirectory.newFacultyProfile(professor5);
            FacultyProfile facultyProfile6 = department.facultydirectory.newFacultyProfile(professor6);
            FacultyProfile facultyProfile7 = department.facultydirectory.newFacultyProfile(professor7);
            FacultyProfile facultyProfile8 = department.facultydirectory.newFacultyProfile(professor8);
            facultyProfile1.AssignAsTeacher(courseoffer1);
            facultyProfile1.AssignAsTeacher(courseoffer0);
            facultyProfile2.AssignAsTeacher(courseoffer2);
            facultyProfile3.AssignAsTeacher(courseoffer3);
            facultyProfile3.AssignAsTeacher(courseoffer9);
            facultyProfile4.AssignAsTeacher(courseoffer4);
            facultyProfile5.AssignAsTeacher(courseoffer5);
            facultyProfile6.AssignAsTeacher(courseoffer6);
            facultyProfile7.AssignAsTeacher(courseoffer7);
            facultyProfile8.AssignAsTeacher(courseoffer8);
        }
        

        // Print a summary
        /*
         * Department: <DepartmentName>
         * \tCourse: <CouseNumber> - <CourseName> (Credits: <CreditHours>)
         * \t\tCourse Offered by: <ProfessorName>, <semister>
         * \t\t\tStudent: <StudentName>  Seat: <SeatNumber>
         * \t\t\tStudent: ...
         * \t\tCourse Offered by: ...
         * \tCourse: ...
         * 
         * Semister: <Semister>
         * \tStudent: <StudentName>, Average GPA: <GPA>, Paid: <Tuition>
         * \t\tCourse: <CouseNumber> - <CourseName> (Credits: <CreditHours>): Grade: <Grade>, Professor: <ProfessorName>
         * \t\tCourse: ...
         * \tStudent: ...
         */
        System.out.println("\033[38;2;193;156;0mDepartment\033[38;2;136;23;152m: \033[38;2;231;72;86m" + department.name);
        for (Course course : department.coursecatalog.courselist) {
            System.out.println("\t\033[38;2;193;156;0mCourse\033[38;2;136;23;152m: \033[38;2;22;198;12m" + course.getCourseNumber() + " \033[38;2;136;23;152m- \033[38;2;19;161;14m" + course.name + " \033[38;2;136;23;152m(\033[38;2;193;156;0mCredits: \033[38;2;97;214;214m" + course.getCredits() + "\033[38;2;136;23;152m)");
            for (String semister : department.mastercoursecatalog.keySet()) {
                CourseOffer courseoffer = department.mastercoursecatalog.get(semister).getCourseOfferByNumber(course.getCourseNumber());
                if (courseoffer != null) {
                    System.out.println("\t\t\033[38;2;193;156;0mCourse Offered by\033[38;2;136;23;152m: \033[38;2;242;242;242m" + courseoffer.facultyassignment.facultyprofile.person.id + "\033[38;2;136;23;152m, \033[38;2;54;120;255m" + semister);
                    for (StudentProfile studentProfile : department.studentdirectory.studentlist) {
                        CourseLoad courseload = studentProfile.transcript.getCourseLoadBySemester(semister);
                        if (courseload != null) {
                            for (SeatAssignment seatAssignment : courseload.seatassignments) {
                                if (seatAssignment.getAssociatedCourse().getCourseNumber().equals(course.getCourseNumber())) {
                                    System.out.println("\t\t\t\033[38;2;193;156;0mStudent\033[38;2;136;23;152m: \033[38;2;118;118;118m" + studentProfile.person.id + "  \033[38;2;193;156;0mSeat\033[38;2;136;23;152m: \033[38;2;97;214;214m" + seatAssignment.getSeat().number);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("\033[38;2;249;241;165m-----------------------------------------------------------------------------");
        for (String semister : department.mastercoursecatalog.keySet()) {
            System.out.println("\033[38;2;193;156;0mSemister\033[38;2;136;23;152m: \033[38;2;54;120;255m" + semister);
            for (StudentProfile studentProfile : department.studentdirectory.studentlist) {
                float totalGrade = 0;
                int totalCredits = 0;
                int totalTuition = 0;
                CourseLoad courseload = studentProfile.transcript.getCourseLoadBySemester(semister);
                if (courseload != null) {
                    for (SeatAssignment seatAssignment : courseload.seatassignments) {
                        totalGrade += seatAssignment.grade * seatAssignment.getAssociatedCourse().getCredits();
                        totalCredits += seatAssignment.getAssociatedCourse().getCredits();
                        totalTuition += seatAssignment.getAssociatedCourse().getCoursePrice();
                    }
                }
                System.out.println("\t\033[38;2;193;156;0mStudent\033[38;2;136;23;152m: \033[38;2;118;118;118m" + studentProfile.person.id + "\033[38;2;136;23;152m, \033[38;2;193;156;0mAverage GPA\033[38;2;136;23;152m: \033[38;2;97;214;214m" + totalGrade / totalCredits + "\033[38;2;136;23;152m, \033[38;2;193;156;0mPaid\033[38;2;136;23;152m: \033[38;2;97;214;214m$" + totalTuition);
                if (courseload != null) {
                    for (SeatAssignment seatAssignment : courseload.seatassignments) {
                        Course course = seatAssignment.getAssociatedCourse();
                        System.out.println("\t\t\033[38;2;193;156;0mCourse\033[38;2;136;23;152m: \033[38;2;22;198;12m" + course.getCourseNumber() + " \033[38;2;136;23;152m- \033[38;2;19;161;14m" + course.name + " \033[38;2;136;23;152m(\033[38;2;193;156;0mCredits\033[38;2;136;23;152m: \033[38;2;97;214;214m" + course.getCredits() + "\033[38;2;136;23;152m): \033[38;2;193;156;0mGrade\033[38;2;136;23;152m: \033[38;2;97;214;214m" + seatAssignment.grade + "\033[38;2;136;23;152m, \033[38;2;193;156;0mProfessor\033[38;2;136;23;152m: \033[38;2;242;242;242m" + seatAssignment.getCourseOffer().facultyassignment.facultyprofile.person.id);
                    }
                }
            }
        }
        System.out.println("\033[0m");
    }
}
