/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class arn {
    private static final d c = org.apache.logging.log4j.c.c();
    private final cpk d;
    private final int e;
    private int f;
    private final int g;
    private long h;
    private long i;
    private long j;
    private int k;
    private int l;
    private int m;
    private double n;
    private double o;
    private double p;
    public int a;
    private double q;
    private double r;
    private double s;
    private boolean t;
    private final boolean u;
    private int v;
    private List w = Collections.emptyList();
    private boolean x;
    private boolean y;
    public boolean b;
    private final Set z = aad.a();

    public arn(cpk cpk2, int n2, int n3, int n4, boolean bl2) {
        this.d = cpk2;
        this.e = n2;
        this.f = n3;
        this.g = n4;
        this.u = bl2;
        this.h = tt.a(cpk2.aU);
        this.i = tt.a(cpk2.aV);
        this.j = tt.a(cpk2.aW);
        this.k = cmk.d(cpk2.ba * 256.0f / 360.0f);
        this.l = cmk.d(cpk2.bb * 256.0f / 360.0f);
        this.m = cmk.d(cpk2.bA() * 256.0f / 360.0f);
        this.y = cpk2.be;
    }

    public boolean equals(Object object) {
        if (object instanceof arn) {
            return ((arn)object).d.bW() == this.d.bW();
        }
        return false;
    }

    public int hashCode() {
        return this.d.bW();
    }

    public void a(List list) {
        List list2;
        this.b = false;
        if (!this.t || this.d.i(this.q, this.r, this.s) > 16.0) {
            this.q = this.d.aU;
            this.r = this.d.aV;
            this.s = this.d.aW;
            this.t = true;
            this.b = true;
            this.b(list);
        }
        if (!(list2 = this.d.cH()).equals(this.w)) {
            this.w = list2;
            this.a(new pg(this.d));
        }
        if (this.d instanceof cvr && this.a % 10 == 0) {
            cvr cvr2 = (cvr)this.d;
            bhl bhl2 = cvr2.w();
            if (bhl2 != null && bhl2.a() instanceof ayb) {
                aph aph2 = hp.bk.a(bhl2, this.d.aQ);
                for (bdl bdl2 : list) {
                    czt czt2 = (czt)bdl2;
                    aph2.a(czt2, bhl2);
                    ds ds2 = hp.bk.a(bhl2, this.d.aQ, czt2);
                    if (ds2 == null) continue;
                    czt2.a.a(ds2);
                }
            }
            this.d();
        }
        if (this.a % this.g == 0 || this.d.bO || this.d.bY().a()) {
            if (this.d.cp()) {
                boolean bl2;
                int n2 = cmk.d(this.d.ba * 256.0f / 360.0f);
                int n3 = cmk.d(this.d.bb * 256.0f / 360.0f);
                boolean bl3 = bl2 = Math.abs(n2 - this.k) >= 1 || Math.abs(n3 - this.l) >= 1;
                if (bl2) {
                    this.a(new xl(this.d.bW(), (byte)n2, (byte)n3, this.d.be));
                    this.k = n2;
                    this.l = n3;
                }
                this.h = tt.a(this.d.aU);
                this.i = tt.a(this.d.aV);
                this.j = tt.a(this.d.aW);
                this.d();
                this.x = true;
            } else {
                boolean bl4;
                ++this.v;
                long l2 = tt.a(this.d.aU);
                long l3 = tt.a(this.d.aV);
                long l4 = tt.a(this.d.aW);
                int n4 = cmk.d(this.d.ba * 256.0f / 360.0f);
                int n5 = cmk.d(this.d.bb * 256.0f / 360.0f);
                long l5 = l2 - this.h;
                long l6 = l3 - this.i;
                long l7 = l4 - this.j;
                ds ds3 = null;
                boolean bl5 = l5 * l5 + l6 * l6 + l7 * l7 >= 128L || this.a % 60 == 0;
                boolean bl6 = bl4 = Math.abs(n4 - this.k) >= 1 || Math.abs(n5 - this.l) >= 1;
                if (this.a > 0 || this.d instanceof cwt) {
                    if (l5 < -32768L || l5 >= 32768L || l6 < -32768L || l6 >= 32768L || l7 < -32768L || l7 >= 32768L || this.v > 400 || this.x || this.y != this.d.be) {
                        this.y = this.d.be;
                        this.v = 0;
                        this.c();
                        ds3 = new bqt(this.d);
                    } else if (bl5 && bl4 || this.d instanceof cwt) {
                        ds3 = new css(this.d.bW(), l5, l6, l7, (byte)n4, (byte)n5, this.d.be);
                    } else if (bl5) {
                        ds3 = new ang(this.d.bW(), l5, l6, l7, this.d.be);
                    } else if (bl4) {
                        ds3 = new xl(this.d.bW(), (byte)n4, (byte)n5, this.d.be);
                    }
                }
                boolean bl7 = this.u;
                if (this.d instanceof bga && ((bga)this.d).bL()) {
                    bl7 = true;
                }
                if (bl7) {
                    double d2 = this.d.aX - this.n;
                    double d3 = this.d.aY - this.o;
                    double d4 = this.d.aZ - this.p;
                    double d5 = 0.02;
                    double d6 = d2 * d2 + d3 * d3 + d4 * d4;
                    if (d6 > 4.0E-4 || d6 > 0.0 && this.d.aX == 0.0 && this.d.aY == 0.0 && this.d.aZ == 0.0) {
                        this.n = this.d.aX;
                        this.o = this.d.aY;
                        this.p = this.d.aZ;
                        this.a(new gi(this.d.bW(), this.n, this.o, this.p));
                    }
                }
                if (ds3 != null) {
                    this.a(ds3);
                }
                this.d();
                if (bl5) {
                    this.h = l2;
                    this.i = l3;
                    this.j = l4;
                }
                if (bl4) {
                    this.k = n4;
                    this.l = n5;
                }
                this.x = false;
            }
            int n6 = cmk.d(this.d.bA() * 256.0f / 360.0f);
            if (Math.abs(n6 - this.m) >= 1) {
                this.a(new bmq(this.d, (byte)n6));
                this.m = n6;
            }
            this.d.bO = false;
        }
        ++this.a;
        if (this.d.bi) {
            this.b(new gi(this.d));
            this.d.bi = false;
        }
    }

    private void d() {
        bwm bwm2 = this.d.bY();
        if (bwm2.a()) {
            this.b(new qx(this.d.bW(), bwm2, false));
        }
        if (this.d instanceof bga) {
            abh abh2 = (abh)((bga)this.d).bs();
            Set set = abh2.a();
            if (!set.isEmpty()) {
                this.b(new cl(this.d.bW(), set));
            }
            set.clear();
        }
    }

    public void a(ds ds2) {
        for (czt czt2 : this.z) {
            czt2.a.a(ds2);
        }
    }

    public void b(ds ds2) {
        this.a(ds2);
        if (this.d instanceof czt) {
            ((czt)this.d).a.a(ds2);
        }
    }

    public void a() {
        for (czt czt2 : this.z) {
            this.d.c(czt2);
            czt2.u(this.d);
        }
    }

    public void a(czt czt2) {
        if (this.z.contains(czt2)) {
            this.d.c(czt2);
            czt2.u(this.d);
            this.z.remove(czt2);
        }
    }

    public void b(czt czt2) {
        if (czt2 == this.d) {
            return;
        }
        if (this.c(czt2)) {
            if (!this.z.contains(czt2) && (this.e(czt2) || this.d.aP)) {
                Object object;
                this.z.add(czt2);
                ds ds2 = this.e();
                czt2.a.a(ds2);
                if (!this.d.bY().d()) {
                    czt2.a.a(new qx(this.d.bW(), this.d.bY(), true));
                }
                boolean bl2 = this.u;
                if (this.d instanceof bga) {
                    object = (dfm[])((bga)this.d).bs();
                    Collection collection = ((abh)object).b();
                    if (!collection.isEmpty()) {
                        czt2.a.a(new cl(this.d.bW(), collection));
                    }
                    if (((bga)this.d).bL()) {
                        bl2 = true;
                    }
                }
                this.n = this.d.aX;
                this.o = this.d.aY;
                this.p = this.d.aZ;
                if (bl2 && !(ds2 instanceof bvv)) {
                    czt2.a.a(new gi(this.d.bW(), this.d.aX, this.d.aY, this.d.aZ));
                }
                if (this.d instanceof bga) {
                    object = dfm.values();
                    int n2 = ((dfm[])object).length;
                    for (int i2 = 0; i2 < n2; ++i2) {
                        Object object2 = object[i2];
                        bhl bhl2 = ((bga)this.d).a((dfm)((Object)object2));
                        if (bhl2 == null) continue;
                        czt2.a.a(new aey(this.d.bW(), (dfm)((Object)object2), bhl2));
                    }
                }
                if (this.d instanceof bdl && ((bdl)(object = (bdl)this.d)).H_()) {
                    czt2.a.a(new bjj((bdl)object, new cmz(this.d)));
                }
                if (this.d instanceof bga) {
                    object = (bga)this.d;
                    for (cko cko2 : ((bga)object).bf()) {
                        czt2.a.a(new bbk(this.d.bW(), cko2));
                    }
                }
                this.d.b(czt2);
                czt2.v(this.d);
            }
        } else if (this.z.contains(czt2)) {
            this.z.remove(czt2);
            this.d.c(czt2);
            czt2.u(this.d);
        }
    }

    public boolean c(czt czt2) {
        double d2 = czt2.aU - (double)this.h / 4096.0;
        double d3 = czt2.aW - (double)this.j / 4096.0;
        int n2 = Math.min(this.e, this.f);
        return d2 >= (double)(-n2) && d2 <= (double)n2 && d3 >= (double)(-n2) && d3 <= (double)n2 && this.d.a(czt2);
    }

    private boolean e(czt czt2) {
        return czt2.bS().ag().a(czt2, this.d.bH, this.d.bJ);
    }

    public void b(List list) {
        for (int i2 = 0; i2 < list.size(); ++i2) {
            this.b((czt)list.get(i2));
        }
    }

    private ds e() {
        if (this.d.bk) {
            c.f("Fetching addPacket for removed entity");
        }
        if (this.d instanceof er) {
            return new azj(this.d, 2, 1);
        }
        if (this.d instanceof czt) {
            return new hb((bdl)this.d);
        }
        if (this.d instanceof cef) {
            cef cef2 = (cef)this.d;
            return new azj(this.d, 10, cef2.bd_().a());
        }
        if (this.d instanceof cor) {
            return new azj(this.d, 1);
        }
        if (this.d instanceof cjl) {
            this.m = cmk.d(this.d.bA() * 256.0f / 360.0f);
            return new bvv((bga)this.d);
        }
        if (this.d instanceof cvo) {
            bdl bdl2 = ((cvo)this.d).a;
            return new azj(this.d, 90, bdl2 != null ? bdl2.bW() : this.d.bW());
        }
        if (this.d instanceof bno) {
            cpk cpk2 = ((bno)this.d).e;
            return new azj(this.d, 91, 1 + (cpk2 != null ? cpk2.bW() : this.d.bW()));
        }
        if (this.d instanceof bib) {
            cpk cpk3 = ((cwt)this.d).e;
            return new azj(this.d, 60, 1 + (cpk3 != null ? cpk3.bW() : this.d.bW()));
        }
        if (this.d instanceof bef) {
            return new azj(this.d, 61);
        }
        if (this.d instanceof tp) {
            return new azj(this.d, 73);
        }
        if (this.d instanceof bgc) {
            return new azj(this.d, 75);
        }
        if (this.d instanceof ddg) {
            return new azj(this.d, 65);
        }
        if (this.d instanceof cnd) {
            return new azj(this.d, 72);
        }
        if (this.d instanceof p) {
            return new azj(this.d, 76);
        }
        if (this.d instanceof chw) {
            chw chw2 = (chw)this.d;
            azj azj2 = null;
            int n2 = 63;
            if (this.d instanceof bx) {
                n2 = 64;
            } else if (this.d instanceof ckd) {
                n2 = 93;
            } else if (this.d instanceof nm) {
                n2 = 66;
            }
            azj2 = chw2.a != null ? new azj(this.d, n2, ((chw)this.d).a.bW()) : new azj(this.d, n2, 0);
            azj2.a((int)(chw2.b * 8000.0));
            azj2.b((int)(chw2.c * 8000.0));
            azj2.c((int)(chw2.d * 8000.0));
            return azj2;
        }
        if (this.d instanceof dcg) {
            azj azj3 = new azj(this.d, 67, 0);
            azj3.a((int)(this.d.aX * 8000.0));
            azj3.b((int)(this.d.aY * 8000.0));
            azj3.c((int)(this.d.aZ * 8000.0));
            return azj3;
        }
        if (this.d instanceof xe) {
            return new azj(this.d, 62);
        }
        if (this.d instanceof cgg) {
            return new azj(this.d, 50);
        }
        if (this.d instanceof abi) {
            return new azj(this.d, 51);
        }
        if (this.d instanceof azb) {
            azb azb2 = (azb)this.d;
            return new azj(this.d, 70, bfa.u(azb2.r()));
        }
        if (this.d instanceof bdi) {
            return new azj(this.d, 78);
        }
        if (this.d instanceof cbk) {
            return new bz((cbk)this.d);
        }
        if (this.d instanceof cvr) {
            cvr cvr2 = (cvr)this.d;
            return new azj(this.d, 71, cvr2.b.c(), cvr2.p());
        }
        if (this.d instanceof ahe) {
            ahe ahe2 = (ahe)this.d;
            return new azj(this.d, 77, 0, ahe2.p());
        }
        if (this.d instanceof cvs) {
            return new bbv((cvs)this.d);
        }
        if (this.d instanceof gw) {
            return new azj(this.d, 3);
        }
        throw new IllegalArgumentException("Don't know how to add " + this.d.getClass() + "!");
    }

    public void d(czt czt2) {
        if (this.z.contains(czt2)) {
            this.z.remove(czt2);
            this.d.c(czt2);
            czt2.u(this.d);
        }
    }

    public cpk b() {
        return this.d;
    }

    public void a(int n2) {
        this.f = n2;
    }

    public void c() {
        this.t = false;
    }
}

