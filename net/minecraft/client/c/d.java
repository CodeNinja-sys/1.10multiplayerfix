/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

public enum d {
    a("file"),
    b("event");

    private final String c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private d() {
        void var3_1;
        this.c = var3_1;
    }

    public static d a(String string) {
        for (d d2 : net.minecraft.client.c.d.values()) {
            if (!d2.c.equals(string)) continue;
            return d2;
        }
        return null;
    }
}

