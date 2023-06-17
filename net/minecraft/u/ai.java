/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import net.minecraft.u.d.a;
import net.minecraft.u.d.l;

public enum ai {
    a((a)new l("options.mainHand.left", new Object[0])),
    b((a)new l("options.mainHand.right", new Object[0]));

    private final a c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ai() {
        void var3_1;
        this.c = var3_1;
    }

    public ai a() {
        return this == a ? b : a;
    }

    public String toString() {
        return this.c.c();
    }
}

