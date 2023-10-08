import java.util.Random;
import java.util.Scanner;

public class Generator extends Alphabet{
    int passwordLength;
    public char[] password;
    public int setPasswordLength(int passwordLength){
        int min = 4;
        int max = 9;
        if(passwordLength>=min && passwordLength<=max){
            this.passwordLength = passwordLength;
        }
        else{
            this.passwordLength = 5;
        }
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
