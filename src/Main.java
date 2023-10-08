
public class Main {
    public static void main(String[] args) {
        Text text = new Text();
        text.startingText();

        PasswordData data = new PasswordData();
        data.choosingCharactersInPassword(2);
        data.choosingCharactersInPassword(1);
        data.choosingCharactersInPassword(3);

        text.setPasswordData(data); //Here is connecting data in main with
        // data in text class - REMEMBER how to do it

        text.chosenCharacters();

        System.out.println();
        text.passwordLength();


        Generator generator = new Generator();
        int passwordLength = generator.setPasswordLength(9);
        System.out.println("Length: " + passwordLength);
        generator.creatingPassword(data);

        String password = new String(generator.password);
        System.out.println("Password: " + password);



    }
}