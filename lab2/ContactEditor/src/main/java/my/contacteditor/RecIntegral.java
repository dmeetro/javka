package my.contacteditor;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class RecIntegral { 
    
   // int num = 0;
    private double ul = 0, ll = 0, stp = 0, rez =0;

    public RecIntegral( double ul, double ll, double stp) {
        this.ul = ul;
        this.ll = ll;
        this.stp = stp;
               
   }
    
   public RecIntegral( double ul, double ll, double stp, double rez) {
       this.ul = ul;
       this.ll = ll;
       this.stp = stp; 
       this.rez = rez;
        
   }

    public double getValueUl() {
        return ul;
        
    }
    
    public double getValueLl() {
        return ll;
        
    }
    
    public double getValueStp() {
        return stp;
        
    }
    
    public double getValueRez() {
        return rez;
        
    }
}


