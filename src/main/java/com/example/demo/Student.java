package com.example.demo;

//clase Student

public class Student {

    //atributos encapsulados
    private int id;

    private String name; 

    // metodos getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // constructor con parametros.
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //constructor sin parametros.
    public Student() {
        this.id = 0;
        this.name = "";
    }

}
