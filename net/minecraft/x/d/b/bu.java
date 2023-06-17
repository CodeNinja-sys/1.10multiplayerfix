/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import java.util.EnumSet;
import java.util.Set;

public enum bu {
    a(0),
    b(1),
    c(2),
    d(3),
    e(4);

    private final int f;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bu() {
        void var3_1;
        this.f = var3_1;
    }

    private int a() {
        return 1 << this.f;
    }

    private boolean b(int n2) {
        return (n2 & this.a()) == this.a();
    }

    public static Set a(int n2) {
        EnumSet<bu> enumSet = EnumSet.noneOf(bu.class);
        for (bu bu2 : bu.values()) {
            if (!bu2.b(n2)) continue;
            enumSet.add(bu2);
        }
        return enumSet;
    }

    public static int a(Set set) {
        int n2 = 0;
        for (bu bu2 : set) {
            n2 |= bu2.a();
        }
        return n2;
    }
}

