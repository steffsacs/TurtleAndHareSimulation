
import java.time.*;
import java.time.LocalDateTime;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stephanie Sánchez Cortés
 */
public class DateTime {
    
    
    LocalDateTime today;
    
    private static LocalDateTime t1;
    private static LocalDateTime t2;
    
    public DateTime(){
        
        
    }
    
    
    public String getSeconds(){
        
        
        String sec= String.valueOf(today.getSecond());
        String msec=String.valueOf(today.getNano()/10000000);
                
        return sec+":"+msec;
        
    }
    
    public LocalDateTime getCurrentTime(){
        today=LocalDateTime.now();
        return today;
    }
    
    public void setStartTime(){
        this.t1=getCurrentTime();
    }
    
    public void setFinishTime(){
        this.t2=getCurrentTime();
    }
    
    public String deltaTime(){
        setFinishTime();
        Duration duration= Duration.between(t1, t2);
        long diff= Math.abs(duration.toMillis());
        int sec= (int)diff/1000;
        int milis= (int) (diff%1000)/10;
        return "Timer: "+sec+":"+milis;
        
    }

}
