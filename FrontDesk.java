package FacadeDesignPattern;

public class FrontDesk {
    public void delegateRequest(HotelService service)   {
        service.execute();
    }
}
