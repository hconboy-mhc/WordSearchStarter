package cs225;

public class WordSearchTest {
    private static void testFindWord() {
        System.out.println ("Testing findWord");
        
        // Load in the puzzle
        WordSearch wordSearch = new WordSearch ("test_files/test1.txt");
        
        System.out.println("Testing left to right");
        int[] result = wordSearch.findWord("PEGASUS");
        assert 2 == result[0];
        assert 2 == result[1];
        assert 0 == result[2];

   }

   /**
    * Runs test code
    * @param args
    */
    public static void main(String[] args) {
        testFindWord();
    }
}
