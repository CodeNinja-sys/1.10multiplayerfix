/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class bdm
extends ajt
implements avf,
tb {
    private bhl[] o = new bhl[27];
    public boolean c;
    public bdm d;
    public bdm e;
    public bdm f;
    public bdm g;
    public float h;
    public float i;
    public int j;
    private int p;
    private asr q;
    private String r;

    public bdm() {
    }

    public bdm(asr asr2) {
        this.q = asr2;
    }

    @Override
    public int aI_() {
        return 27;
    }

    @Override
    public bhl a(int n2) {
        this.d((bdl)null);
        return this.o[n2];
    }

    @Override
    public bhl a(int n2, int n3) {
        this.d((bdl)null);
        bhl bhl2 = cjk.a(this.o, n2, n3);
        if (bhl2 != null) {
            this.c_();
        }
        return bhl2;
    }

    @Override
    public bhl b(int n2) {
        this.d((bdl)null);
        return cjk.a(this.o, n2);
    }

    @Override
    public void a(int n2, bhl bhl2) {
        this.d((bdl)null);
        this.o[n2] = bhl2;
        if (bhl2 != null && bhl2.b > this.d()) {
            bhl2.b = this.d();
        }
        this.c_();
    }

    @Override
    public String i_() {
        return this.j_() ? this.r : "container.chest";
    }

    @Override
    public boolean j_() {
        return this.r != null && !this.r.isEmpty();
    }

    public void a(String string) {
        this.r = string;
    }

    public static void a(cgy cgy2) {
        cgy2.a(bst.d, (cui)new ml("Chest", new String[]{"Items"}));
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.o = new bhl[this.aI_()];
        if (bvp2.b("CustomName", 8)) {
            this.r = bvp2.l("CustomName");
        }
        if (!this.c(bvp2)) {
            bmh bmh2 = bvp2.c("Items", 10);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                bvp bvp3 = bmh2.b(i2);
                int n2 = bvp3.f("Slot") & 0xFF;
                if (n2 < 0 || n2 >= this.o.length) continue;
                this.o[n2] = bhl.a(bvp3);
            }
        }
    }

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        if (!this.d(bvp2)) {
            bmh bmh2 = new bmh();
            for (int i2 = 0; i2 < this.o.length; ++i2) {
                if (this.o[i2] == null) continue;
                bvp bvp3 = new bvp();
                bvp3.a("Slot", (byte)i2);
                this.o[i2].b(bvp3);
                bmh2.a(bvp3);
            }
            bvp2.a("Items", bmh2);
        }
        if (this.j_()) {
            bvp2.a("CustomName", this.r);
        }
        return bvp2;
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public boolean a(bdl bdl2) {
        if (this.k.q(this.l) != this) {
            return false;
        }
        return !(bdl2.i((double)this.l.a() + 0.5, (double)this.l.b() + 0.5, (double)this.l.c() + 0.5) > 64.0);
    }

    @Override
    public void g_() {
        super.g_();
        this.c = false;
    }

    private void a(bdm bdm2, bqk bqk2) {
        if (bdm2.A()) {
            this.c = false;
        } else if (this.c) {
            switch (bqk2) {
                case c: {
                    if (this.d == bdm2) break;
                    this.c = false;
                    break;
                }
                case d: {
                    if (this.g == bdm2) break;
                    this.c = false;
                    break;
                }
                case f: {
                    if (this.e == bdm2) break;
                    this.c = false;
                    break;
                }
                case e: {
                    if (this.f == bdm2) break;
                    this.c = false;
                }
            }
        }
    }

    public void k() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.f = this.a(bqk.e);
        this.e = this.a(bqk.f);
        this.d = this.a(bqk.c);
        this.g = this.a(bqk.d);
    }

    protected bdm a(bqk bqk2) {
        bql bql2;
        cmz cmz2 = this.l.c(bqk2);
        if (this.a(cmz2) && (bql2 = this.k.q(cmz2)) instanceof bdm) {
            bdm bdm2 = (bdm)bql2;
            bdm2.a(this, bqk2.e());
            return bdm2;
        }
        return null;
    }

    private boolean a(cmz cmz2) {
        if (this.k == null) {
            return false;
        }
        bfa bfa2 = this.k.n(cmz2).t();
        return bfa2 instanceof aqi && ((aqi)bfa2).g == this.o();
    }

    @Override
    public void a() {
        float f2;
        this.k();
        int n2 = this.l.a();
        int n3 = this.l.b();
        int n4 = this.l.c();
        ++this.p;
        if (!this.k.C && this.j != 0 && (this.p + n2 + n3 + n4) % 200 == 0) {
            this.j = 0;
            f2 = 5.0f;
            List list = this.k.a(bdl.class, new cxt((float)n2 - 5.0f, (float)n3 - 5.0f, (float)n4 - 5.0f, (float)(n2 + 1) + 5.0f, (float)(n3 + 1) + 5.0f, (float)(n4 + 1) + 5.0f));
            for (bdl bdl2 : list) {
                tb tb2;
                if (!(bdl2.p instanceof cnx) || (tb2 = ((cnx)bdl2.p).b()) != this && (!(tb2 instanceof ayf) || !((ayf)tb2).a(this))) continue;
                ++this.j;
            }
        }
        this.i = this.h;
        f2 = 0.1f;
        if (this.j > 0 && this.h == 0.0f && this.d == null && this.f == null) {
            double d2 = (double)n2 + 0.5;
            double d3 = (double)n4 + 0.5;
            if (this.g != null) {
                d3 += 0.5;
            }
            if (this.e != null) {
                d2 += 0.5;
            }
            this.k.a(null, d2, (double)n3 + 0.5, d3, dah.X, csg.e, 0.5f, this.k.p.nextFloat() * 0.1f + 0.9f);
        }
        if (this.j == 0 && this.h > 0.0f || this.j > 0 && this.h < 1.0f) {
            float f3 = this.h;
            this.h = this.j > 0 ? (this.h += 0.1f) : (this.h -= 0.1f);
            if (this.h > 1.0f) {
                this.h = 1.0f;
            }
            float f4 = 0.5f;
            if (this.h < 0.5f && f3 >= 0.5f && this.d == null && this.f == null) {
                double d4 = (double)n2 + 0.5;
                double d5 = (double)n4 + 0.5;
                if (this.g != null) {
                    d5 += 0.5;
                }
                if (this.e != null) {
                    d4 += 0.5;
                }
                this.k.a(null, d4, (double)n3 + 0.5, d5, dah.V, csg.e, 0.5f, this.k.p.nextFloat() * 0.1f + 0.9f);
            }
            if (this.h < 0.0f) {
                this.h = 0.0f;
            }
        }
    }

    @Override
    public boolean a_(int n2, int n3) {
        if (n2 == 1) {
            this.j = n3;
            return true;
        }
        return super.a_(n2, n3);
    }

    @Override
    public void b(bdl bdl2) {
        if (!bdl2.aL()) {
            if (this.j < 0) {
                this.j = 0;
            }
            ++this.j;
            this.k.c(this.l, this.z(), 1, this.j);
            this.k.b(this.l, this.z());
            this.k.b(this.l.h(), this.z());
        }
    }

    @Override
    public void c(bdl bdl2) {
        if (!bdl2.aL() && this.z() instanceof aqi) {
            --this.j;
            this.k.c(this.l, this.z(), 1, this.j);
            this.k.b(this.l, this.z());
            this.k.b(this.l.h(), this.z());
        }
    }

    @Override
    public boolean b(int n2, bhl bhl2) {
        return true;
    }

    @Override
    public void e_() {
        super.e_();
        this.g_();
        this.k();
    }

    public asr o() {
        if (this.q == null) {
            if (this.k != null && this.z() instanceof aqi) {
                this.q = ((aqi)this.z()).g;
            } else {
                return asr.a;
            }
        }
        return this.q;
    }

    @Override
    public String n() {
        return "minecraft:chest";
    }

    @Override
    public apq a(cps cps2, bdl bdl2) {
        this.d(bdl2);
        return new cnx(cps2, this, bdl2);
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public void g() {
        this.d((bdl)null);
        for (int i2 = 0; i2 < this.o.length; ++i2) {
            this.o[i2] = null;
        }
    }
}

