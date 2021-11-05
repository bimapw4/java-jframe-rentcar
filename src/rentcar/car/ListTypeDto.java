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
public class ListTypeDto {
    private int id_tipe;
    private String tipe;
    
    public ListTypeDto(){
    }
    
    public ListTypeDto(int id_tipe, String tipe){        
        this.id_tipe = id_tipe;
        this.tipe = tipe;
    }
    
    public int getId() {
        return id_tipe;
    }
    
    @Override
    public String toString(){
       return tipe;
    }
    
}
