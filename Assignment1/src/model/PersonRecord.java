/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;


/**
 *
 * @author jiaf
 */
public class PersonRecord {

    public ArrayList<Person> getRecords() {
        return person;
    }

    public void setRecords(ArrayList<Person> records) {
        this.person = records;
    }
    private ArrayList<Person> person;
    
    public PersonRecord(){
        this.person = new ArrayList<>();
    }
    public void addNewPerson (Person pers){
        this.person.add(pers);
    }
    public void deletePerson (Person pers){
        this.person.remove(pers);
    }
}
