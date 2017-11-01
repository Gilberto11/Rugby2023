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
public class France extends Countries{
    
    private String paris;
    private String lyon;
    private String parcDesPrinces;
    private String parcOlympiqueLyonnais;
    
    public France(String city, String stadium, String paris, String lyon, 
            String parcDesPrinces, String parcOlympiqueLyonnais){
        super(city, stadium);
        this.paris = paris; 
        this.lyon = lyon; 
        this.parcDesPrinces = parcDesPrinces;
        this.parcOlympiqueLyonnais = parcOlympiqueLyonnais; 
    }
    public France(){
        this("", "", "", "", "", "");    
    }
    
   
     
      @Override
    public String printDetails(){
        return super.printDetails()+"Cities in France are: "+paris+""+lyon+
                "Stadiums are: "+parcDesPrinces+""+parcOlympiqueLyonnais;
    } 
    
}
