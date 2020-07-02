package Java.基础._1_重载重写;

/**
 * @Author: 杨斌
 * @Date: 2020/6/18 0018 10:25
 */
public class Reload {

    public Object fun(){
        return new Object();
    }

//    虽然访问修饰符不同，返回类型不同，但是由于参数列表与原有方法相同，所以该书写方式不合法
/*    private String fun()  {
        return "";
    }*/

    public Object fun(String s) {
        return new Object();
    }

    private int fun(int a) {
        return a;
    }





}
