package ex3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main3 {
    final static int page_size = 1800;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
        System.out.println("Enter page number for reading, 0 - for exit");
        int page = sc.nextInt();
        long t=System.currentTimeMillis();
        if(page!=0) {

            for (int i = 0; i < page_size; i++) {
                try (RandomAccessFile raf = new RandomAccessFile("war_and_peace.txt", "r")) {
                    raf.seek((page * page_size - page_size) + i);
                    try {
                        System.out.print((char) raf.read());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    finally {
                        raf.close();
                    }

                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }
            System.out.println();
            System.out.println(System.currentTimeMillis()-t);
        }
        else return;
        }
    }
}
