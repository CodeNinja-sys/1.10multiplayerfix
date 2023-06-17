/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c.a;

import com.a.a.b.cm;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.minecraft.a.p;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.e.r;
import net.minecraft.e.s;
import net.minecraft.e.u;
import net.minecraft.f.ap;
import net.minecraft.g.cn;
import net.minecraft.h.y;
import net.minecraft.q.g.c.a.a;
import net.minecraft.q.g.c.a.b;
import net.minecraft.q.g.c.a.c;
import net.minecraft.q.g.c.a.f;
import net.minecraft.q.g.c.a.g;
import net.minecraft.q.g.c.a.i;
import net.minecraft.q.g.c.a.j;
import net.minecraft.q.g.c.dc;
import net.minecraft.q.k;
import net.minecraft.u.bi;
import net.minecraft.u.bq;
import net.minecraft.w.n;

public class h {
    private final List a = ov.a();
    private final List b = ov.a();
    private net.minecraft.u.b.b c = net.minecraft.u.b.b.c;
    private String d = "?";

    public net.minecraft.u.b.b a() {
        return this.c;
    }

    public void a(String string) {
        this.d = string;
    }

    public String b() {
        return this.d;
    }

    public void a(k k2, net.minecraft.u.b.b b2, net.minecraft.u.b.b b3, boolean bl2, cn cn2) {
        if (b3.cy_() >= 1 && b3.k() >= 1 && b3.l() >= 1) {
            net.minecraft.u.b.b b4 = b2.a(b3).a(-1, -1, -1);
            ArrayList arrayList = ov.a();
            ArrayList arrayList2 = ov.a();
            ArrayList arrayList3 = ov.a();
            net.minecraft.u.b.b b5 = new net.minecraft.u.b.b(Math.min(b2.cy_(), b4.cy_()), Math.min(b2.k(), b4.k()), Math.min(b2.l(), b4.l()));
            net.minecraft.u.b.b b6 = new net.minecraft.u.b.b(Math.max(b2.cy_(), b4.cy_()), Math.max(b2.k(), b4.k()), Math.max(b2.l(), b4.l()));
            this.c = b3;
            for (net.minecraft.u.b.g g2 : net.minecraft.u.b.b.b(b5, b6)) {
                net.minecraft.u.b.b b7 = g2.b(b5);
                net.minecraft.g.c.b b8 = k2.n(g2);
                if (cn2 != null && cn2 == b8.c()) continue;
                ap ap2 = k2.q(g2);
                if (ap2 != null) {
                    e e2 = ap2.a(new e());
                    e2.q("x");
                    e2.q("y");
                    e2.q("z");
                    arrayList2.add(new a(b7, b8, e2));
                    continue;
                }
                if (!b8.e() && !b8.k()) {
                    arrayList3.add(new a(b7, b8, null));
                    continue;
                }
                arrayList.add(new a(b7, b8, null));
            }
            this.a.clear();
            this.a.addAll(arrayList);
            this.a.addAll(arrayList2);
            this.a.addAll(arrayList3);
            if (bl2) {
                this.a(k2, b5, b6.a(1, 1, 1));
            } else {
                this.b.clear();
            }
        }
    }

    private void a(k k2, net.minecraft.u.b.b b2, net.minecraft.u.b.b b3) {
        List list = k2.a(n.class, new net.minecraft.u.b.a(b2, b3), (cm)new g(this));
        this.b.clear();
        for (n n2 : list) {
            net.minecraft.u.b.s s2 = new net.minecraft.u.b.s(n2.aU - (double)b2.cy_(), n2.aV - (double)b2.k(), n2.aW - (double)b2.l());
            e e2 = new e();
            n2.d(e2);
            net.minecraft.u.b.b b4 = n2 instanceof net.minecraft.w.f.q ? ((net.minecraft.w.f.q)n2).l().b(b2) : new net.minecraft.u.b.b(s2);
            this.b.add(new c(s2, b4, e2));
        }
    }

    public Map a(net.minecraft.u.b.b b2, i i2) {
        HashMap hashMap = sz.c();
        dc dc2 = i2.g();
        for (a a2 : this.a) {
            net.minecraft.f.r r2;
            net.minecraft.g.c.b b3;
            net.minecraft.u.b.b b4 = h.a(i2, a2.a).a(b2);
            if (dc2 != null && !dc2.a(b4) || (b3 = a2.b).c() != p.dk || a2.c == null || (r2 = net.minecraft.f.r.valueOf(a2.c.l("mode"))) != net.minecraft.f.r.d) continue;
            hashMap.put(b4, a2.c.l("metadata"));
        }
        return hashMap;
    }

    public net.minecraft.u.b.b a(i i2, net.minecraft.u.b.b b2, i i3, net.minecraft.u.b.b b3) {
        net.minecraft.u.b.b b4 = h.a(i2, b2);
        net.minecraft.u.b.b b5 = h.a(i3, b3);
        return b4.b(b5);
    }

    public static net.minecraft.u.b.b a(i i2, net.minecraft.u.b.b b2) {
        return h.b(b2, i2.b(), i2.c());
    }

    public void a(k k2, net.minecraft.u.b.b b2, i i2) {
        i2.i();
        this.b(k2, b2, i2);
    }

    public void b(k k2, net.minecraft.u.b.b b2, i i2) {
        this.a(k2, b2, new b(b2, i2), i2, 2);
    }

    public void a(k k2, net.minecraft.u.b.b b2, i i2, int n2) {
        this.a(k2, b2, new b(b2, i2), i2, n2);
    }

    public void a(k k2, net.minecraft.u.b.b b2, f f2, i i2, int n2) {
        if (!this.a.isEmpty() && this.c.cy_() >= 1 && this.c.k() >= 1 && this.c.l() >= 1) {
            Object object;
            net.minecraft.u.b.b b3;
            cn cn2 = i2.f();
            dc dc2 = i2.g();
            for (a a2 : this.a) {
                ap ap2;
                b3 = h.a(i2, a2.a).a(b2);
                Object object2 = object = f2 != null ? f2.a(k2, b3, a2) : a2;
                if (object == null) continue;
                cn cn3 = ((a)object).b.c();
                if (cn2 != null && cn2 == cn3 || i2.h() && cn3 == p.dk || dc2 != null && !dc2.a(b3)) continue;
                net.minecraft.g.c.b b4 = ((a)object).b.a(i2.b());
                net.minecraft.g.c.b b5 = b4.a(i2.c());
                if (((a)object).c != null && (ap2 = k2.q(b3)) != null) {
                    if (ap2 instanceof y) {
                        ((y)((Object)ap2)).j();
                    }
                    k2.a(b3, p.cv.v(), 4);
                }
                if (!k2.a(b3, b5, n2) || ((a)object).c == null || (ap2 = k2.q(b3)) == null) continue;
                ((a)object).c.a("x", b3.cy_());
                ((a)object).c.a("y", b3.k());
                ((a)object).c.a("z", b3.l());
                ap2.b(((a)object).c);
                ap2.a(i2.b());
                ap2.a(i2.c());
            }
            for (a a2 : this.a) {
                if (cn2 != null && cn2 == a2.b.c()) continue;
                b3 = h.a(i2, a2.a).a(b2);
                if (dc2 != null && !dc2.a(b3)) continue;
                k2.a(b3, a2.b.c());
                if (a2.c == null || (object = k2.q(b3)) == null) continue;
                ((ap)object).C();
            }
            if (!i2.e()) {
                this.a(k2, b2, i2.b(), i2.c(), dc2);
            }
        }
    }

    private void a(k k2, net.minecraft.u.b.b b2, bi bi2, bq bq2, dc dc2) {
        for (c c2 : this.b) {
            n n2;
            net.minecraft.u.b.b b3 = h.b(c2.b, bi2, bq2).a(b2);
            if (dc2 != null && !dc2.a(b3)) continue;
            e e2 = c2.c;
            net.minecraft.u.b.s s2 = h.a(c2.a, bi2, bq2);
            net.minecraft.u.b.s s3 = s2.b(b2.cy_(), b2.k(), b2.l());
            q q2 = new q();
            q2.a(new s(s3.b));
            q2.a(new s(s3.c));
            q2.a(new s(s3.d));
            e2.a("Pos", q2);
            e2.a("UUID", UUID.randomUUID());
            try {
                n2 = net.minecraft.w.h.a(e2, k2);
            }
            catch (Exception exception) {
                n2 = null;
            }
            if (n2 == null) continue;
            float f2 = n2.a(bi2);
            n2.b(s3.b, s3.c, s3.d, f2 += n2.ba - n2.a(bq2), n2.bb);
            k2.a(n2);
        }
    }

    public net.minecraft.u.b.b a(bq bq2) {
        switch (bq2) {
            case b: 
            case d: {
                return new net.minecraft.u.b.b(this.c.l(), this.c.k(), this.c.cy_());
            }
        }
        return this.c;
    }

    private static net.minecraft.u.b.b b(net.minecraft.u.b.b b2, bi bi2, bq bq2) {
        int n2 = b2.cy_();
        int n3 = b2.k();
        int n4 = b2.l();
        boolean bl2 = true;
        switch (bi2) {
            case b: {
                n4 = -n4;
                break;
            }
            case c: {
                n2 = -n2;
                break;
            }
            default: {
                bl2 = false;
            }
        }
        switch (bq2) {
            case d: {
                return new net.minecraft.u.b.b(n4, n3, -n2);
            }
            case b: {
                return new net.minecraft.u.b.b(-n4, n3, n2);
            }
            case c: {
                return new net.minecraft.u.b.b(-n2, n3, -n4);
            }
        }
        return bl2 ? new net.minecraft.u.b.b(n2, n3, n4) : b2;
    }

    private static net.minecraft.u.b.s a(net.minecraft.u.b.s s2, bi bi2, bq bq2) {
        double d2 = s2.b;
        double d3 = s2.c;
        double d4 = s2.d;
        boolean bl2 = true;
        switch (bi2) {
            case b: {
                d4 = 1.0 - d4;
                break;
            }
            case c: {
                d2 = 1.0 - d2;
                break;
            }
            default: {
                bl2 = false;
            }
        }
        switch (bq2) {
            case d: {
                return new net.minecraft.u.b.s(d4, d3, 1.0 - d2);
            }
            case b: {
                return new net.minecraft.u.b.s(1.0 - d4, d3, d2);
            }
            case c: {
                return new net.minecraft.u.b.s(1.0 - d2, d3, 1.0 - d4);
            }
        }
        return bl2 ? new net.minecraft.u.b.s(d2, d3, d4) : s2;
    }

    public net.minecraft.u.b.b a(net.minecraft.u.b.b b2, bi bi2, bq bq2) {
        int n2 = this.a().cy_() - 1;
        int n3 = this.a().l() - 1;
        int n4 = bi2 == bi.c ? n2 : 0;
        int n5 = bi2 == bi.b ? n3 : 0;
        net.minecraft.u.b.b b3 = b2;
        switch (bq2) {
            case d: {
                b3 = b2.a(n5, 0, n2 - n4);
                break;
            }
            case b: {
                b3 = b2.a(n3 - n5, 0, n4);
                break;
            }
            case c: {
                b3 = b2.a(n2 - n4, 0, n3 - n5);
                break;
            }
            case a: {
                b3 = b2.a(n4, 0, n5);
            }
        }
        return b3;
    }

    public e a(e e2) {
        Object object4;
        Object object22;
        j j2 = new j(null);
        q q2 = new q();
        for (Object object22 : this.a) {
            Object object3 = new e();
            ((e)object3).a("pos", this.a(((a)object22).a.cy_(), ((a)object22).a.k(), ((a)object22).a.l()));
            ((e)object3).a("state", j2.a(((a)object22).b));
            if (((a)object22).c != null) {
                ((e)object3).a("nbt", ((a)object22).c);
            }
            q2.a((net.minecraft.e.a)object3);
        }
        object22 = new q();
        for (Object object4 : this.b) {
            e e3 = new e();
            e3.a("pos", this.a(object4.a.b, object4.a.c, object4.a.d));
            e3.a("blockPos", this.a(((c)object4).b.cy_(), ((c)object4).b.k(), ((c)object4).b.l()));
            if (((c)object4).c != null) {
                e3.a("nbt", ((c)object4).c);
            }
            ((q)object22).a(e3);
        }
        object4 = new q();
        for (Object object3 : j2) {
            ((q)object4).a(u.a(new e(), (net.minecraft.g.c.b)object3));
        }
        e2.a("palette", (net.minecraft.e.a)object4);
        e2.a("blocks", q2);
        e2.a("entities", (net.minecraft.e.a)object22);
        e2.a("size", this.a(this.c.cy_(), this.c.k(), this.c.l()));
        e2.a("version", 1);
        e2.a("author", this.d);
        return e2;
    }

    public void b(e e2) {
        net.minecraft.e.a a2;
        Object object;
        Object object2;
        net.minecraft.e.a a3;
        this.a.clear();
        this.b.clear();
        q q2 = e2.c("size", 3);
        this.c = new net.minecraft.u.b.b(q2.c(0), q2.c(1), q2.c(2));
        this.d = e2.l("author");
        j j2 = new j(null);
        q q3 = e2.c("palette", 10);
        for (int i2 = 0; i2 < q3.e(); ++i2) {
            j2.a(u.d(q3.b(i2)), i2);
        }
        q q4 = e2.c("blocks", 10);
        for (int i3 = 0; i3 < q4.e(); ++i3) {
            e e3 = q4.b(i3);
            a3 = e3.c("pos", 3);
            object2 = new net.minecraft.u.b.b(((q)a3).c(0), ((q)a3).c(1), ((q)a3).c(2));
            object = j2.a(e3.h("state"));
            a2 = e3.e("nbt") ? e3.o("nbt") : null;
            this.a.add(new a((net.minecraft.u.b.b)object2, (net.minecraft.g.c.b)object, (e)a2));
        }
        q q5 = e2.c("entities", 10);
        for (int i4 = 0; i4 < q5.e(); ++i4) {
            a3 = q5.b(i4);
            object2 = ((e)a3).c("pos", 6);
            object = new net.minecraft.u.b.s(((q)object2).e(0), ((q)object2).e(1), ((q)object2).e(2));
            a2 = ((e)a3).c("blockPos", 3);
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(((q)a2).c(0), ((q)a2).c(1), ((q)a2).c(2));
            if (!((e)a3).e("nbt")) continue;
            e e4 = ((e)a3).o("nbt");
            this.b.add(new c((net.minecraft.u.b.s)object, b2, e4));
        }
    }

    private q a(int ... arrn) {
        q q2 = new q();
        int[] arrn2 = arrn;
        int n2 = arrn.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = arrn2[i2];
            q2.a(new r(n3));
        }
        return q2;
    }

    private q a(double ... arrd) {
        q q2 = new q();
        double[] arrd2 = arrd;
        int n2 = arrd.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            double d2 = arrd2[i2];
            q2.a(new s(d2));
        }
        return q2;
    }
}

