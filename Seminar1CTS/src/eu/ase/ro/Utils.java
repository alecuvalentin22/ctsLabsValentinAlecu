package eu.ase.ro;

public class Utils {
	public static int function(int vector[], int k) {
		if(vector== null)
			 return -9999;
		int i=vector[0];
		int j=0;
		for(k=0; k< vector.length; k++) {
			if(i == vector[k])
				j=j+1;
			else 
				if(i>vector[k])
			{
				i=vector[k];
				j=1;
			}
		}
		return j;
	}
}
