/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

public enum r {
    a,
    b,
    c,
    d,
    e;


    public static r a(String string) {
        for (r r2 : r.values()) {
            if (!r2.name().equalsIgnoreCase(string)) continue;
            return r2;
        }
        return a;
    }

    public static String[] a() {
        String[] arrstring = new String[r.values().length];
        int n2 = 0;
        for (r r2 : r.values()) {
            arrstring[n2++] = r2.name().toLowerCase();
        }
        return arrstring;
    }
}

