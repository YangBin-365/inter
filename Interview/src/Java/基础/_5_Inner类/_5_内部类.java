package Java.基础._5_Inner类;

/**
 * @Author: 杨斌
 * @Date: 2020/7/3 0003 21:03
 */
public class _5_内部类 {
    private int i = 0;
    private static String s = "a";

    public static void main(String[] args) {
        //匿名内部类
        new _5_内部类().mylocal(new Object() {

        });
        _5_内部类.innerClass innerClass = new _5_内部类().new innerClass();

    }

    public void mylocal(Object obj) {

    //局部内部类和局部变量一样，不能有访问修饰符
        /*privete */
        final class local {

        }
        local local = new local();
    }

    //成员内部类   可以拥有访问修饰符
    protected class innerClass {
        //static int x = 0;  成员内部类不可以存在任何static的变量和方法
        final int x = 0; //可以定义常量

        public void inner() {
            int i = 0;
            //若要访问外部的同名变量或方法，形式为：类名.this.变量(方法名)
            System.out.println("i = " + _5_内部类.this.i);
            //成员内部类可以随意访问外部类的成员变量和成员方法(包括static方法和private方法)
        }
    }

    //不依赖于外部类，类似于静态方法，不可以调用外部类的非静态方法和变量
    protected static class staticInnerClass {
        public void staticInner() {
            //System.out.println(i);
            System.out.println(s);
            System.out.println("staticInnerClass");
        }
    }
}

