package generic;

/**
 * Created by Thinkpad on 2018/12/19.
 */
public class Generic<T> {

    private T key;

    public Generic(T key){
        this.key = key;
    }

    public T getKey(){
        return key;
    }

}
