public class Text {
    private PasswordData passwordData;
    public void setPasswordData(PasswordData passwordData){
        this.passwordData = passwordData;
    }
    private Generator generator;

    public Text(Generator generator) {
        this.generator = generator;
    }
    public Text(){

    }

    public void startingText(){
        System.out.println("Hello, it's a password generator.");
        System.out.println("You can choose what characters do you want in " +
                "your password, lower case letters are added automatically");
        System.out.println("Press 1 to include upper case letters");
        System.out.println("Press 2 to include numbers");
        System.out.println("Press 3 to include special characters");
    }
    public void chosenCharacters() {
        System.out.println();
        System.out.println("You have chosen: ");
        for (int x : passwordData.passwordSymbols) {
            if (x == 0) {

            } else if (x == 1) {
                System.out.println("1. You have chosen upper case letters");
            } else if (x == 2) {
                System.out.println("2. You have chosen numbers");
            } else if (x == 3) {
                System.out.println("3. You have chosen special characters");
            } else {
                System.out.println("Out of scope, choose between 1-3");
            }
        }
    }

    public void passwordLength(){
        System.out.println(("Choose a password length, the scope is between " + generator.getMin() +
                " and " + generator.getMax()));
    }
    public void outOfScope(int passwordLength, int min, int max){
        if(passwordLength <= min){
            System.out.println("Password too short");
        }
        else if(passwordLength >= max){
            System.out.println("Password too long");
        }

    }

}
