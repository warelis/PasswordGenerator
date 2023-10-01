
public class Main {
    public static void main(String[] args) {
        Text text = new Text();
        text.startingText();
        PasswordData data = new PasswordData();
        data.choosingCharactersInPassword(2);
        data.choosingCharactersInPassword(1);
        for(int x : data.passwordSymbols){
            System.out.print(x);
        }
        System.out.println();
        Generator generator = new Generator();
        generator.creatingPassword();
//        for(char x : generator.password){
//            System.out.print(x);
//        }
        String password = new String(generator.password);
        System.out.println("Password: " + password);



    }
}