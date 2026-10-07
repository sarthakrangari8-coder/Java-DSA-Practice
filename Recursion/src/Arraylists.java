import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arraylists {
    public static void main(String[] args) {
         ArrayList<Integer>list=new ArrayList<>();

         //add elements
         list.add(0);
         list.add(2);
         list.add(3);
        System.out.println(list);

        //get elements
        int element=  list.get(0);
        System.out.println(element);

        //add elements in between
        list.add(1,4);
        System.out.println(list);

        //set element
        list.set(0,6);
        System.out.println(list);

        //delete element
        list.remove(1);
        System.out.println(list);

        //size of arraylist
        int size=list.size();
        System.out.println(size);

        //loops
//        for (int i=0;i<list.size();i++){
//            int max=list.get(0);
//            System.out.print(Math.max(ma));
//        }
//        System.out.println();

        //checking if an element exists
       boolean ans= list.contains(Integer.valueOf(7));
        System.out.println(ans);
        //sorting
        Collections.sort(list);
        System.out.println("Ascending order "+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Descending order"+list);


        //reverse the arraylist
        System.out.println("og arraylist"+list);
        Collections.reverse(list);
        System.out.println("reverse list"+list);


        ArrayList<String> l1 =new ArrayList<>();






    }


}
