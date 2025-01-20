package lab9.com.java9.features;
import  java.util.*;

class Person {
    private String firstName;
    private String lastName;
    private double ssn;
}

class Foo{


    public Foo(int ...list){

    }
   static public void foo1(int ...list){

    }

    final public void foo2(int ...list){

    }

     private void foo3(int ...list){

    }

    @SafeVarargs
    public final void foo4(List<Person>... list) {

    }


}
public class D_SafeVarargsDemo {
    public static void main(String[] args) {
        List<String> l1=Arrays.asList("A","B");
        List<String> l2=Arrays.asList("M","X");
        foo(l1, l2);

    }

    private static void foo(List<String> ...list) {
//        for(List<String> data: list){
//            System.out.println(data);
//        }
        Object[] oList=list;
        oList[0]=Arrays.asList(12,22);//heap pollution
        String name=list[0].get(0);
        System.out.println(name);
    }
}
