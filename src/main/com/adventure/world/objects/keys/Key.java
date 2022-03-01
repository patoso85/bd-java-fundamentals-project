package main.com.adventure.world.objects.keys;

import main.com.adventure.world.objects.Tangible;

/**
 * A key opens a locked door. More specifically, keys work only on doors that share their level.
 * For example, if a key is level 1, it can only open doors that are also level 1.
 *
 * A key's level cannot change once the object is instantiated. You should create the following constructors that take
 * the following parameters:
 * 1. without any inputs (i.e. default parameters)
 * 2. a level (int)
 * 3. a level (int) and a name (string)
 *
 * The default values for a door are level = 1 and name = "key"
 */

public class Key implements Tangible {

    //TODO variable for level and name needed here
    private String name;
    private int level;

    //TODO Add default (i.e. no params) constructor here

    /**
     * generates basic key with name "key" and a level of 1.
     */
    public Key() {
        this.name = "key";
        this.level = 1;
    }


    /**
     * basic key with adjustable level. name will always be key.
     * @param level - inputs key desired level
     */
    public Key(int level) {
        name = "key";
        this.level = level;
    }

    /**
     * Constructor for a named door with adjustable level. inputs are the level of the door and the name of the door.
     * @param level level of the door to be created.
     * @param name  name of the door to be created.
     */

    public Key(int level, String name) {
        this.name = name;
        this.level = level;
    }

    public int getLevel() {
        //TODO Fix this so it references the level property instead of 0
        return level;
    }

    //TODO Fix this so it references the name property instead of "key"
    @Override
    public String getName() {
        return name;
    }







    //******IGNORE THE CODE BELOW******//


    @Override
    public Boolean canTake() {
        return true;
    }

    @Override
    public Boolean canUse(Tangible item) {
        return false;
    }

    @Override
    public void useItem(Tangible initiator) { /* intentionally left blank */ }

    @Override
    public void use() {
        System.out.println(getName() + " doesn't much be itself. Try using it on a door");
    }

    @Override
    public String getDescription() {
        return "A key that opens a door";
    }


}
