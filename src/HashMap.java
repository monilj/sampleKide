import java.util.*;
class TestCollection13{
    public static void main(String args[]){

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        HashMap<Character,Integer> mhm=new HashMap<Character, Integer>();
        String str = "ghnejlsdjkekfdf";
        char [] ch= str.toCharArray();


        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
