/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.a;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.f.u;
import net.minecraft.client.k.a.j;
import net.minecraft.client.k.av;
import net.minecraft.client.r;
import net.minecraft.w.h;
import net.minecraft.w.q;

class e
extends av {
    private final List b;
    final /* synthetic */ j a;

    public e(j j2, r r2) {
        this.a = j2;
        super(r2, j2.p, j2.q, 32, j2.q - 64, net.minecraft.client.k.a.j.b((j)j2).a * 4);
        this.b = ov.a();
        this.b(false);
        for (q q2 : net.minecraft.w.h.a.values()) {
            if (net.minecraft.client.k.a.j.a(j2).a(q2.d) <= 0 && net.minecraft.client.k.a.j.a(j2).a(q2.e) <= 0) continue;
            this.b.add(q2);
        }
    }

    @Override
    protected int a() {
        return this.b.size();
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected int c() {
        return this.a() * net.minecraft.client.k.a.j.b((j)this.a).a * 4;
    }

    @Override
    protected void d() {
        this.a.m();
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        q q2 = (q)this.b.get(n2);
        String string = net.minecraft.client.f.u.a("entity." + q2.a + ".name", new Object[0]);
        int n8 = net.minecraft.client.k.a.j.a(this.a).a(q2.d);
        int n9 = net.minecraft.client.k.a.j.a(this.a).a(q2.e);
        String string2 = net.minecraft.client.f.u.a("stat.entityKills", n8, string);
        String string3 = net.minecraft.client.f.u.a("stat.entityKilledBy", string, n9);
        if (n8 == 0) {
            string2 = net.minecraft.client.f.u.a("stat.entityKills.none", string);
        }
        if (n9 == 0) {
            string3 = net.minecraft.client.f.u.a("stat.entityKilledBy.none", string);
        }
        this.a.b(net.minecraft.client.k.a.j.b(this.a), string, n3 + 2 - 10, n4 + 1, 0xFFFFFF);
        this.a.b(net.minecraft.client.k.a.j.b(this.a), string2, n3 + 2, n4 + 1 + net.minecraft.client.k.a.j.b((j)this.a).a, n8 == 0 ? 0x606060 : 0x909090);
        this.a.b(net.minecraft.client.k.a.j.b(this.a), string3, n3 + 2, n4 + 1 + net.minecraft.client.k.a.j.b((j)this.a).a * 2, n9 == 0 ? 0x606060 : 0x909090);
    }
}

