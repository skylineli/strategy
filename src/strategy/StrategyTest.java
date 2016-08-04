package strategy;

public class StrategyTest {

	public static void main(String[] args) {
		//没有任何策略
		Calculator calc = new Calculator(30, 40);
		System.out.println(calc.result());
		
		//使用减法策略
		Calculator calc2 = new Calculator(30, 40, new SubStrategy());
		System.out.println(calc2.result());
		
		//使用加法策略
		Calculator calc3 = new Calculator(30, 40, new AddCalcStrategy());
		System.out.println(calc3.result());
		
		//自定义策略
		Calculator calc4 = new Calculator(30, 40, new CalcStrategy(){

			@Override
			public int calc(int x, int y) {
				return ((x+10) - y*3)/2;
			}
			
		});
		System.out.println(calc4.result());
	}

}
