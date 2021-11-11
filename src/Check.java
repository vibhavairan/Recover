import java.text.SimpleDateFormat;
import java.util.*;

public class Check  {
    public static void main(String[] args){
       long timestamp = 1632821969;
        Date date = new Date(timestamp);
        System.out.println(date.toString());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        System.out.println(format.format(date).toString());

    }
}
