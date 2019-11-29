import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JulianDateToNormal {
    public static void main(String[] args) throws ParseException {
        String j = "113029";
        Date date = new SimpleDateFormat("Myydd").parse(j);
        String g = new SimpleDateFormat("dd.MM.yyyy").format(date);
        System.out.println(g);
    }
}
