package Entity;

public class Player {

    private Integer id;
    private String name;
    private int sofkaCoins;

    public Player() {
    }

    public Player(Integer id, String name, int sofkaCoins) {
        this.id = id;
        this.name = name;
        this.sofkaCoins = sofkaCoins;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSofkaCoins() {
        return sofkaCoins;
    }

    public void setSofkaCoins(int sofkaCoins) {
        this.sofkaCoins = sofkaCoins;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sofkaCoins=" + sofkaCoins +
                '}';
    }
}
