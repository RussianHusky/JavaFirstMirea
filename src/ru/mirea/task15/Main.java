package ru.mirea.task15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Main {

    public static void write()
    {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        try {
            FileWriter myWriter = new FileWriter("task15.txt", false);
            myWriter.write(line);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void append()
    {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        try {
            FileWriter myWriter = new FileWriter("task15.txt", true);
            myWriter.write(line);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void read()
    {
        try {
            File myObj = new File("task15.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        try {
            File myObj = new File("task15.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        do {
            System.out.println("Input command\n1.Write or overwrite to file\n2.Read from file\n3.Append to file");
            a = scanner.nextInt();
            System.out.flush();
            switch (a)
            {
                case 1:
                    System.out.println("Input line");
                    write();
                    break;
                case 2:
                    read();
                    break;
                case 3:
                    System.out.println("Input line");
                    append();
                    break;
                default:
                    a = 0;
                    break;
            }
        } while(a != 0);
    }
}
