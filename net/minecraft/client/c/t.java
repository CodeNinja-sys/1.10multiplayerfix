/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import net.minecraft.client.c.h;
import net.minecraft.client.c.l;
import net.minecraft.client.c.r;
import net.minecraft.client.c.u;
import net.minecraft.u.bp;

class t
implements r {
    final /* synthetic */ h a;
    private final /* synthetic */ bp b;

    t(h h2, bp bp2) {
        this.a = h2;
        this.b = bp2;
    }

    @Override
    public int e() {
        u u2 = (u)h.a(this.a).a(this.b);
        return u2 == null ? 0 : u2.e();
    }

    public l a() {
        u u2 = (u)h.a(this.a).a(this.b);
        return u2 == null ? h.a : u2.a();
    }

    @Override
    public /* synthetic */ Object i() {
        return this.a();
    }
}

