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
    
    private ArrayList<Person> record;
    
    public PersonRecord(){
        this.record = new ArrayList<>();
    }

    public ArrayList<Person> getRecord() {
        return record;
    }

    public void setRecord(ArrayList<Person> record) {
        this.record = record;
    }


    public Person addNewPerson (){
        Person newPerson = new Person();
        record.add(newPerson);
        return newPerson;
    }
    public void deletePerson (Person pers){
        this.record.remove(pers);
    }
}
