package src.behavioral.p25_state;

public class Main {
    public static void main(String[] args) {
        System.out.println("No pattern");
        ParkingTickeVendingMachineNoPattern parkingTickeVendingMachineNoPattern = new ParkingTickeVendingMachineNoPattern();
        parkingTickeVendingMachineNoPattern.payForOneHourWithCreditCard();
        parkingTickeVendingMachineNoPattern.printTicket();

        parkingTickeVendingMachineNoPattern.printTicket();

        System.out.println("With State pattern:");
        final ParkingTicketVendingMachine parkingTicketVendingMachine = new ParkingTicketVendingMachine();
        ParkingTicketVedingMachineState state = new NeedToPayState(parkingTicketVendingMachine);

        state.openMachineAndAddPrintingPaperPieces();
        state.pressprintingButton();
        state.moveCreditCardToSensor();
        state = new PaidState(parkingTicketVendingMachine);

        state.pressprintingButton();
        state.moveCreditCardToSensor();
    }
}
