package com.frico.crmcommon.utils;

import com.alibaba.fastjson.JSONObject;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * 进行NIO客户端的连接访问。
 */

public class NIOClient implements AutoCloseable {

    private static ByteBuffer buffer = ByteBuffer.allocate(10240) ; // 开辟一个缓冲区
    private SocketChannel clientChannel ;

    public NIOClient() throws Exception {
        this.clientChannel = SocketChannel.open() ;
        this.clientChannel.connect(new InetSocketAddress("localhost",20050)) ;
    }

    public String accessServer(String msg) throws Exception {    // 访问服务器端
        buffer.clear(); // 清空缓冲区，因为该部分代码会重复执行
        int len = msg.getBytes().length;
        char perNum = (char) (len/126);
        char endNum = (char) (len%126);
        msg =String.valueOf(perNum)+String.valueOf(endNum)+msg;
        buffer.put(msg.getBytes()) ; // 将此数据保存在缓冲区之中
        buffer.flip() ; // 重置缓冲区
        this.clientChannel.write(buffer) ; // 发送数据内容
    // 当消息发送过去之后还需要进行返回内容的接收处理
        buffer.clear() ; // 清空缓冲区，等待新的 内容的输入
        byte[] data =null;
        while (this.clientChannel.read(buffer) >0){
            buffer.flip();
            int preNum = (int) buffer.get();
            int endsNum = (int) buffer.get();
            int length = preNum * 126 + endsNum;
            data = new byte[length];
            buffer.get(data, 0, length);
        }
        return new String(data);
    }

    @Override
    public void close() throws Exception {
        this.clientChannel.close();
    }

    private static void processByHead(SocketChannel socketChannel) throws IOException {
        int number = 0;
        while (socketChannel.read(buffer) > 0) {
            int position = buffer.position();
            int limit = buffer.limit();
            buffer.flip();
            System.out.println("position:"+buffer.position()+"  limit:"+buffer.limit());
            System.out.println("remain:"+buffer.remaining());
            if (buffer.remaining() < 2) {//判断数据长度是否够首部长度
                buffer.position(position);
                buffer.limit(limit);
                continue;
            }

            int preNum =(int)buffer.get();
            int endNum = (int)buffer.get();
            int length =preNum*126+endNum;
            System.out.println("length:"+length);
            if (buffer.remaining() < length) {//bytebuffer剩余数据是否足够一个包
                buffer.position(position);
                buffer.limit(limit);
                continue;
            }

            byte[] data = new byte[length];

            buffer.get(data, 0, length);
            System.out.println("data:"+new String(data) + "<--->" + number++);
            buffer.compact();
        }
    }

}

class tt{

    public static void main(String[] args) throws Exception{
        NIOClient nioClient = new NIOClient();
        JSONObject json = new JSONObject();
        json.put("msg_type","1005");
        json.put("account","69809");
//        json.put("leverage","100");
//        json.put("email","122899768@qq.com");
//        json.put("phone","+8613015789222");
        String msg = nioClient.accessServer(json.toString());
        System.out.println("msg:"+msg);
        JSONObject js = JSONObject.parseObject(msg);
        System.out.println(js.getString("email")+"+"+js.getString("phone")+"+"+js.getString("code"));
    }


}