package com.company;

public class Person {
    String name;
    int age;
    String dni;
    float weidth;
    float heigth;



    public Person(){
    }

    public Person(String name, int age, String dni){
        this.name = name;
        this.age = age;
        this.dni = dni;
    }

    public Person(String name, int age, String dni, float height, float width) {
        this.name = name;
        this.age = age;
        this.dni = dni;
        this.weidth = height;
        this.heigth = width;
    }

    public String calcularIMC(){
        float imc = weidth/(heigth * heigth);
        if (imc > 25) {
            return "Sobrepeso";
        } else if (imc >= 20 && imc <= 25){
            return "Peso saludable";
        } else {
            return "Bajo peso";
        }
    }

    public boolean esMayorDeEdad(){
            if (age > 17){
                return true;
            }
        return false;
    }

    @Override
    public String toString() {
        return
                "Nombre='" + name +
                ", Edad=" + age +
                ", dni='" + dni +
                ", Peso=" + weidth +
                ", Altura=" + heigth +
                ", IMC=" + calcularIMC() +
                ", Es mayor?=" + esMayorDeEdad()
                ;
    }
}
