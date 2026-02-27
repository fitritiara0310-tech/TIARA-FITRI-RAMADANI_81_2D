/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tgspakafif;

/**
 *
 * @author UsEr
 */
public class TGSPAKAFIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Membuat object dari class Person
        Person person1 = new Person("Tiara Fitri Ramadani", 18, "Gresik");

        // Menampilkan informasi object
        person1.displayInfo();
    }
}

// Class Person
class Person {
    // Atribut
    String name;
    int age;
    String city;

    // Constructor
    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    // Method untuk menampilkan informasi
    public void displayInfo() {
        System.out.println("Nama  : " + name);
        System.out.println("Umur  : " + age);
        System.out.println("Kota  : " + city);
    }
    
}
