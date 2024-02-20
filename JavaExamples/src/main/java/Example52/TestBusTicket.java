package Example52;


public class TestBusTicket {

    public static void main(String[] args) {

        /* BusFare busFare2020 = new BusFare2020();
        BusTicket busTicket = new BusTicket("20", busFare2020);
        busTicket.getTicketPrintout(100); */
        // if the bus fare changes, (1) write a new class (2) pass to BusTicket
        // Rememmber - any object that implements BusFare can be passed to BusTicket
        BusTicket busTicket = new BusTicket("20", new BusFare2024());
        busTicket.getTicketPrintout(100);

    }
}
