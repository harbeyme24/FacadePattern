package FacadeDesignPattern;

public class HouseKeeping implements HotelService   {
    private int roomNumber;

    public HouseKeeping(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void execute() {
        cleanRoom(roomNumber);
    }

    public void cleanRoom(int roomNumber)   {
        System.out.println("Cleaning room: " + roomNumber);
    }
}
