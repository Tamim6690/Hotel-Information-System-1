/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel.information.system;

///**

import java.util.Scanner;
import java.util.ArrayList;



public class Hotel {

      public static void main(String[] args) throws InvalidAgeException {
        Scanner key=new Scanner(System.in);
        ArrayList<Customer>customerList=new ArrayList<Customer>();
        char cont='y';
        while(cont=='y'){
            System.out.println("-------------------------------");
        System.out.println("1- Add a new customer");   // prent  add a new customer//
        System.out.println("2- Print customer information of the hotel"); // print information of customers in hotel//
        System.out.println("3- Exit ...");
        int s=key.nextInt();
        if(s==1)
        {
            System.out.println("Input ID "); // prent ID of Customer          
                String i=key.next();
                System.out.println("input name");    //prent name of custemer
                String n=key.next(); 
                System.out.println("Input age");    //prent age of custemer
                int g=key.nextInt();
                
                System.out.println("Input address");    // prent address
                String r=key.next();
                System.out.println("Input mobile number"); //prent mobail number
                String m=key.next();
                System.out.println("Input email");  //prent email
                String e=key.next();
                System.out.println("Input type");   //prent type of Room (Royal or One bed rom)
                char t=key.next().charAt(0);
                Customer p=new Customer(i,t,n,g,r,m,e) ;
                customerList.add(p);
        }
        else if(s==2) //print all information of customers 
        {
            for(int i=0;i<customerList.size();i++)
                {
                    System.out.println(customerList.get(i)); 
                }  
        }
        else if(s==3) //Exit
        {
            cont='n';
        }
        else  
        {
            System.out.println("try again ...."); // if there wrong data enter 
        }
    }
    }  
}
