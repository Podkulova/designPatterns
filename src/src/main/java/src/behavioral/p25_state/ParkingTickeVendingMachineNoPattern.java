package src.behavioral.p25_state;

import java.time.LocalDateTime;

public class ParkingTickeVendingMachineNoPattern {
    private MoneyMachineState state = MoneyMachineState.NEED_PAYMENT;
    private int printingPaperPieces = 100;
    private String message;

    public MoneyMachineState getState() {
        return state;
    }

    public void setState(MoneyMachineState state) {
        this.state = state;
    }

    public int getPrintingPaperPieces() {
        return printingPaperPieces;
    }

    public void setPrintingPaperPieces(int printingPaperPieces) {
        this.printingPaperPieces = printingPaperPieces;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        System.out.println("MESSAGE: " + message);
    }

    public void addPrintingPaperPieces(int pieces) {
        if (pieces <= 0) {
            throw new UnsupportedOperationException("Cannot add non positive number of pieces");
        }
        printingPaperPieces += pieces;
        message = "Please pay for the parking";

        if (state == MoneyMachineState.NO_PAPER) {
            state = MoneyMachineState.NEED_PAYMENT;
        }
    }

    public void payForOneHourWithCreditCard() {
        if (state == MoneyMachineState.NEED_PAYMENT) {
            System.out.println("Paying for parking 5$");
            message = "Please click the button to print the ticket";
            state = MoneyMachineState.PAID_READY_TO_PRINT;
        }
    }

    public void printTicket() {
        if (state == MoneyMachineState.PAID_READY_TO_PRINT) {
            printingPaperPieces--;
            System.out.println("Ticket valid thru " + LocalDateTime.now().plusHours(1));
            message = "Ticket printed. Please collect it";

            if (printingPaperPieces == 0) {
                state = MoneyMachineState.NO_PAPER;
            } else {
                state = MoneyMachineState.NEED_PAYMENT;
            }
        } else {
            System.out.println("Not paid.");
        }
    }

    public void goDown() {
        if (state == MoneyMachineState.PAID_READY_TO_PRINT) {
            System.out.println("Trying to revert last transaction.");
        }
        state = MoneyMachineState.UNAVAILABLE;
        message = "Vending machine is unavailable. Try another one.";
    }
}
