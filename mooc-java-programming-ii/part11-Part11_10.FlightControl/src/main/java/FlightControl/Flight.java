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
public class Flight {
    private String airplaneId;
    private String departureAirport;
    private String targetAirport;

    public Flight(String airplaneId, String departureAirport, String targetAirport){
        this.airplaneId = airplaneId; 
        this.departureAirport = departureAirport; 
        this.targetAirport = targetAirport; 
    }


    public String getFlight(){
        return "(" + this.departureAirport + "-" + this.targetAirport+ ")";
    }

    public String getAirplaneId(){
        return this.airplaneId; 
    }


}
