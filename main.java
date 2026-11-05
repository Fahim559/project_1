
import java.util.Scanner;

public class main {


    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = scanner.nextInt();



        System.out.print("Enter Username: ");
        String username = scanner.next();

        System.out.print("Enter Email: ");
        String email = scanner.next();

        System.out.print("Enter Password: ");
        String password = scanner.next();

        System.out.print("Enter Salt: ");
        String salt = scanner.next();




        User user1 = new User(id, username, email, salt, password);        
        System.out.println("ID: " + user1.getId());
        System.out.println("Username: " + user1.getUsername());
        System.out.println("Email: " + user1.getEmail());
        System.out.println("Password: " + user1.getPassword());

        int save_id = user1.getId();
        System.out.println("Password has been saved: " + save_id);


        scanner.close();
        

        

        

    }
}

