package FacadeDesignPattern;

public class Valet implements HotelService {
    private String plateNumber;

    public Valet(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void execute() {
        pickUpVehicle(plateNumber);
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet parking for vehicle with plate number: " + plateNumber);
    }
}
