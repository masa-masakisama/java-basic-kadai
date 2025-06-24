package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// Dictionary_Chapter21クラスのインスタンスを作成
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		
		//調べたい英単語を配列にセットする
		String[] words = new String[] {"apple", "banana", "grape", "orange" };
		
		//searchDicメソッドを実行する
		dic.searchDic(words);
	}

}
