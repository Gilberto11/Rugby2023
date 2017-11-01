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
public class Ireland extends Countries{
    
    private String dublin;
    private String cork;
    private String aviva;
    private String croke;
    
    
     public Ireland(String city, String stadium, String dublin, String cork, 
            String aviva, String croke){
        super(city, stadium);
        this.dublin = dublin; 
        this.cork = cork; 
        this.aviva = aviva;
        this.croke = croke; 
    }
     
      @Override
    public String printDetails(){
        return super.printDetails()+"Cities in Ireland are: "+dublin+""+cork+
                "Stadiums are: "+aviva+""+croke;
    } 
    
}
