package vn.tvn.class_object;

public class VariableType {
    // static, instance, local
    public String instanceVariable = "instanceVariable";
    public static String staticVariable = "staticVariable";

    public void demoLocalVariable(){
        String localVariable = "localVariable";
        System.out.println(instanceVariable);
        System.out.println(staticVariable);
        System.out.println(localVariable);
    }

    public void demoLocalVariable2(){
        System.out.println(instanceVariable);
        System.out.println(staticVariable);
        //System.out.println(localVariable);
    }

}
