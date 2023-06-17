/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.b.g;
import net.minecraft.q.k;
import net.minecraft.u.b.b;
import net.minecraft.w.b.bm;
import net.minecraft.w.h.ak;
import net.minecraft.w.n;

public class h
extends bm {
    private final ak b;
    private ak c;
    private final k d;
    private int e;
    g a;

    public h(ak ak2) {
        this.b = ak2;
        this.d = ak2.aQ;
        this.b(3);
    }

    @Override
    public boolean e() {
        if (this.b.dn() != 0) {
            return false;
        }
        if (this.b.bd().nextInt(500) != 0) {
            return false;
        }
        this.a = this.d.U().a(new b(this.b), 0);
        if (this.a == null) {
            return false;
        }
        if (this.f() && this.b.d(true)) {
            n n2 = this.d.a(ak.class, this.b.cT().b(8.0, 3.0, 8.0), (n)this.b);
            if (n2 == null) {
                return false;
            }
            this.c = (ak)n2;
            return this.c.dn() == 0 && this.c.d(true);
        }
        return false;
    }

    @Override
    public void b() {
        this.e = 300;
        this.b.a(true);
    }

    @Override
    public void c() {
        this.a = null;
        this.c = null;
        this.b.a(false);
    }

    @Override
    public boolean a() {
        return this.e >= 0 && this.f() && this.b.dn() == 0 && this.b.d(false);
    }

    @Override
    public void d() {
        --this.e;
        this.b.I().a(this.c, 10.0f, 30.0f);
        if (this.b.n(this.c) > 2.25) {
            this.b.N().a(this.c, 0.25);
        } else if (this.e == 0 && this.c.q()) {
            this.g();
        }
        if (this.b.bd().nextInt(35) == 0) {
            this.d.a((n)this.b, (byte)12);
        }
    }

    private boolean f() {
        if (!this.a.i()) {
            return false;
        }
        int n2 = (int)((double)this.a.c() * 0.35);
        return this.a.e() < n2;
    }

    private void g() {
        ak ak2 = this.b.a(this.c);
        this.c.e(6000);
        this.b.e(6000);
        this.c.e(false);
        this.b.e(false);
        ak2.e(-24000);
        ak2.b(this.b.aU, this.b.aV, this.b.aW, 0.0f, 0.0f);
        this.d.a(ak2);
        this.d.a((n)ak2, (byte)12);
    }
}

