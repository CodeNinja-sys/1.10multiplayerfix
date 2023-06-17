/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.b;

import net.minecraft.u.a.d;
import net.minecraft.u.a.e;

public abstract class c
implements e {
    private final String a;
    private final String b;

    public c(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public net.minecraft.e.e a(d d2, net.minecraft.e.e e2, int n2) {
        if (e2.l(this.a).equals(this.b)) {
            e2 = this.b(d2, e2, n2);
        }
        return e2;
    }

    abstract net.minecraft.e.e b(d var1, net.minecraft.e.e var2, int var3);
}

