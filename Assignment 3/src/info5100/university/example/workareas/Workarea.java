/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.workareas;

import info5100.university.example.Persona.Person;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Workarea {
    public Person person; //owner
    public ArrayList<WorkRequest> inQueue;
    public ArrayList<WorkRequest> outQueue;
    
    public Workarea(Person p){
        person = p;
        inQueue = new ArrayList<WorkRequest>();
        outQueue = new ArrayList<WorkRequest>();
    }
    
    public void addInQuestRequest(WorkRequest wr){
        inQueue.add(wr);
    }
}
