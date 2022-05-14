package template;

public class InsuranceProcedure extends ATemplateProcedure {
    @Override
    public void getProcedurePapers() {
        System.out.println("Getting the papers");
    }

    @Override
    public void getOfficerApprovalProcedure() {
        System.out.println("Get the approval");
    }

    @Override
    public void identifyDamage() {
        System.out.println("Identifying the damage");
    }

    @Override
    public void evaluateHouse() {
        System.out.println("Evaluating house");
    }

    @Override
    public void sendEvaluation() {
        System.out.println("Sending evaluation");
    }
}
