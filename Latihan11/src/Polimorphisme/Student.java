/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphisme;

/**
 *
 * @author Windows_10
 */
   public class Student extends Person {
public Student()
 {
 //super( "SomeName", "SomeAddress");
 //super();
 //super.name = "name";
 System.out.println("Inside Student:Constructor");
 }
 public String getName() {
 System.out.println("Student Name : " +name);
 return name; 
 }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student anna = new Student();
    }
    
}
