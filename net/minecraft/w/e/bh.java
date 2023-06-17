/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.q.a.a.j;
import net.minecraft.q.k;
import net.minecraft.q.l;
import net.minecraft.u.a.a;
import net.minecraft.u.aj;
import net.minecraft.u.bp;
import net.minecraft.u.bv;
import net.minecraft.w.d;
import net.minecraft.w.e.av;
import net.minecraft.w.f;
import net.minecraft.w.n;

public class bh
extends av {
    public bh(k k2) {
        super(k2);
        this.bD = true;
    }

    public static void c(a a2) {
        f.a(a2, "LavaSlime");
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(d.d).a(0.2f);
    }

    @Override
    public boolean aq() {
        return this.aQ.R() != net.minecraft.q.l.a;
    }

    @Override
    public boolean ar() {
        return this.aQ.a(this.cT(), (n)this) && this.aQ.a((n)this, this.cT()).isEmpty() && !this.aQ.e(this.cT());
    }

    @Override
    protected void b(int n2) {
        super.b(n2);
        this.a(d.g).a((double)(n2 * 3));
    }

    @Override
    public int m(float f2) {
        return 0xF000F0;
    }

    @Override
    public float n(float f2) {
        return 1.0f;
    }

    @Override
    protected aj q() {
        return net.minecraft.u.aj.A;
    }

    @Override
    protected av t() {
        return new bh(this.aQ);
    }

    @Override
    protected bp ai() {
        return this.p() ? net.minecraft.q.a.a.j.a : net.minecraft.q.a.a.j.af;
    }

    @Override
    public boolean cy() {
        return false;
    }

    @Override
    protected int s() {
        return super.s() * 4;
    }

    @Override
    protected void r() {
        this.a *= 0.9f;
    }

    @Override
    protected void aj() {
        this.aY = 0.42f + (float)this.c() * 0.1f;
        this.bO = true;
    }

    @Override
    protected void bI() {
        this.aY = 0.22f + (float)this.c() * 0.05f;
        this.bO = true;
    }

    @Override
    public void c(float f2, float f3) {
    }

    @Override
    protected boolean v() {
        return true;
    }

    @Override
    protected int w() {
        return super.w() + 2;
    }

    @Override
    protected bv cc_() {
        return this.p() ? net.minecraft.a.f.fM : net.minecraft.a.f.dq;
    }

    @Override
    protected bv cd_() {
        return this.p() ? net.minecraft.a.f.fL : net.minecraft.a.f.dp;
    }

    @Override
    protected bv y() {
        return this.p() ? net.minecraft.a.f.fN : net.minecraft.a.f.ds;
    }

    @Override
    protected bv E() {
        return net.minecraft.a.f.dr;
    }
}

