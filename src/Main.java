
public class Main {
    public static void main(String[] args) {
        Generator generator = new Generator();
        Text text = new Text(generator);
        text.startingText();

        PasswordData data = new PasswordData();
        data.choosingCharactersInPassword(2);
        data.choosingCharactersInPassword(1);
        data.choosingCharactersInPassword(3);

        text.setPasswordData(data);

        text.chosenCharacters();

        System.out.println();
        text.passwordLength();



        generator.setMinMax(5, 15);
        int passwordLength = generator.setPasswordLength();

        System.out.println("Length: " + passwordLength);
        generator.creatingPassword(data);

        String password = new String(generator.password);
        System.out.println("Password: " + password);



    }
}