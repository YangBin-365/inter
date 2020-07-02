package Java.基础._3_拆箱装箱;

import java.beans.IntrospectionException;

/**
 * @Author: 杨斌
 * @Date: 2020/6/18 0018 11:06
 * <p>
 * 2.1.3 自动装箱与拆箱
 * 装箱：将基本类型用它们对应的引用类型包装起来；
 * 拆箱：将包装类型转换为基本数据类型；
 */
public class IntAnalyze {
    //    自动装箱              自动调用Integer.valueOf();
    Integer j = 1;

    //    自动拆箱              自动调用intValue()方法
    int i = new Integer(1);

    public static void main(String[] args) {
        Integer a = 127;                      //等价于Integer.valueOf(127)    byte 取值范围：[-128~~~127]
        Integer b = 127;                      //当valueOf传入的数在byte的范围之间时，不会新生成一个Integer对象
        System.out.println(a == b);           //true
        System.out.println("=====================");

        Integer aa = 128;                     //等价于Integer.valueOf(128)
        Integer bb = 128;                     //当valueOf传入的数超出byte的范围时，会新生成一个Integer对象
        System.out.println(aa == bb);         //false
        System.out.println("=====================");

        int aaa = 127;
        int bbb = 128;
        System.out.println(aaa == a);          //当一个引用类型和一个基本类型做比较的时候，会先把引用类型转换为基本类型作比较
        System.out.println(bbb == bb);         //即自动拆箱：自动调用 其intValue()方法


    }
}
