public class PasswordData {

    public int[] passwordSymbols = new int[4];

    public int getPasswordSymbols(int index) {
        if(index >=0 && index <= passwordSymbols.length){
            return passwordSymbols[index];
        }
        else{
            return passwordSymbols[0];
        }
    }


    public void choosingCharactersInPassword(int number) {
        switch (number) {
            case 0:
                passwordSymbols[0] = 0;
                break;
            case 1:
                passwordSymbols[1] = 1;
                break;
            case 2:
                passwordSymbols[2] = 2;
                break;
            case 3:
                passwordSymbols[3] = 3;
                break;
            default:
                break;
        }
    }
}
