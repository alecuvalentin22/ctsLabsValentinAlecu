package state;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.processTask("Server down");

        IState iState = new VacationState();
        Employee employee1 = new Employee(iState);
        employee1.processTask("Database lost");

        employee.setCurrentState(EState.AWAY);
        employee.processTask("Server down");
    }
}
