package mysolutionCards;

public class CardStatic {

    private static String rankStatic;
    private static String suitStatic;

    public CardStatic(String rankStatic, String suitStatic) {
        this.rankStatic = rankStatic;
        this.suitStatic = suitStatic;
    }

    public static String getRankStatic() {
        return rankStatic;
    }

    public static String getSuitStatic() {
        return suitStatic;
    }
}
