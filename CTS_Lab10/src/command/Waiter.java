package command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    private final List<ICommand> orders = new ArrayList<>();

    public void noteCommands(ICommand order) {
        orders.add(order);
    }

    public void sendCommands() {
        for(var command: orders) {
            command.process();
        }
        orders.clear();
    }
}
