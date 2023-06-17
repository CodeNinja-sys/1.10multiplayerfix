/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q;

import net.minecraft.w.a.e;

public enum am {
    a(-1, "", ""),
    b(0, "survival", "s"),
    c(1, "creative", "c"),
    d(2, "adventure", "a"),
    e(3, "spectator", "sp");

    int f;
    String g;
    String h;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private am(String string) {
        void var5_3;
        void var4_2;
        this.f = (int)string;
        this.g = var4_2;
        this.h = var5_3;
    }

    public int a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public void a(e e2) {
        if (this == c) {
            e2.c = true;
            e2.d = true;
            e2.a = true;
        } else if (this == e) {
            e2.c = true;
            e2.d = false;
            e2.a = true;
            e2.b = true;
        } else {
            e2.c = false;
            e2.d = false;
            e2.a = false;
            e2.b = false;
        }
        e2.e = !this.c();
    }

    public boolean c() {
        return this == d || this == e;
    }

    public boolean d() {
        return this == c;
    }

    public boolean e() {
        return this == b || this == d;
    }

    public static am a(int n2) {
        return am.a(n2, b);
    }

    public static am a(int n2, am am2) {
        for (am am3 : am.values()) {
            if (am3.f != n2) continue;
            return am3;
        }
        return am2;
    }

    public static am a(String string) {
        return am.a(string, b);
    }

    public static am a(String string, am am2) {
        for (am am3 : am.values()) {
            if (!am3.g.equals(string) && !am3.h.equals(string)) continue;
            return am3;
        }
        return am2;
    }
}

