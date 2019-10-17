package StacksAndQues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) throws IOException {
        var reader = new BufferedReader(new InputStreamReader(System.in));

        String[] robotsWithTime = reader.readLine().split(";");

        String[] robots = new String[robotsWithTime.length];

        int[] times = new int[robotsWithTime.length];

        int[] processTime = new int[robotsWithTime.length];
        int index = 0;
        for (String robot : robotsWithTime) {
            String[] data = robot.split("-");
            robots[index] = data[0];
            times[index] = Integer.parseInt(data[1]);
            index++;
        }
        String[] timeData = reader.readLine().split(":");
        int hours = Integer.parseInt(timeData[0]);
        int minutes = Integer.parseInt(timeData[1]);
        int seconds = Integer.parseInt(timeData[2]);
        int beginSeconds = hours * 3600 + minutes * 60 + seconds;
        String line = reader.readLine();

        ArrayDeque<String> queue = new ArrayDeque<>();
        while (!line.equals("End")) {
            queue.offer(line);


            line = reader.readLine();
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (!queue.isEmpty()) {
            beginSeconds++;
            String product = queue.poll();
            for (int i = 0; i < processTime.length; i++) {
                if (processTime[i] > 0) {
                    processTime[i]--;
                }

            }

            boolean istaken = false;
            for (int i =0; i < robots.length; i++) {
                if (processTime[i] == 0) {
                    processTime[i] = times[i];
                    stringBuilder.append(print(robots[i], product, beginSeconds));

                    istaken = true;
                    break;
                }
            }
            if (!istaken) {
                queue.offer(product);
            }
        }
        System.out.println(stringBuilder.toString());

    }

    private static String print(String robot, String product, int beginSeconds) {

        long s = beginSeconds % 60;
        long m = (beginSeconds / 60) % 60;
        long h = (beginSeconds / (60 * 60)) % 24;

        return
                String.format("%s - %s [%02d:%02d:%02d]%n", robot, product, h, m, s);


    }
}



