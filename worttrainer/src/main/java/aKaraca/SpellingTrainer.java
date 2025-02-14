package aKaraca;

public class SpellingTrainer {
    private String[][] wordList;
    private int selectedIndex;
    // 0: Correct, 1: Wrong, 2: Total
    private int[] playerStats;
    /**
     * Contructor for the Rechtschreibtrainer class
     * @autor Ali Karaca
     * @version 14-02-2025
     */
    public void spellingTrainer() {
        wordList = new String[10][2];
        wordList[0][0] = "Haus";
        wordList[0][1] = "URLPlaceholder";
        wordList[1][0] = "Auto";
        wordList[1][1] = "URLPlaceholder";
        wordList[2][0] = "Schule";
        wordList[2][1] = "URLPlaceholder";
        wordList[3][0] = "Stuhl";
        wordList[3][1] = "URLPlaceholder";
        wordList[4][0] = "Tisch";
        wordList[4][1] = "URLPlaceholder";
        wordList[5][0] = "Hund";
        wordList[5][1] = "URLPlaceholder";
        wordList[6][0] = "Katze";
        wordList[6][1] = "URLPlaceholder";
        wordList[7][0] = "Maus";
        wordList[7][1] = "URLPlaceholder";
        wordList[8][0] = "Buch";
        wordList[8][1] = "URLPlaceholder";
        wordList[9][0] = "Stift";
        wordList[9][1] = "URLPlaceholder";


        playerStats = new int[3];
        playerStats[0] = 0;
        playerStats[1] = 0;
        playerStats[2] = 0;
    }
}
