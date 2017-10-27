/**
 * Created by jliang1 on 10/24/17.
 */
public class GenericShape<T> {
    private T shape;
    private String name;
    public void set(T shape) {this.shape = shape;}
    public T get() {return shape;}

}
