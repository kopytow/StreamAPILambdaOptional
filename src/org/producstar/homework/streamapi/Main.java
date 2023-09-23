package org.producstar.homework.streamapi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        try {
            // data.txt содержит строки вида (x1,y1)-(x2,y2)
            Stream<String> lines = new BufferedReader(new FileReader("data.txt")).lines();
            double maxSegmentLength = lines
                    .map(LineSegment::length)
                    .reduce((a,b)-> a > b ? a:b).orElse(0.0);
            System.out.println("Максимальная длина " + maxSegmentLength);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}