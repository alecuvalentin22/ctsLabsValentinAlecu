package command;

public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef("John");
        Chef chef1 = new Chef("Maria");

        Waiter waiter = new Waiter();
        waiter.noteCommands(new PizzaOrder(chef, "margherita"));
        waiter.noteCommands(new PastaOrder(chef1, "carbonara"));
        waiter.noteCommands(new PizzaOrder(chef, "diavola"));

        waiter.sendCommands();
    }
}
