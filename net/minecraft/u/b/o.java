/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import net.minecraft.u.ad;
import net.minecraft.u.b.b;
import net.minecraft.u.b.p;
import net.minecraft.u.b.s;
import net.minecraft.w.n;

public class o {
    private b e;
    public p a;
    public ad b;
    public s c;
    public n d;

    public o(s s2, ad ad2, b b2) {
        this(p.b, s2, ad2, b2);
    }

    public o(s s2, ad ad2) {
        this(p.b, s2, ad2, net.minecraft.u.b.b.c);
    }

    public o(n n2) {
        this(n2, new s(n2.aU, n2.aV, n2.aW));
    }

    public o(p p2, s s2, ad ad2, b b2) {
        this.a = p2;
        this.e = b2;
        this.b = ad2;
        this.c = new s(s2.b, s2.c, s2.d);
    }

    public o(n n2, s s2) {
        this.a = p.c;
        this.d = n2;
        this.c = s2;
    }

    public b a() {
        return this.e;
    }

    public String toString() {
        return "HitResult{type=" + (Object)((Object)this.a) + ", blockpos=" + this.e + ", f=" + this.b + ", pos=" + this.c + ", entity=" + this.d + '}';
    }
}

