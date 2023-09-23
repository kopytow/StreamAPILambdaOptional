package org.producstar.homework.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Отрезок.
 */
public final class LineSegment {

    public static double length(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double length(String strings) {
        List<Integer> list = Arrays.stream(strings.split("\\D"))
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt).toList();
        int N = list.size();
        return Math.sqrt(Math.pow((list.get(N - 2) - list.get(0)), 2) + Math.pow((list.get(N - 1) - list.get(1)), 2));
    }
}
