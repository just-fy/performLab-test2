package com.faizulina;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class NumbersSorter {
    public static final Integer ArrayCount = 10;

    private InputStream in;
    private PrintStream out;

    NumbersSorter(InputStream in, PrintStream out) {
        super();
        this.in = in;
        this.out = out;
    }

    void run() {
        ArrayList<Integer> arr = readArray();
        write(arr);
    }

    private ArrayList<Integer> readArray() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(in);
        for (int i = 0; i < ArrayCount; i++) {
            Integer val = scanner.nextInt();
            list.add(val);
        }
        Collections.sort(list);

        return list;
    }

    private void write(ArrayList<Integer> list) {
        StringWriter stringWriter = new StringWriter();
        for (int value: list) {
            String s = value + " ";
            stringWriter.write(s);
        }

        out.print(stringWriter.toString());
    }
}

