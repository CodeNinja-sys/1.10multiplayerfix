/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.List;
import java.util.Map;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.b.a.ah;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.at;
import net.minecraft.client.g.b.a.bb;
import net.minecraft.client.g.b.a.q;
import net.minecraft.client.g.b.a.r;
import net.minecraft.client.g.b.a.t;
import net.minecraft.g.c.b;
import net.minecraft.u.b.n;

public class ad {
    private final List a = ov.a();
    private final Map b = sz.a(net.minecraft.u.ad.class);
    private final at c;
    private final boolean d;
    private d e;
    private final boolean f;
    private final q g;

    public ad(r r2, at at2) {
        this(r2.b(), r2.c(), r2.j(), at2);
    }

    public ad(b b2, aq aq2, d d2, net.minecraft.u.b.b b3) {
        this(aq2.a(), aq2.b(), aq2.e(), aq2.f());
        this.e = aq2.d();
        long l2 = n.a(b3);
        for (net.minecraft.u.ad ad2 : net.minecraft.u.ad.values()) {
            this.a(b2, aq2, d2, ad2, l2);
        }
        this.a(b2, aq2, d2, l2);
    }

    private ad(boolean bl2, boolean bl3, q q2, at at2) {
        for (net.minecraft.u.ad ad2 : net.minecraft.u.ad.values()) {
            this.b.put(ad2, ov.a());
        }
        this.c = at2;
        this.d = bl2;
        this.f = bl3;
        this.g = q2;
    }

    private void a(b b2, aq aq2, d d2, net.minecraft.u.ad ad2, long l2) {
        for (t t2 : aq2.a(b2, ad2, l2)) {
            this.a(ad2, new ah(t2, d2));
        }
    }

    private void a(b b2, aq aq2, d d2, long l2) {
        for (t t2 : aq2.a(b2, null, l2)) {
            this.a(new ah(t2, d2));
        }
    }

    public ad a(net.minecraft.u.ad ad2, t t2) {
        ((List)this.b.get(ad2)).add(t2);
        return this;
    }

    public ad a(t t2) {
        this.a.add(t2);
        return this;
    }

    public ad a(d d2) {
        this.e = d2;
        return this;
    }

    public aq a() {
        if (this.e == null) {
            throw new RuntimeException("Missing particle!");
        }
        return new bb(this.a, this.b, this.d, this.f, this.e, this.g, this.c);
    }
}

