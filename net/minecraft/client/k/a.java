/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.List;
import java.util.Map;
import net.minecraft.client.b.e;
import net.minecraft.client.f.h;
import net.minecraft.client.f.u;
import net.minecraft.client.k.as;
import net.minecraft.client.k.av;
import net.minecraft.client.r;

class a
extends av {
    private final List b;
    private final Map w;
    final /* synthetic */ as a;

    public a(as as2, r r2) {
        this.a = as2;
        super(r2, as2.p, as2.q, 32, as2.q - 65 + 4, 18);
        this.b = ov.a();
        this.w = sz.c();
        for (h h2 : as.a(as2).d()) {
            this.w.put(h2.a(), h2);
            this.b.add(h2.a());
        }
    }

    @Override
    protected int a() {
        return this.b.size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
        h h2 = (h)this.w.get(this.b.get(n2));
        as.a(this.a).a(h2);
        as.b((as)this.a).aE = h2.a();
        this.c.f();
        this.a.u.a(as.a(this.a).a() || as.b((as)this.a).aF);
        this.a.u.b(as.a(this.a).b());
        as.c((as)this.a).i = net.minecraft.client.f.u.a("gui.done", new Object[0]);
        as.d((as)this.a).i = as.b(this.a).c(net.minecraft.client.b.e.E);
        as.b(this.a).b();
    }

    public void b() {
        h h2 = (h)this.w.get("en_US");
        as.a(this.a).a(h2);
        as.b((as)this.a).aE = h2.a();
        this.c.f();
        this.a.u.a(as.a(this.a).a() || as.b((as)this.a).aF);
        this.a.u.b(as.a(this.a).b());
        as.c((as)this.a).i = net.minecraft.client.f.u.a("gui.done", new Object[0]);
        as.d((as)this.a).i = as.b(this.a).c(net.minecraft.client.b.e.E);
        as.b(this.a).b();
    }

    @Override
    protected boolean a(int n2) {
        return ((String)this.b.get(n2)).equals(as.a(this.a).c().a());
    }

    @Override
    protected int c() {
        return this.a() * 18;
    }

    @Override
    protected void d() {
        this.a.m();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a.u.b(true);
        this.a.a(this.a.u, ((h)this.w.get(this.b.get(n2))).toString(), this.d / 2, n4 + 1, 0xFFFFFF);
        this.a.u.b(as.a(this.a).c().b());
    }
}

