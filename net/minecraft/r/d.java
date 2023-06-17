/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.r;

import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.r.j;
import net.minecraft.r.k;
import net.minecraft.r.m;
import net.minecraft.u.d.a;
import net.minecraft.u.d.l;
import net.minecraft.u.d.o;

public class d
extends k {
    public final int a;
    public final int b;
    public final d c;
    private final String k;
    private m l;
    public final cu d;
    private boolean m;

    public d(String string, String string2, int n2, int n3, cg cg2, d d2) {
        this(string, string2, n2, n3, new cu(cg2), d2);
    }

    public d(String string, String string2, int n2, int n3, cn cn2, d d2) {
        this(string, string2, n2, n3, new cu(cn2), d2);
    }

    public d(String string, String string2, int n2, int n3, cu cu2, d d2) {
        super(string, new l("achievement." + string2, new Object[0]));
        this.d = cu2;
        this.k = "achievement." + string2 + ".desc";
        this.a = n2;
        this.b = n3;
        if (n2 < net.minecraft.r.j.a) {
            net.minecraft.r.j.a = n2;
        }
        if (n3 < net.minecraft.r.j.b) {
            net.minecraft.r.j.b = n3;
        }
        if (n2 > net.minecraft.r.j.c) {
            net.minecraft.r.j.c = n2;
        }
        if (n3 > net.minecraft.r.j.d) {
            net.minecraft.r.j.d = n3;
        }
        this.c = d2;
    }

    public d a() {
        this.f = true;
        return this;
    }

    public d b() {
        this.m = true;
        return this;
    }

    public d c() {
        super.i();
        net.minecraft.r.j.e.add(this);
        return this;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public a e() {
        a a2 = super.e();
        a2.a().a(this.g() ? o.f : o.k);
        return a2;
    }

    public d a(Class class_) {
        return (d)super.b(class_);
    }

    public String f() {
        return this.l != null ? this.l.a(net.minecraft.u.d.b.a.a(this.k)) : net.minecraft.u.d.b.a.a(this.k);
    }

    public d a(m m2) {
        this.l = m2;
        return this;
    }

    public boolean g() {
        return this.m;
    }

    @Override
    public /* synthetic */ k h() {
        return this.a();
    }

    @Override
    public /* synthetic */ k b(Class class_) {
        return this.a(class_);
    }

    @Override
    public /* synthetic */ k i() {
        return this.c();
    }
}

