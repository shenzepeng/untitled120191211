package com.eq3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @Auther: szp
 * @Date: 2019/12/11 21:36
 * @Description: 沈泽鹏写点注释吧
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        URL url=new URL("http://www.baidu.com");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(url.openStream()));
        String string;
        while ((string=bufferedReader.readLine())!=null){
            System.out.println(string);
        }
        bufferedReader.close();
    }
}
