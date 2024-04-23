package vn.tvn.access_modifier.same_class;

public class DemoSameClass {

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


    public void usingAllMethods(){
        defaultMethod();
        privateMethod();
        publicMethod();
        protectedMethod();
    }

    public static void main(String[] args) {
        DemoSameClass demoSameClass = new DemoSameClass();

        demoSameClass.protectedMethod();
        demoSameClass.defaultMethod();
        demoSameClass.publicMethod();
        demoSameClass.protectedMethod();
    }

}
