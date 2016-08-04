package strategy;

public class Calculator {
	
	private int x = 0;
	
	private int y = 0;
	
	private CalcStrategy strategy = null;
	
	public Calculator(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public Calculator(int x, int y, CalcStrategy strategy){
		this.x = x;
		this.y = y;
		this.strategy = strategy;
	}
	
	public int calc(int x, int y){
		return x + y;
	}
	
	public int result(){
		if(strategy != null){
			return strategy.calc(x, y);
		}else{
			return calc(x, y);
		}
	}

}
