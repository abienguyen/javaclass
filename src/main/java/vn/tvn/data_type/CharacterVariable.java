package vn.tvn.data_type;

public class CharacterVariable {

    public static void innit(){

        // syntax
        //data_type (char)  variable_name = innit value

        char letterA = 'A'; // duy nhat 1 ky tu, trong dau nhay don
        char letterB = 'B';

        char uniChar = '\u0026';  // &
        char aciiChar = 38;

        System.out.println(uniChar);
        System.out.println(letterA);
        System.out.println(aciiChar);


        Character objectCharacter = 'A';

        // BT tim hieu methods trong Character
        // method dung lam gi?
        // method tra vef gia trij gif?
        // method nay can parameter gif?
        //1. dung de kiem tra char cos phai laf thuoc so
        //2. trar ve true/false
        //3. parameter laf char datatype
        boolean result = Character.isDigit('\u0660');
        System.out.println(result);
    }



    public static void main(String[] args) {
        innit();
    }

}
