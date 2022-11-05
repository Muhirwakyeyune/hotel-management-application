import java.util.Scanner;
public class detail extends rooms {
   private String name;
   private  String surname;
   private  int age;
   private String phone;
   private String email;
   public int room_Number;
   Scanner  sc = new Scanner(System.in);

    public detail(int room_number, int first_clients, String street_number, int firstClients) {
        super(room_number, String.valueOf(first_clients), street_number, firstClients);
    }
   public void service(){
       System.out.println(" please enter your name ");
       name= sc.nextLine();
       System.out.println(" please enter your second name");
       surname=sc.nextLine();
       System.out.println(" enter your age  ");
       age=sc.nextInt();
       System.out.print(" enter your email");
       email=sc.nextLine();

   }
   public void decision() {
       if (age < 15) {
           System.out.println(" Dear " + name + " you are not allowed to MS hotel");
           System.out.println(" we accept from 16 years old");
       }

       else {
           System.out.println(" welcome to the room number "+rnumber);
           System.out.println(" Name"+name+surname);
           System.out.println(" age"+age);
           System.out.println(" email"+email);
           System.out.println(" room number "+rnumber);
           System.out.println(" we like to provide better service for you");
       }
   }
}
