package c2_Encapsulation;

public class Encapsulation {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        player.loseHealth(10);
//        player.health = 200;
//        System.out.println("Remaining health = " + player.healRemaining());
        //
        EnhancedPlayer player = new EnhancedPlayer("Denis", 50, "Sword");
        System.out.println("Initial health is " + player.getMainHealth());

    }
}
