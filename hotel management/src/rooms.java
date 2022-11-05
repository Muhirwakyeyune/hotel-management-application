import  java.util.Scanner;
public class rooms implements hotel {
     public int room_number;
     int rnumber;
     public String room_id;
     public String street_number;
     int[] rooms1={1,3,2,4,6,4,8,7,15,23,21,24,25,27,30,29,17,18,19,15,37,39,46,48};
     int[] room_not={9,10,11,12,13,14,16,20,22,24,26,27,28,31,32,33,34,35,36,38,40,41};
     Scanner sc =new Scanner(System.in);
    public rooms(int room_number, String first_clients, String street_number, int firstClients) {
       // First_clients = Integer.parseInt(first_clients);
    }

    public rooms(int room_number, String room_id, String street_number) {
        this.room_number = room_number;
        this.room_id = room_id;
        this.street_number = street_number;
    }

    public rooms() {

    }

    public int getRoom_number() {
        return room_number;
    }

    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    public String getRoom_id() {
        return room_id;
    }

    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    public String getStreet_number() {
        return street_number;
    }

    public void setStreet_number(String street_number) {
        this.street_number = street_number;
    }

    @Override
    public void rooms() {
        System.out.println(" this is MS hotel, with beautiful rooms ");
        System.out.println(" enter the number of room ");
        rnumber=sc.nextInt();



        }

    @Override
    public int[] clients() {
        for (int rum : rooms1) {
            if (rnumber == rum) {
                System.out.println(" the room you are requesting is already booked ");
            }
            else if (rnumber != rum) {
                System.out.println(" invalid input");
            }
        }
        return new int[0];
    }

    @Override
    public void employee() {
        for (int rum1 : room_not) {
            if (rnumber == rum1) {
                System.out.println(" welcome to room number" + rnumber);
            }
            else if (rnumber!=rum1) {
                System.out.println("invalid input");

            }
            return;
        }


    }}
