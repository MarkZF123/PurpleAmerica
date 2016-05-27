/*
 Your Name
The Name of the Class
A description of all class variables that explains the variable’s purpose and how it is used
a brief description of any methods in the class.

 */
package map;

import java.awt.Color;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author hcps-hallocbr1
 */
public class Coloring{
    
    HashMap colors = new HashMap<String, Color>();
    
    
    public void voteStates(Scanner scan){
        scan.nextLine();
        while(scan.hasNext()){
            String[] votes = scan.nextLine().split(",");
            String name = votes[0];
                    
            int rVotes = Integer.parseInt(votes[1]);
            int dVotes = Integer.parseInt(votes[2]);
            int iVotes = Integer.parseInt(votes[3]);
            int sum = iVotes+rVotes+dVotes;
            Color temp = new Color((255*rVotes)/sum, (255*iVotes)/sum, (255*dVotes)/sum);
            colors.put(name, temp);
            //System.out.println(name+temp);
        }
    }
    
    
    public Color getMapColor(String s){
        return (Color) colors.get(s);
        
    }
}
