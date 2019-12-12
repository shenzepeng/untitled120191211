package com.eq1;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/12/11 20:27
 * @Description: 沈泽鹏写点注释吧
 */
public class Demp1 {
    /**
     * 一个人去打比赛
     * 打完是否硬了
     * @param username
     * @return
     */
    public String getEnd(String username){
        /**
         * y=x+"asdas"
         */
        int end=(int)(Math.random()*10);
        if (end>5){
            return username+"赢";
        }else {
            return username+"输了";
        }
    }
    public void getStart(){
        /**
         * 3x;
         * void 就是不想输出
         */
        return;
    }

    public List<Object> getObjectList(String time){
        /**
         * List 就是输出结果
         * y=3x+z
         */
        List<Object> objects=new ArrayList<>();
        return objects;
    }
    public static void main(String[] args) {
        Demp1 demp1=new Demp1();

        String result = demp1.getEnd("小明");
        List<Object> asd =demp1.getObjectList("asd");

        System.out.println(result);
    }
}
