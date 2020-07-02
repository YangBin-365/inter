package Java.基础._2_字符串;

/**
 * @Author: 杨斌
 * @Date: 2020/6/18 0018 10:49
 */

/**
 * 每次对 String 类型进行改变的时候，都会生成一个新的 String 对象，然后将指针指向新的 String 对象。
 * StringBuffer 每次都会对 StringBuffer 对象本身进行操作，而不是生成新的对象并改变对象引用。相同情况下使用
 * StringBuilder 相比使用 StringBuffer 仅能获得 10%~15% 左右的性能提升，但却要冒多线程不安全的风险。
 *
 *  对于三者使用的总结：
 *    1. 操作少量的数据 = String
 *    2. 单线程操作字符串缓冲区下操作大量数据 = StringBuilder
 *    3. 多线程操作字符串缓冲区下操作大量数据 = StringBuffer
 *
 * 字符串常量池
 *      当使用 "" 创建 String 类型的对象时，虚拟机会在常量池中查找有没有已经存在的值和要创建的值相同的对象，
 *      如果有就把它赋给当前引用。如果没有就在常量池中新创建一个String对象。
 */
public class example {
    String s = new String();
//    String的内容是不可变的  因为其内部实现是常量的字符数组
//    public final class String { private final char value[];}

/*  StringBuilder 和 StringBuffer都继承了AbstractStringBuilder抽象类  其有一成员变量为
    char[] value;   这明显和String不同  这里没有加final关键字，所以是可变的*/

//    StringBuffer 对方法加了同步锁或者对调用的方法加了同步锁，所以是线程安全的
    StringBuffer sbuf = new StringBuffer();

//    StringBuilder 并没有对方法进行加同步锁，所以是非线程安全的。
    StringBuilder sbui = new StringBuilder();


}