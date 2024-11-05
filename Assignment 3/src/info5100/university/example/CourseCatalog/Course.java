/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example.CourseCatalog;

/**
 *
 * @author kal bugrara
 */
public class Course {
    public String number;
    public String name;
    public int credits;
    public int price;

    public Course(String n, String numb, int ch) {
        name = n;
        number = numb;
        credits = ch;
        price = 1500; // Per credit hour
    }

    public String getCourseNumber() {
        return number;
    }

    public int getCoursePrice() {
        return price * credits;
    }

    public int getCredits() {
        return credits;
    }
}