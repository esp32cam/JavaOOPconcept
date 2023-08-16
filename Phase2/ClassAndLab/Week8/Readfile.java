import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chanakarnkin
 */
public class Readfile {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Exception = ข้อยกเว้น
        BufferedReader inputStream = null;
        PrintWriter outputStream = null;
    
        try {
            inputStream = new BufferedReader(new FileReader("src/file1.csv"));
            outputStream = new PrintWriter(new FileWriter("src/output1.txt"));
            String l;
            int sum = 0; // ตัวแปรเพื่อมาเก็บค่าผลบวก
            while ((l = inputStream.readLine()) != null) { // เมื่ออ่านไฟล์แล้วยังพบว่ามี Line ให้อ่าน
                String [] ll = l.split(",");
                for (int i = 0 ; i < ll.length ; i++) {
                    sum += Integer.parseInt(ll[i]);
                }
            }
            System.out.println(sum);
            outputStream.println(sum);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
   
        
    }

}


