package Learn_0;

public class Goods implements Comparable{
    private String name;
    private double price;
    public Goods(){}
    public Goods(String name,double price){
        this.name=name;
        this.price=price;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(){
        this.price=price;
    }
    public String toString(){
        return "Goods{"+
                "name='"+name+'\''+
                ", price="+price+
                '}';
    }
    public int compareTo(Object o){
        if(o instanceof Goods){
            Goods goods=(Goods)o;
            //way1:
            if(this.price>goods.price){
                return 1;
            }else if(this.price<goods.price){
                return -1;
            }else{
                return -this.name.compareTo(goods.name);
            }
            //way2:
//            return Double.compare(this.price,goods.price);
        }
        throw new RuntimeException("inconsistent data type");
    }
}
