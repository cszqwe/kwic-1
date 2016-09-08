package test;

//import CS3213.KeyWords;
//import CS3213.KeyWordsFilter;

import org.junit.Test;

import static org.junit.Assert.*;

public class KeyWordFilterTest {

    @Test
    public void testIsWordIgnored() throws Exception {
        KeyWords keyWords = KeyWords.getKeyWords();

        assertFalse(keyWords.isKeyWord("KeyWord1"));
        keyWords.addKeyWord("KeyWord1");
        keyWords.addKeyWord("KeyWord2");
        keyWords.addKeyWord("KeyWord3");
        keyWords.addKeyWord("KeyWord4");
        assertTrue(keyWords.isKeyWord("KeyWord1"));
        assertTrue(keyWords.isKeyWord("KeyWord2"));
        assertTrue(keyWords.isKeyWord("KeyWord3"));
        assertTrue(keyWords.isKeyWord("KeyWord4"));
        assertFalse(keyWords.isKeyWord("KeyWord5"));
        String[] initStrings = new String[]{"KeyWord1 a b c d","a KeyWords2 b c d","KeyWord3 a b c d","b c d e KeyWord4","keyword5 a b c d"};
        KeyWordsFilter keywordsFilter = new KeyWordsFilter(initStrings , keyWords);
        keywordsFilter.filter();
        String[] finalResult = keywordsFilter.getFilteredResults();
        assertTrue(finalResult.length == 2);
        assertTrue(finalResult[0].equals("KeyWord1 a b c d"));
        assertTrue(finalResult[1].equals("KeyWord3 a b c d"));
    }
}