/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.f;

import com.a.a.d.mq;
import com.a.a.d.ov;
import io.netty.b.g;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.a.p;
import net.minecraft.c.a;
import net.minecraft.f.ap;
import net.minecraft.f.r;
import net.minecraft.f.v;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.fy;
import net.minecraft.q.g.c.a.e;
import net.minecraft.q.g.c.a.h;
import net.minecraft.q.g.c.a.i;
import net.minecraft.q.g.c.dc;
import net.minecraft.u.b.m;
import net.minecraft.u.b.n;
import net.minecraft.u.b.t;
import net.minecraft.u.bi;
import net.minecraft.u.bp;
import net.minecraft.u.bq;
import net.minecraft.u.bw;
import net.minecraft.u.d;
import net.minecraft.u.d.l;
import net.minecraft.x.d.b.j;

public class ab
extends ap {
    private String a = "";
    private String b = "";
    private String c = "";
    private net.minecraft.u.b.b d = new net.minecraft.u.b.b(0, 1, 0);
    private net.minecraft.u.b.b e = net.minecraft.u.b.b.c;
    private bi f = bi.a;
    private bq g = bq.a;
    private r h = net.minecraft.f.r.d;
    private boolean i = true;
    private boolean j;
    private boolean o;
    private boolean p = true;
    private float q = 1.0f;
    private long r = 0L;

    @Override
    public net.minecraft.e.e a(net.minecraft.e.e e2) {
        super.a(e2);
        e2.a("name", this.a);
        e2.a("author", this.b);
        e2.a("metadata", this.c);
        e2.a("posX", this.d.cy_());
        e2.a("posY", this.d.k());
        e2.a("posZ", this.d.l());
        e2.a("sizeX", this.e.cy_());
        e2.a("sizeY", this.e.k());
        e2.a("sizeZ", this.e.l());
        e2.a("rotation", this.g.toString());
        e2.a("mirror", this.f.toString());
        e2.a("mode", this.h.toString());
        e2.a("ignoreEntities", this.i);
        e2.a("powered", this.j);
        e2.a("showair", this.o);
        e2.a("showboundingbox", this.p);
        e2.a("integrity", this.q);
        e2.a("seed", this.r);
        return e2;
    }

    @Override
    public void b(net.minecraft.e.e e2) {
        super.b(e2);
        this.a(e2.l("name"));
        this.b = e2.l("author");
        this.c = e2.l("metadata");
        int n2 = net.minecraft.u.b.n.a(e2.h("posX"), -32, 32);
        int n3 = net.minecraft.u.b.n.a(e2.h("posY"), -32, 32);
        int n4 = net.minecraft.u.b.n.a(e2.h("posZ"), -32, 32);
        this.d = new net.minecraft.u.b.b(n2, n3, n4);
        int n5 = net.minecraft.u.b.n.a(e2.h("sizeX"), 0, 32);
        int n6 = net.minecraft.u.b.n.a(e2.h("sizeY"), 0, 32);
        int n7 = net.minecraft.u.b.n.a(e2.h("sizeZ"), 0, 32);
        this.e = new net.minecraft.u.b.b(n5, n6, n7);
        try {
            this.g = bq.valueOf(e2.l("rotation"));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.g = bq.a;
        }
        try {
            this.f = bi.valueOf(e2.l("mirror"));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.f = bi.a;
        }
        try {
            this.h = net.minecraft.f.r.valueOf(e2.l("mode"));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.h = net.minecraft.f.r.d;
        }
        this.i = e2.p("ignoreEntities");
        this.j = e2.p("powered");
        this.o = e2.p("showair");
        this.p = e2.p("showboundingbox");
        this.q = e2.e("integrity") ? e2.j("integrity") : 1.0f;
        this.r = e2.i("seed");
        this.H();
    }

    private void H() {
        net.minecraft.u.b.b b2;
        b b3;
        if (this.k != null && (b3 = this.k.n(b2 = this.D())).c() == net.minecraft.a.p.dk) {
            this.k.a(b2, b3.a(fy.a, (Comparable)((Object)this.h)), 2);
        }
    }

    @Override
    public j bJ_() {
        return new j(this.l, 7, this.d());
    }

    @Override
    public net.minecraft.e.e d() {
        return this.a(new net.minecraft.e.e());
    }

    public boolean a(net.minecraft.w.a.b b2) {
        if (!b2.aN()) {
            return false;
        }
        if (b2.aE().C) {
            b2.a(this);
        }
        return true;
    }

    public String b() {
        return this.a;
    }

    public void a(String string) {
        String string2 = string;
        char[] arrc = net.minecraft.u.d.b;
        int n2 = net.minecraft.u.d.b.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = arrc[i2];
            string2 = string2.replace(c2, '_');
        }
        this.a = string2;
    }

    public void a(net.minecraft.w.l l2) {
        if (!bw.b(l2.X())) {
            this.b = l2.X();
        }
    }

    public net.minecraft.u.b.b g() {
        return this.d;
    }

    public void a(net.minecraft.u.b.b b2) {
        this.d = b2;
    }

    public net.minecraft.u.b.b h() {
        return this.e;
    }

    public void b(net.minecraft.u.b.b b2) {
        this.e = b2;
    }

    public bi i() {
        return this.f;
    }

    public void b(bi bi2) {
        this.f = bi2;
    }

    public bq j() {
        return this.g;
    }

    public void b(bq bq2) {
        this.g = bq2;
    }

    public String k() {
        return this.c;
    }

    public void b(String string) {
        this.c = string;
    }

    public r n() {
        return this.h;
    }

    public void a(r r2) {
        this.h = r2;
        b b2 = this.k.n(this.D());
        if (b2.c() == net.minecraft.a.p.dk) {
            this.k.a(this.D(), b2.a(fy.a, (Comparable)((Object)r2)), 2);
        }
    }

    public void o() {
        switch (this.n()) {
            case a: {
                this.a(net.minecraft.f.r.b);
                break;
            }
            case b: {
                this.a(net.minecraft.f.r.c);
                break;
            }
            case c: {
                this.a(net.minecraft.f.r.d);
                break;
            }
            case d: {
                this.a(net.minecraft.f.r.a);
            }
        }
    }

    public boolean p() {
        return this.i;
    }

    public void a(boolean bl2) {
        this.i = bl2;
    }

    public float q() {
        return this.q;
    }

    public void a(float f2) {
        this.q = f2;
    }

    public long r() {
        return this.r;
    }

    public void a(long l2) {
        this.r = l2;
    }

    public boolean s() {
        net.minecraft.u.b.b b2;
        if (this.h != net.minecraft.f.r.a) {
            return false;
        }
        net.minecraft.u.b.b b3 = this.D();
        int n2 = 80;
        net.minecraft.u.b.b b4 = new net.minecraft.u.b.b(b3.cy_() - 80, 0, b3.l() - 80);
        List list = this.a(b4, b2 = new net.minecraft.u.b.b(b3.cy_() + 80, 255, b3.l() + 80));
        List list2 = this.a(list);
        if (list2.size() < 1) {
            return false;
        }
        dc dc2 = this.a(b3, list2);
        if (dc2.d - dc2.a > 1 && dc2.e - dc2.b > 1 && dc2.f - dc2.c > 1) {
            this.d = new net.minecraft.u.b.b(dc2.a - b3.cy_() + 1, dc2.b - b3.k() + 1, dc2.c - b3.l() + 1);
            this.e = new net.minecraft.u.b.b(dc2.d - dc2.a - 1, dc2.e - dc2.b - 1, dc2.f - dc2.c - 1);
            this.C();
            b b5 = this.k.n(b3);
            this.k.a(b3, b5, b5, 3);
            return true;
        }
        return false;
    }

    private List a(List list) {
        Iterable iterable = mq.c((Iterable)list, new v(this));
        return ov.a(iterable);
    }

    private List a(net.minecraft.u.b.b b2, net.minecraft.u.b.b b3) {
        ArrayList arrayList = ov.a();
        for (net.minecraft.u.b.g g2 : net.minecraft.u.b.b.b(b2, b3)) {
            ap ap2;
            b b4 = this.k.n(g2);
            if (b4.c() != net.minecraft.a.p.dk || (ap2 = this.k.q(g2)) == null || !(ap2 instanceof ab)) continue;
            arrayList.add((ab)ap2);
        }
        return arrayList;
    }

    private dc a(net.minecraft.u.b.b b2, List list) {
        dc dc2;
        if (list.size() > 1) {
            Object object = ((ab)list.get(0)).D();
            dc2 = new dc((t)object, (t)object);
        } else {
            dc2 = new dc(b2, b2);
        }
        for (Object object : list) {
            net.minecraft.u.b.b b3 = ((ap)object).D();
            if (b3.cy_() < dc2.a) {
                dc2.a = b3.cy_();
            } else if (b3.cy_() > dc2.d) {
                dc2.d = b3.cy_();
            }
            if (b3.k() < dc2.b) {
                dc2.b = b3.k();
            } else if (b3.k() > dc2.e) {
                dc2.e = b3.k();
            }
            if (b3.l() < dc2.c) {
                dc2.c = b3.l();
                continue;
            }
            if (b3.l() <= dc2.f) continue;
            dc2.f = b3.l();
        }
        return dc2;
    }

    public void a(g g2) {
        g2.E(this.l.cy_());
        g2.E(this.l.k());
        g2.E(this.l.l());
    }

    public boolean t() {
        return this.b(true);
    }

    public boolean b(boolean bl2) {
        if (this.h == net.minecraft.f.r.a && !this.k.C && !bw.b(this.a)) {
            net.minecraft.u.b.b b2 = this.D().a(this.d);
            net.minecraft.q.v v2 = (net.minecraft.q.v)this.k;
            a a2 = this.k.l();
            e e2 = v2.ah();
            h h2 = e2.a(a2, new bp(this.a));
            h2.a(this.k, b2, this.e, !this.i, net.minecraft.a.p.dj);
            h2.a(this.b);
            return !bl2 || e2.d(a2, new bp(this.a));
        }
        return false;
    }

    public boolean u() {
        return this.c(true);
    }

    public boolean c(boolean bl2) {
        if (this.h == net.minecraft.f.r.b && !this.k.C && !bw.b(this.a)) {
            Object object;
            net.minecraft.u.b.b b2;
            boolean bl3;
            net.minecraft.u.b.b b3 = this.D();
            net.minecraft.u.b.b b4 = b3.a(this.d);
            net.minecraft.q.v v2 = (net.minecraft.q.v)this.k;
            a a2 = this.k.l();
            e e2 = v2.ah();
            h h2 = e2.b(a2, new bp(this.a));
            if (h2 == null) {
                return false;
            }
            if (!bw.b(h2.b())) {
                this.b = h2.b();
            }
            if (!(bl3 = this.e.equals(b2 = h2.a()))) {
                this.e = b2;
                this.C();
                object = this.k.n(b3);
                this.k.a(b3, (b)object, (b)object, 3);
            }
            if (bl2 && !bl3) {
                return false;
            }
            object = new i().a(this.f).a(this.g).a(this.i).a((m)null).a((cn)null).b(false);
            if (this.q < 1.0f) {
                ((i)object).a(net.minecraft.u.b.n.a(this.q, 0.0f, 1.0f)).a((Long)this.r);
            }
            h2.a(this.k, b4, (i)object);
            return true;
        }
        return false;
    }

    public void v() {
        net.minecraft.q.v v2 = (net.minecraft.q.v)this.k;
        e e2 = v2.ah();
        e2.a(new bp(this.a));
    }

    public boolean w() {
        if (this.h == net.minecraft.f.r.b && !this.k.C) {
            net.minecraft.q.v v2 = (net.minecraft.q.v)this.k;
            a a2 = this.k.l();
            e e2 = v2.ah();
            return e2.b(a2, new bp(this.a)) != null;
        }
        return false;
    }

    public boolean x() {
        return this.j;
    }

    public void d(boolean bl2) {
        this.j = bl2;
    }

    public boolean y() {
        return this.o;
    }

    public void e(boolean bl2) {
        this.o = bl2;
    }

    public boolean z() {
        return this.p;
    }

    public void f(boolean bl2) {
        this.p = bl2;
    }

    @Override
    public net.minecraft.u.d.a aK() {
        return new l("structure_block.hover." + net.minecraft.f.r.a(this.h), this.h == net.minecraft.f.r.d ? this.c : this.a);
    }

    static /* synthetic */ r a(ab ab2) {
        return ab2.h;
    }

    static /* synthetic */ String b(ab ab2) {
        return ab2.a;
    }
}

