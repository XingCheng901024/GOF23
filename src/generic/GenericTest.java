package generic;

/**
 * Created by Thinkpad on 2018/12/20.
 */
public class GenericTest {

    public class Generic<T>{
        private T key;

        public Generic(T key){
            this.key=key;
        }
        public T getKey(){
            return key;
        }
    }

    public <T> T showKeyName(Generic<T> container){
        System.out.println(container.getKey());
        T test = container.getKey();
        return test;
    }

    public void showKeyValue1(Generic<Number> obj){
        System.out.println(obj.getKey());
    }

    public void showKeyValue2(Generic<?> obj){
        System.out.println(obj.getKey());
    }


}
