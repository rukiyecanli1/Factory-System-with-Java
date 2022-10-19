/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorysystem;

import java.util.ArrayList;

/**
 *@author Rukiye Canlı
 * 
 * The project is written in Java that represents "Employee" factory workers and 
 * their salaries with its methods. Employee class has 4 attributes and 5 
 * methods. Employee's name, salary, weekly working hours, starting year, tax, 
 * bonus, salary increase, salary with taxes and bonuses and the total salary is 
 * printed here in main class.
 * 
 */
public class FactorySystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // creation of Employee objects 
        Employee emp1 = new Employee("Ali Demir", 12000, 30, 2017);
        Employee emp2 = new Employee("Ayse Yildiz", 28000, 42, 2007);
        Employee emp3 = new Employee("Emre Korkmaz", 15000, 35, 2016);
        Employee emp4 = new Employee("Veli Turk", 30000, 45, 2012);
        Employee emp5 = new Employee("Aysel Yilmaz", 35000, 50, 2011);

        // addition them to an Employee type ArrayList
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);
        
        int totalSalary ;
        int salaryWithTaxAndIncomes ;
  
        // printing information on the console
        for (Employee emp : empList) {
            System.out.println(emp.toString());
        
            System.out.println("Calisana Odenecek Bonus: " + emp.bonus());
            System.out.println("Calisanin Odeyecegi Vergi: " + emp.tax());
            System.out.println("Calisana Odenecek Zam: " + emp.raiseSalary());
             
            totalSalary = emp.getSalary() + emp.raiseSalary() + emp.bonus();
            salaryWithTaxAndIncomes = totalSalary - emp.tax() ;
            
            System.out.println("Calisanin Toplam Maasi: " + totalSalary);
            System.out.println("Calisanin Vergi ve Bonuslarla birlikte Maasi: " 
            + salaryWithTaxAndIncomes);
            System.out.println("-------------------------------------");
        }

    }

}
