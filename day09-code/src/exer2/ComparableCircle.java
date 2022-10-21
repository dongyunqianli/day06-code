package exer2;

import org.junit.Test;

public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(Object o) {
        if(this==o){
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c=(ComparableCircle)o;
/*            if(this.getRadius()>c.getRadius()){
                return 1;
            }else if(this.getRadius()<c.getRadius()){
                return -1;
            }else{
                return 0;
            }*/
            return this.getRadius().compareTo(c.getRadius());
        }else{
            throw new RuntimeException("the incoming data type does not match");
        }
    }


}
