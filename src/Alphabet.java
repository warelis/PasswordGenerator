public class Alphabet {

    public final char[] lettersLowerCase = {'a', 'b', 'c',
            'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'};
    public final char[] lettersUpperCase = {'A', 'B',
            'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
    public final char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    public final char[] characters = {'!', '@', '#', '$', '%', '^', '&'};


    public Alphabet() {
    }

    public char[] getLettersLowerCase() {
        return lettersLowerCase;
    }

    public char[] getLettersUpperCase() {
        return lettersUpperCase;
    }

    public char[] getNum() {
        return num;
    }

    public char[] getCharacters() {
        return characters;
    }
}
