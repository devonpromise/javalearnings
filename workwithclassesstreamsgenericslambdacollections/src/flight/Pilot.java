package flight;

//should tag as abstract when it contains one or more abstract method
public abstract class Pilot {


    private Flight currentFlight;
    public void fly(Flight f){
        if (canAccept(f)){
            currentFlight = f;
        }
        else
            handleCantAccept();
    }

    private void handleCantAccept() {
        System.out.println("Can't accentt");
    }

    public abstract boolean canAccept(Flight f);


}
