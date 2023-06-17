/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

public class s {
    private final String l;
    public static final s a = new s("Unknown");
    public static final s b = new s("Mouse");
    public static final s c = new s("Keyboard");
    public static final s d = new s("Fingerstick");
    public static final s e = new s("Gamepad");
    public static final s f = new s("Headtracker");
    public static final s g = new s("Rudder");
    public static final s h = new s("Stick");
    public static final s i = new s("Trackball");
    public static final s j = new s("Trackpad");
    public static final s k = new s("Wheel");

    protected s(String string) {
        this.l = string;
    }

    public String toString() {
        return this.l;
    }
}

