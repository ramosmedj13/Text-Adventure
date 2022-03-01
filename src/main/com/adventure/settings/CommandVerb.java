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
    FIGHT,
    INVENTORY;


    /**
     * Takes verbString to determine and return the associated CommandVerb.
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {
        CommandVerb command = INVALID;
        if (verbString.equalsIgnoreCase("take")) {
            command = TAKE;
        } else if (verbString.equalsIgnoreCase("move")) {
            command = MOVE;
        } else if (verbString.equalsIgnoreCase("use")) {
            command = USE;
        } else if (verbString.equalsIgnoreCase("dig")) {
            command = DIG;
        } else if (verbString.equalsIgnoreCase("examine")) {
            command = EXAMINE;
        } else if (verbString.equalsIgnoreCase("look")) {
            command = LOOK;
        } else if (verbString.equalsIgnoreCase("help")) {
            command = HELP;
        } else if (verbString.equalsIgnoreCase("inventory")) {
            command = INVENTORY;
        } else if (verbString.equalsIgnoreCase("fight")) {
            command = FIGHT;
        }
        System.out.println("Verb = " + verbString);
        System.out.println(command);
        System.out.println();
        return command;
    }
}
