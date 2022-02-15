package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s = "";

        // String
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            s += i + " ";
        }
        System.out.println(s);
        long stopTime = System.currentTimeMillis();
        System.out.println();

        // StringBuilder
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
        long stopTime2 = System.currentTimeMillis();
        System.out.println();

        // Result time
        System.out.println("StringBuilder time " + (stopTime-startTime));
        System.out.println("String time " + (stopTime2-startTime2));
    }
}
