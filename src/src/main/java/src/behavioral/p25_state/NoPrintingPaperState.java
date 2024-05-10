package src.behavioral.p25_state;

public class NoPrintingPaperState implements ParkingTicketVedingMachineState {
    private final ParkingTicketVendingMachine machine;

    public NoPrintingPaperState(ParkingTicketVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void moveCreditCardToSensor() {
        machine.setMessage("Cannot pay because there is no printing paper");
    }

    @Override
    public void pressprintingButton() {
        machine.setMessage("Please call 555-123456 for adding printing paper");
    }

    @Override
    public void openMachineAndAddPrintingPaperPieces() {
        machine.addPrintingPaperPieces(100);
        machine.setState(MoneyMachineState.NEED_PAYMENT);
    }
}
