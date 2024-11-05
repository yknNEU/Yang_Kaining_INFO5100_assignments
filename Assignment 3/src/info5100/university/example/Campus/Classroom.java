/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Campus;

import java.util.ArrayList;

import info5100.university.example.CourseSchedule.Seat;

/**
 *
 * @author kal bugrara
 */
public class Classroom {
    public int number;
    public Floor floor;
    public Sprinkler sprinkler;
    public ArrayList<Seat> seats;

    public Classroom(int n, Floor f) {
        number = n;
        seats = new ArrayList<Seat>();
        floor = f;
        sprinkler = null;
    }

    public void setSprinkler(String m, String sn) {
        sprinkler = new Sprinkler(m, sn);
    }

    public void generateSeats(int size){
        for (int i = 0; i<size; i++) {
            Seat s = new Seat(null, i);
            seats.add(s);
        }
    }

    public Boolean isRoomSafe() {
        if (sprinkler == null) {
            return false;
        }
        if (sprinkler.isActive() == true) {
            return true;
        }
        else {
            return false;
        }
    }
}
