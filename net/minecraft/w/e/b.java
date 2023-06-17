/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.w.b.y;
import net.minecraft.w.e.ac;
import net.minecraft.w.e.au;
import net.minecraft.w.n;
import net.minecraft.w.t;

class b
extends y {
    private final au i;
    private net.minecraft.w.a.b j;
    private int k;
    private int l;

    public b(au au2) {
        super((t)au2, net.minecraft.w.a.b.class, false);
        this.i = au2;
    }

    @Override
    public boolean e() {
        double d2 = this.f();
        this.j = this.i.aQ.a(this.i.aU, this.i.aV, this.i.aW, d2, d2, null, new ac(this));
        return this.j != null;
    }

    @Override
    public void b() {
        this.k = 5;
        this.l = 0;
    }

    @Override
    public void c() {
        this.j = null;
        super.c();
    }

    @Override
    public boolean a() {
        if (this.j != null) {
            if (!au.a(this.i, this.j)) {
                return false;
            }
            this.i.a((n)this.j, 10.0f, 10.0f);
            return true;
        }
        return this.h != null && ((net.minecraft.w.a.b)this.h).br() ? true : super.a();
    }

    @Override
    public void d() {
        if (this.j != null) {
            if (--this.k <= 0) {
                this.h = this.j;
                this.j = null;
                super.b();
            }
        } else {
            if (this.h != null) {
                if (au.a(this.i, (net.minecraft.w.a.b)this.h)) {
                    if (((net.minecraft.w.a.b)this.h).n(this.i) < 16.0) {
                        this.i.p();
                    }
                    this.l = 0;
                } else if (((net.minecraft.w.a.b)this.h).n(this.i) > 256.0 && this.l++ >= 30 && this.i.b((n)this.h)) {
                    this.l = 0;
                }
            }
            super.d();
        }
    }

    static /* synthetic */ au a(b b2) {
        return b2.i;
    }
}

