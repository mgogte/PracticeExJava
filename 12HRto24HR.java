//program to convert 12HR to 24HR
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        convertAMtoPM(time);
    }
    
    public static void convertAMtoPM(String time){
        String value, ending;
        String value1 = "";
        value = time.substring(0,2);
        ending = time.substring(8,10);
        if(ending =="PM" && Integer.parseInt(value)<12){
            //System.out.println("entered first if");
            value1 = String.valueOf(Integer.parseInt(value) + 12);
        }
        else if(ending =="AM" && Integer.parseInt(value) == 12){
            value1 = "00";
        }
        
        //System.out.println(ending);
        System.out.println(String.valueOf(Integer.parseInt(value) + 12) + time.substring(2,8));
        
    }
}
