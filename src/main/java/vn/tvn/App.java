package vn.tvn;

import vn.tvn.java_basic.DemoDebug;
import vn.tvn.java_basic.objects.sub_object.DemoImportPackageEdit;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("I am Thinh");
        System.out.println("phone: 0934003155");
        System.out.println("email: tranthinh1384@gmail.com");
        System.out.println("address: 869 Au Co");
        String mess = formatString("han han");
        System.out.println(mess);
        DemoDebug demoDebug = new DemoDebug();
        String alert = demoDebug.otherFunction();
        System.out.println(alert);

        //import package
        DemoImportPackageEdit demoImportPackageEdit = new DemoImportPackageEdit();
        demoImportPackageEdit.importMethodDemo();

        // java convention name
        //https://www.javatpoint.com/java-naming-conventions



    }

    public static String formatString(String name){
        String text = "welcome to HCM, %s";
        return String.format(text, name);
    }

}
