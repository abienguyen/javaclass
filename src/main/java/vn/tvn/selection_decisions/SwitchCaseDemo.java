package vn.tvn.selection_decisions;

import org.apache.commons.lang3.StringUtils;

public class SwitchCaseDemo {

    public void demoSwitchCase(String browser){
        switch (browser){
            case "ie":
                System.out.println("Start IE browser");
                break;
            case "safari":
                System.out.println("Start Safari browser");
                break;
            case "firefox":
                System.out.println("Start Firefox browser");
                break;
            default:
                System.out.println("Not start anything");
        }
    }

    public void ifElseVsSwitchCase(String browser){
        if(StringUtils.equals(browser, "ie")){
            System.out.println("Start IE browser");
        } else if(StringUtils.equals(browser, "safari")){
            System.out.println("Start Safari browser");
        } else if (StringUtils.equals(browser, "firefox")){
            System.out.println("Start Firefox browser");
        } else {
            System.out.println("Not start anything");
        }
    }

    public static void main(String[] args) {
        SwitchCaseDemo switchCaseDemo = new SwitchCaseDemo();
        switchCaseDemo.demoSwitchCase("firefox");
        switchCaseDemo.ifElseVsSwitchCase("firefox");
    }

}
