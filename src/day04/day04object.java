package day04;

public class day04object {
    static String phoneName;
    private int num;

    public day04object() {
    }

    public day04object(int num) {
        this.num = num;
    }

    public static String getPhoneName() {
        return phoneName;
    }

    public static void setPhoneName(String phoneName) {
        day04object.phoneName = phoneName;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
