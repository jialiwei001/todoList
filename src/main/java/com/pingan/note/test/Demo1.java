package com.pingan.note.test;

import java.lang.reflect.Method;

/**
 * @author: 焦立伟
 * @PackageName: com.pingan.note.test
 * @ClassName: Demo1
 * @Description:
 * @date: 2019/11/25 12:27
 */
public class Demo1 {

    public static void main(String[] args) throws Exception {

        Object obj = create("am.Foo");

        Foo foo = (Foo) obj;

        System.out.println(foo.a);
        double dou = foo.show(12,"hello");
        System.out.println(dou);


    }

    //通过反射调用方法，那个对象，什么名称，参数类型，参数值
    public static Object getMethodValue(Object obj,String method,Class[] paramType,Object[] param) throws Exception {

        Class cla = obj.getClass();

        Method me = cla.getDeclaredMethod(method, paramType);

        Object o = me.invoke(obj, param);

        return o;
    }

    public static Object create(String name) throws Exception {

        //反射的方法
        Class cla = Class.forName(name);

        //如何获得object类型对象
        Object obj = cla.newInstance();

        return obj;

    }
}

class Foo{
    int a = 10;

    double b = 20;

    public double show(int p ,String str){
        System.out.println("调用方法传入的值是："+str);
        return a+b+p;
    }

    public Foo(){

    }

    public Foo(int a ,int b){

    }

}
