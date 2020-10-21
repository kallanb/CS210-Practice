package practicing;

import java.util.ArrayList;
import java.util.Arrays;

public class TestClass {

   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(-3,3,24,17,9,31));
       TestClass.mystery(list);
   }
  
   public static void mystery(ArrayList<Integer> list) {
       for(int i=list.size() -1; i>=0;i--) {
           if(i%2==0) {
               list.add(list.get(i));
           }else {
               list.add(0,list.get(i));
           }
       }
       System.out.println(list.toString());
   }
}