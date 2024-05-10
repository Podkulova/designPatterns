package src.behavioral.p25_state;

public class NeedToPayState implements ParkingTicketVedingMachineState {
    private final ParkingTicketVendingMachine machine;

    public NeedToPayState(ParkingTicketVendingMachine machine) {
        this.machine = machine;
    }

    @Override
    public void moveCreditCardToSensor() {
        machine.payForOneHourWithCreditCard();
        if (machine.getState() == MoneyMachineState.NEED_PAYMENT) {
            machine.setState(MoneyMachineState.PAID_READY_TO_PRINT);
        }
    }

    @Override
    public void pressprintingButton() {
        machine.setMessage("Please pay first");
    }

    @Override
    public void openMachineAndAddPrintingPaperPieces() {
        machine.setMessage("Only authorized person can add paper");
    }
}
