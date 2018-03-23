/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author rishi
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Role role;
    private WorkQueue workQueue;
    private Employee employee;

    public UserAccount(String username, String password,Employee employee, Role role) {
        workQueue = new WorkQueue();
        this.employee=employee;
        this.password=password;
        this.role=role;
        this.username= username;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setPassword(String password) {
        this.password = password;
    }         
    
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

   

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return employee.getFirstName() + " " + employee.getLastName();
    }
    
    
    
}
