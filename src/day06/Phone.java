package day06;
public class Phone {
    private String name;
    private double price;
    //重写equals方法，比较name属性是否相等，相等返回true，不等返回false
    @Override
    public boolean equals(Object obj) {
        //入参类型是Object类型，父类不能调用子类特有的属性或方法，需要向下转型
        //并且由入参是Object类型，也就是说任何类型的参数都能进来
        //这样就得先判断入参类型是否是Phone类型(还可以加非空判断、是否是自己比较自己判断等)
        if(this == obj){
            return true;
        }
        if(obj instanceof Phone){
            Phone p = (Phone)obj;//向下转型
            return this.name == p.name;
        }
        return false;
    }
    //空参构造
    public Phone(){
    }
    //有参构造
    public Phone(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
