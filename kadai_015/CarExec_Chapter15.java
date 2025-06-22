package kadai_015;

public class CarExec_Chapter15 {

	public static void main(String[] args) {
		//Car_Chapter15クラスでインスタンスを生成
		Car_Chapter15 car = new Car_Chapter15(1, 10);
		
		//gearChangeメソッドを実行する
		car.gearChange(3);
		
		//runメソッドを実行する
		car.run();

	}

}
