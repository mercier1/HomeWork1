package Modul06;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[4];
        users[0]= new User(1, "A", "Black", 3500, 9000);
        users[1]= new User(5, "C", "White", 3000, 15000);
        users[2]= new User(2, "B", "Green", 3500, 7000);
        users[3]= new User(7, "X", "Black", 3500, 9000);


        for (User user : UserUtils.uniqueUsers(users)){
            System.out.println(user.getFirstName());
        }
        for (User user : UserUtils.usersWithConditionalBalance(users, 100)){
            System.out.println(user.getFirstName());
        }
    }
    }

