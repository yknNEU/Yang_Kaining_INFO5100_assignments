/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.Campus;

/**
 *
 * @author kal bugrara
 */
public class Address {

    public int number;
    public String street;
    public String zipcode;
    public String gps;

    public Address(int n, String s, String zip, String g) {
        number = n;
        street = s;
        zipcode = zip;
        gps = g;  
    }
}
