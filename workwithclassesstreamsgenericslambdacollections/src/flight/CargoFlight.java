package flight;

public class CargoFlight extends Flight{

    int seats = 12;
    float maxCargoSpace =  1000.0f;
    float usedCargoSpace;

    public CargoFlight(){}

    public CargoFlight(int flightNumber){
        super(flightNumber);
    }

    public CargoFlight(int flightNumber,float maxCargoSpace){
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
    }

    // public final  - to prevent override of this function
    public void  add1Package(float h, float w,  float d){
        float size= h * w * d;
        if (hasCargoSpace(size)){
            usedCargoSpace+=size;
        }
        else handleNoSpace();
    }

    private void handleNoSpace() {
        System.out.println("Not enough space");
        }


    private boolean hasCargoSpace(float size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    int getSeats (){
        return seats;
    }

}
