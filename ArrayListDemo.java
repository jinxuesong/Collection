/**
 * Created by stephenue on 2016/11/3.
 */
import java.util.ArrayList;
import java.util.List;
//import java.util.Collection;

public class ArrayListDemo {
    public static void main(String []args){
        List<String> allList=new ArrayList<>();
        //Collection<String> allcollection=new ArrayList<String>();
        allList.add("hello");
        allList.add(0,"world");                      //添加对象       直接加    或者按照位置加
        allList.add("stephenue");
        allList.add("www.jxs.com");
        System.out.println(allList);
        allList.remove(3);
        System.out.println(allList);                 //移除对象    0123或者对象名称
        allList.remove(0);
        System.out.println(allList);
        allList.remove("stephenue");
        System.out.println(allList);




    }
}
