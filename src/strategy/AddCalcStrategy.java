package strategy;

public class AddCalcStrategy implements CalcStrategy {

	@Override
	public int calc(int x, int y) {
		return x + y;
	}

}
