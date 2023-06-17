/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;

public class cor
extends cpk {
    private static final bcz a = bwm.a(cor.class, cbf.b);
    private static final bcz b = bwm.a(cor.class, cbf.b);
    private static final bcz c = bwm.a(cor.class, cbf.c);
    private static final bcz d = bwm.a(cor.class, cbf.b);
    private static final bcz[] e = new bcz[]{bwm.a(cor.class, cbf.h), bwm.a(cor.class, cbf.h)};
    private final float[] f = new float[2];
    private float g;
    private float h;
    private float i;
    private int j;
    private double k;
    private double l;
    private double m;
    private double n;
    private double o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private double t;
    private float u;
    private gz v;
    private gz w;
    private double x;

    public cor(iu iu2) {
        super(iu2);
        this.aN = true;
        this.a_(1.375f, 0.5625f);
    }

    public cor(iu iu2, double d2, double d3, double d4) {
        this(iu2);
        this.d(d2, d3, d4);
        this.aX = 0.0;
        this.aY = 0.0;
        this.aZ = 0.0;
        this.aR = d2;
        this.aS = d3;
        this.aT = d4;
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    protected void a() {
        this.bE.a(a, 0);
        this.bE.a(b, 1);
        this.bE.a(c, Float.valueOf(0.0f));
        this.bE.a(d, cns.a.ordinal());
        for (bcz bcz2 : e) {
            this.bE.a(bcz2, false);
        }
    }

    @Override
    public cxt a_(cpk cpk2) {
        return cpk2.cD();
    }

    @Override
    public cxt ao_() {
        return this.cD();
    }

    @Override
    public boolean P() {
        return true;
    }

    @Override
    public double ag() {
        return -0.1;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        boolean bl2;
        if (this.c(ahy2)) {
            return false;
        }
        if (this.aQ.C || this.bk) {
            return true;
        }
        if (ahy2 instanceof ace && ahy2.b() != null && this.r(ahy2.b())) {
            return false;
        }
        this.e(-this.E());
        this.d(10);
        this.c(this.B() + f2 * 10.0f);
        this.bz();
        boolean bl3 = bl2 = ahy2.b() instanceof bdl && ((bdl)ahy2.b()).G.d;
        if (bl2 || this.B() > 40.0f) {
            if (!bl2 && this.aQ.F().b("doEntityDrops")) {
                this.a(this.n(), 1, 0.0f);
            }
            this.ak_();
        }
        return true;
    }

    @Override
    public void e_(cpk cpk2) {
        if (cpk2 instanceof cor) {
            if (cpk2.cD().b < this.cD().e) {
                super.e_(cpk2);
            }
        } else if (cpk2.cD().b <= this.cD().b) {
            super.e_(cpk2);
        }
    }

    public azg n() {
        switch (this.H()) {
            default: {
                return hp.aG;
            }
            case b: {
                return hp.aH;
            }
            case c: {
                return hp.aI;
            }
            case d: {
                return hp.aJ;
            }
            case e: {
                return hp.aK;
            }
            case f: 
        }
        return hp.aL;
    }

    @Override
    public void bk() {
        this.e(-this.E());
        this.d(10);
        this.c(this.B() * 11.0f);
    }

    @Override
    public boolean bc_() {
        return !this.bk;
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        this.k = d2;
        this.l = d3;
        this.m = d4;
        this.n = f2;
        this.o = f3;
        this.j = 10;
    }

    @Override
    public bqk L_() {
        return this.B_().f();
    }

    @Override
    public void bb_() {
        this.w = this.v;
        this.v = this.J();
        this.h = this.v == gz.b || this.v == gz.c ? (this.h += 1.0f) : 0.0f;
        if (!this.aQ.C && this.h >= 60.0f) {
            this.cl();
        }
        if (this.C() > 0) {
            this.d(this.C() - 1);
        }
        if (this.B() > 0.0f) {
            this.c(this.B() - 1.0f);
        }
        this.aR = this.aU;
        this.aS = this.aV;
        this.aT = this.aW;
        super.bb_();
        this.I();
        if (this.cK()) {
            if (this.cH().size() == 0 || !(this.cH().get(0) instanceof bdl)) {
                this.a(false, false);
            }
            this.O();
            if (this.aQ.C) {
                this.Q();
                this.aQ.a(new bpd(this.c(0), this.c(1)));
            }
            this.b(this.aX, this.aY, this.aZ);
        } else {
            this.aX = 0.0;
            this.aY = 0.0;
            this.aZ = 0.0;
        }
        for (int i2 = 0; i2 <= 1; ++i2) {
            if (this.c(i2)) {
                int n2 = i2;
                this.f[n2] = (float)((double)this.f[n2] + 0.01);
                continue;
            }
            this.f[i2] = 0.0f;
        }
        this.cd();
        List list = this.aQ.a((cpk)this, this.cD().b((double)0.2f, -0.01f, 0.2f), auxx.a(this));
        if (!list.isEmpty()) {
            boolean bl2 = !this.aQ.C && !(this.aj() instanceof bdl);
            for (int i3 = 0; i3 < list.size(); ++i3) {
                cpk cpk2 = (cpk)list.get(i3);
                if (cpk2.r(this)) continue;
                if (bl2 && this.cH().size() < 2 && !cpk2.cp() && cpk2.bl < this.bl && cpk2 instanceof bga && !(cpk2 instanceof ev) && !(cpk2 instanceof bdl)) {
                    cpk2.m(this);
                    continue;
                }
                this.e_(cpk2);
            }
        }
    }

    private void I() {
        if (this.j <= 0 || this.cK()) {
            return;
        }
        double d2 = this.aU + (this.k - this.aU) / (double)this.j;
        double d3 = this.aV + (this.l - this.aV) / (double)this.j;
        double d4 = this.aW + (this.m - this.aW) / (double)this.j;
        double d5 = cmk.g(this.n - (double)this.ba);
        this.ba = (float)((double)this.ba + d5 / (double)this.j);
        this.bb = (float)((double)this.bb + (this.o - (double)this.bb) / (double)this.j);
        --this.j;
        this.d(d2, d3, d4);
        this.e(this.ba, this.bb);
    }

    public void a(boolean bl2, boolean bl3) {
        this.bE.b(e[0], bl2);
        this.bE.b(e[1], bl3);
    }

    public float a(int n2, float f2) {
        if (this.c(n2)) {
            return (float)cmk.b((double)this.f[n2] - 0.01, (double)this.f[n2], (double)f2);
        }
        return 0.0f;
    }

    private gz J() {
        gz gz2 = this.M();
        if (gz2 != null) {
            this.t = this.cD().e;
            return gz2;
        }
        if (this.K()) {
            return gz.a;
        }
        float f2 = this.w();
        if (f2 > 0.0f) {
            this.u = f2;
            return gz.d;
        }
        return gz.e;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public float p() {
        cxt cxt2 = this.cD();
        int n2 = cmk.c(cxt2.a);
        int n3 = cmk.f(cxt2.d);
        int n4 = cmk.c(cxt2.e);
        int n5 = cmk.f(cxt2.e - this.x);
        int n6 = cmk.c(cxt2.c);
        int n7 = cmk.f(cxt2.f);
        bjb bjb2 = bjb.e();
        try {
            block4: for (int i2 = n4; i2 < n5; ++i2) {
                float f2 = 0.0f;
                for (int i3 = n2; i3 < n3; ++i3) {
                    for (int i4 = n6; i4 < n7; ++i4) {
                        bjb2.c(i3, i2, i4);
                        dbk dbk2 = this.aQ.n(bjb2);
                        if (dbk2.a() == ahk.h) {
                            f2 = Math.max(f2, cor.a(dbk2, this.aQ, bjb2));
                        }
                        if (f2 >= 1.0f) continue block4;
                    }
                }
                if (!(f2 < 1.0f)) continue;
                float f3 = (float)bjb2.b() + f2;
                return f3;
            }
            float f4 = n5 + 1;
            return f4;
        }
        finally {
            bjb2.f();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public float w() {
        cxt cxt2 = this.cD();
        cxt cxt3 = new cxt(cxt2.a, cxt2.b - 0.001, cxt2.c, cxt2.d, cxt2.b, cxt2.f);
        int n2 = cmk.c(cxt3.a) - 1;
        int n3 = cmk.f(cxt3.d) + 1;
        int n4 = cmk.c(cxt3.b) - 1;
        int n5 = cmk.f(cxt3.e) + 1;
        int n6 = cmk.c(cxt3.c) - 1;
        int n7 = cmk.f(cxt3.f) + 1;
        ArrayList arrayList = ov.a();
        float f2 = 0.0f;
        int n8 = 0;
        bjb bjb2 = bjb.e();
        try {
            for (int i2 = n2; i2 < n3; ++i2) {
                for (int i3 = n6; i3 < n7; ++i3) {
                    int n9 = (i2 == n2 || i2 == n3 - 1 ? 1 : 0) + (i3 == n6 || i3 == n7 - 1 ? 1 : 0);
                    if (n9 == 2) continue;
                    for (int i4 = n4; i4 < n5; ++i4) {
                        if (n9 > 0 && (i4 == n4 || i4 == n5 - 1)) continue;
                        bjb2.c(i2, i4, i3);
                        dbk dbk2 = this.aQ.n(bjb2);
                        dbk2.a(this.aQ, bjb2, cxt3, arrayList, this);
                        if (!arrayList.isEmpty()) {
                            f2 += dbk2.t().N;
                            ++n8;
                        }
                        arrayList.clear();
                    }
                }
            }
        }
        finally {
            bjb2.f();
        }
        return f2 / (float)n8;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean K() {
        cxt cxt2 = this.cD();
        int n2 = cmk.c(cxt2.a);
        int n3 = cmk.f(cxt2.d);
        int n4 = cmk.c(cxt2.b);
        int n5 = cmk.f(cxt2.b + 0.001);
        int n6 = cmk.c(cxt2.c);
        int n7 = cmk.f(cxt2.f);
        boolean bl2 = false;
        this.t = Double.MIN_VALUE;
        bjb bjb2 = bjb.e();
        try {
            for (int i2 = n2; i2 < n3; ++i2) {
                for (int i3 = n4; i3 < n5; ++i3) {
                    for (int i4 = n6; i4 < n7; ++i4) {
                        bjb2.c(i2, i3, i4);
                        dbk dbk2 = this.aQ.n(bjb2);
                        if (dbk2.a() != ahk.h) continue;
                        float f2 = cor.b(dbk2, this.aQ, bjb2);
                        this.t = Math.max((double)f2, this.t);
                        bl2 |= cxt2.b < (double)f2;
                    }
                }
            }
        }
        finally {
            bjb2.f();
        }
        return bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private gz M() {
        cxt cxt2 = this.cD();
        double d2 = cxt2.e + 0.001;
        int n2 = cmk.c(cxt2.a);
        int n3 = cmk.f(cxt2.d);
        int n4 = cmk.c(cxt2.e);
        int n5 = cmk.f(d2);
        int n6 = cmk.c(cxt2.c);
        int n7 = cmk.f(cxt2.f);
        boolean bl2 = false;
        bjb bjb2 = bjb.e();
        try {
            for (int i2 = n2; i2 < n3; ++i2) {
                for (int i3 = n4; i3 < n5; ++i3) {
                    for (int i4 = n6; i4 < n7; ++i4) {
                        bjb2.c(i2, i3, i4);
                        dbk dbk2 = this.aQ.n(bjb2);
                        if (dbk2.a() != ahk.h || !(d2 < (double)cor.b(dbk2, this.aQ, bjb2))) continue;
                        if ((Integer)dbk2.b(en.a) == 0) {
                            bl2 = true;
                            continue;
                        }
                        gz gz2 = gz.c;
                        return gz2;
                    }
                }
            }
        }
        finally {
            bjb2.f();
        }
        return bl2 ? gz.b : null;
    }

    public static float a(dbk dbk2, bnj bnj2, cmz cmz2) {
        int n2 = (Integer)dbk2.b(en.a);
        if ((n2 & 7) == 0 && bnj2.n(cmz2.g()).a() == ahk.h) {
            return 1.0f;
        }
        return 1.0f - en.b(n2);
    }

    public static float b(dbk dbk2, bnj bnj2, cmz cmz2) {
        return (float)cmz2.b() + cor.a(dbk2, bnj2, cmz2);
    }

    private void O() {
        double d2 = -0.04f;
        double d3 = this.cf() ? 0.0 : (double)-0.04f;
        double d4 = 0.0;
        this.g = 0.05f;
        if (this.w == gz.e && this.v != gz.e && this.v != gz.d) {
            this.t = this.cD().b + (double)this.bm;
            this.d(this.aU, (double)(this.p() - this.bm) + 0.101, this.aW);
            this.aY = 0.0;
            this.x = 0.0;
            this.v = gz.a;
        } else {
            if (this.v == gz.a) {
                d4 = (this.t - this.cD().b) / (double)this.bm;
                this.g = 0.9f;
            } else if (this.v == gz.c) {
                d3 = -7.0E-4;
                this.g = 0.9f;
            } else if (this.v == gz.b) {
                d4 = 0.01f;
                this.g = 0.45f;
            } else if (this.v == gz.e) {
                this.g = 0.9f;
            } else if (this.v == gz.d) {
                this.g = this.u;
                if (this.aj() instanceof bdl) {
                    this.u /= 2.0f;
                }
            }
            this.aX *= (double)this.g;
            this.aZ *= (double)this.g;
            this.i *= this.g;
            this.aY += d3;
            if (d4 > 0.0) {
                double d5 = 0.65;
                this.aY += d4 * 0.06153846016296973;
                double d6 = 0.75;
                this.aY *= 0.75;
            }
        }
    }

    private void Q() {
        if (!this.cq()) {
            return;
        }
        float f2 = 0.0f;
        if (this.p) {
            this.i += -1.0f;
        }
        if (this.q) {
            this.i += 1.0f;
        }
        if (this.q != this.p && !this.r && !this.s) {
            f2 += 0.005f;
        }
        this.ba += this.i;
        if (this.r) {
            f2 += 0.04f;
        }
        if (this.s) {
            f2 -= 0.005f;
        }
        this.aX += (double)(cmk.a(-this.ba * ((float)Math.PI / 180)) * f2);
        this.aZ += (double)(cmk.b(this.ba * ((float)Math.PI / 180)) * f2);
        this.a(this.q || this.r, this.p || this.r);
    }

    @Override
    public void c(cpk cpk2) {
        if (!this.r(cpk2)) {
            return;
        }
        float f2 = 0.0f;
        float f3 = (float)((this.bk ? (double)0.01f : this.ag()) + cpk2.Z_());
        if (this.cH().size() > 1) {
            int n2 = this.cH().indexOf(cpk2);
            f2 = n2 == 0 ? 0.2f : -0.6f;
            if (cpk2 instanceof cxn) {
                f2 = (float)((double)f2 + 0.2);
            }
        }
        amj amj2 = new amj(f2, 0.0, 0.0).b(-this.ba * ((float)Math.PI / 180) - 1.5707964f);
        cpk2.d(this.aU + amj2.b, this.aV + (double)f3, this.aW + amj2.d);
        cpk2.ba += this.i;
        cpk2.n(cpk2.bA() + this.i);
        this.h(cpk2);
        if (cpk2 instanceof cxn && this.cH().size() > 1) {
            int n3 = cpk2.bW() % 2 == 0 ? 90 : 270;
            cpk2.o(((cxn)cpk2).ah + (float)n3);
            cpk2.n(cpk2.bA() + (float)n3);
        }
    }

    protected void h(cpk cpk2) {
        cpk2.o(this.ba);
        float f2 = cmk.g(cpk2.ba - this.ba);
        float f3 = cmk.a(f2, -105.0f, 105.0f);
        cpk2.bc += f3 - f2;
        cpk2.ba += f3 - f2;
        cpk2.n(cpk2.ba);
    }

    @Override
    public void b_(cpk cpk2) {
        this.h(cpk2);
    }

    @Override
    protected void a(bvp bvp2) {
        bvp2.a("Type", this.H().a());
    }

    @Override
    protected void b(bvp bvp2) {
        if (bvp2.b("Type", 8)) {
            this.a(cns.a(bvp2.l("Type")));
        }
    }

    @Override
    public boolean a(bdl bdl2, bhl bhl2, bqp bqp2) {
        if (!this.aQ.C && !bdl2.ar_() && this.h < 60.0f) {
            bdl2.m(this);
        }
        return true;
    }

    @Override
    protected void a(double d2, boolean bl2, dbk dbk2, cmz cmz2) {
        this.x = this.aY;
        if (this.cp()) {
            return;
        }
        if (bl2) {
            if (this.bq > 3.0f) {
                if (this.v != gz.d) {
                    this.bq = 0.0f;
                    return;
                }
                this.a(this.bq, 1.0f);
                if (!this.aQ.C && !this.bk) {
                    this.ak_();
                    if (this.aQ.F().b("doEntityDrops")) {
                        int n2;
                        for (n2 = 0; n2 < 3; ++n2) {
                            this.a(new bhl(azg.a(blg.f), 1, this.H().b()), 0.0f);
                        }
                        for (n2 = 0; n2 < 2; ++n2) {
                            this.a(hp.A, 1, 0.0f);
                        }
                    }
                }
            }
            this.bq = 0.0f;
        } else if (this.aQ.n(new cmz(this).h()).a() != ahk.h && d2 < 0.0) {
            this.bq = (float)((double)this.bq - d2);
        }
    }

    public boolean c(int n2) {
        return (Boolean)this.bE.a(e[n2]) != false && this.aj() != null;
    }

    public void c(float f2) {
        this.bE.b(c, Float.valueOf(f2));
    }

    public float B() {
        return ((Float)this.bE.a(c)).floatValue();
    }

    public void d(int n2) {
        this.bE.b(a, n2);
    }

    public int C() {
        return (Integer)this.bE.a(a);
    }

    public void e(int n2) {
        this.bE.b(b, n2);
    }

    public int E() {
        return (Integer)this.bE.a(b);
    }

    public void a(cns cns2) {
        this.bE.b(d, cns2.ordinal());
    }

    public cns H() {
        return cns.a((Integer)this.bE.a(d));
    }

    @Override
    protected boolean c_(cpk cpk2) {
        return this.cH().size() < 2;
    }

    @Override
    public cpk aj() {
        List list = this.cH();
        return list.isEmpty() ? null : (cpk)list.get(0);
    }

    public void a(boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this.p = bl2;
        this.q = bl3;
        this.r = bl4;
        this.s = bl5;
    }
}

