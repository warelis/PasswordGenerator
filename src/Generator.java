import java.util.Random;
import java.util.Scanner;

public class Generator extends Alphabet{
    int passwordLength;
    private int min = 4;
    private int max = 9;
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

    public char[] password;
    public int setPasswordLength(){
        Text text = new Text();
        int passwordLength;
        Scanner scan = new Scanner(System.in);
        do{
            passwordLength = scan.nextInt();
            if(passwordLength >= min && passwordLength <= max){
                this.passwordLength = passwordLength;
                break;
            }
            text.outOfScope(passwordLength,min,max);

        }while(passwordLength < min || passwordLength > max);

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
