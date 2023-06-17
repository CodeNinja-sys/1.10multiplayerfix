/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.e;

import net.minecraft.q.a.a.j;
import net.minecraft.u.a.a;
import net.minecraft.u.b.b;
import net.minecraft.u.bp;
import net.minecraft.w.d;
import net.minecraft.w.e.k;
import net.minecraft.w.f;

public class be
extends k {
    public be(net.minecraft.q.k k2) {
        super(k2);
        this.d(this.bl * 6.0f, this.bm * 6.0f);
    }

    public static void a(a a2) {
        f.a(a2, "Giant");
    }

    @Override
    public float ce_() {
        return 10.440001f;
    }

    @Override
    protected void ca_() {
        super.ca_();
        this.a(d.a).a(100.0);
        this.a(d.d).a(0.5);
        this.a(d.e).a(50.0);
    }

    @Override
    public float a(b b2) {
        return this.aQ.m(b2) - 0.5f;
    }

    @Override
    protected bp ai() {
        return net.minecraft.q.a.a.j.t;
    }
}

