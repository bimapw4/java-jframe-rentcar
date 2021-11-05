/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rentcar.car;

/**
 *
 * @author User
 */
public class ListType {
    private int id;
    private String tipe;
    
    public ListType(){
    }
    
    public ListType(int id, String tipe){        
        this.id = id;
        this.tipe = tipe;
    }
    
    public int getId() {
        return id;
    }
    
    @Override
    public String toString(){
       return tipe;
    }
    
}
