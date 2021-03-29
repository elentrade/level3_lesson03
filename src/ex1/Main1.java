package ex1;

import java.io.*;

public class Main1 {


    public static void main(String[] args) {
// File file = new File("docs50.xml") ;
  //    System.out.println(file.getAbsolutePath());


//   ex # 1 1-st way
	try (FileInputStream in = new FileInputStream("docs50.xml")) {
	    int i;
	    while ((i=in.read())!=-1){
            System.out.print((char) i);
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }


        //   ex # 1 2-nd way
//        BufferedReader br = null;
//        FileReader fr = null;
//        String currentLine;
//        try {
//            fr = new FileReader("docs50.xml");
//            br = new BufferedReader(fr);
//            while ((currentLine= br.readLine())!=null){
//                System.out.println(currentLine);
//
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            br.close();
//            fr.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }
}
