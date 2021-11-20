/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcar.employee;

import rentcar.car.*;

/**
 *
 * @author User
 */
public class ListRole {
    private int id;
    private String role;
    
    public ListRole(){
    }
    
    public ListRole(int id, String tipe){        
        this.id = id;
        this.role = role;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public String toString(){
       return role;
    }
    
}
