package src.behavioral.p25_state;

public class UnavailableState implements ParkingTicketVedingMachineState {
    private final ParkingTicketVendingMachine machine;

    public UnavailableState(ParkingTicketVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void moveCreditCardToSensor() {
        machine.setMessage("Vending machine is unavailable");
    }

    @Override
    public void pressprintingButton() {
        machine.goDown();
        machine.setState(MoneyMachineState.UNAVAILABLE);
    }

    @Override
    public void openMachineAndAddPrintingPaperPieces() {
machine.setMessage("Vending machine is unavailable");
    }
}
