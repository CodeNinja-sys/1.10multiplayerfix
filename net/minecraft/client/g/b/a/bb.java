/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import java.util.List;
import java.util.Map;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.at;
import net.minecraft.client.g.b.a.q;
import net.minecraft.g.c.b;
import net.minecraft.u.ad;

public class bb
implements aq {
    protected final List a;
    protected final Map b;
    protected final boolean c;
    protected final boolean d;
    protected final d e;
    protected final q f;
    protected final at g;

    public bb(List list, Map map, boolean bl2, boolean bl3, d d2, q q2, at at2) {
        this.a = list;
        this.b = map;
        this.c = bl2;
        this.d = bl3;
        this.e = d2;
        this.f = q2;
        this.g = at2;
    }

    @Override
    public List a(b b2, ad ad2, long l2) {
        return ad2 == null ? this.a : (List)this.b.get(ad2);
    }

    @Override
    public boolean a() {
        return this.c;
    }

    @Override
    public boolean b() {
        return this.d;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public d d() {
        return this.e;
    }

    @Override
    public q e() {
        return this.f;
    }

    @Override
    public at f() {
        return this.g;
    }
}

