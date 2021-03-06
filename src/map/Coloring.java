/*
* Team Members: Ben, Chen, Mark
* Coloring.jav
* The coloring class uses HashMap which store colors by certain names. Then the the voteStates method 
takes in the file to be scanned and splits the data in order to get the votes for each candidate which 
is running. Using the algorithm presented in the project, all the votes are added into a sum and then are
mulitplied by 255 to form the purple color and are finally outputted as a certain color to be used on the map.
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
    
    HashMap colors = new HashMap<String, Color>();//makes a HashMap to store colors by name
    
    
    public void voteStates(Scanner scan){
        scan.nextLine();//spacing
        while(scan.hasNext()){//scans all input
            String[] votes = scan.nextLine().split(",");//gets the data and puts it into an array
            String name = votes[0];//name of thing having datat recorded on it
                    
            int rVotes = Integer.parseInt(votes[1]);//republican votes
            int dVotes = Integer.parseInt(votes[2]);//democrat votes
            int iVotes = Integer.parseInt(votes[3]);//independent votes
            int sum = iVotes+rVotes+dVotes;
            Color temp = new Color((255*rVotes)/sum, (255*iVotes)/sum, (255*dVotes)/sum);//makes the color
            colors.put(name, temp);//saves the data in the hashmap
            //System.out.println(name+temp);
        }
    }
    
    
    public Color getMapColor(String s){//returns the data held, takes the name of the target
        return (Color) colors.get(s);//returns the color associated with the name
        
    }
}
