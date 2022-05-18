package memento;

public class Contract {
	
	private String nameEmployee;
	private String contractClause;
	public Contract(String nameEmployee, String contractClause) {
		super();
		this.nameEmployee = nameEmployee;
		this.contractClause = contractClause;
	}
	
	public String getNameEmployee() {
		return nameEmployee;
	}
	public void setNameEmployee(String nameEmployee) {
		this.nameEmployee = nameEmployee;
	}
	public String getContractClause() {
		return contractClause;
	}
	public void setContractClause(String contractClause) {
		this.contractClause = contractClause;
	}
	
	

	public Contract(String nameEmployee) {
		super();
		this.nameEmployee = nameEmployee;
	}

	public void addClause(String newContractClause) {
		this.contractClause+= "\n" + newContractClause;
		
	}
	
	

	public ContractVersion saveVersion() {
		return new ContractVersion(this.contractClause);
	}
	
	public void restoreFromVersion(ContractVersion contractClauseSpecificVersion) {
		this.contractClause = contractClauseSpecificVersion.getContractClause();
	}
	
}
