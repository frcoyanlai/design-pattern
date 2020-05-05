package creational.builder;

/**
 * @author: songyanlai
 * @version: v1.0
 * @date: 2020-05-04 13:58
 **/
public class Client {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        final int count = 26;
        for (int i = 0; i < count; i++) {
            sb.append((char) ('a' + i));
        }
        System.out.println(sb.toString());
    }
}
