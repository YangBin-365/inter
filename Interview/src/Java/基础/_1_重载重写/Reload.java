package Java.基础._1_重载重写;

/**
 * @Author: 杨斌
 * @Date: 2020/6/18 0018 10:25
 */
public class Reload {

    public Object fun(){
        return new Object();
    }

/* 	发生在同一个类中，方法名必须相同，参数类型不同、个数不同、顺序不同，
		方法返回值和访问修饰符可以不同，发生在编译时。   
		虽然访问修饰符不同，返回类型不同，但是由于参数列表与原有方法相同，所以该书写方式不合法
    private String fun()  {
        return "";
    }*/

    public Object fun(String s) {
        return new Object();
    }

    private int fun(int a) {
        return a;
    }





}
