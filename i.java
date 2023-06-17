/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.mq;
import com.a.a.d.ov;
import io.netty.b.g;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.c.a;

public class i
extends bql {
    private String a = "";
    private String b = "";
    private String c = "";
    private cmz d = new cmz(0, 1, 0);
    private cmz e = cmz.e;
    private cdk f = cdk.a;
    private ih g = ih.a;
    private cfk h = cfk.d;
    private boolean i = true;
    private boolean j;
    private boolean o;
    private boolean p = true;
    private float q = 1.0f;
    private long r = 0L;

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        bvp2.a("name", this.a);
        bvp2.a("author", this.b);
        bvp2.a("metadata", this.c);
        bvp2.a("posX", this.d.a());
        bvp2.a("posY", this.d.b());
        bvp2.a("posZ", this.d.c());
        bvp2.a("sizeX", this.e.a());
        bvp2.a("sizeY", this.e.b());
        bvp2.a("sizeZ", this.e.c());
        bvp2.a("rotation", this.g.toString());
        bvp2.a("mirror", this.f.toString());
        bvp2.a("mode", this.h.toString());
        bvp2.a("ignoreEntities", this.i);
        bvp2.a("powered", this.j);
        bvp2.a("showair", this.o);
        bvp2.a("showboundingbox", this.p);
        bvp2.a("integrity", this.q);
        bvp2.a("seed", this.r);
        return bvp2;
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.a(bvp2.l("name"));
        this.b = bvp2.l("author");
        this.c = bvp2.l("metadata");
        int n2 = cmk.a(bvp2.h("posX"), -32, 32);
        int n3 = cmk.a(bvp2.h("posY"), -32, 32);
        int n4 = cmk.a(bvp2.h("posZ"), -32, 32);
        this.d = new cmz(n2, n3, n4);
        int n5 = cmk.a(bvp2.h("sizeX"), 0, 32);
        int n6 = cmk.a(bvp2.h("sizeY"), 0, 32);
        int n7 = cmk.a(bvp2.h("sizeZ"), 0, 32);
        this.e = new cmz(n5, n6, n7);
        try {
            this.g = ih.valueOf(bvp2.l("rotation"));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.g = ih.a;
        }
        try {
            this.f = cdk.valueOf(bvp2.l("mirror"));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.f = cdk.a;
        }
        try {
            this.h = cfk.valueOf(bvp2.l("mode"));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            this.h = cfk.d;
        }
        this.i = bvp2.p("ignoreEntities");
        this.j = bvp2.p("powered");
        this.o = bvp2.p("showair");
        this.p = bvp2.p("showboundingbox");
        this.q = bvp2.e("integrity") ? bvp2.j("integrity") : 1.0f;
        this.r = bvp2.i("seed");
        this.C();
    }

    private void C() {
        if (this.k == null) {
            return;
        }
        cmz cmz2 = this.y();
        dbk dbk2 = this.k.n(cmz2);
        if (dbk2.t() == blg.dk) {
            this.k.a(cmz2, dbk2.a(cip.a, (Comparable)((Object)this.h)), 2);
        }
    }

    @Override
    public hv a_() {
        return new hv(this.l, 7, this.b());
    }

    @Override
    public bvp b() {
        return this.b(new bvp());
    }

    public boolean a(bdl bdl2) {
        if (!bdl2.aU()) {
            return false;
        }
        if (bdl2.m_().C) {
            bdl2.a(this);
        }
        return true;
    }

    public String c() {
        return this.a;
    }

    public void a(String string) {
        String string2 = string;
        for (char c2 : ate.b) {
            string2 = string2.replace(c2, '_');
        }
        this.a = string2;
    }

    public void a(bga bga2) {
        if (!aco.b(bga2.i_())) {
            this.b = bga2.i_();
        }
    }

    public cmz d() {
        return this.d;
    }

    public void a(cmz cmz2) {
        this.d = cmz2;
    }

    public cmz e() {
        return this.e;
    }

    public void b(cmz cmz2) {
        this.e = cmz2;
    }

    public cdk f() {
        return this.f;
    }

    public void a(cdk cdk2) {
        this.f = cdk2;
    }

    public ih g() {
        return this.g;
    }

    public void a(ih ih2) {
        this.g = ih2;
    }

    public String h() {
        return this.c;
    }

    public void b(String string) {
        this.c = string;
    }

    public cfk i() {
        return this.h;
    }

    public void a(cfk cfk2) {
        this.h = cfk2;
        dbk dbk2 = this.k.n(this.y());
        if (dbk2.t() == blg.dk) {
            this.k.a(this.y(), dbk2.a(cip.a, (Comparable)((Object)cfk2)), 2);
        }
    }

    public void j() {
        switch (this.i()) {
            case a: {
                this.a(cfk.b);
                break;
            }
            case b: {
                this.a(cfk.c);
                break;
            }
            case c: {
                this.a(cfk.d);
                break;
            }
            case d: {
                this.a(cfk.a);
            }
        }
    }

    public boolean k() {
        return this.i;
    }

    public void a(boolean bl2) {
        this.i = bl2;
    }

    public float l() {
        return this.q;
    }

    public void a(float f2) {
        this.q = f2;
    }

    public long m() {
        return this.r;
    }

    public void a(long l2) {
        this.r = l2;
    }

    public boolean n() {
        cmz cmz2;
        if (this.h != cfk.a) {
            return false;
        }
        cmz cmz3 = this.y();
        int n2 = 80;
        cmz cmz4 = new cmz(cmz3.a() - 80, 0, cmz3.c() - 80);
        List list = this.a(cmz4, cmz2 = new cmz(cmz3.a() + 80, 255, cmz3.c() + 80));
        List list2 = this.a(list);
        if (list2.size() < 1) {
            return false;
        }
        awx awx2 = this.a(cmz3, list2);
        if (awx2.d - awx2.a > 1 && awx2.e - awx2.b > 1 && awx2.f - awx2.c > 1) {
            this.d = new cmz(awx2.a - cmz3.a() + 1, awx2.b - cmz3.b() + 1, awx2.c - cmz3.c() + 1);
            this.e = new cmz(awx2.d - awx2.a - 1, awx2.e - awx2.b - 1, awx2.f - awx2.c - 1);
            this.c_();
            dbk dbk2 = this.k.n(cmz3);
            this.k.a(cmz3, dbk2, dbk2, 3);
            return true;
        }
        return false;
    }

    private List a(List list) {
        Iterable iterable = mq.c((Iterable)list, new cgp(this));
        return ov.a(iterable);
    }

    private List a(cmz cmz2, cmz cmz3) {
        ArrayList arrayList = ov.a();
        for (pj pj2 : cmz.b(cmz2, cmz3)) {
            bql bql2;
            dbk dbk2 = this.k.n(pj2);
            if (dbk2.t() != blg.dk || (bql2 = this.k.q(pj2)) == null || !(bql2 instanceof i)) continue;
            arrayList.add((i)bql2);
        }
        return arrayList;
    }

    private awx a(cmz cmz2, List list) {
        awx awx2;
        if (list.size() > 1) {
            cmz cmz3 = ((i)list.get(0)).y();
            awx2 = new awx(cmz3, cmz3);
        } else {
            awx2 = new awx(cmz2, cmz2);
        }
        for (i i2 : list) {
            cmz cmz4 = i2.y();
            if (cmz4.a() < awx2.a) {
                awx2.a = cmz4.a();
            } else if (cmz4.a() > awx2.d) {
                awx2.d = cmz4.a();
            }
            if (cmz4.b() < awx2.b) {
                awx2.b = cmz4.b();
            } else if (cmz4.b() > awx2.e) {
                awx2.e = cmz4.b();
            }
            if (cmz4.c() < awx2.c) {
                awx2.c = cmz4.c();
                continue;
            }
            if (cmz4.c() <= awx2.f) continue;
            awx2.f = cmz4.c();
        }
        return awx2;
    }

    public void a(g g2) {
        g2.E(this.l.a());
        g2.E(this.l.b());
        g2.E(this.l.c());
    }

    public boolean o() {
        return this.b(true);
    }

    public boolean b(boolean bl2) {
        if (this.h != cfk.a || this.k.C || aco.b(this.a)) {
            return false;
        }
        cmz cmz2 = this.y().g(this.d);
        alj alj2 = (alj)this.k;
        a a2 = this.k.f();
        bzz bzz2 = alj2.ai();
        ed ed2 = bzz2.a(a2, new bpx(this.a));
        ed2.a(this.k, cmz2, this.e, !this.i, blg.dj);
        ed2.a(this.b);
        return !bl2 || bzz2.d(a2, new bpx(this.a));
    }

    public boolean p() {
        return this.c(true);
    }

    public boolean c(boolean bl2) {
        Object object;
        cmz cmz2;
        boolean bl3;
        if (this.h != cfk.b || this.k.C || aco.b(this.a)) {
            return false;
        }
        cmz cmz3 = this.y();
        cmz cmz4 = cmz3.g(this.d);
        alj alj2 = (alj)this.k;
        a a2 = this.k.f();
        bzz bzz2 = alj2.ai();
        ed ed2 = bzz2.b(a2, new bpx(this.a));
        if (ed2 == null) {
            return false;
        }
        if (!aco.b(ed2.b())) {
            this.b = ed2.b();
        }
        if (!(bl3 = this.e.equals(cmz2 = ed2.a()))) {
            this.e = cmz2;
            this.c_();
            object = this.k.n(cmz3);
            this.k.a(cmz3, (dbk)object, (dbk)object, 3);
        }
        if (!bl2 || bl3) {
            object = new cwl().a(this.f).a(this.g).a(this.i).a((zz)null).a((bfa)null).b(false);
            if (this.q < 1.0f) {
                ((cwl)object).a(cmk.a(this.q, 0.0f, 1.0f)).a((Long)this.r);
            }
            ed2.a(this.k, cmz4, (cwl)object);
            return true;
        }
        return false;
    }

    public void q() {
        alj alj2 = (alj)this.k;
        bzz bzz2 = alj2.ai();
        bzz2.a(new bpx(this.a));
    }

    public boolean r() {
        if (this.h != cfk.b || this.k.C) {
            return false;
        }
        alj alj2 = (alj)this.k;
        a a2 = this.k.f();
        bzz bzz2 = alj2.ai();
        return bzz2.b(a2, new bpx(this.a)) != null;
    }

    public boolean s() {
        return this.j;
    }

    public void d(boolean bl2) {
        this.j = bl2;
    }

    public boolean t() {
        return this.o;
    }

    public void e(boolean bl2) {
        this.o = bl2;
    }

    public boolean u() {
        return this.p;
    }

    public void f(boolean bl2) {
        this.p = bl2;
    }

    @Override
    public cbg v() {
        return new du("structure_block.hover." + cfk.a(this.h), this.h == cfk.d ? this.c : this.a);
    }

    static /* synthetic */ cfk a(i i2) {
        return i2.h;
    }

    static /* synthetic */ String b(i i2) {
        return i2.a;
    }
}

