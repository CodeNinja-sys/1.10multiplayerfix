/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.j;
import net.minecraft.client.g.i.a.z;
import net.minecraft.client.g.i.al;
import net.minecraft.client.g.i.bk;
import net.minecraft.client.g.i.f;
import net.minecraft.client.j.am;
import net.minecraft.client.j.ap;
import net.minecraft.u.b.n;
import net.minecraft.u.bp;
import net.minecraft.w.l;

public class bm
extends al {
    public static final bp a = new bp("textures/entity/armorstand/wood.png");

    public bm(f f2) {
        super(f2, new am(), 0.0f);
        bk bk2 = new bk(this, this);
        this.a(bk2);
        this.a(new j(this));
        this.a(new z(this.e().a));
    }

    protected bp a(net.minecraft.w.f.j j2) {
        return a;
    }

    public am e() {
        return (am)super.f();
    }

    protected void a(net.minecraft.w.f.j j2, float f2, float f3, float f4) {
        bd.b(180.0f - f3, 0.0f, 1.0f, 0.0f);
        float f5 = (float)(j2.aQ.B() - j2.h) + f4;
        if (f5 < 5.0f) {
            bd.b(n.a(f5 / 1.5f * (float)Math.PI) * 3.0f, 0.0f, 1.0f, 0.0f);
        }
    }

    protected boolean b(net.minecraft.w.f.j j2) {
        return j2.cQ();
    }

    public void a(net.minecraft.w.f.j j2, double d2, double d3, double d4, float f2, float f3) {
        if (j2.p()) {
            this.j = true;
        }
        super.a(j2, d2, d3, d4, f2, f3);
        if (j2.p()) {
            this.j = false;
        }
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((net.minecraft.w.f.j)n2);
    }

    @Override
    protected /* synthetic */ boolean a(l l2) {
        return this.b((net.minecraft.w.f.j)l2);
    }

    @Override
    public /* synthetic */ ap f() {
        return this.e();
    }
}

