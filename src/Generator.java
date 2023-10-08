import java.util.Random;
import java.util.Scanner;

public class Generator extends Alphabet{
    int passwordLength;
//    private Text text;
    int min = 4;
    int max = 9;
    public void setMinMax(int min, int max){
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    //    public void setText(Text text){
//        int max = 0;
//        int min = 0;
//        this.text = text;
//        this.min = min;
//        this.max = max;
//    }
    public char[] password;
    public int setPasswordLength(int passwordLength){

        int i;
        Scanner scan = new Scanner(System.in);
        do{
            i = scan.nextInt();
            // i < lub > wiadomość. Przekazać dalej i
        }while(i < 5 || i > 15);

//        if(passwordLength >= min && passwordLength <= max){
//            this.passwordLength = passwordLength;
//        }
//        else{
//            text.outOfScope(passwordLength, min, max);
//            //this.passwordLength = 5;
//        }
        password = new char[passwordLength];
        return this.passwordLength;
    }

    Random rand = new Random();

    public void creatingPassword(PasswordData passwordData){
        for(int i = 0; i < password.length; i++){
            int choice = passwordData.getPasswordSymbols(rand.nextInt(4));
        switch (choice) {
            case 0:
                password[i] = lettersLowerCase[rand.nextInt(lettersLowerCase.length)];
                break;
            case 1:
                password[i] = lettersUpperCase[rand.nextInt(lettersUpperCase.length)];
                break;
            case 2:
                password[i] = num[rand.nextInt(num.length)];
                break;
            case 3:
                password[i] = characters[rand.nextInt(characters.length)];
                break;
        }
        }
    }

}
