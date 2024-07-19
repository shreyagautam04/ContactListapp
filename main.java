import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactList contactlist = new ContactList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\t\t Contact List Application");
        System.out.println("Enter 1:Insert Contact");
        System.out.println("Enter 2:Search Contact");
        System.out.println("Enter 3:Delete Contact by Name");
        System.out.println("Enter 4:Print All");
        System.out.println("Enter 5:Exit");
        System.out.println("Enter your choice");
        int choice = scanner.nextInt();
        do {
            switch (choice) {
                case 1:
                    System.out.println("Enter ID:");
                    long id = scanner.nextInt();
                    System.out.println("Enter Name:");
                    String name = scanner.next();
                    System.out.println("Enter Phone number:");
                    String phone = scanner.next();
                    System.out.println("Enter Nickname:");
                    String nickname = scanner.next();
                    System.out.println("Enter Email:");
                    String email = scanner.next();
                    contactlist.insert(
                            id,
                            name,phone,nickname,email
                    );
                    break;
                case 2:
                    contactlist.search();
                    break;
                case 3:
                    contactlist.deleteContactByName();
                    break;
                case 4:
                    contactlist.printAll();
                    break;
                case 5:
                    break;
            }
        } while (true);
    }
}
