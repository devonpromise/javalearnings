package flight;



public enum FlightCrewJob{
    FLIGHT_ATTENDANT("Flight Attendant"),
    CO_PILOT("First Officer"),
    PILOT("Captain");
    private String title;

    public String getTitle(){
        return title;
    }

    private FlightCrewJob(String title) {
        this.title = title;
    }
}



