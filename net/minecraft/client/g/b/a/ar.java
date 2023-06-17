/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import java.util.List;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.at;
import net.minecraft.client.g.b.a.n;
import net.minecraft.client.g.b.a.q;
import net.minecraft.g.c.b;
import net.minecraft.u.ad;
import net.minecraft.u.cd;

public class ar
implements aq {
    private final int a;
    private final List b;
    private final aq c;

    public ar(List list) {
        this.b = list;
        this.a = cd.a(list);
        this.c = ((n)list.get((int)0)).a;
    }

    private aq a(long l2) {
        return ((n)cd.a((List)this.b, (int)(Math.abs((int)((int)l2 >> 16)) % this.a))).a;
    }

    @Override
    public List a(b b2, ad ad2, long l2) {
        return this.a(l2).a(b2, ad2, l2);
    }

    @Override
    public boolean a() {
        return this.c.a();
    }

    @Override
    public boolean b() {
        return this.c.b();
    }

    @Override
    public boolean c() {
        return this.c.c();
    }

    @Override
    public d d() {
        return this.c.d();
    }

    @Override
    public q e() {
        return this.c.e();
    }

    @Override
    public at f() {
        return this.c.f();
    }
}

