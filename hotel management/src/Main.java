public class Main {
    public static void main(String[] args) {

        System.out.println("WELCOME TO MS hotel");
        System.out.println("MS hotel is the first hotel to privide best service you need ");
           detail detai =new detail(7,12,"kj 12",12);
           detai.service();
        rooms room=new rooms();
        room.rooms();
        room.clients();
        room.employee();
           detai.decision();


    }
}