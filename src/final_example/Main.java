package final_example;


public class Main {
    public static void main(String[] args) {
        User user = new User("user1", "9392193129312");
        System.out.println(user.getId());

        User user1 = new User("user2", "000001200210");
        System.out.println(user1.getId());

        User user2 = new User("user3", "000001200210");
        System.out.println(user2.getId());

    }
}
