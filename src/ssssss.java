public class ssssss {

    public static void main(String[] args) {

        String text="";

        String[] numbers = text.split("\\D");
        int sum = 0;
        for (String number : numbers)

        {
            try {
                sum += Integer.parseInt(number);
            } catch (Exception ex) {
                //not an integer number
            }
        }
        System.out.println(sum);
    }

}