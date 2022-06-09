package ClassCreate;

import java.sql.SQLOutput;

public class car {
    public String m_name;
    public double m_price;

    public void start()
    {
        System.out.println("汽车启动了");
    }

    public car(String name,double price)
    {
        this.m_name = name;
        this.m_price = price;
    }



}
