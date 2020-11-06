
import java.util.HashSet;
import java.util.Set;
import javax.swing.text.Position;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stephanie Sánchez Cortés
 */
public class Turtle implements Movements {
    
    private static int positionTurtle=0;

    public Turtle(){
        setMovements();
        
    }
    public static int getPositionTurtle() {
        return positionTurtle;
    }
    @Override
    public void setMovements() {
        movementType.put("Fast heavy step", 3);
        movementType.put("Slip", -6);
        movementType.put("Slow heavy step", 1);
    }

    @Override
    public void move(int number) {
        int m=0;
        if (number>=1 && number<=5){
            m= movementType.get("Fast heavy step");
        }else if (number==6 || number==7){
            m= movementType.get("Slip");
        }else{
            m= movementType.get("Slow heavy step");
        }
        
        if((positionTurtle+m)>1){
            positionTurtle+=m;
        }else if ((positionTurtle+m)>70){
            positionTurtle=70;
        }
        else{
            positionTurtle=1;
        }
        
        
    }
        
    
    
    

}
