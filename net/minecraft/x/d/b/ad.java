/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x.d.b;

import java.util.UUID;
import net.minecraft.u.b.b;
import net.minecraft.w.f.g;
import net.minecraft.w.f.q;
import net.minecraft.x.d.a;
import net.minecraft.x.p;

public class ad
implements p {
    private int a;
    private UUID b;
    private b c;
    private net.minecraft.u.ad d;
    private String e;

    public ad() {
    }

    public ad(q q2) {
        this.a = q2.ca();
        this.b = q2.cM();
        this.c = q2.l();
        this.d = q2.b;
        this.e = q2.c.B;
    }

    @Override
    public void a(net.minecraft.x.a a2) {
        this.a = a2.e();
        this.b = a2.g();
        this.e = a2.e(g.A);
        this.c = a2.c();
        this.d = net.minecraft.u.ad.b(a2.F());
    }

    @Override
    public void b(net.minecraft.x.a a2) {
        a2.d(this.a);
        a2.a(this.b);
        a2.a(this.e);
        a2.a(this.c);
        a2.B(this.d.c());
    }

    public void a(a a2) {
        a2.a(this);
    }

    public int a() {
        return this.a;
    }

    public UUID b() {
        return this.b;
    }

    public b c() {
        return this.c;
    }

    public net.minecraft.u.ad d() {
        return this.d;
    }

    public String e() {
        return this.e;
    }
}

