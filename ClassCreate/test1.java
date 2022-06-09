package ClassCreate;

public class test1 {
    public static void main(String[] args) {
        car c = new car("aaa",169.0);
        System.out.println(c.m_price + "的" + c.m_name + " 车 " );
        c.start();
        Student s = new Student("张三",18,'男');
        s.eat();
        s.getInfo();

    }
}
