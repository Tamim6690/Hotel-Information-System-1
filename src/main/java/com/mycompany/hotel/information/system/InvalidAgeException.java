/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.information.system;

/**
 *
 * @author Tamim
 */

// if the customer enter invalid Age 
class InvalidAgeException extends Exception { 

    InvalidAgeException(String e) {
        System.out.println(e);
    }
    
}
