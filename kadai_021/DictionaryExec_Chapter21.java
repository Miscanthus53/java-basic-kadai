package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンス作成
		Dictionary_Chapter21 doSearch = new Dictionary_Chapter21();
		
		//調べる英単語を配列にセット
		String[] word = {"apple", "banana", "grape", "orange"};
		
		//searchメソッドで辞書を調べる
		doSearch.search(word);

	}

}
