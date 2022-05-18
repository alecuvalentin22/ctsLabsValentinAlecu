package memento;

public class ProgMain {

	public static void main(String[] args) {
		
		Contract contract = new Contract("Mada");
		ManagerContractVersion manager = new ManagerContractVersion();
		contract.addClause("increase salary");
		System.out.println(contract.getContractClause());
		//
		manager.addContractVersion(contract.saveVersion());
		
		contract.addClause("WFM");
		System.out.println(contract.getContractClause());
		//
		manager.addContractVersion(contract.saveVersion());

		contract.addClause("Manager new role");
		System.out.println(contract.getContractClause());
		//
		manager.addContractVersion(contract.saveVersion());
		
		
		//manager.recoverContract(0);
		
		contract.restoreFromVersion(manager.recoverContract(0));
		
		System.out.println("RECOVER ---------");
		System.out.println(contract.getContractClause());
	}

}
