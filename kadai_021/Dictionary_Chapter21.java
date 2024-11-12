package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	//辞書を調べるsearchメソッド
	public static void search(String[] word) {
		
		//HashMap dictionaryの宣言
		HashMap<String,String> dictionary = new HashMap<String, String>();
		
		//dictionaryに単語を追加
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウイ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
		
		//英語がdictionrayに存在するか調べる
		for(String eng : word) {
			boolean exist = dictionary.containsKey(eng);
			if (exist) {
				System.out.println(eng + "の意味は" + dictionary.get(eng));
			} else {
				System.out.println(eng + "は辞書に存在しません");
			}
		}
		
	}	
	
}
