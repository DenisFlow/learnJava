package c2_Encapsulation;

public class Player {
    public String Fullname;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0){
            System.out.println("Player knocked out");
        }
    }

    public int healRemaining() {
        return this.health;
    }
}
