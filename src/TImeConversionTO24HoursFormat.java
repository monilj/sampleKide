import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TImeConversionTO24HoursFormat {
    public static void main(String[] args) {
//        String input = "23/12/2014 10:22:12 PM";
        String input = "10:22:12PM";

        //Format of the date defined in the input String i.e 12 hours format
        //DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        //Desired format: 24 hour format: Change the pattern as per the need
//        DateFormat outputformat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");

        Date date = null;
        String output = null;
        try{
            //Converting the input String to Date
            date= df.parse(input);
            //Changing the format of date and storing it in String
            output = outputformat.format(date);
            //Displaying the date
            System.out.println(output);
        }catch(ParseException pe){
            pe.printStackTrace();
        }

    }
}
