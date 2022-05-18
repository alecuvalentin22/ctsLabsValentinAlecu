package memento;

import java.util.ArrayList;

public class ManagerContractVersion {
	
	private ArrayList<ContractVersion> listContractVersion = 
			new ArrayList<ContractVersion>();
	
	public void addContractVersion(ContractVersion contractVersion) {
		this.listContractVersion.add(contractVersion);
	}
	
	public ContractVersion recoverContract(int i) {
		return this.listContractVersion.get(i);
	}

}
