/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Campus;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Floor {
    public int number;
    public ArrayList<Classroom> rooms;
    public Building building;

    public Floor(int n, Building b) {
        number = n;
        building = b;
        rooms = new ArrayList<Classroom>();
    }

    public void newRoom(int n) {
        Classroom r = new Classroom(n, this); //pass the floor object for reference
        rooms.add(r);
    }

    public Boolean isFloorSafe() {
        //check each classroom. If all classrooms are safe then floor is safe
        for (Classroom room : rooms) {
            if (!room.isRoomSafe()) {
                return false;
            }
        }
        return true;
    }
}
