package vn.tvn.practice;

public class BT3_1 {
    //3.1 Viết function count có bao nhiêu
    // từ trong 1 đoạn text nhập vào. Return về số đó.

    // cos the sai
    public static int countWords(String text){
        // toi di hoc
        int count  = text.split(" ").length;
        return count;
    }

    public static int countWords2(String text){
        // check null
        int count  = text.split("\\s+").length;
        return count;
    }


    public static void main(String[] args) {
        String tx = "tôi đi hoc đây nhé";
        int count = countWords2(tx);
        String tx2 = "  tôi đi    hoc đây nhé  ";
        int count2 = countWords2(tx2);
        String tx3 = null;
        int count3 = countWords2(tx3);

        for (String word : tx.split("\\s+")){
            System.out.println(word);
        }
        System.out.println(count);
    }

}
