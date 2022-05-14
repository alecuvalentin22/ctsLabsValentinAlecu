package state;

public class Employee {

    IState currentState;

    public Employee(IState currentState) {
        this.currentState = currentState;
    }

    public Employee() {
        this.currentState = new WorkingState();
    }

    public void setCurrentState(EState eState) {
        switch (eState) {
            case VACATION:
                this.currentState = new VacationState();
                break;
            case AWAY:
                this.currentState = new AwayState();
                break;
            default:
                this.currentState = new WorkingState();
        }
    }

    public void processTask(String task) {
        this.currentState.act(task);
    }
}
