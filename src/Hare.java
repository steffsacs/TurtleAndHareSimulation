/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stephanie Sánchez Cortés
 */
public class Hare implements Movements {
    private static int positionHare=0;

    public Hare(){
        setMovements();
    }

    @Override
     public void setMovements() {
        movementType.put("Sleep", 0);
        movementType.put("Big jump", 9);
        movementType.put("Big slip", -12);
        movementType.put("Little jump", 1);
        movementType.put("Little slip", 2);
        
        
        
    }
    public static int getPositionHare() {
        return positionHare;
    }

    @Override
    public void move(int number) {
        int m=0;
        switch (number) {
            case 1:
            case 2:
                m= movementType.get("Sleep");
                break;
            case 3:
            case 4:
                m= movementType.get("Big jump");
                break;
            case 6:
                m= movementType.get("Big slip");
                break;
            case 7:
            case 8:
            case 9:
                 m= movementType.get("Little jump"); 
                break;
            default:
                m= movementType.get("Little slip");  
        }
        if((positionHare+m)>1 && (positionHare+m)<=70){
            positionHare+=m;
        }else if ((positionHare+m)>70){
            positionHare=70;
        }else{
            positionHare=1;
        }
    }
    
    

}
