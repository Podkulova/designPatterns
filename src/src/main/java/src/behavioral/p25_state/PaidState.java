package src.behavioral.p25_state;

public class PaidState implements ParkingTicketVedingMachineState {
    private final ParkingTicketVendingMachine machine;

    public PaidState(ParkingTicketVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void moveCreditCardToSensor() {
        machine.setMessage("Already paid. Please press button for printing.");
    }

    @Override
    public void pressprintingButton() {
        machine.printTicket();
        if (machine.getPrintingpaperPieces() == 0) {
            machine.setState(MoneyMachineState.NO_PAPER);
        } else {
            machine.setState(MoneyMachineState.NEED_PAYMENT);
        }
    }

    @Override
    public void openMachineAndAddPrintingPaperPieces() {
        System.out.println("Only authorized person can add paper");
    }
}
