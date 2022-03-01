package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {

    private Key content;
    private boolean isCovered = true;

    /**
     * Constructor that sets HoleContent's instance variable.
     * @param content Parameter that is set.
     */
    public HoleContent(Key content) {
        this.content = content;
    }

    public void setIsCovered(boolean isCovered) {
        this.isCovered = isCovered;
    }

    public boolean isCovered() {
        return isCovered;
    }

    public Key getKey() {
        return content;
    }
}
