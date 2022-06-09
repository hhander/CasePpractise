package ClassCreate;

public class Student {
    public String m_name;
    private int m_age;
    public char m_sex;

    public Student(String name,int age,char sex)
    {
        this.m_age = age;
        this.m_sex = sex;
        this.m_name = name;
    }

    public void eat()
    {
        System.out.println(m_name + "正在吃饭");
    }

    public void getInfo()
    {
        System.out.printf("%s %c %d",m_name,m_sex,m_age);
    }
}
