package com.hspedu.decorator;

public class _BufferedReader extends _Reader {
    _Reader reader;
    public _BufferedReader(_Reader reader) {
        this.reader = reader;
    }

    public void readFiles(int num) {
        for (int i = 0; i < num; i++) {
            reader.readFile();
        }
    }

    public void readArrays(int num) {
        for (int i = 0; i < num; i++) {
            reader.readArray();
        }
    }

    public void readPipes(int num) {
        for (int i = 0; i < num; i++) {
            reader.readPipe();
        }
    }
}
