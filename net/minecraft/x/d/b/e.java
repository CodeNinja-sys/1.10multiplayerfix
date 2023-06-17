/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import net.minecraft.u.bu;
import net.minecraft.u.bv;
import net.minecraft.x.d.a;
import net.minecraft.x.p;
import org.apache.commons.c.ao;

public class e
implements p {
    private bv a;
    private bu b;
    private int c;
    private int d;
    private int e;
    private float f;
    private float g;

    public e() {
    }

    public e(bv bv2, bu bu2, double d2, double d3, double d4, float f2, float f3) {
        ao.a((Object)bv2, "sound", new Object[0]);
        this.a = bv2;
        this.b = bu2;
        this.c = (int)(d2 * 8.0);
        this.d = (int)(d3 * 8.0);
        this.e = (int)(d4 * 8.0);
        this.f = f2;
        this.g = f3;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = (bv)bv.a.a(a2.e());
        this.b = (bu)a2.a(bu.class);
        this.c = a2.K();
        this.d = a2.K();
        this.e = a2.K();
        this.f = a2.O();
        this.g = a2.O();
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(bv.a.d(this.a));
        a2.a(this.b);
        a2.E(this.c);
        a2.E(this.d);
        a2.E(this.e);
        a2.a(this.f);
        a2.a(this.g);
    }

    public bv a() {
        return this.a;
    }

    public bu b() {
        return this.b;
    }

    public double c() {
        return (float)this.c / 8.0f;
    }

    public double d() {
        return (float)this.d / 8.0f;
    }

    public double e() {
        return (float)this.e / 8.0f;
    }

    public float f() {
        return this.f;
    }

    public float g() {
        return this.g;
    }

    public void a(a a2) {
        a2.a(this);
    }
}

