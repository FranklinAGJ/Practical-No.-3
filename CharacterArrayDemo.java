class CharacterArray {
    char[] array;

    public void setArray(char[] arr) {
        array = arr;
    }

    public void searchCharacter(char searchChar) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchChar) {
                System.out.println("Character '" + searchChar + "' found at index: " + i);
                return;
            }
        }
        System.out.println("Character '" + searchChar + "' not found in the array.");
    }
}

public class CharacterArrayDemo {
    public static void main(String[] args) {
        char[] charArray = {'l', 'o', 'k', 'w', 'p', 'F', 'R', 'N'};
        CharacterArray object = new CharacterArray();
        object.setArray(charArray);

        char searchChar = args[0].charAt(0); // Taking input character from command-line args
        object.searchCharacter(searchChar);
    }
}