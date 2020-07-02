package Java.基础._4_equals;

/**
 * @Author: 杨斌
 * @Date: 2020/6/18 0018 11:09
 * <p>
 * == : 它的作用是判断两个对象的地址是不是相等。即，判断两个对象是不是同一个对象。
 *      (基本数据类型==比较的是值，引用数据类型==比较的是内存地址)
 * equals() : 它的作用也是判断两个对象是否相等。但它一般有两种使用情况：
 *      情况1：类没有覆盖 equals() 方法。则通过 equals() 比较该类的两个对象时，等价于通过“==”比较这两个对象。
 *     情况2：类覆盖了 equals() 方法。一般，我们都覆盖 equals() 方法来两个对象的内容相等；若它们的内容相
 *            等，则返回 true (即，认为这两个对象相等)。
 *
 */
public class example {
    public static void main(String[] args) {
        String a = new String("ab"); // a 为一个引用
        String b = new String("ab"); // b为另一个引用,对象的内容一样
        String aa = "ab"; // 放在常量池中
        String bb = "ab"; // 从常量池中查找
        System.out.println("aa == bb       ->    " + (aa == bb));

        System.out.println("a == b         ->    " +( a == b));

        //因为String重写了equals方法   所以此时比较的事内容
        System.out.println("a.equals(b)    ->    " + a.equals(b));

    }
}

