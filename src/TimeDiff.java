/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author jim
 */
public class TimeDiff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Snap an instance      
        Instant before = Instant.now();
        // Now run a length loop
        for (int i=0; i<10000;i++){
            for (int j=0; j<100;j++){
                System.out.println("i x j = " + i*j);
            }
        }
        Instant after = Instant.now();      
        System.out.println("Difference is " + 
               Duration.between(before, after).toNanos()/1_000_000_000.0 +
                " Seconds.");
       
        
    }
    
}
