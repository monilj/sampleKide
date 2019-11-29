public class BinaryToString extends BinaryHeart {
    public static void main(String[] args) {
        BinaryToString bts = new BinaryToString();
        bts.birthdayMesage();
        bts.drawNow();
    }
    public void birthdayMesage()
    {
        String letters = "01001000 01100001 01110000 01110000 01111001 00100000 01000010 01101001 01110010 01110100 01101000 01100100 01100001 01111001 00100000 01000100 01100101 01100001 01110010";
        String s = " ";
        for(int index = 0; index < letters.length(); index+=9) {
            String temp = letters.substring(index, index+8);
            int num = Integer.parseInt(temp,2);
            char letter = (char) num;
            s = s+letter;
        }

        System.out.println("\033[1;33m           " +s);
        System.out.println("\033[1;31m");
    }
}
