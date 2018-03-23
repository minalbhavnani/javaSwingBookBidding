/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Books.Author;
import Business.Books.Book;
import Business.Books.Catagory;
import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Bengre
 */
public class ConfigureASystem {
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        Scanner scanner;
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee();
        employee.setFirstName("System");
        employee.setLastName("Admin");       
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        try {
            scanner = new Scanner(new FileReader("Catagories.csv"));        
            scanner.nextLine();
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] splits = line.split(",");
            Catagory c = system.getCd().createAndAddCatagory();                
            c.setName(splits[0]);
            }
            scanner.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("IO ERROR received: "+ ex.getMessage());
        }
        
        try {
            scanner = new Scanner(new FileReader("BooksFinal.csv"));        
            scanner.nextLine();
            while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] splits = line.split(",");
            Book b = system.getBd().createAndAddBooks();
            b.setName(splits[0]);
            String catName = splits[1];
            Catagory catagory = null;
            for(Catagory c: system.getCd().getListOfCatagory()){
                if(c.getName().equals(catName)){
                    catagory = c;
                }
            }
            if(catagory == null){
                catagory= system.getCd().createAndAddCatagory();
                catagory.setName(catName);
            }
            b.setCatagory(catagory);
            b.setAbout(splits[2]);
            String authorName = splits[3];
            Author a = null;
            for(Author aut:system.getAd().getListOfAuthor()){
                if(aut.getName().equals(authorName))
                    a=aut;
            }
            if(a == null){
                a= system.getAd().createAndAddAuthor();
                a.setName(authorName);
            }
            b.setAuthor(a);
            }
            scanner.close();
            
        } catch (FileNotFoundException ex) {
            System.err.println("IO ERROR received: "+ ex.getMessage());
        }
        
        return system;
    }
}
