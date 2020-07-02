package Java.基础._9_interface_abstract;

/**
 * 在JDK8中，接口也可以定义静态方法，可以直接用接口名调用。实现类和实现是不可以调用的。如果同时实现
 * 两个接口，接口中定义了一样的默认方法，必须重写，不然会报错。
 */
public interface intter {
    //接口中的实例变量默认是 final 类型的，而抽象类中则不一定
    final int i = 0;
    //接口的方法默认是 public，所有方法在接口中不能有实现(Java 8 开始接口方法可以有默认实现）
    // 抽象类可以有非抽象的方法
    public default void fun() {
        System.out.println("这是接口的fun方法的默认实现");
    }


    public void fun4();

    public static void fun5(){
        System.out.println("这是接口的静态方法fun5()");
    }
}
