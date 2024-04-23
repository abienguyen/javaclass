package vn.tvn.access_modifier.same_package_sub_class;

public class SubClass extends SupperClass{

    public void callAllMethods(){
        publicMethod();
        protectedMethod();
        defaultMethod();
        //privateMethod(); --> ko dung dc
    }
}
