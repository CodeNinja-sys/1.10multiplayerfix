/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.nio.FloatBuffer;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public class adr {
    private iu d;
    private final fr e;
    public static int a;
    public ajc b = ajc.a;
    private final ReentrantLock f = new ReentrantLock();
    private final ReentrantLock g = new ReentrantLock();
    private chn h;
    private final Set i = aad.a();
    private final int j;
    private final FloatBuffer k = avj.e(16);
    private final cwg[] l = new cwg[kj.values().length];
    public cxt c;
    private int m = -1;
    private boolean n = true;
    private pj o = new pj(-1, -1, -1);
    private pj[] p = new pj[6];
    private boolean q;
    private bnj r;

    public adr(iu iu2, fr fr2, int n2) {
        int n3;
        for (n3 = 0; n3 < this.p.length; ++n3) {
            this.p[n3] = new pj();
        }
        this.d = iu2;
        this.e = fr2;
        this.j = n2;
        if (cjg.f()) {
            for (n3 = 0; n3 < kj.values().length; ++n3) {
                this.l[n3] = new cwg(bxb.a);
            }
        }
    }

    public boolean a(int n2) {
        if (this.m == n2) {
            return false;
        }
        this.m = n2;
        return true;
    }

    public cwg b(int n2) {
        return this.l[n2];
    }

    public void a(int n2, int n3, int n4) {
        if (n2 == this.o.a() && n3 == this.o.b() && n4 == this.o.c()) {
            return;
        }
        this.h();
        this.o.a(n2, n3, n4);
        this.c = new cxt(n2, n3, n4, n2 + 16, n3 + 16, n4 + 16);
        for (bqk bqk2 : bqk.values()) {
            this.p[bqk2.ordinal()].a(this.o).a(bqk2, 16);
        }
        this.p();
    }

    public void a(float f2, float f3, float f4, chn chn2) {
        ajc ajc2 = chn2.c();
        if (ajc2.c() == null || ajc2.b(kj.d)) {
            return;
        }
        this.a(chn2.d().a(kj.d), this.o);
        chn2.d().a(kj.d).a(ajc2.c());
        this.a(kj.d, f2, f3, f4, chn2.d().a(kj.d), ajc2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void b(float f2, float f3, float f4, chn chn2) {
        Object object;
        Object object2;
        ajc ajc2 = new ajc();
        boolean bl2 = true;
        pj pj2 = this.o;
        cmz cmz2 = pj2.e(15, 15, 15);
        chn2.f().lock();
        try {
            if (chn2.a() != czd.b) {
                return;
            }
            chn2.a(ajc2);
        }
        finally {
            chn2.f().unlock();
        }
        apv apv2 = new apv();
        HashSet hashSet = aad.a();
        if (!this.r.M()) {
            ++a;
            object2 = new boolean[kj.values().length];
            object = bxy.B().ac();
            for (pj pj3 : cmz.b(pj2, cmz2)) {
                kh kh2;
                Object object3;
                dbk dbk2 = this.r.n(pj3);
                bfa object4 = dbk2.t();
                if (dbk2.p()) {
                    apv2.a(pj3);
                }
                if (object4.l() && (object3 = this.r.q(new cmz(pj3))) != null && (kh2 = ccg.a.a((bql)object3)) != null) {
                    ajc2.a((bql)object3);
                    if (kh2.a((bql)object3)) {
                        hashSet.add(object3);
                    }
                }
                object3 = object4.b();
                int n2 = object3.ordinal();
                if (object4.s().i() == cpb.a) continue;
                bix bix2 = chn2.d().a(n2);
                if (!ajc2.d((kj)((Object)object3))) {
                    ajc2.c((kj)((Object)object3));
                    this.a(bix2, pj2);
                }
                Object object5 = object2;
                int n3 = n2;
                object5[n3] = object5[n3] | ((dfp)object).a(dbk2, (cmz)pj3, this.r, bix2);
            }
            for (kj kj2 : kj.values()) {
                if (object2[kj2.ordinal()] != false) {
                    ajc2.a(kj2);
                }
                if (!ajc2.d(kj2)) continue;
                this.a(kj2, f2, f3, f4, chn2.d().a(kj2), ajc2);
            }
        }
        ajc2.a(apv2.a());
        this.f.lock();
        try {
            object2 = aad.b((Iterable)hashSet);
            object = aad.b((Iterable)this.i);
            object2.removeAll(this.i);
            object.removeAll(hashSet);
            this.i.clear();
            this.i.addAll(hashSet);
            this.e.a((Collection)object, (Collection)object2);
        }
        finally {
            this.f.unlock();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void a() {
        this.f.lock();
        try {
            if (this.h != null && this.h.a() != czd.d) {
                this.h.e();
                this.h = null;
            }
        }
        finally {
            this.f.unlock();
        }
    }

    public ReentrantLock b() {
        return this.f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public chn c() {
        this.f.lock();
        try {
            this.a();
            this.h = new chn(this, ait.a, this.e());
            this.o();
            chn chn2 = this.h;
            return chn2;
        }
        finally {
            this.f.unlock();
        }
    }

    private void o() {
        boolean bl2 = true;
        this.r = new dek(this.d, this.o.e(-1, -1, -1), this.o.e(16, 16, 16), 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public chn d() {
        this.f.lock();
        try {
            if (this.h != null && this.h.a() == czd.a) {
                chn chn2 = null;
                return chn2;
            }
            if (this.h != null && this.h.a() != czd.d) {
                this.h.e();
                this.h = null;
            }
            this.h = new chn(this, ait.b, this.e());
            this.h.a(this.b);
            chn chn3 = this.h;
            return chn3;
        }
        finally {
            this.f.unlock();
        }
    }

    protected double e() {
        ob ob2 = bxy.B().h;
        double d2 = this.c.a + 8.0 - ob2.aU;
        double d3 = this.c.b + 8.0 - ob2.aV;
        double d4 = this.c.c + 8.0 - ob2.aW;
        return d2 * d2 + d3 * d3 + d4 * d4;
    }

    private void a(bix bix2, cmz cmz2) {
        bix2.a(7, bxb.a);
        bix2.c((double)(-cmz2.a()), (double)(-cmz2.b()), (double)(-cmz2.c()));
    }

    private void a(kj kj2, float f2, float f3, float f4, bix bix2, ajc ajc2) {
        if (kj2 == kj.d && !ajc2.b(kj2)) {
            bix2.a(f2, f3, f4);
            ajc2.a(bix2.a());
        }
        bix2.e();
    }

    private void p() {
        cja.D();
        cja.C();
        float f2 = 1.000001f;
        cja.c(-8.0f, -8.0f, -8.0f);
        cja.b(1.000001f, 1.000001f, 1.000001f);
        cja.c(8.0f, 8.0f, 8.0f);
        cja.c(2982, this.k);
        cja.E();
    }

    public void f() {
        cja.a(this.k);
    }

    public ajc g() {
        return this.b;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(ajc ajc2) {
        this.g.lock();
        try {
            this.b = ajc2;
        }
        finally {
            this.g.unlock();
        }
    }

    public void h() {
        this.a();
        this.b = ajc.a;
    }

    public void i() {
        this.h();
        this.d = null;
        for (int i2 = 0; i2 < kj.values().length; ++i2) {
            if (this.l[i2] == null) continue;
            this.l[i2].c();
        }
    }

    public cmz j() {
        return this.o;
    }

    public void a(boolean bl2) {
        if (this.n) {
            bl2 |= this.q;
        }
        this.n = true;
        this.q = bl2;
    }

    public void k() {
        this.n = false;
        this.q = false;
    }

    public boolean l() {
        return this.n;
    }

    public boolean m() {
        return this.n && this.q;
    }

    public cmz a(bqk bqk2) {
        return this.p[bqk2.ordinal()];
    }

    public iu n() {
        return this.d;
    }
}

