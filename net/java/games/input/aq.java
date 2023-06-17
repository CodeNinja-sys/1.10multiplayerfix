/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

final class aq {
    private static final aq[] h = new aq[514];
    public static final aq a = new aq(1);
    public static final aq b = new aq(2);
    public static final aq c = new aq(3);
    public static final aq d = new aq(4);
    public static final aq e = new aq(129);
    public static final aq f = new aq(257);
    public static final aq g = new aq(513);
    private final int i;

    public static final aq a(int n2) {
        if (n2 < 0 || n2 >= h.length) {
            return null;
        }
        return h[n2];
    }

    private aq(int n2) {
        aq.h[n2] = this;
        this.i = n2;
    }

    public final String toString() {
        return "ElementType (0x" + Integer.toHexString(this.i) + ")";
    }
}

