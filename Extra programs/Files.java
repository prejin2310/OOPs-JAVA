import java.io.*;
public class files {
    public static void main(String[] args) {
        //create file
        File f=new File("Sample.txt");
        try{
            boolean status=f.createNewFile();
            if(status)
                System.out.println("New file Created");
            else
               System.out.println("File Already Exist");
        }catch(Exception e){
            System.out.println("Error Occured");
        }

        //add message to file
        String msg="Learn Java programming";
        try{
            FileWriter fw=new FileWriter("Sample.txt");
            fw.write(msg);
            System.out.println("Message Written to file..");
            fw.close();
        }catch(Exception e){
            System.out.println("An Error Occured!");
        }

        //read content of file
        char[] data=new char[50];
        try{
            FileReader fr=new FileReader("Sample.txt");
            fr.read(data);
            System.out.println(data);
            fr.close();

        }catch(Exception e){
            System.out.println("Error!!");
        }

        //file deteletion
        File fd=new File("Sample.txt");
        fd.delete();


    }
}
