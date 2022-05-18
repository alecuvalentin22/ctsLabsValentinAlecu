package strategy;

public class StrategyMaxNo implements IStrategyFindSpecificNo {

	@Override
	public int process(int[] v) {
		if (v.length <= 0)
			return 0;
		int max = v[0];
		for (int i = 1; i < v.length; i++) {
			if (max < v[i]) {
				max = v[i];
			}
		}
		return max;
	}

}
