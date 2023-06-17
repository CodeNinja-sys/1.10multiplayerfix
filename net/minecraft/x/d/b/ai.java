/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.x.d.a;
import net.minecraft.x.d.b.r;
import net.minecraft.x.p;

public class ai
implements p {
    private r a;
    private net.minecraft.u.d.a b;
    private int c;
    private int d;
    private int e;

    public ai() {
    }

    public ai(r r2, net.minecraft.u.d.a a2) {
        this(r2, a2, -1, -1, -1);
    }

    public ai(int n2, int n3, int n4) {
        this(r.c, null, n2, n3, n4);
    }

    public ai(r r2, net.minecraft.u.d.a a2, int n2, int n3, int n4) {
        this.a = r2;
        this.b = a2;
        this.c = n2;
        this.d = n3;
        this.e = n4;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = (r)a2.a(r.class);
        if (this.a == r.a || this.a == r.b) {
            this.b = a2.d();
        }
        if (this.a == r.c) {
            this.c = a2.K();
            this.d = a2.K();
            this.e = a2.K();
        }
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.a(this.a);
        if (this.a == r.a || this.a == r.b) {
            a2.a(this.b);
        }
        if (this.a == r.c) {
            a2.E(this.c);
            a2.E(this.d);
            a2.E(this.e);
        }
    }

    public void a(a a2) {
        a2.a(this);
    }

    public r a() {
        return this.a;
    }

    public net.minecraft.u.d.a b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }
}

