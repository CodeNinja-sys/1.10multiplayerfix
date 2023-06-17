/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import net.minecraft.a.p;
import net.minecraft.f.af;
import net.minecraft.g.c.b;
import net.minecraft.q.k;
import net.minecraft.u.a.a;
import net.minecraft.u.a.c;
import net.minecraft.u.a.e;
import net.minecraft.w.f.ac;
import net.minecraft.w.f.f;
import net.minecraft.w.f.m;
import net.minecraft.w.f.y;

public class aa
extends f {
    private final af a = new ac(this);

    public aa(k k2) {
        super(k2);
    }

    public aa(k k2, double d2, double d3, double d4) {
        super(k2, d2, d3, d4);
    }

    public static void a(a a2) {
        aa.a(a2, "MinecartSpawner");
        a2.a(c.e, (e)new y());
    }

    @Override
    public m a() {
        return m.e;
    }

    @Override
    public b c() {
        return p.ac.v();
    }

    @Override
    protected void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.a.a(e2);
    }

    @Override
    protected void a(net.minecraft.e.e e2) {
        super.a(e2);
        this.a.b(e2);
    }

    @Override
    public void a(byte by2) {
        this.a.b(by2);
    }

    @Override
    public void cE_() {
        super.cE_();
        this.a.c();
    }
}

