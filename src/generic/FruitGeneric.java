package generic;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Thinkpad on 2018/12/20.
 */
public class FruitGeneric<T> implements GenericInterface<T> {

    @Override
    public T next() {
        return null;
    }

    public <E> void show1(E t){

    }

    public  void show2(ConcurrentHashMap temp){

    }

}
