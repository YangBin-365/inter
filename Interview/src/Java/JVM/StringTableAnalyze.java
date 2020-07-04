package Java.JVM;

/**
 * @Author: 杨斌
 * @Date: 2020/7/1 0001 20:17
 */
public class StringTableAnalyze {


    public static void main(String[] args) {

        String s1 = "a";          //在串池中添加"a"对象
        String s2 = "b";          //在串池中添加"b"对象
        String s3 = "a" + "b";    //首先编译器把该句优化为String s3 = "ab"  然后在串池中添加"ab"对象
        String s4 = s1 + s2;      //此句相当于new StringBuilder().append("a").append("b").toString()  即在堆内存中添加"ab"对象
        String s5 = "ab";         //尝试在串池中添加"ab"对象，发现已有，直接指向串池中的"ab"
        String s6 = s4.intern();  //尝试把s4放入串池，可是此时串池已有"ab"，所以放入失败，s4仍然指向堆中的"ab",s6指向串池中的"ab"

        System.out.println(s3 == s4);  //false
        System.out.println(s3 == s5);  //true
        System.out.println(s3 == s6);  //true

        //在堆中创建String("c") 然后尝试把"c"放入串池，发现池中没有，成功放入
        //在堆中创建String("d") 然后尝试把"d"放入串池，发现池中没有，成功放入
        //此句相当于new StringBuilder().append("c").append("d").toString;
        String x2 = new String("c") + new String("d");
        //尝试把x2放进串池
        //1.6： 发现串池中没有   复制一份"cd"  将其放进串池  x2仍然指向堆中的"cd"
        //1.7： 发现串池中没有   直接把堆中的"cd"对象放进串池，此时x2指向的是串池中的"cd"
        x2.intern();
        //此时串池中已有"cd"  所以x1直接指向串池中已经存在的"cd"
        String x1 = "cd";

        //1.6 :  x1指向串池中的"cd" ， x2指向堆中的"cd"         结果：false
        //1.7 :  x1指向串池中的"cd" ， x2也指向串池中的"cd"     结果：true
        System.out.println(x1 == x2);
    }
}
