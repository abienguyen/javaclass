package vn.tvn.data_type;

public class BooleanVariable {

    // synx tax
    public void initBooleanVariable(){

        // data type  variable_name = init_value
        boolean isChecked = true;
        boolean hasModified;
        // ==> chi co 2 gia tri (true/ false)



        // class Boolean
        Boolean isClassBoolean = true;
        // 3 gia tri (null, true, false)

        String a = isClassBoolean.toString();
        // ==> a = "true"

        boolean b = isClassBoolean.booleanValue();
        // isClassBoolean --> object
    }

    public void usingBooleanVariable(){
        int a = 10;
        int b = 20;
        boolean result = a > b;

        // dung lamf gif
        // check dieu kien naof do
        boolean isChecked = true;
        if (isChecked) {
            System.out.println("isChecked = true");
        } else {
            System.out.println("isChecked = false");
        }
    }


}
