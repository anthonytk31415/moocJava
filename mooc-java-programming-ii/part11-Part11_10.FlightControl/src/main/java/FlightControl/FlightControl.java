/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author anthonytk
 */


public class FlightControl {
    private HashMap<String, Airplane> airplanes; 
    private ArrayList<Flight> flights; 
    
    public FlightControl(){
        this.airplanes = new HashMap<>();
        this.flights = new ArrayList<>();
        
    }
    
    public void addAirplane(String airId, int capacity){        
        this.airplanes.put(airId, new Airplane(airId, capacity));
    }

    // reconfigure with pieces of flight; check if flight in hash table 
    public void addFlight(String airId, String dep, String arr){
        if (this.airplanes.containsKey((airId))){
            Flight flight = new Flight(airId, dep, arr);
            this.flights.add(flight);
        }

    }


    public void printAirplanes(){
        for (String airplane : this.airplanes.keySet()){
            System.out.println(this.airplanes.get(airplane));
        }
    }

    
    public void printFlights(){
        for (Flight flight: this.flights){
            String airplaneId = flight.getAirplaneId();
            String res = this.airplanes.get(airplaneId) + " " + flight.getFlight(); 
            System.out.println(res);
        }
    }

    public void printAirplaneDetails(String airplaneId){
        if (this.airplanes.containsKey(airplaneId)){
            System.out.println(this.airplanes.get(airplaneId));
        }

    }
}
