package Java.基础._1_重载重写;

import java.util.ArrayList;

/**
 * @Author: 杨斌
 * @Date: 2020/6/18 0018 10:37
 */
public class Children extends Parent {
    //   返回值范围小于等于父类
    @Override
    public ArrayList ret() {
        return new ArrayList();
    }
    /*@Override
    public Object ret(){
        return new Object();
    }*/

    //    抛出的异常范围小于等于父类
    @Override
    public void excep() throws NullPointerException {

    }
    /*@Override
    public void excep() throws Exception {

    }*/


    //    访问修饰符范围大于等于父类
    @Override
    public void access() {
    }

    /*@Override
    private void access() {

    }*/
}
