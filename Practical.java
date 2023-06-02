  import java.util.*;

class Practical{

    private static HashMap<Integer, String> name = new HashMap<Integer, String>();
    private static HashMap<Integer, String> gender = new HashMap<Integer, String>();
    private static HashMap<Integer, String> dob = new HashMap<Integer, String>();
    private static HashMap<Integer, String> email = new HashMap<Integer, String>();
    private static HashMap<Integer, String> phone = new HashMap<Integer, String>();     
    private static Scanner input = new Scanner(System.in);
    public static void main(String ars[]){
        int num;
        
        do{
            System.out.println("\n\n");
            System.out.println("----------------MENU----------------");
            System.out.println("1.DISPLAY");
            System.out.println("2.CREATE");
            System.out.println("3.UPDATE");
            System.out.println("4.DELETE");
            System.out.println("5.SORT");
            System.out.println("6.EXIT");
            System.out.println("Enter your choice\t:");
            num = input.nextInt();

            switch(num){
                case 1:
                    display();
                    break;
                case 2:
                    create();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    sort();
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Please enter valid number...");
                    num = 0;
            }
        }while(num < 6);
    }
    public static void display(){
        Set<Integer> ids = name.keySet();
        System.out.println("Name\t\tGender\t\tDate of Birth\t\tEmail\t\tPhone");
        for(int i: ids){
            String desc = name.get(i) +"\t\t"+ gender.get(i) +"\t\t"+ dob.get(i) +"\t"+ email.get(i) +"\t"+ phone.get(i);
            System.out.println(desc);
        }

    }

    public static void create(){
        int id;
        String user;
        System.out.print("Id\t:");
        id = input.nextInt();
        System.out.print("Name\t:");
        user = input.next();
        name.put(id, user);

        System.out.print("Gender\t:");
        user = input.next();
        gender.put(id, user);

        System.out.print("Date of Birth\t:");
        user = input.next();
        dob.put(id, user);

        System.out.print("Email\t:");
        user = input.next();
        email.put(id, user);

        System.out.print("Phone\t:");
        user = input.next();
        phone.put(id, user);        
    }

    public static void update(){
        int id, num;
        String user;
        System.out.print("Enter id\t:");
        id = input.nextInt();
        System.out.println("\tWhat you want to update\t:");
        System.out.println("\t1.Name");
        System.out.println("\t2.Gender");
        System.out.println("\t3.Date of Birth");
        System.out.println("\t4.Email");
        System.out.println("\t5.Phone");
        System.out.print("Choice\t:");
        num = input.nextInt();

        switch(num){
            case 1:
                System.out.println("Old name\t:"+name.get(id));
                System.out.print("Enter new Name\t:");
                user = input.next();
                name.put(id, user);
                break;
            case 2:
                System.out.println("Old gender\t:"+gender.get(id));
                System.out.print("Enter new Gender\t:");
                user = input.next();
                gender.put(id, user);
                break;                            
            case 3:
                System.out.println("Old date of birth\t:"+dob.get(id));
                System.out.print("Enter new Date of Birth\t:");
                user = input.next();
                dob.put(id, user);
                break;
            case 4:
                System.out.println("Old email\t:"+email.get(id));
                System.out.print("Enter new Email\t:");
                user = input.next();
                email.put(id, user);
                break;                                                        
            case 5:
                System.out.println("Old phone\t:"+phone.get(id));
                System.out.print("Enter new Phone\t:");
                user = input.next();
                phone.put(id, user);
                break;                            
        }
        System.out.println("Updated successfully...");
    }

    public static void delete(){
        int id;
        System.out.println("Enter id you want to delete\t:");
        id = input.nextInt();
        name.remove(id);
        gender.remove(id);
        dob.remove(id);
        email.remove(id);
        phone.remove(id);
        System.out.println("Deleted successfully...");
    }

    public static void sort(){
        System.out.println("sort");
    }
}
