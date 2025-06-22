package kadai_015;

public class Car_Chapter15 {
  //フィールド（内部データ）
	private  int  gear = 1; //ギア
	private int  speed = 10; //ギアチェンジ後の速度
	
	//コンストラクタ
	public  Car_Chapter15( int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	
	//ギアの値により速度を変えるメソッド
	//afterGear:どのギアに変えたか
	public void gearChange(final int afterGear ) {
		switch(afterGear) {
		case 2  -> this.speed = 20;
		case 3  -> this.speed = 30;
		case 4  -> this.speed = 40;
		case 5  -> this.speed = 50;
		default -> this.speed = 10;
		};
		System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました");
	}
	
	//変更後の速度を表示するメソッド
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
}
