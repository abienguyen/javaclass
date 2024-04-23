package vn.tvn.access_modifier.diff_package_sub_class.sub;


import vn.tvn.access_modifier.diff_package_sub_class.supper.SupperClass;

public class SubClassDiffPackage extends SupperClass {

    public void callAllMethods(){
        publicMethod();
        protectedMethod();
        //defaultMethod(); --> ko dung dc
        //privateMethod();
    }
}
