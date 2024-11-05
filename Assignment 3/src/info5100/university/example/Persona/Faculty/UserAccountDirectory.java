/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Persona.Faculty;

import info5100.university.example.Persona.*;
import info5100.university.example.Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class UserAccountDirectory {
    public Department department;
    public ArrayList<UserAccount> studentlist;

    public UserAccountDirectory(Department d) {
        department = d;
        studentlist = new ArrayList<UserAccount>();
    }

    public UserAccount newUserAccount(Person p) {
        UserAccount sp = new UserAccount(p);
        studentlist.add(sp);
        return sp;
    }

    public UserAccount findStudent(String id) {
        for (UserAccount sp : studentlist) {
            //   if (sp.isMatch(id)) {
            //       return sp;
            //   }
        }
        return null; //not found after going through the whole list
    }
}
