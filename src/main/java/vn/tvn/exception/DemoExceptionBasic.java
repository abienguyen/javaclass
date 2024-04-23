package vn.tvn.exception;

// runtime, built in

import org.apache.commons.lang3.StringUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DemoExceptionBasic {

    public void readFile(String path){
        try {
            InputStream input = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void demoNullPointerException(){
        try {
            String str = null;
            str.equals("");
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public void demoArrayIndexOutOfBoundsException(){
        try {
            String[] a = new String[3];
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }

    public void multiCatchException(){
        try {
            int a = 10 / 0;
        } catch (NullPointerException e){
            System.out.println("Not null");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("wrong index");
        } catch (ArithmeticException e){
            System.out.println("div 0");
        }
    }

    public void demoThrowException() throws NullPointerException{
        String str = null;
        str.equals("");
    }

    public void demoThrowNewException(String str){
        if (StringUtils.isBlank(str)){
            throw new IllegalArgumentException("Gia tri ko dc empty");
        }
        System.out.println(str.length());
    }


    public static void main(String[] args) {
        try {
            DemoExceptionBasic demo = new DemoExceptionBasic();
            demo.demoNullPointerException();
            System.out.println("Done");
            demo.demoArrayIndexOutOfBoundsException();
            demo.multiCatchException();
            //demo.demoThrowException();
            demo.demoThrowNewException(null);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
