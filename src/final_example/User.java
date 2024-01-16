package final_example;

public class User {
    private int id;
    private String name;
    private final String iin;

    static final int amountOfChrosome = 46;

    private static int uniqueId = 1;

    public User(String name, String iin) {
        this.id = getUniqueId();
        this.name = name;
        this.iin = iin;
    }

    private static int getUniqueId() {
        return uniqueId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIin() {
        return iin;
    }
}
