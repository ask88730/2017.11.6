public class grade {
    public static void main (String args[]){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        if (a>=60||a<=100)
        {
            System.out.print("及格");
        }
          else
              {
                  if (a<60||a>=50)
                  {
                      System.out.print("補考");
                  }
                  else
                  {
                      System.out.print("死當");
                  }
        }
    }
}
