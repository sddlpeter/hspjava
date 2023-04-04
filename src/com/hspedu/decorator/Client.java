package com.hspedu.decorator;

public class Client {
    public static void main(String[] args) {
        _Reader fileReader = new _FileReader();
        _Reader charArrayReader = new _CharArrayReader();
        _Reader pipeReader = new _PipeReader();
        _BufferedReader reader1 = new _BufferedReader(fileReader);
        _BufferedReader reader2 = new _BufferedReader(charArrayReader);
        _BufferedReader reader3 = new _BufferedReader(pipeReader);
        reader3.readPipe();
        reader3.readPipes(3);


    }
}
