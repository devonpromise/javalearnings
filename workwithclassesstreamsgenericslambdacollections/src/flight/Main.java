package flight;

import java.util.Arrays;

public class Main {


    public static void main(String[] args){

        //flight.Flight
//        Flight f = new Flight(14);
//        Passenger marie = new Passenger(0, 1);
//        Passenger irish = new Passenger(0, 1);
//        f.addPassenger(marie, irish);
//
//        Passenger jean = new Passenger(0, 2);
//        Passenger arielle = new Passenger(0, 2);
//        Passenger airish = new Passenger(0, 3);
//        f.addPassenger(airish, marie, irish);
//
//        //Cargo
//        CargoFlight cf = new CargoFlight();
//        cf.add1Package(1.0f, 2.5f, 3.0f);
//        Passenger jack = new Passenger(1, 2);
//
//        cf.add1Passenger(jack);
//
//        Flight f1 = new CargoFlight();
//        Passenger rose = new Passenger(0,2);
//
//        f.add1Passenger(rose);

//        double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
//        double[] rigthVals ={50.0d, 92.0d, 213.0d, 3.0};
//        char[] opCodes = {'d', 'a', 's','m'};
//        double[] results = new double[opCodes.length];
//
        //Array of Classes


        //Object references
            // close, hashCode, getClass, finalize
        Object o = new CargoFlight();

        if (o instanceof  CargoFlight) {
            CargoFlight cf1 = (CargoFlight) o;
            cf1.add1Package(1.0f, 2.5f, 3.0f);
        }


        CrewMember geetha = new CrewMember(FlightCrewJob.PILOT, "Geetha");
        CrewMember joe = new CrewMember(FlightCrewJob.FLIGHT_ATTENDANT, "Joe");

      //  whoIsInCharge(geetha, joe);

        //Comparable
        Passenger[] passengers = {
                new Passenger("Luisa", 1 , 180),
                new Passenger("Jack", 1 , 90),
                new Passenger("Ashanti", 1 , 730),
                new Passenger("Harish", 1 , 150)
        };

        Arrays.sort(passengers); // utilizes Comparable interface

        //passenger: Ashanti, Harish, Luisa, Jack

        Flight f175 = new Flight(175);
        f175.add1Passenger(new Passenger("Santiago"));
        f175.add1Passenger(new Passenger("Julie"));
        f175.add1Passenger(new Passenger("John"));
        f175.add1Passenger(new Passenger("Geetha"));

        for (Passenger p : f175)
            System.out.println(p.getName());


        //Nested Class
        Passenger steve = new Passenger( "Steve", 3, 180);
        Passenger.RewardProgram platinum = new Passenger.RewardProgram();

        platinum.setMemberLevel(3);

        if(steve.getRewardProgram().getMemberLevel() == platinum.getMemberLevel()){
            System.out.println("Steve is platinum");
        }

        Flight f176 = new Flight(175);
        f176.add1Passenger(new Passenger("Luisa", 1, 180));
        f176.add1Passenger(new Passenger("Jack", 1, 90));
        f176.add1Passenger(new Passenger("Ashanti", 3, 730));
        f176.add1Passenger(new Passenger("Harish", 2, 150));

        for (Passenger p : f176)
            System.out.println(p.getName());

        Flight f177 = new Flight(175);
        f177.add1Passenger(new Passenger("Luisa", 1, 180));
        f177.add1Passenger(new Passenger("Jack", 1, 90));
        f177.add1Passenger(new Passenger("Ashanti", 3, 730));
        f177.add1Passenger(new Passenger("Harish", 2, 150));

        for (Passenger p : f177.getOrderedPassengers())
            System.out.println(p.getName());



    }

    private static void whoIsInCharge(CrewMember member1, CrewMember member2) {
        CrewMember theBoss = member1.getJob().compareTo(member2.getJob()) > 0 ? member1 : member2;
        System.out.println(theBoss.getJob().getTitle() + " " +theBoss.getName() + " is boss");

        System.out.println(
                FlightCrewJob.valueOf("PILOT") + " " + FlightCrewJob.values());
    }

/*    void DisplayJobResponsibilities(Main.FlightCrewJob job){
        switch (job){
            case FLIGHT_ATTENDANT:
                System.out.println("Assures passenger safety");
                break;
            case CO_PILOT:
                System.out.println("Assists in flying the plane");
                break;
            case PILOT:
                System.out.println("Flies the plane");
                break;

        }
    }*/

}
