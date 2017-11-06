import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class largeandsmall {
    public static void main (String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max,min;
        max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        min=a;
        if(b<min) min=b;
        if(c<min) min=c;
        System.out.println("The max number is " + max);
        System.out.println("The min number is " + min);


    }
}
