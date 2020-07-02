package Java.基础._7_exception;

/**
 * @Author: 杨斌
 * @Date: 2020/6/18 0018 12:25
 */
public class example {

    public static void main(String[] args) {
        finalNotExecute1();

        re();

        finalNotExecute2();
    }

    public static void finalNotExecute1(){
        try {
            exception();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            int i = 2/0;
            System.out.println("执行了finally");
        }
    }


    public static void finalNotExecute2(){
        try {
            exception();
//            退出程序
            System.exit(0);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("执行了finally");
        }
    }


    public  static String re(){
        try {
            exception();
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }finally {
            System.out.println("执行了finally");
        }
    }


    private static void exception() throws Exception{
        System.out.println("执行了exception()");
    }
}
