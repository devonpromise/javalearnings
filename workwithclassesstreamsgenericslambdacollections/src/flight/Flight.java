package flight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Flight implements Comparable<Flight>, Iterable<Passenger>{

    private int passengers;
    private int seats = 150;
    private int flightNumber;
    private char flightClass;

    private ArrayList<Passenger> passengerList = new ArrayList<>();

    //Inner class
    private class FlightIterable implements Iterable<Passenger>{
        @Override
        public Iterator<Passenger> iterator() {
            Passenger[] passengers = new Passenger[passengerList.size()];
            passengerList.toArray(passengers);
            Arrays.sort(passengers);
            return Arrays.asList(passengers).iterator();
        }
    }

/*    public Iterable<Passenger> getOrderedPassengers(){
        FlightIterable orderedPassengers = new FlightIterable();
        return  orderedPassengers;
    }*/

    //Anonymous Class
    public Iterable<Passenger> getOrderedPassengers(){
        FlightIterable orderedPassengers = new FlightIterable();
        return  new Iterable<Passenger>() {
            @Override
            public Iterator<Passenger> iterator() {
                Passenger[] passengers = new Passenger[passengerList.size()];
                passengerList.toArray(passengers);
                Arrays.sort(passengers);
                return Arrays.asList(passengers).iterator();
            }
        };
    }

    public static int allPassengers, totalCheckedBags;

    public static int getAllPassengers(){
        return allPassengers;
    }
    private boolean[] isSeatAvailable = new boolean[seats];

    public Flight(){}

    public Flight(int flightNumber){
        this.flightNumber  = flightNumber;
    }
    public int getPassengers(){
        return passengers;
    }

    //Initialization Block
    {
        for(int i=0; i<seats; i++)
        isSeatAvailable[i] = true;
    }

    void addPassenger(){
        if (passengers < seats)
            passengers +=1;
            allPassengers +=1;

    }


    int getSeats (){
        return seats;
    }
    //Variable length parameter lists
    void addPassenger(Passenger... list){
        if(hasSeating(list.length)){
            passengers += list.length;
            for(Passenger p: list) {

                totalCheckedBags += p.getCheckedBags();

            }

        }

    }

    void add1Passenger(Passenger p){
        if(hasSeating(1)){
            passengers +=1;
            totalCheckedBags += p.getCheckedBags();

            passengerList.add(p);

        }

    }
    boolean hasSeating(int passengers){
        return passengers <= seats;
    }

    //Comparator
    @Override
    public boolean equals(Object o){

        //Without super in will call the equals function   unended loop
        if(super.equals(o))
            return true;

        if (!(o instanceof Flight))
            return false;

        Flight flight =  (Flight) o;
        return flightNumber == flight.flightNumber &&
                flightClass == flight.flightClass;
    }

    @Override
    public int compareTo(Flight flight) {
        return 0;
    }

    @Override
    public Iterator<Passenger> iterator() {
        return passengerList.iterator();
    }


}
