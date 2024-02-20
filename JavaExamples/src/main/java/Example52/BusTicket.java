package Example52;

public class BusTicket {

    private String busService;
    private BusFare busFare;

    // ANY object that implements the BusFare interface can be passed
    // to the class BusTicket (compare with previous Example)
    BusTicket(String busService, BusFare busFare){
        this.busService = busService;
        this.busFare = busFare;
    }

    public String getTicketPrintout(int distance){
        return "Service:"+busService + "Fare:" + busFare.getBusFare(distance);
    }
}
