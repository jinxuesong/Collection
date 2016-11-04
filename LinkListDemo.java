/**
 * Created by stephenue on 2016/11/3.
 */
import java.util.LinkedList;
public class LinkListDemo {
    public static void main(String []args){
        LinkedList<String> link=new LinkedList<String>();
        link.add("i");
        link.add("have");
        link.add("a");
        link.add("pen");
        System.out.println("初始链表"+link);
        link.addFirst("so");
        link.addLast("ok");
        System.out.println("增加首尾后的链表"+link);


        System.out.println("找到表头的方法"+link.element());
        System.out.println("找完后的链表"+link);

        System.out.println("找到表头的另一种方法"+link.peek());        //找到表头后不删除
        System.out.println("找完后的链表"+link);

        System.out.println("还有一种方法"+link.poll());
        System.out.println("找完后的链表"+link);                  //找到表头后删除

    }
}
