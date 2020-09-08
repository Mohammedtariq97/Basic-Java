import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class regexdemo1{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
class MyRegex{
        String zeroto255 = "(\\d{1,2}|(0|1)\\" + "d{2}|2[0-4]\\d|25[0-5])";
        String pattern = zeroto255 + "\\." + zeroto255 + "\\." + zeroto255 + "\\." + zeroto255;

}
