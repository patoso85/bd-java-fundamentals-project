package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {
    private Key content;
    private boolean isCovered;

    /**
     * creates a hole with a named that is covered.
     * @param key key object that will be contained by the hole.
     */
    public HoleContent(Key key) {
        this.content = key;
        this.isCovered = true;
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
