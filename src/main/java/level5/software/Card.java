package level5.software;

public class Card {
    private final int index;
    private final String value;
    
    public Card(int index, String value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public String getValue() {
        return value;
    }
}
