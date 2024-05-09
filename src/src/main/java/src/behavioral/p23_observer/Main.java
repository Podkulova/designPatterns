package src.behavioral.p23_observer;

public class Main {
    public static void main(String[] args) {
        final ChatChannel chatChannel = new ChatChannel("design pattern.");
        final BaseObserver userA = new UserObserver(chatChannel, "Adam");
        final BaseObserver userB = new UserObserver(chatChannel, "Eliška");
        final BaseObserver adminC = new AdminObserver(chatChannel, "Monty");
        final BaseObserver adminD = new AdminObserver(chatChannel, "Petra");

        userA.sendMessage("Hello all.");
        userB.sendMessage("Hi Adam.");
        adminC.sendMessage("Users cant see my message.");
        adminD.sendMessage("Yes, I know.");
    }
}
