package FacadeDesignPattern;
import java.util.*;
public class HotelApp {
    public static void main(String[] args)  {

        FrontDesk frontDesk = new FrontDesk();
        Scanner sc = new Scanner(System.in);

        while (true)    {

            System.out.println("SERVICES THAT WE PROVIDE");
            System.out.println("\t[1] Valet Parking\n" +
                                "\t[2] Housekeeping\n" +
                                "\t[3] Cart\n" +
                                "\t[4] Exit App");
            System.out.print("Choose Service [1-3]: ");
            int userChoice = sc.nextInt();

            switch(userChoice) {
                case 1:
                    System.out.print("Kindly put your License Plate number: ");
                    String plateNum = sc.next();
                    HotelService valetService = new Valet(plateNum);
                    frontDesk.delegateRequest(valetService);
                    System.out.println();
                    break;
                case 2:
                    System.out.print("Kindly enter your Room number: ");
                    int roomNum = sc.nextInt();
                    HotelService housekeepingService = new HouseKeeping(roomNum);
                    frontDesk.delegateRequest(housekeepingService);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter the number of Carts you want to have: ");
                    int cartNum = sc.nextInt();
                    HotelService cartService = new Cart(cartNum);
                    frontDesk.delegateRequest(cartService);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Have a good day! Thank you for using our APP!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input!\n");
                    break;
            }
        }
    }
}
