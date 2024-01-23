/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Afifah
 */
public class bola {

    double r;

    double volume() {
        double volume = 4.0 / 3.0 * 3.14 * r * r * r;
        System.out.println("Volume Bola : " + volume + "cm3");
        return volume;
    }
}

