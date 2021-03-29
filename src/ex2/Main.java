package ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

 public static void main(String[] args) {


        //последовательно считывать файлы из папки docs не получилось
      ArrayList<FileInputStream> all = new ArrayList<>();
       ArrayList<File> files = new ArrayList<>();
      File file = new File("docs");
       for (String a : file.list()) {
//          try {
     System.out.println(a);
//                all.add(new FileInputStream(a)); //так не работает
//
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
       }
//     SequenceInputStream in = new SequenceInputStream(Collections.enumeration(all));
     try {
         all.add(new FileInputStream("docs/docs1.xml"));
         all.add(new FileInputStream("docs/docs2.xml"));
         all.add(new FileInputStream("docs/goods1.xml"));
         all.add(new FileInputStream("docs/goods2.xml"));
         all.add(new FileInputStream("docs/goods3.xml"));
         SequenceInputStream in = new SequenceInputStream(Collections.enumeration(all));
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     }



 }
}
