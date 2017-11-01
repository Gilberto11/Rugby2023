/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rugbyworldcup;

/**
 *
 * @author gilbertocaobianco
 */
public class SouthAfrica extends Countries{
    
    private String johannesburg;
    private String capeTown;
    private String ellisParkStadium;
    private String capeTownStadium;
    
    public SouthAfrica(String city, String stadium, String johannesburg, String capeTown, 
           String ellisParkStadium, String capeTownStadium){
        super(city, stadium);
        this.johannesburg = johannesburg; 
        this.capeTown = capeTown; 
        this.ellisParkStadium = ellisParkStadium;
        this.capeTownStadium = capeTownStadium; 
    }
    
     public SouthAfrica(){
        this("", "", "", "", "", "");    
    }

     
       @Override
    public String printDetails(){
        return super.printDetails()+"Cities in South Africa are: "+johannesburg+","+capeTown+
                "Stadiums are: "+ellisParkStadium+","+capeTownStadium;
    } 
}
