import java.util.ArrayList;
import java.util.Scanner;

public class App {

    
    public static void main(String[] args) throws Exception {
       double boxerWeight = 0.0;
       int planetIndex = 0;
       double weightOnPlanet = 0.0;
       ArrayList<Planet> Planets = new ArrayList<Planet>();
       Scanner in = new Scanner(System.in);
       
       Planet temp = new Planet("Venus", 0.78);
       Planets.add(temp);
       
       temp = new Planet("Mars", 0.39);
       Planets.add(temp);

       temp = new Planet("Jupiter", 2.65);
       Planets.add(temp);

       temp = new Planet("Saturn", 1.17);
       Planets.add(temp);
       
       temp = new Planet("Uranus", 1.05);
       Planets.add(temp);

       temp = new Planet("Neptune", 1.23);
       Planets.add(temp);

       System.out.println("Please enter your current earth weight:");
       boxerWeight = in.nextDouble();
       
       System.out.println("I have information for the following planets:\n");
        System.out.println(" ");
       
        System.out.println("1. Venus" + " " + " " + "2. Mars" + " " + " " + "3. Jupiter");
        System.out.println("4. Saturn" + " " + " " + "5. Uranus" + " " + " " + "6. Neptune\n");
        
        System.out.println("Which planet are you visiting?");
        planetIndex = in.nextInt();
        
        weightOnPlanet = Planets.get(planetIndex).exchengeGrav(boxerWeight);

        System.out.println("Your weight would be " + weightOnPlanet +
                " pounds on " + Planets.get(planetIndex).getName() + " planet");

    }
}
