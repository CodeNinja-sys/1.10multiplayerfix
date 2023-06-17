/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.c.a;

import com.a.a.b.cc;
import com.a.a.c.an;
import net.minecraft.g.c.a;
import net.minecraft.g.c.a.h;
import net.minecraft.u.ad;
import net.minecraft.u.b.b;

public class f {
    private final b a;
    private final ad b;
    private final ad c;
    private final an d;
    private final int e;
    private final int f;
    private final int g;

    public f(b b2, ad ad2, ad ad3, an an2, int n2, int n3, int n4) {
        this.a = b2;
        this.b = ad2;
        this.c = ad3;
        this.d = an2;
        this.e = n2;
        this.f = n3;
        this.g = n4;
    }

    public b a() {
        return this.a;
    }

    public ad b() {
        return this.b;
    }

    public ad c() {
        return this.c;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public a a(int n2, int n3, int n4) {
        return (a)this.d.c(h.a(this.a, this.b(), this.c(), n2, n3, n4));
    }

    public String toString() {
        return cc.a((Object)this).a("up", this.c).a("forwards", this.b).a("frontTopLeft", this.a).toString();
    }
}

