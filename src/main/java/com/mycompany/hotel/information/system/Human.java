/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hotel.information.system;

/**
 *
 * @author Tamim
 */


public class Human {
    private String name;
    private int age;
    private String address;
    private String mobileNumber;
    private String email;

    public Human(String name, int age, String address, String mobileNumber, String email) throws InvalidAgeException {
        this.name = name;
        setAge(age); 
        this.address = address;
        this.mobileNumber = mobileNumber;
        this.email = email;
    }
     //set and get for private instance
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)throws InvalidAgeException {
        if(age>=18)
            this.age=age;      //the customer should hava 18 years or more 
        else
            throw new InvalidAgeException("Age should be greater than or equal to 18 years old!");
    }                //called Exception function  

    public String getAddress() {
        return address;
    }
   
    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
    @Override                       // to print data 
    public String toString() {
        return  "\nname=" + name + "\n age=" + age + "\naddress=" + address + "\nmobileNumber=" + mobileNumber + "\nemail=" + email ;
    }
    
}

