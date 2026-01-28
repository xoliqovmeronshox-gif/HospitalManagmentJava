package model;

public class Patient {
    private final int id;
    private final String name;
    private final int age;
    private final String disease;


    public Patient(int id, String name, int age, String disease) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.disease = disease;
    }
    public int getId(){
        return id;
    }
    @Override
    public String toString(){
        return "Patient ID: " + id +
                ", Name: " + name +
                ", Age: " + age +
                ", Disease: " + disease;
    }
}