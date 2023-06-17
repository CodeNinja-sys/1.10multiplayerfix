/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.l;

import net.minecraft.g.cn;
import net.minecraft.q.k;
import net.minecraft.w.a.b;

public class g {
    public int a;
    public int b;
    public int c;
    public cn d;

    public g(int n2, int n3, int n4, cn cn2) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = cn2;
    }

    public boolean a(k k2, b b2, double d2) {
        if (b2.i(this.a, b2.aV, this.c) > d2) {
            return false;
        }
        k2.a(new net.minecraft.u.b.b(this.a, this.b, this.c), this.d.v(), 3);
        return true;
    }
}

