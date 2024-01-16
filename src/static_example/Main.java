package static_example;

public class Main {

    public static void main(String[] args) {


        User[] users = getUsers();
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i]);
        }
    }

    static User[] getUsers(){
        return new User[] {
                new User("user1", 26),
                new User("user2", 26),
                new User("user3", 26),
                new User("user4", 26),
                new User("user5", 26),
                null,
                null
        };
    }
}
