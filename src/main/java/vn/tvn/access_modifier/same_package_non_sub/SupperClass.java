package vn.tvn.access_modifier.same_package_non_sub;

public class SupperClass {

    void defaultMethod(){
        System.out.println("default Method");
    }

    private void privateMethod(){
        System.out.println(" Private Method");
    }

    protected void protectedMethod(){
        System.out.println("protected Method");
    }

    public void publicMethod(){
        System.out.println("public method");
    }
}
