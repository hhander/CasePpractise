package ClassCreate;

import java.util.Scanner;



public class BuyCart {
    static int cartNum = 0;

    public static void main(String[] args) {
        Goods[] shopCart = new Goods[100];
        System.out.println(shopCart.length);


        Scanner sc = new Scanner(System.in);
        String choice;
        boolean flag = true;


        do {
            menu();
            System.out.println("请选择");
            choice = sc.next();
            switch(choice)
            {
                case "add":
                    add_Cart(shopCart,sc);
                    break;
                case "del" :
                    del_Cart(shopCart);
                    break;
                case "query":
                    query_Cart(shopCart);
                    break;
                case "modify":
                    break;
                case "pay" :
                    break;
                case "quit":
                    flag = false;
                    break;
            }

        }while(flag);
    }

    public static void menu()
    {
        System.out.println("-----------  请选择  -----------");
        System.out.println("-----------  add    -----------");
        System.out.println("-----------  del    -----------");
        System.out.println("-----------  query  -----------");
        System.out.println("-----------  modify -----------");
        System.out.println("-----------  pay    -----------");
    }

    public static void add_Cart(Goods[] shopCart,Scanner sc)
    {
        if(cartNum > 100)
        {
            System.out.println("购物车已满");
        }
        else
        {
            shopCart[cartNum] = new Goods();
            System.out.println("请你输入商品编号");
            shopCart[cartNum].id = sc.nextInt();
            System.out.println("请你输入商品名称");
            shopCart[cartNum].name = sc.next();
            System.out.println("请你输入商品名称");
            shopCart[cartNum].price = sc.nextDouble();
            System.out.println("请你输入商品数量");
            shopCart[cartNum].buyNum = sc.nextInt();
            System.out.println("添加成功");
            cartNum++;

        }

    }

    public static void del_Cart(Goods[] shopCart)
    {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("输入需要删除的物件名称");
        String name = sc1.next();
        int ret = findInCart(shopCart,name);
        if(ret == -1)
        {
            System.out.println("你输入的名字不存在");
        }
        else
        {
            for (int i = ret; i < cartNum - 1; i++)
            {
                shopCart[i] = shopCart[i + 1];
            }
            cartNum--;
            System.out.println("删除成功");
        }


    }


    public static void query_Cart(Goods[] shopCart)
    {
        System.out.println("购物车数量为" + (cartNum));
        System.out.println("\t" + "名称" + "\t" + "id" + "\t" + "价格" + "\t" + "数量" + "\t");
        for (int i = 0; i < cartNum; i++)
        {
            System.out.print("\t" + shopCart[i].name + "\t" + shopCart[i].id + "\t"
                    + shopCart[i].price + "\t" + shopCart[i].buyNum + "\t");
            System.out.println();
        }

    }


    public static void modify_Cart(Goods[] shopCart)
    {

    }

    public static void pay_Cart(Goods[] shopCart)
    {

    }

    public static int findInCart(Goods[] shopCart,String name)
    {
        for (int i = 0; i < cartNum; i++)
        {
            if(shopCart[i].name.equals(name))
            {
                return i;
            }
        }
        return -1;
    }



}
