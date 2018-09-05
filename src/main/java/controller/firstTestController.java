package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by haohy on 2018/9/6.
 */
public class firstTestController {

    public static void main(String [] args){

       // BufferedReader bufferedReader=null;
        try{
         //   bufferedReader=new BufferedReader(new InputStreamReader(System.in));
           String bashCommand = "sh" + " "+"C:/Users/haohy/Desktop/test.sh";
            System.out.println(bashCommand);
            Runtime runtime ;
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
