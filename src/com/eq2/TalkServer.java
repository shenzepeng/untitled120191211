package com.eq2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Auther: szp
 * @Date: 2019/12/11 20:47
 * @Description: 大家的耳朵
 */

public class TalkServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=null;
        /**
         * 通过ip地址+端口号 找到你    理解为现实 通过手机号给人打电话   我要找你们在哪才能对你们说话
         * 套接字
         */
        try {
            //创建一个serverSocket监听4700端口，等待对方说话
            serverSocket=new ServerSocket(4700);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Socket socket=null;
        try {
            socket=serverSocket.accept();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //听别人说话的是时候，一句一句的听别人
        String line;
        //把从别人听来的东西，放在自己的大脑中，在计算中叫做缓存
        BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        //听众的声音 说出的行为
        PrintWriter os=new PrintWriter(socket.getOutputStream());

        //脑子处理过后说出来的东西
        BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));

        line=sin.readLine();

        while (!line.equals("bye")){
            //向外说
            os.println(line);
            //刷新一下，咽吐沫
            os.flush();
            System.out.println("Service:"+line);
            System.out.println("client:"+is.readLine());
            line=sin.readLine();
        }
        //打完电话必须关上，计算机中叫做流的关闭
        os.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
