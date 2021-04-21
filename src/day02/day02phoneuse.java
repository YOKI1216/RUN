package day02;

public class day02phoneuse {
    public static void main(String[] args) {
        day02phone one = new day02phone();
        day02phone two = phone02();
        System.out.println(one.price);
        one.price="fuck";
        System.out.println(one.price);
        test(one);
        person person = new person();
        person.setAge(80);
        person.show();
    }

    public static void test(day02phone pargram) {//phone 是类名 后面那个是对象名
        System.out.println(pargram.price);
    }

    public static day02phone phone02() {
        day02phone phone02 = new day02phone();
        return phone02;
    }
}
