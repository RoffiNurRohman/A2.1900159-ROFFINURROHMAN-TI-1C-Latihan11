/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorphisme;

/**
 *
 * @author Windows_10
 */
public class Employee extends Person {
public String getName() {
 System.out.println("Employee Name:" +name);
 return name;
}
    public static void main(String[] args) {
        // TODO code application logic here
    
    Person ref;
 Student studentObject = new Student();
 Employee employeeObject = new Employee();

 ref = studentObject; //Person menunjuk kepada object Student

 String temp = ref.getName(); //getName dari Student class dipanggil
 System.out.println(temp);

 ref = employeeObject; //Person menunjuk kepada object Employee

 temp = ref.getName(); //getName dari Employee class dipanggil
 System.out.println(temp);
    }
}
