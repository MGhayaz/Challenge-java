package Question88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileNotFoundExceptionTest {
    public static void main(String[] args) {
        file();
    }
    public static void file(){
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter file name : ");
        String fileName = input.next();
        try (FileReader fileRead = new FileReader(fileName)){
            int reaad ;
            do{
                reaad = fileRead.read();
                System.out.print((char)reaad);

            } while (reaad != -1);

        } catch ( FileNotFoundException exe){
            System.out.println(exe.getMessage());
        } catch (IOException arre){
            System.out.println("IO Exception");
        }
    }
}
