/*
 * Decompiled with CFR 0.150.
 */
package e.a;

public class s
extends Exception {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    private int g = 1;

    public s(String string) {
        super(string);
    }

    public s(String string, int n2) {
        super(string);
        this.g = n2;
    }

    public int a() {
        return this.g;
    }
}

