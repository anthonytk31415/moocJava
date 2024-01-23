/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;

/**
 *
 * @author anthonytk
 */
import java.util.Scanner; 

public class UserInterface {

    private Scanner scanner; 
    private FlightControl flightControl;

    public UserInterface(){
        this.scanner = new Scanner(System.in);
        this.flightControl = new FlightControl();
    }

    public void start() {
        // asset control
        
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();
        
        while (true){
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.print("> ");
            String input = this.scanner.nextLine();
            if (input.equals("x")){
                break;
            } else if (input.equals("1")){
                
                // add airplane 
                System.out.println("Give the airplane id: ");
                String airId = this.scanner.nextLine(); 
                System.out.println("Give the airplane capacity: ");
                int capacity = Integer.parseInt(this.scanner.nextLine());
                this.flightControl.addAirplane(airId, capacity);
            } else if (input.equals("2")){

                // add flight
                System.out.println("Give the airplane id: ");
                String airId = this.scanner.nextLine(); 
                System.out.println("Give the departure airport id: ");
                String dep = this.scanner.nextLine(); 
                System.out.println("Give the target airport id: ");
                String arr = this.scanner.nextLine(); 
                this.flightControl.addFlight(airId, dep, arr);
            }
        }

        // flight control
        System.out.println("Flight Control");
        System.out.println("------------");
        System.out.println();
        while (true){
            System.out.println("Choose an action:");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            System.out.print("> ");
            String input = scanner.nextLine();
            if (input.equals("x")){
                break;
            } else if (input.equals("1")){

                // print airplane
                this.flightControl.printAirplanes();

            } else if (input.equals("2")){
                this.flightControl.printFlights();
            } else if (input.equals("3")){
                System.out.println("Give the airplane id: ");
                String airId = this.scanner.nextLine(); 
                this.flightControl.printAirplaneDetails(airId);
            }
        }
        
    }


            
}
