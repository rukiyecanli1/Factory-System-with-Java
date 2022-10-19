/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorysystem;

/**
 *
 * @author Rukiye Canlı
 */
public class Employee {
    
    // variables
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;

    // constructor with parameters
    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    // get method to get salary info in FactorySystem.class
    public int getSalary() {
        return salary;
    }
 
    // set method to set salary info in FactorySystem.class
    public void setSalary(int salary) {
        this.salary = salary;
    }


    //overriding the toString() method  
    public String toString(){
    return ("Calisanin Adi Soyadi: " + name + "\n" +
          "Calisanin Maasi: " + salary + "\n" +
          "Calisanin Haftalik Calisma Saati: " + workHours + "\n" +
          "Calisanin Ise Baslangic Yili: " + hireYear + "\n");
 }  
    
    
    
  // method to calcute tax on salary
  public int tax() {
      return this.salary > 1000
        ? this.salary*3/100
        : 0; 
  }


  // method to calculate bonus based on weekly working hours
  public int bonus() {
       return this.workHours > 40
        ? (this.workHours-40)*30*4 // to multiple by 4 for getting montly bonus
        : 0; 
  }


 
  // method to calculate the salary increase based on the employee's start year
  public int raiseSalary(){
      int raise = 0 ;
      int currentYear = 2021;
      int workedYears = currentYear - this.hireYear;
      int newSalary = this.salary +bonus()-tax();
      if( workedYears < 10)
          raise = newSalary*5/100;
      else if(workedYears > 9 && workedYears < 20)
          raise = newSalary*10/100;
      else if(workedYears > 19)
          raise = newSalary*15/100;
      
      return raise;
  }
}
