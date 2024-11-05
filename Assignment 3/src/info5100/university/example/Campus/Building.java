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
public class Building {
    public int number;
    public ArrayList<Floor> floors;
    public Address address;

    public Building(int n, Address ad) {
        number = n;
        address = ad;
        floors = new ArrayList<Floor>();
    }

    public Floor addNewFloor(int n) {
        Floor f = new Floor(n, this); //reference back to building;
        floors.add(f);
        return f;
    }

    public Boolean isBuildingSafe() {
        //Building is safe if all floors are safe
        for (Floor f: floors) {
            if (!f.isFloorSafe()) {
                return false;
            }
        }
        return true; 
    }
}
