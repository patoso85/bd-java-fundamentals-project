package main.com.adventure;

import main.com.adventure.player.Player;
import main.com.adventure.world.Monster;

public class CombatController {

    private Player player;
    private Monster monster;

    /**
     * Processes a combat situation between the player and a monster.
     * @param player - the game's player.
     * @param monster - the monster who the player is trying to defeat.
     */
    public CombatController(Player player, Monster monster) {
        this.player = player;
        this.monster = monster;
    }

    /**
     * Runs through the combat of the player and monster until either the monster's
     * or the player's health is 0. The player always goes first.
     */
    public void autosimulateCombat() {
        while (player.getHealth() > 0 && monster.getHealth() > 0) {
            monster.setHealth(monster.getHealth() - player.getPower());
            player.setHealth(player.getHealth() - monster.getPower());
        }

    }

    /**
     * Checks if the players health has gone to zero if so player. if so returns true(defeated) else false.
     * @return - boolean true defeated false otherwise.
     */
    public boolean isPlayerDefeated() {
        if (player.getHealth() <= 0) {
            System.out.println(monster + " has defeated " + player);
            return true;
        } else {
            System.out.println(player + " has defeated " + monster);
            return false;
        }

    }

    /**
     * Resets the health of the monster and player back to 10.
     */
    public void reset() {
        player.setHealth(10);
        monster.setHealth(10);

    }
}
