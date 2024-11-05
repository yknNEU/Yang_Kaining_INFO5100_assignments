/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.EmploymentHistory;

import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.Employer.EmployerProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Employment {
    public ArrayList<CourseOffer> relevantcourseoffers;
    public int weight;
    public String quality;
    public String job;
    public Employment nextemplyment;  //next job so they are in a sequence 
    
    public EmployerProfile employer;

    public Employment(String j){    
        relevantcourseoffers = new ArrayList<CourseOffer>();
        job = j;
    }
}
