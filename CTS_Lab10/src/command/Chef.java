package command;

public class Chef {

    private String name;

    public Chef(String name) {
        this.name = name;
    }

    public void cookPizza(String pizzaName) {
        System.out.println("The chef " + name + " is cooking pizza " + pizzaName);
    }

    public void cookPasta(String pastaName) {
        System.out.println("The chef " + name + " is cooking pasta " + pastaName);
    }
}
