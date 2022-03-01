package main.com.adventure.settings;

/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;


    /**
     * Takes verbString to determine and return the associated CommandVerb.
     *
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {
        String upperCase = verbString.toUpperCase();
        CommandVerb returnValue;
        switch (upperCase) {
            case "TAKE":
                returnValue = TAKE;
                break;
            case "MOVE":
                returnValue = MOVE;
                break;
            case "USE":
                returnValue = USE;
                break;
            case "DIG":
                returnValue = DIG;
                break;
            case "EXAMINE":
                returnValue = EXAMINE;
                break;
            case "LOOK":
                returnValue = LOOK;
                break;
            case "HELP":
                returnValue = HELP;
                break;
            //Used in Sprint 3 Module 2
            case "FIGHT":
                returnValue = FIGHT;
                break;
            //Used in Sprint 3 Module 3
            case "INVENTORY":
                returnValue = INVENTORY;
                break;
            default:
                returnValue = INVALID;
                break;
        }
        return returnValue;
    }
}


