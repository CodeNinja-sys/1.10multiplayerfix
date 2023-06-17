/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.w.a.b;
import net.minecraft.w.b.bm;
import net.minecraft.w.f;
import net.minecraft.w.n;

public class ap
extends bm {
    protected f a;
    protected n b;
    protected float c;
    private int e;
    private final float f;
    protected Class d;

    public ap(f f2, Class class_, float f3) {
        this.a = f2;
        this.d = class_;
        this.c = f3;
        this.f = 0.02f;
        this.b(2);
    }

    public ap(f f2, Class class_, float f3, float f4) {
        this.a = f2;
        this.d = class_;
        this.c = f3;
        this.f = f4;
        this.b(2);
    }

    @Override
    public boolean e() {
        if (this.a.bd().nextFloat() >= this.f) {
            return false;
        }
        if (this.a.W() != null) {
            this.b = this.a.W();
        }
        this.b = this.d == b.class ? this.a.aQ.a((n)this.a, (double)this.c) : this.a.aQ.a(this.d, this.a.cT().b((double)this.c, 3.0, this.c), (n)this.a);
        return this.b != null;
    }

    @Override
    public boolean a() {
        return !this.b.br() ? false : (this.a.n(this.b) > (double)(this.c * this.c) ? false : this.e > 0);
    }

    @Override
    public void b() {
        this.e = 40 + this.a.bd().nextInt(40);
    }

    @Override
    public void c() {
        this.b = null;
    }

    @Override
    public void d() {
        this.a.I().a(this.b.aU, this.b.aV + (double)this.b.ce_(), this.b.aW, this.a.ap(), this.a.ao());
        --this.e;
    }
}

