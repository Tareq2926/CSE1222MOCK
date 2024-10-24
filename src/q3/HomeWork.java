package q3;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        File dir = new File("HomeWork");
        dir.mkdir();
        String path = dir.getAbsolutePath();

        File file1 = new File(path + "/address.txt");

        try {
            file1.createNewFile();
            System.out.println("File is created.");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            Formatter formatter = new Formatter(path + "/address.txt");
            Scanner input = new Scanner(System.in);
            System.out.println("How many students : ");
            int num = input.nextInt();

            for(int i=0;i<num;i++)
            {
                System.out.println("Enter student id and name :");
                String id = input.next();
                String name = input.next();
                formatter.format("%s %s\n",id,name);

            }
            formatter.close();
        }catch (Exception e) {
            System.out.println(e);
        }
        try {
            File file= new File(path +"/address.txt");
            Scanner scanner=new Scanner(file);

            while (scanner.hasNext()) {
                String id= scanner.next();
                String name= scanner.next();
                System.out.println("ID:"+id +' '+"Name: "+name);
            }
            scanner.close();
        }catch (Exception e) {
            System.out.println(e);
        }
    }

}