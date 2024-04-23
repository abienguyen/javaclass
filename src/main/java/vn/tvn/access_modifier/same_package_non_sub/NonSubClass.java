package vn.tvn.access_modifier.same_package_non_sub;



public class NonSubClass {

    public void callAllMethods(){
        SupperClass supperClass = new SupperClass();

        supperClass.defaultMethod();
        supperClass.protectedMethod();
        supperClass.publicMethod();
        //supperClass.privateMethod();  --> ko dung dc
    }

}
