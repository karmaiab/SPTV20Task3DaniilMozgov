/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20task3daniilmozgov;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class SPTV20Task3DaniilMozgov {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year = 0;
        int day = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.next();
        System.out.println("Surname: ");
        String surname = scanner.next();
        System.out.println("Year: ");
        year = scanner.nextInt();
        System.out.println("Month: ");
        String month = scanner.next();
        System.out.println("Day: ");
        day = scanner.nextInt();
        System.out.printf(name+" "+surname+" "+"was born on the"+" "+day+" "+month+" "+year);
    }
    
}
