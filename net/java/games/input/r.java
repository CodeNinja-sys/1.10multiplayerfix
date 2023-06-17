/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

public final class r {
    private final String h;
    public static final r a = new r("Unknown");
    public static final r b = new r("USB port");
    public static final r c = new r("Game port");
    public static final r d = new r("Network port");
    public static final r e = new r("Serial port");
    public static final r f = new r("i8042 (PS/2)");
    public static final r g = new r("Parallel port");

    protected r(String string) {
        this.h = string;
    }

    public String toString() {
        return this.h;
    }
}

