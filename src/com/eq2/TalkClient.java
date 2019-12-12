package com.eq2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.SQLOutput;

/**
 * @Auther: szp
 * @Date: 2019/12/11 20:47
 * @Description: 沈泽鹏的声音
 */

public class TalkClient {
    public static void main(String[] args) {
        try {
            //通过ip地址和端口号找到接受方    理解为打电话的时候要输对手机号
            Socket socket=new Socket("127.0.0.1",4700);

            BufferedReader isn=new BufferedReader(new InputStreamReader(System.in));

            PrintWriter os=new PrintWriter(socket.getOutputStream());
            BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String readLine;
            readLine=isn.readLine();
            while (!readLine.equals("bye")){
                os.println(readLine);
                os.flush();
                System.out.println("Client:"+readLine);
                System.out.println("Server"+is.readLine());
                readLine=isn.readLine();
            }

            os.close();
            is.close();
            socket.close();
        }catch (Exception e){
            System.out.println("异常信息");
        }
    }

}
