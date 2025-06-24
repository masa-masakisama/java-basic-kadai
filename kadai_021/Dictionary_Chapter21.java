package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

  //辞書を調べるメソッドを定義する	
  public  void searchDic(String[] words) {
	  
	//HashMapのコレクションを宣言する
	HashMap<String,String> wordMap = new HashMap<String,String>();
	
	//wordMapに英単語と意味を追加していく
	wordMap.put("apple", "りんご" );
	wordMap.put("peach", "桃" );
	wordMap.put("banana", "バナナ" );
	wordMap.put("lemon", "レモン" );
	wordMap.put("pear", "梨" );
	wordMap.put("kiwi", "キウィ" );
	wordMap.put("strawberry", "いちご" );
	wordMap.put("grape", "ぶどう" );
	wordMap.put("muscat", "マスカット" );
	wordMap.put("cherry", "さくらんぼ" );
	
	//調べる英単語が辞書に追加されているか判定
	for(String word : words) {
		String mean  = wordMap.get(word);
		
		if (mean == null) {
			//辞書に単語が存在しない場合
			System.out.println(word + "は辞書に存在しません");
		} else {
			//辞書に単語が存在する場合
			System.out.println(word + "の意味は" + mean);
		}
	}
	
  }
	
}
