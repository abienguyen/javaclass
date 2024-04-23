package vn.tvn.class_object;

public class DemoVariableType {


    public static void main(String[] args) {
        var sta = VariableType.staticVariable;

        VariableType variableType = new VariableType();
        var ins = variableType.instanceVariable;
    }

}
