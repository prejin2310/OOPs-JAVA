import java.util.*;
class Text extends Thread{
    public void run(){
        for(int i=0;i<=19;i++){
            System.out.println(i);
        }
    }
}
class Book extends Thread{
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("thread of Book");
        }

    }
}
public class MultiThread {
    public static void main(String[] args) {
        Book b=new Book();
        Text t=new Text();
        b.start();
        t.start();

    }
}
