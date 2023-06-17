/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.a.a;

public enum q {
    a("this"),
    b("killer"),
    c("killer_player");

    private final String d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private q() {
        void var3_1;
        this.d = var3_1;
    }

    public static q a(String string) {
        for (q q2 : q.values()) {
            if (!q2.d.equals(string)) continue;
            return q2;
        }
        throw new IllegalArgumentException("Invalid entity target " + string);
    }

    static /* synthetic */ String a(q q2) {
        return q2.d;
    }
}

