/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.c;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.client.g.am;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.c.a;
import net.minecraft.client.g.c.c;
import net.minecraft.client.g.c.f;
import net.minecraft.client.g.c.h;
import net.minecraft.client.g.c.i;
import net.minecraft.client.g.c.j;
import net.minecraft.client.g.c.k;
import net.minecraft.client.g.c.l;
import net.minecraft.client.g.c.n;
import net.minecraft.client.g.c.o;
import net.minecraft.client.g.c.p;
import net.minecraft.client.g.c.r;
import net.minecraft.client.g.c.s;
import net.minecraft.client.k.ce;
import net.minecraft.f.ab;
import net.minecraft.f.ad;
import net.minecraft.f.aj;
import net.minecraft.f.ak;
import net.minecraft.f.ao;
import net.minecraft.f.ap;
import net.minecraft.f.aq;
import net.minecraft.f.m;
import net.minecraft.f.u;
import net.minecraft.f.w;
import net.minecraft.f.y;
import net.minecraft.u.b.b;
import net.minecraft.u.bo;

public class d {
    private final Map n = sz.c();
    public static d a = new d();
    private ce o;
    public static double b;
    public static double c;
    public static double d;
    public net.minecraft.client.g.a.c e;
    public net.minecraft.q.k f;
    public net.minecraft.w.n g;
    public float h;
    public float i;
    public net.minecraft.u.b.o j;
    public double k;
    public double l;
    public double m;

    private d() {
        this.n.put(ad.class, new j());
        this.n.put(y.class, new s());
        this.n.put(m.class, new i());
        this.n.put(u.class, new r());
        this.n.put(ak.class, new k());
        this.n.put(aj.class, new a());
        this.n.put(ao.class, new l());
        this.n.put(net.minecraft.f.am.class, new h());
        this.n.put(aq.class, new n());
        this.n.put(net.minecraft.f.f.class, new c());
        this.n.put(w.class, new p());
        this.n.put(ab.class, new f());
        for (o o2 : this.n.values()) {
            o2.a(this);
        }
    }

    public o a(Class class_) {
        o o2 = (o)this.n.get(class_);
        if (o2 == null && class_ != ap.class) {
            o2 = this.a(class_.getSuperclass());
            this.n.put(class_, o2);
        }
        return o2;
    }

    public o a(ap ap2) {
        return ap2 == null ? null : this.a(ap2.getClass());
    }

    public void a(net.minecraft.q.k k2, net.minecraft.client.g.a.c c2, ce ce2, net.minecraft.w.n n2, net.minecraft.u.b.o o2, float f2) {
        if (this.f != k2) {
            this.a(k2);
        }
        this.e = c2;
        this.g = n2;
        this.o = ce2;
        this.j = o2;
        this.h = n2.bc + (n2.ba - n2.bc) * f2;
        this.i = n2.bd + (n2.bb - n2.bd) * f2;
        this.k = n2.br + (n2.aU - n2.br) * (double)f2;
        this.l = n2.bs + (n2.aV - n2.bs) * (double)f2;
        this.m = n2.bt + (n2.aW - n2.bt) * (double)f2;
    }

    public void a(ap ap2, float f2, int n2) {
        if (ap2.a(this.k, this.l, this.m) < ap2.bM_()) {
            am.b();
            int n3 = this.f.b(ap2.D(), 0);
            int n4 = n3 % 65536;
            int n5 = n3 / 65536;
            ay.a(ay.r, n4, (float)n5);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            b b2 = ap2.D();
            this.a(ap2, (double)b2.cy_() - b, (double)b2.k() - c, (double)b2.l() - d, f2, n2);
        }
    }

    public void a(ap ap2, double d2, double d3, double d4, float f2) {
        this.a(ap2, d2, d3, d4, f2, -1);
    }

    public void a(ap ap2, double d2, double d3, double d4, float f2, int n2) {
        o o2 = this.a(ap2);
        if (o2 != null) {
            try {
                o2.a(ap2, d2, d3, d4, f2, n2);
            }
            catch (Throwable throwable) {
                net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Rendering Block Entity");
                net.minecraft.k.i i2 = a2.a("Block Entity Details");
                ap2.a(i2);
                throw new bo(a2);
            }
        }
    }

    public void a(net.minecraft.q.k k2) {
        this.f = k2;
        if (k2 == null) {
            this.g = null;
        }
    }

    public ce a() {
        return this.o;
    }
}

