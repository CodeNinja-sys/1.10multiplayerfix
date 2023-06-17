/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.i.g;
import net.minecraft.u.b.n;
import net.minecraft.w.a.b;
import net.minecraft.w.b.a.i;
import net.minecraft.w.b.bm;
import net.minecraft.w.d;
import net.minecraft.w.f;
import net.minecraft.w.l;
import net.minecraft.w.t;
import net.minecraft.w.u;

public abstract class s
extends bm {
    protected final t c;
    protected boolean d;
    private final boolean a;
    private int b;
    private int g;
    private int h;
    protected l e;
    protected int f = 60;

    public s(t t2, boolean bl2) {
        this(t2, bl2, false);
    }

    public s(t t2, boolean bl2, boolean bl3) {
        this.c = t2;
        this.d = bl2;
        this.a = bl3;
    }

    @Override
    public boolean a() {
        l l2 = this.c.W();
        if (l2 == null) {
            l2 = this.e;
        }
        if (l2 == null) {
            return false;
        }
        if (!l2.br()) {
            return false;
        }
        net.minecraft.j.i i2 = this.c.aA();
        net.minecraft.j.i i3 = l2.aA();
        if (i2 != null && i3 == i2) {
            return false;
        }
        double d2 = this.f();
        if (this.c.n(l2) > d2 * d2) {
            return false;
        }
        if (this.d) {
            if (this.c.V().a(l2)) {
                this.h = 0;
            } else if (++this.h > this.f) {
                return false;
            }
        }
        if (l2 instanceof b && ((b)l2).J.a) {
            return false;
        }
        this.c.c(l2);
        return true;
    }

    protected double f() {
        i i2 = this.c.a(net.minecraft.w.d.b);
        return i2 == null ? 16.0 : i2.f();
    }

    @Override
    public void b() {
        this.b = 0;
        this.g = 0;
        this.h = 0;
    }

    @Override
    public void c() {
        this.c.c((l)null);
        this.e = null;
    }

    public static boolean a(f f2, l l2, boolean bl2, boolean bl3) {
        if (l2 == null) {
            return false;
        }
        if (l2 == f2) {
            return false;
        }
        if (!l2.br()) {
            return false;
        }
        if (!f2.a(l2.getClass())) {
            return false;
        }
        if (f2.w(l2)) {
            return false;
        }
        if (f2 instanceof u && ((u)((Object)f2)).b() != null) {
            if (l2 instanceof u && ((u)((Object)f2)).b().equals(l2.cM())) {
                return false;
            }
            if (l2 == ((u)((Object)f2)).c()) {
                return false;
            }
        } else if (l2 instanceof b && !bl2 && ((b)l2).J.a) {
            return false;
        }
        return !bl3 || f2.V().a(l2);
    }

    protected boolean a(l l2, boolean bl2) {
        if (!s.a(this.c, l2, bl2, this.d)) {
            return false;
        }
        if (!this.c.f(new net.minecraft.u.b.b(l2))) {
            return false;
        }
        if (this.a) {
            if (--this.g <= 0) {
                this.b = 0;
            }
            if (this.b == 0) {
                int n2 = this.b = this.a(l2) ? 1 : 2;
            }
            if (this.b == 2) {
                return false;
            }
        }
        return true;
    }

    private boolean a(l l2) {
        int n2;
        this.g = 10 + this.c.bd().nextInt(5);
        net.minecraft.i.i i2 = this.c.N().a(l2);
        if (i2 == null) {
            return false;
        }
        g g2 = i2.c();
        if (g2 == null) {
            return false;
        }
        int n3 = g2.a - n.c(l2.aU);
        return (double)(n3 * n3 + (n2 = g2.c - n.c(l2.aW)) * n2) <= 2.25;
    }
}

