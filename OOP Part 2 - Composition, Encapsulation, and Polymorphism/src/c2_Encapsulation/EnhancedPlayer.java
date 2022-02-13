package c2_Encapsulation;

public class EnhancedPlayer {
    private String Fullname;
    private int mainHealth = 100;
    private String weapon;

    public EnhancedPlayer(String fullname, int mainHealth, String weapon) {
        Fullname = fullname;
        if (this.mainHealth > 0 && mainHealth <= 100) // checking validation
            this.mainHealth = mainHealth;
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.mainHealth -= damage;
        if (this.mainHealth <= 0){
            System.out.println("Player knocked out");
        }
    }

    public String getFullname() {
        return Fullname;
    }

    public int getMainHealth() {
        return mainHealth;
    }

    public String getWeapon() {
        return weapon;
    }
}
