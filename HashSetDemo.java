/**
 * Created by stephenue on 2016/11/4.
 */
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class HashSetDemo {
    public static void main(String []args){
        Set<String> allSet=new HashSet<String>();            //散列存放
        allSet.add("1");
        allSet.add("2");
        allSet.add("3");
        allSet.add("4");
        allSet.add("5");
        System.out.println(allSet);


        Set<String> allSets=new TreeSet<String>();           //有序存放
        allSets.add("1");
        allSets.add("2");
        allSets.add("3");
        allSets.add("4");
        allSets.add("5");
        System.out.println(allSets);
    }
}
