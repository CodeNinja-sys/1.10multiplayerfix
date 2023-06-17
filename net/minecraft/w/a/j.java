/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.a;

import net.minecraft.u.d.a;
import net.minecraft.u.d.l;

public enum j {
    a(0, "cape"),
    b(1, "jacket"),
    c(2, "left_sleeve"),
    d(3, "right_sleeve"),
    e(4, "left_pants_leg"),
    f(5, "right_pants_leg"),
    g(6, "hat");

    private final int h;
    private final int i;
    private final String j;
    private final a k;

    /*
     * WARNING - void declaration
     */
    private j() {
        void var4_2;
        void var3_1;
        this.h = var3_1;
        this.i = 1 << var3_1;
        this.j = var4_2;
        this.k = new l("options.modelPart." + (String)var4_2, new Object[0]);
    }

    public int a() {
        return this.i;
    }

    public int b() {
        return this.h;
    }

    public String c() {
        return this.j;
    }

    public a d() {
        return this.k;
    }
}

