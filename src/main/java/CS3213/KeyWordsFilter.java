package CS3213;

import java.util.ArrayList;

/*
 * Provides the function to filter the input.
 * Only reserve the strings start with a key word. The rest would be removed.
 */
public class KeyWordsFilter {
	private KeyWords keyWords;
	private String[] data;
	private ArrayList<String> filteredResults = new ArrayList<String>();
	public KeyWordsFilter(String[] data, KeyWords keyWords){
		this.data = data;
		this.keyWords = keyWords;
	}
	public void filter(){
		filteredResults.clear();
		if (data == null) return;
		if (keyWords == null) return;
		for (int i = 0; i < this.data.length; i++){
			String firstWord = this.data[i].split(" ")[0];
			if (keyWords.isKeyWord(firstWord)){
				filteredResults.add(this.data[i]);
			}
		}
	}
	
	public String[] getFilteredResults(){
		String[] ans = new String[filteredResults.size()];
		filteredResults.toArray(ans);
		return ans;
	}
}
