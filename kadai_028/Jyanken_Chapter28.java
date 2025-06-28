package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	private Scanner scanner = new Scanner(System.in);

	//自分のじゃんけんの手を入力するメソッド
	public  String getMyChoice() {
		//自分のじゃんけんの手を入力
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		String choice = scanner.nextLine();
		
		//自分の手が正式なものかそれぞれ比較する
		while (!choice.equals("r") && !choice.equals("s") && !choice.equals("p")) {
			System.out.println("正しく入力する");
			choice = scanner.nextLine();
		}
		return choice;
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		String[] fight = { "r", "s", "p"};
		int i = (int)(Math.floor(Math.random() * fight.lenght) );
		return fight[i];
	}
	
	//じゃんけんを行うメソッド
	public void playGame() {
		HashMap<String, String> result = new HashMap<>();
		result.put("r", "グー");
		result.put("s", "チョキ");
		result.put("p", "パー");
		
		String myChoice = getMyChoice();
		String byChoice = getRandom();
		
		System.out.println("自分の手は" + result.get(myChoice) + "、 対戦相手の手は" + result.get(byChoice));
		
		//結果の出力
		if(myChoice.equals(byChoice)) {
			System.out.println("あいこです");
		} else if ((myChoice.equals("r") && byChoice.equals("s")) ||
				     (myChoice.equals("s") && byChoice.equals("p")) ||
				     (myChoice.equals("p") && byChoice.equals("r")) ) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
		
	}
}
