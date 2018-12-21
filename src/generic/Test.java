package generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        /*List<String> list1 = new ArrayList();
        list1.add("aaa");
        //list1.add(100);
        for(int i=0;i<list1.size();i++){
            String item = (String)list1.get(i);
            System.out.print(item);
        }*/

        /*List<String> stringArrayList = new ArrayList<>();
        List<Integer> integerArrayList = new ArrayList<>();

        Class classOfStringArrayList = stringArrayList.getClass();
        Class classOfIntegerArrayList = integerArrayList.getClass();

        if(classOfStringArrayList.equals(classOfIntegerArrayList)){
            System.out.println("泛型测试,类型相同");
        }*/

        /*generic.Generic<String> stringGeneric = new generic.Generic<String>("hello");
        generic.Generic<Integer> integerGeneric = new generic.Generic<Integer>(123456);
        System.out.println(stringGeneric.getKey());
        System.out.println(integerGeneric.getKey());*/

        /*Generic<?> generic1 = new Generic<>(123);
        Generic<?> generic2 = new Generic<>(456);
        Generic<?> generic3 = new Generic<>("789");
        getValue(generic1);
        getValue(generic2);
        getValue(generic3);*/

        List list = new ArrayList<>();
        list.add("11223333");
        list.add(123);
        list.add(true);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

    public static void getValue(Generic<?> generic){
        System.out.println(generic.getKey());
    }

}
