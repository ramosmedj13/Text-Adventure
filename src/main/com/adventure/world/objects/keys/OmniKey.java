package main.com.adventure.world.objects.keys;

import main.com.adventure.world.objects.Tangible;
import main.com.adventure.world.objects.doors.OmniDoor;

import java.util.Arrays;

public class OmniKey implements Tangible {

    private static final int pinLength = 5;
    public boolean[] pins = new boolean[pinLength];

    /**
     * A key that can be used with the OmniDoor.
     */
    public OmniKey() {
        Arrays.fill(pins, false);
    }

    /**
     * The only item the OmniKey can be used with is an OmniDoor. When the OmniKey receives an OmniDoor, this method
     * needs to configure the key to the OmniDoor, making the OmniKey become a valid key for the door.
     * Note that this does NOT unlock the door; it merely configures the key so it can unlock the door in the future.
     * @param door - If it's an OmniDoor, this key will configure itself to it. Otherwise, inform the user
     *             that this key can only be used with OmniDoors and do nothing more.
     */
    @Override
    public void useItem(Tangible door) {
        boolean[] doorPins = ((OmniDoor) door).getPins();
        if (door instanceof OmniDoor) {
            for (int i = 0; i < pins.length; i++) {
                doorPins[i] = pins[i];
            }
            System.out.println("Your solution goes here");
        }
    }

    public boolean[] getPins() {
        return pins;
    }

    @Override
    public String getName() {
        return "OmniKey";
    }

    @Override
    public String getDescription() {
        return "A key with adjustable pins for teeth";
    }

    @Override
    public Boolean canTake() {
        return true;
    }

    @Override
    public Boolean canUse(Tangible item) {
        return item instanceof OmniDoor;
    }

    @Override
    public void use() {

    }
}
