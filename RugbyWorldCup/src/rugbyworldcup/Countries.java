/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyworldcup;

import java.io.Serializable;

/**
 *
 * @author gilbertocaobianco
 */
public class Countries  implements Serializable{
    //declaring variables
    protected String city;
    protected String stadium;

    
    public Countries (String city, String stadium){
        
        this.city= city;
        this.stadium= stadium;
    }
    //constructor
     public Countries(){
        this("", ""); 
    }
     //setters
      public void setCity (String city){
        this.city = city; 
    }
       public void setStadium (String stadium){
        this.stadium = stadium; 
    }
       
       //getters
       
        public String getCity(){
        return city;
    }
    
         public String getStadium(){
        return stadium;
    }
         public String printDetails(){
        return "The cities for this country are: "+city+" and stadiums are: "+stadium;
               
    }
}
