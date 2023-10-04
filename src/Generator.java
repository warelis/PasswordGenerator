import java.util.Random;
import java.util.Scanner;

public class Generator extends Alphabet{
    public char[] password = new char[10];
    Random rand = new Random();
//    PasswordData passwordData = new PasswordData();

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
