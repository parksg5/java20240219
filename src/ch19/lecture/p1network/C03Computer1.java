package ch19.lecture.p1network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class C03Computer1 {
    public static void main(String[] args) throws IOException {
        // ServerSocket 만들기
        ServerSocket serverSocket = new ServerSocket(7000);

        // 연결 기다린 후
        // 연결되면 Socket 만들기
        Socket socket = serverSocket.accept();

        try (socket) {
            // Socket 에서 OutputStream 꺼내기
            // BufferedOutputStream 연결
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());

            // 파일은 아무거나
            // FileInputStream 만들기
            // BufferedInputStream 연결
            FileInputStream fis = new FileInputStream("temp/dog.png");
            BufferedInputStream bis = new BufferedInputStream(fis);

            try (bos; fis; bis;) {
                // BufferedInputStream 으로 읽은 데이터
                // BufferedOutputStream 으로 출력
                byte[] data = new byte[1024];
                int len = 0;
                while ((len = bis.read(data)) != -1) {
                    bos.write(data, 0, len);
                }
                bos.flush();
            }
                // 마지막에 flush()
        }
        // 끝
    }
}




