/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.b.ag;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dx;
import org.lwjgl.util.a.j;

public class cwz
implements aoi {
    private static final d e = org.apache.logging.log4j.c.c();
    private static final bpx f = new bpx("textures/environment/rain.png");
    private static final bpx g = new bpx("textures/environment/snow.png");
    public static boolean a;
    public static int b;
    private final bxy h;
    private final akx i;
    private final Random j = new Random();
    private float k;
    public final ddx c;
    private final bte l;
    private int m;
    private cpk n;
    private final bza o = new bza();
    private final bza p = new bza();
    private final float q = 4.0f;
    private float r = 4.0f;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;
    private float A;
    private boolean B;
    private boolean C = true;
    private boolean D = true;
    private long E;
    private long F = bxy.K();
    private long G;
    private final cze H;
    private final int[] I;
    private final bpx J;
    private boolean K;
    private float L;
    private float M;
    private int N;
    private final float[] O = new float[1024];
    private final float[] P = new float[1024];
    private final FloatBuffer Q = avj.e(16);
    private float R;
    private float S;
    private float T;
    private float U;
    private float V;
    private int W;
    private boolean X;
    private double Y = 1.0;
    private double Z;
    private double aa;
    private bum ab;
    private static final bpx[] ac;
    public static final int d;
    private int ad = d;
    private boolean ae;
    private int af;

    public cwz(bxy bxy2, akx akx2) {
        this.h = bxy2;
        this.i = akx2;
        this.c = bxy2.af();
        this.l = new bte(bxy2.P());
        this.H = new cze(16, 16);
        this.J = bxy2.P().a("lightMap", this.H);
        this.I = this.H.c();
        this.ab = null;
        for (int i2 = 0; i2 < 32; ++i2) {
            for (int i3 = 0; i3 < 32; ++i3) {
                float f2 = i3 - 16;
                float f3 = i2 - 16;
                float f4 = cmk.c(f2 * f2 + f3 * f3);
                this.O[i2 << 5 | i3] = -f3 / f4;
                this.P[i2 << 5 | i3] = f2 / f4;
            }
        }
    }

    public boolean a() {
        return cjg.O && this.ab != null;
    }

    public void b() {
        if (this.ab != null) {
            this.ab.a();
        }
        this.ab = null;
        this.ad = d;
    }

    public void c() {
        this.ae = !this.ae;
    }

    public void a(cpk cpk2) {
        if (!cjg.O) {
            return;
        }
        if (this.ab != null) {
            this.ab.a();
        }
        this.ab = null;
        if (cpk2 instanceof ddh) {
            this.a(new bpx("shaders/post/creeper.json"));
        } else if (cpk2 instanceof yi) {
            this.a(new bpx("shaders/post/spider.json"));
        } else if (cpk2 instanceof bgv) {
            this.a(new bpx("shaders/post/invert.json"));
        }
    }

    private void a(bpx bpx2) {
        try {
            this.ab = new bum(this.h.P(), this.i, this.h.c(), bpx2);
            this.ab.a(this.h.d, this.h.e);
            this.ae = true;
        }
        catch (IOException iOException) {
            e.f("Failed to load shader: {}", bpx2, iOException);
            this.ad = d;
            this.ae = false;
        }
        catch (ag ag2) {
            e.f("Failed to load shader: {}", bpx2, ag2);
            this.ad = d;
            this.ae = false;
        }
    }

    @Override
    public void a(akx akx2) {
        if (this.ab != null) {
            this.ab.a();
        }
        this.ab = null;
        if (this.ad == d) {
            this.a(this.h.ab());
        } else {
            this.a(ac[this.ad]);
        }
    }

    public void d() {
        float f2;
        float f3;
        if (cjg.O && sj.b() == null) {
            sj.a();
        }
        this.j();
        this.k();
        this.U = this.V;
        this.r = 4.0f;
        if (this.h.u.ax) {
            f3 = this.h.u.b * 0.6f + 0.2f;
            f2 = f3 * f3 * f3 * 8.0f;
            this.u = this.o.a(this.s, 0.05f * f2);
            this.v = this.p.a(this.t, 0.05f * f2);
            this.w = 0.0f;
            this.s = 0.0f;
            this.t = 0.0f;
        } else {
            this.u = 0.0f;
            this.v = 0.0f;
            this.o.a();
            this.p.a();
        }
        if (this.h.ab() == null) {
            this.h.a(this.h.h);
        }
        f3 = this.h.f.m(new cmz(this.h.ab()));
        f2 = (float)this.h.u.d / 32.0f;
        float f4 = f3 * (1.0f - f2) + f2;
        this.V += (f4 - this.V) * 0.1f;
        ++this.m;
        this.c.a();
        this.n();
        this.A = this.z;
        if (this.h.r.i().d()) {
            this.z += 0.05f;
            if (this.z > 1.0f) {
                this.z = 1.0f;
            }
        } else if (this.z > 0.0f) {
            this.z -= 0.0125f;
        }
    }

    public bum e() {
        return this.ab;
    }

    public void a(int n2, int n3) {
        if (!cjg.O) {
            return;
        }
        if (this.ab != null) {
            this.ab.a(n2, n3);
        }
        this.h.g.a(n2, n3);
    }

    public void a(float f2) {
        cpk cpk2 = this.h.ab();
        if (cpk2 == null) {
            return;
        }
        if (this.h.f == null) {
            return;
        }
        this.h.B.a("pick");
        this.h.i = null;
        double d2 = this.h.c.d();
        this.h.t = cpk2.a(d2, f2);
        amj amj2 = cpk2.q(f2);
        boolean bl2 = false;
        int n2 = 3;
        double d3 = d2;
        if (this.h.c.i()) {
            d2 = d3 = 6.0;
        } else {
            if (d3 > 3.0) {
                bl2 = true;
            }
            d2 = d3;
        }
        if (this.h.t != null) {
            d3 = this.h.t.c.f(amj2);
        }
        amj amj3 = cpk2.l(f2);
        amj amj4 = amj2.b(amj3.b * d2, amj3.c * d2, amj3.d * d2);
        this.n = null;
        amj amj5 = null;
        float f3 = 1.0f;
        List list = this.h.f.a(cpk2, cpk2.cD().a(amj3.b * d2, amj3.c * d2, amj3.d * d2).b(1.0, 1.0, 1.0), cn.a(auxx.e, (cm)new aqa(this)));
        double d4 = d3;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            double d5;
            cpk cpk3 = (cpk)list.get(i2);
            cxt cxt2 = cpk3.cD().b(cpk3.ap_());
            auu auu2 = cxt2.b(amj2, amj4);
            if (cxt2.a(amj2)) {
                if (!(d4 >= 0.0)) continue;
                this.n = cpk3;
                amj5 = auu2 == null ? amj2 : auu2.c;
                d4 = 0.0;
                continue;
            }
            if (auu2 == null || !((d5 = amj2.f(auu2.c)) < d4) && d4 != 0.0) continue;
            if (cpk3.cJ() == cpk2.cJ()) {
                if (d4 != 0.0) continue;
                this.n = cpk3;
                amj5 = auu2.c;
                continue;
            }
            this.n = cpk3;
            amj5 = auu2.c;
            d4 = d5;
        }
        if (this.n != null && bl2 && amj2.f(amj5) > 3.0) {
            this.n = null;
            this.h.t = new auu(bmw.a, amj5, null, new cmz(amj5));
        }
        if (this.n != null && (d4 < d3 || this.h.t == null)) {
            this.h.t = new auu(this.n, amj5);
            if (this.n instanceof bga || this.n instanceof cvr) {
                this.h.i = this.n;
            }
        }
        this.h.B.b();
    }

    private void j() {
        float f2 = 1.0f;
        if (this.h.ab() instanceof ciy) {
            ciy ciy2 = (ciy)this.h.ab();
            f2 = ciy2.bV();
        }
        this.y = this.x;
        this.x += (f2 - this.x) * 0.5f;
        if (this.x > 1.5f) {
            this.x = 1.5f;
        }
        if (this.x < 0.1f) {
            this.x = 0.1f;
        }
    }

    private float a(float f2, boolean bl2) {
        dbk dbk2;
        if (this.X) {
            return 90.0f;
        }
        cpk cpk2 = this.h.ab();
        float f3 = 70.0f;
        if (bl2) {
            f3 = this.h.u.az;
            f3 *= this.y + (this.x - this.y) * f2;
        }
        if (cpk2 instanceof bga && ((bga)cpk2).bh() <= 0.0f) {
            float f4 = (float)((bga)cpk2).V + f2;
            f3 /= (1.0f - 500.0f / (f4 + 500.0f)) * 2.0f + 1.0f;
        }
        if ((dbk2 = bsx.a(this.h.f, cpk2, f2)).a() == ahk.h) {
            f3 = f3 * 60.0f / 70.0f;
        }
        return f3;
    }

    private void d(float f2) {
        if (this.h.ab() instanceof bga) {
            float f3;
            bga bga2 = (bga)this.h.ab();
            float f4 = (float)bga2.S - f2;
            if (bga2.bh() <= 0.0f) {
                f3 = (float)bga2.V + f2;
                cja.b(40.0f - 8000.0f / (f3 + 200.0f), 0.0f, 0.0f, 1.0f);
            }
            if (f4 < 0.0f) {
                return;
            }
            f4 /= (float)bga2.T;
            f4 = cmk.a(f4 * f4 * f4 * f4 * (float)Math.PI);
            f3 = bga2.U;
            cja.b(-f3, 0.0f, 1.0f, 0.0f);
            cja.b(-f4 * 14.0f, 0.0f, 0.0f, 1.0f);
            cja.b(f3, 0.0f, 1.0f, 0.0f);
        }
    }

    private void e(float f2) {
        if (!(this.h.ab() instanceof bdl)) {
            return;
        }
        bdl bdl2 = (bdl)this.h.ab();
        float f3 = bdl2.bo - bdl2.bn;
        float f4 = -(bdl2.bo + f3 * f2);
        float f5 = bdl2.s + (bdl2.t - bdl2.s) * f2;
        float f6 = bdl2.ad + (bdl2.ae - bdl2.ad) * f2;
        cja.c(cmk.a(f4 * (float)Math.PI) * f5 * 0.5f, -Math.abs(cmk.b(f4 * (float)Math.PI) * f5), 0.0f);
        cja.b(cmk.a(f4 * (float)Math.PI) * f5 * 3.0f, 0.0f, 0.0f, 1.0f);
        cja.b(Math.abs(cmk.b(f4 * (float)Math.PI - 0.2f) * f5) * 5.0f, 1.0f, 0.0f, 0.0f);
        cja.b(f6, 1.0f, 0.0f, 0.0f);
    }

    private void f(float f2) {
        Object object;
        cpk cpk2 = this.h.ab();
        float f3 = cpk2.A();
        double d2 = cpk2.aR + (cpk2.aU - cpk2.aR) * (double)f2;
        double d3 = cpk2.aS + (cpk2.aV - cpk2.aS) * (double)f2 + (double)f3;
        double d4 = cpk2.aT + (cpk2.aW - cpk2.aT) * (double)f2;
        if (cpk2 instanceof bga && ((bga)cpk2).H_()) {
            f3 = (float)((double)f3 + 1.0);
            cja.c(0.0f, 0.3f, 0.0f);
            if (!this.h.u.ay) {
                object = new cmz(cpk2);
                dbk dbk2 = this.h.f.n((cmz)object);
                bfa bfa2 = dbk2.t();
                if (bfa2 == blg.C) {
                    int n2 = ((bqk)((Object)dbk2.b(dx.j))).c();
                    cja.b((float)(n2 * 90), 0.0f, 1.0f, 0.0f);
                }
                cja.b(cpk2.bc + (cpk2.ba - cpk2.bc) * f2 + 180.0f, 0.0f, -1.0f, 0.0f);
                cja.b(cpk2.bd + (cpk2.bb - cpk2.bd) * f2, -1.0f, 0.0f, 0.0f);
            }
        } else if (this.h.u.as > 0) {
            double d5 = this.r + (4.0f - this.r) * f2;
            if (this.h.u.ay) {
                cja.c(0.0f, 0.0f, (float)(-d5));
            } else {
                float f4 = cpk2.ba;
                float f5 = cpk2.bb;
                if (this.h.u.as == 2) {
                    f5 += 180.0f;
                }
                double d6 = (double)(-cmk.a(f4 * ((float)Math.PI / 180)) * cmk.b(f5 * ((float)Math.PI / 180))) * d5;
                double d7 = (double)(cmk.b(f4 * ((float)Math.PI / 180)) * cmk.b(f5 * ((float)Math.PI / 180))) * d5;
                double d8 = (double)(-cmk.a(f5 * ((float)Math.PI / 180))) * d5;
                for (int i2 = 0; i2 < 8; ++i2) {
                    double d9;
                    auu auu2;
                    float f6 = (i2 & 1) * 2 - 1;
                    float f7 = (i2 >> 1 & 1) * 2 - 1;
                    float f8 = (i2 >> 2 & 1) * 2 - 1;
                    if ((auu2 = this.h.f.a(new amj(d2 + (double)(f6 *= 0.1f), d3 + (double)(f7 *= 0.1f), d4 + (double)(f8 *= 0.1f)), new amj(d2 - d6 + (double)f6 + (double)f8, d3 - d8 + (double)f7, d4 - d7 + (double)f8))) == null || !((d9 = auu2.c.f(new amj(d2, d3, d4))) < d5)) continue;
                    d5 = d9;
                }
                if (this.h.u.as == 2) {
                    cja.b(180.0f, 0.0f, 1.0f, 0.0f);
                }
                cja.b(cpk2.bb - f5, 1.0f, 0.0f, 0.0f);
                cja.b(cpk2.ba - f4, 0.0f, 1.0f, 0.0f);
                cja.c(0.0f, 0.0f, (float)(-d5));
                cja.b(f4 - cpk2.ba, 0.0f, 1.0f, 0.0f);
                cja.b(f5 - cpk2.bb, 1.0f, 0.0f, 0.0f);
            }
        } else {
            cja.c(0.0f, 0.0f, 0.05f);
        }
        if (!this.h.u.ay) {
            cja.b(cpk2.bd + (cpk2.bb - cpk2.bd) * f2, 1.0f, 0.0f, 0.0f);
            if (cpk2 instanceof cxn) {
                object = (cxn)cpk2;
                cja.b(((cxn)object).ak + (((cxn)object).aj - ((cxn)object).ak) * f2 + 180.0f, 0.0f, 1.0f, 0.0f);
            } else {
                cja.b(cpk2.bc + (cpk2.ba - cpk2.bc) * f2 + 180.0f, 0.0f, 1.0f, 0.0f);
            }
        }
        cja.c(0.0f, -f3, 0.0f);
        d2 = cpk2.aR + (cpk2.aU - cpk2.aR) * (double)f2;
        d3 = cpk2.aS + (cpk2.aV - cpk2.aS) * (double)f2 + (double)f3;
        d4 = cpk2.aT + (cpk2.aW - cpk2.aT) * (double)f2;
        this.B = this.h.g.a(d2, d3, d4, f2);
    }

    private void a(float f2, int n2) {
        float f3;
        this.k = this.h.u.d * 16;
        cja.l(5889);
        cja.C();
        float f4 = 0.07f;
        if (this.h.u.f) {
            cja.c((float)(-(n2 * 2 - 1)) * 0.07f, 0.0f, 0.0f);
        }
        if (this.Y != 1.0) {
            cja.c((float)this.Z, (float)(-this.aa), 0.0f);
            cja.a(this.Y, this.Y, 1.0);
        }
        org.lwjgl.util.a.j.a(this.a(f2, true), (float)this.h.d / (float)this.h.e, 0.05f, this.k * cmk.a);
        cja.l(5888);
        cja.C();
        if (this.h.u.f) {
            cja.c((float)(n2 * 2 - 1) * 0.1f, 0.0f, 0.0f);
        }
        this.d(f2);
        if (this.h.u.e) {
            this.e(f2);
        }
        if ((f3 = this.h.h.k + (this.h.h.j - this.h.h.k) * f2) > 0.0f) {
            int n3 = 20;
            if (this.h.h.b(ake.i)) {
                n3 = 7;
            }
            float f5 = 5.0f / (f3 * f3 + 5.0f) - f3 * 0.04f;
            f5 *= f5;
            cja.b(((float)this.m + f2) * (float)n3, 0.0f, 1.0f, 1.0f);
            cja.b(1.0f / f5, 1.0f, 1.0f);
            cja.b(-((float)this.m + f2) * (float)n3, 0.0f, 1.0f, 1.0f);
        }
        this.f(f2);
        if (this.X) {
            switch (this.W) {
                case 0: {
                    cja.b(90.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 1: {
                    cja.b(180.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 2: {
                    cja.b(-90.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 3: {
                    cja.b(90.0f, 1.0f, 0.0f, 0.0f);
                    break;
                }
                case 4: {
                    cja.b(-90.0f, 1.0f, 0.0f, 0.0f);
                }
            }
        }
    }

    private void b(float f2, int n2) {
        boolean bl2;
        if (this.X) {
            return;
        }
        cja.l(5889);
        cja.C();
        float f3 = 0.07f;
        if (this.h.u.f) {
            cja.c((float)(-(n2 * 2 - 1)) * 0.07f, 0.0f, 0.0f);
        }
        org.lwjgl.util.a.j.a(this.a(f2, false), (float)this.h.d / (float)this.h.e, 0.05f, this.k * 2.0f);
        cja.l(5888);
        cja.C();
        if (this.h.u.f) {
            cja.c((float)(n2 * 2 - 1) * 0.1f, 0.0f, 0.0f);
        }
        cja.D();
        this.d(f2);
        if (this.h.u.e) {
            this.e(f2);
        }
        boolean bl3 = bl2 = this.h.ab() instanceof bga && ((bga)this.h.ab()).H_();
        if (!(this.h.u.as != 0 || bl2 || this.h.u.ar || this.h.c.a())) {
            this.g();
            this.c.a(f2);
            this.f();
        }
        cja.E();
        if (this.h.u.as == 0 && !bl2) {
            this.c.b(f2);
            this.d(f2);
        }
        if (this.h.u.e) {
            this.e(f2);
        }
    }

    public void f() {
        cja.g(cjg.r);
        cja.w();
        cja.g(cjg.q);
    }

    public void g() {
        cja.g(cjg.r);
        cja.l(5890);
        cja.C();
        float f2 = 0.00390625f;
        cja.b(0.00390625f, 0.00390625f, 0.00390625f);
        cja.c(8.0f, 8.0f, 8.0f);
        cja.l(5888);
        this.h.P().a(this.J);
        cja.b(3553, 10241, 9729);
        cja.b(3553, 10240, 9729);
        cja.b(3553, 10242, 10496);
        cja.b(3553, 10243, 10496);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.v();
        cja.g(cjg.q);
    }

    private void k() {
        this.M = (float)((double)this.M + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.M = (float)((double)this.M * 0.9);
        this.L += this.M - this.L;
        this.K = true;
    }

    private void g(float f2) {
        if (!this.K) {
            return;
        }
        this.h.B.a("lightTex");
        ym ym2 = this.h.f;
        if (ym2 == null) {
            return;
        }
        float f3 = ym2.b(1.0f);
        float f4 = f3 * 0.95f + 0.05f;
        for (int i2 = 0; i2 < 256; ++i2) {
            float f5;
            float f6;
            float f7 = ym2.q.o()[i2 / 16] * f4;
            float f8 = ym2.q.o()[i2 % 16] * (this.L * 0.1f + 1.5f);
            if (ym2.S() > 0) {
                f7 = ym2.q.o()[i2 / 16];
            }
            float f9 = f7 * (f3 * 0.65f + 0.35f);
            float f10 = f7 * (f3 * 0.65f + 0.35f);
            float f11 = f7;
            float f12 = f8;
            float f13 = f8 * ((f8 * 0.6f + 0.4f) * 0.6f + 0.4f);
            float f14 = f8 * (f8 * f8 * 0.6f + 0.4f);
            float f15 = f9 + f12;
            float f16 = f10 + f13;
            float f17 = f11 + f14;
            f15 = f15 * 0.96f + 0.03f;
            f16 = f16 * 0.96f + 0.03f;
            f17 = f17 * 0.96f + 0.03f;
            if (this.z > 0.0f) {
                f6 = this.A + (this.z - this.A) * f2;
                f15 = f15 * (1.0f - f6) + f15 * 0.7f * f6;
                f16 = f16 * (1.0f - f6) + f16 * 0.6f * f6;
                f17 = f17 * (1.0f - f6) + f17 * 0.6f * f6;
            }
            if (ym2.q.a().a() == 1) {
                f15 = 0.22f + f12 * 0.75f;
                f16 = 0.28f + f13 * 0.75f;
                f17 = 0.25f + f14 * 0.75f;
            }
            if (this.h.h.b(ake.p)) {
                f6 = this.a(this.h.h, f2);
                f5 = 1.0f / f15;
                if (f5 > 1.0f / f16) {
                    f5 = 1.0f / f16;
                }
                if (f5 > 1.0f / f17) {
                    f5 = 1.0f / f17;
                }
                f15 = f15 * (1.0f - f6) + f15 * f5 * f6;
                f16 = f16 * (1.0f - f6) + f16 * f5 * f6;
                f17 = f17 * (1.0f - f6) + f17 * f5 * f6;
            }
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            f6 = this.h.u.aA;
            f5 = 1.0f - f15;
            float f18 = 1.0f - f16;
            float f19 = 1.0f - f17;
            f5 = 1.0f - f5 * f5 * f5 * f5;
            f18 = 1.0f - f18 * f18 * f18 * f18;
            f19 = 1.0f - f19 * f19 * f19 * f19;
            f15 = f15 * (1.0f - f6) + f5 * f6;
            f16 = f16 * (1.0f - f6) + f18 * f6;
            f17 = f17 * (1.0f - f6) + f19 * f6;
            f15 = f15 * 0.96f + 0.03f;
            f16 = f16 * 0.96f + 0.03f;
            f17 = f17 * 0.96f + 0.03f;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            if (f15 < 0.0f) {
                f15 = 0.0f;
            }
            if (f16 < 0.0f) {
                f16 = 0.0f;
            }
            if (f17 < 0.0f) {
                f17 = 0.0f;
            }
            int n2 = 255;
            int n3 = (int)(f15 * 255.0f);
            int n4 = (int)(f16 * 255.0f);
            int n5 = (int)(f17 * 255.0f);
            this.I[i2] = 0xFF000000 | n3 << 16 | n4 << 8 | n5;
        }
        this.H.b();
        this.K = false;
        this.h.B.b();
    }

    private float a(bga bga2, float f2) {
        int n2 = bga2.c(ake.p).b();
        if (n2 > 200) {
            return 1.0f;
        }
        return 0.7f + cmk.a(((float)n2 - f2) * (float)Math.PI * 0.2f) * 0.3f;
    }

    public void a(float f2, long l2) {
        int n2;
        boolean bl2 = dx.j();
        if (bl2 || !this.h.u.z || this.h.u.A && org.lwjgl.a.j.a(1)) {
            this.F = bxy.K();
        } else if (bxy.K() - this.F > 500L) {
            this.h.s();
        }
        this.h.B.a("mouse");
        if (bl2 && bxy.a && this.h.x && !org.lwjgl.a.j.z()) {
            org.lwjgl.a.j.b(false);
            org.lwjgl.a.j.a(dx.C() / 2, dx.D() / 2 - 20);
            org.lwjgl.a.j.b(true);
        }
        if (this.h.x && bl2) {
            this.h.v.c();
            float f3 = this.h.u.b * 0.6f + 0.2f;
            float f4 = f3 * f3 * f3 * 8.0f;
            float f5 = (float)this.h.v.a * f4;
            float f6 = (float)this.h.v.b * f4;
            n2 = 1;
            if (this.h.u.c) {
                n2 = -1;
            }
            if (this.h.u.ax) {
                this.s += f5;
                this.t += f6;
                float f7 = f2 - this.w;
                this.w = f2;
                f5 = this.u * f7;
                f6 = this.v * f7;
                this.h.h.f(f5, f6 * (float)n2);
            } else {
                this.s = 0.0f;
                this.t = 0.0f;
                this.h.h.f(f5, f6 * (float)n2);
            }
        }
        this.h.B.b();
        if (this.h.s) {
            return;
        }
        a = this.h.u.f;
        cnt cnt2 = new cnt(this.h);
        int n3 = cnt2.a();
        int n4 = cnt2.b();
        int n5 = org.lwjgl.a.j.q() * n3 / this.h.d;
        n2 = n4 - org.lwjgl.a.j.r() * n4 / this.h.e - 1;
        int n6 = this.h.u.h;
        if (this.h.f != null) {
            this.h.B.a("level");
            int n7 = Math.min(bxy.ag(), n6);
            n7 = Math.max(n7, 60);
            long l3 = System.nanoTime() - l2;
            long l4 = Math.max((long)(1000000000 / n7 / 4) - l3, 0L);
            this.b(f2, System.nanoTime() + l4);
            if (this.h.G() && this.E < bxy.K() - 1000L) {
                this.E = bxy.K();
                if (!this.h.H().y()) {
                    this.l();
                }
            }
            if (cjg.O) {
                this.h.g.b();
                if (this.ab != null && this.ae) {
                    cja.l(5890);
                    cja.D();
                    cja.C();
                    this.ab.a(f2);
                    cja.E();
                }
                this.h.c().a(true);
            }
            this.G = System.nanoTime();
            this.h.B.c("gui");
            if (!this.h.u.ar || this.h.m != null) {
                cja.a(516, 0.1f);
                this.h.r.a(f2);
            }
            this.h.B.b();
        } else {
            cja.b(0, 0, this.h.d, this.h.e);
            cja.l(5889);
            cja.C();
            cja.l(5888);
            cja.C();
            this.h();
            this.G = System.nanoTime();
        }
        if (this.h.m != null) {
            cja.k(256);
            try {
                this.h.m.a(n5, n2, f2);
            }
            catch (Throwable throwable) {
                cet cet2 = cet.a(throwable, "Rendering screen");
                sx sx2 = cet2.a("Screen render details");
                sx2.a("Screen name", new dgr(this));
                sx2.a("Mouse location", new ni(this, n5, n2));
                sx2.a("Screen size", new bsw(this, cnt2));
                throw new oz(cet2);
            }
        }
    }

    private void l() {
        if (this.h.g.g() > 10 && this.h.g.k() && !this.h.H().y()) {
            BufferedImage bufferedImage = fj.a(this.h.d, this.h.e, this.h.c());
            int n2 = bufferedImage.getWidth();
            int n3 = bufferedImage.getHeight();
            int n4 = 0;
            int n5 = 0;
            if (n2 > n3) {
                n4 = (n2 - n3) / 2;
                n2 = n3;
            } else {
                n5 = (n3 - n2) / 2;
                n3 = n2;
            }
            try {
                BufferedImage bufferedImage2 = new BufferedImage(64, 64, 1);
                Graphics2D graphics2D = bufferedImage2.createGraphics();
                graphics2D.drawImage(bufferedImage, 0, 0, 64, 64, n4, n5, n4 + n2, n5 + n2, null);
                graphics2D.dispose();
                ImageIO.write((RenderedImage)bufferedImage2, "png", this.h.H().z());
            }
            catch (IOException iOException) {
                e.f("Couldn't save auto screenshot", (Throwable)iOException);
            }
        }
    }

    public void b(float f2) {
        this.h();
    }

    private boolean m() {
        boolean bl2;
        if (!this.D) {
            return false;
        }
        cpk cpk2 = this.h.ab();
        boolean bl3 = bl2 = cpk2 instanceof bdl && !this.h.u.ar;
        if (bl2 && !((bdl)cpk2).G.e) {
            bhl bhl2 = ((bdl)cpk2).bt();
            if (this.h.t != null && this.h.t.a == bmw.b) {
                cmz cmz2 = this.h.t.a();
                bfa bfa2 = this.h.f.n(cmz2).t();
                bl2 = this.h.c.l() == bvh.e ? bfa2.l() && this.h.f.q(cmz2) instanceof tb : bhl2 != null && (bhl2.a(bfa2) || bhl2.b(bfa2));
            }
        }
        return bl2;
    }

    public void b(float f2, long l2) {
        this.g(f2);
        if (this.h.ab() == null) {
            this.h.a(this.h.h);
        }
        this.a(f2);
        cja.j();
        cja.d();
        cja.a(516, 0.5f);
        this.h.B.a("center");
        if (this.h.u.f) {
            b = 0;
            cja.a(false, true, true, false);
            this.a(0, f2, l2);
            b = 1;
            cja.a(true, false, false, false);
            this.a(1, f2, l2);
            cja.a(true, true, true, false);
        } else {
            this.a(2, f2, l2);
        }
        this.h.B.b();
    }

    private void a(int n2, float f2, long l2) {
        fr fr2 = this.h.g;
        atx atx2 = this.h.j;
        boolean bl2 = this.m();
        cja.p();
        this.h.B.c("clear");
        cja.b(0, 0, this.h.d, this.h.e);
        this.h(f2);
        cja.k(16640);
        this.h.B.c("camera");
        this.a(f2, n2);
        bsx.a(this.h.h, this.h.u.as == 2);
        this.h.B.c("frustum");
        zr.a();
        this.h.B.c("culling");
        daf daf2 = new daf();
        cpk cpk2 = this.h.ab();
        double d2 = cpk2.br + (cpk2.aU - cpk2.br) * (double)f2;
        double d3 = cpk2.bs + (cpk2.aV - cpk2.bs) * (double)f2;
        double d4 = cpk2.bt + (cpk2.aW - cpk2.bt) * (double)f2;
        daf2.a(d2, d3, d4);
        if (this.h.u.d >= 4) {
            this.a(-1, f2);
            this.h.B.c("sky");
            cja.l(5889);
            cja.C();
            org.lwjgl.util.a.j.a(this.a(f2, true), (float)this.h.d / (float)this.h.e, 0.05f, this.k * 2.0f);
            cja.l(5888);
            fr2.a(f2, n2);
            cja.l(5889);
            cja.C();
            org.lwjgl.util.a.j.a(this.a(f2, true), (float)this.h.d / (float)this.h.e, 0.05f, this.k * cmk.a);
            cja.l(5888);
        }
        this.a(0, f2);
        cja.j(7425);
        if (cpk2.aV + (double)cpk2.A() < 128.0) {
            this.a(fr2, f2, n2);
        }
        this.h.B.c("prepareterrain");
        this.a(0, f2);
        this.h.P().a(dam.g);
        bjr.a();
        this.h.B.c("terrain_setup");
        fr2.a(cpk2, f2, daf2, this.af++, this.h.h.aL());
        if (n2 == 0 || n2 == 2) {
            this.h.B.c("updatechunks");
            this.h.g.a(l2);
        }
        this.h.B.c("terrain");
        cja.l(5888);
        cja.D();
        cja.c();
        fr2.a(kj.a, (double)f2, n2, cpk2);
        cja.d();
        fr2.a(kj.b, (double)f2, n2, cpk2);
        this.h.P().b(dam.g).b(false, false);
        fr2.a(kj.c, (double)f2, n2, cpk2);
        this.h.P().b(dam.g).d();
        cja.j(7424);
        cja.a(516, 0.1f);
        if (!this.X) {
            cja.l(5888);
            cja.E();
            cja.D();
            bjr.b();
            this.h.B.c("entities");
            fr2.a(cpk2, daf2, f2);
            bjr.a();
            this.f();
        }
        cja.l(5888);
        cja.E();
        if (bl2 && this.h.t != null && !cpk2.a(ahk.h)) {
            bdl bdl2 = (bdl)cpk2;
            cja.c();
            this.h.B.c("outline");
            fr2.a(bdl2, this.h.t, 0, f2);
            cja.d();
        }
        if (this.h.p.a()) {
            this.h.p.a(f2, l2);
        }
        this.h.B.c("destroyProgress");
        cja.l();
        cja.a(bjt.l, afi.e, bjt.e, afi.n);
        this.h.P().b(dam.g).b(false, false);
        fr2.a(bha.a(), bha.a().c(), cpk2, f2);
        this.h.P().b(dam.g).d();
        cja.k();
        if (!this.X) {
            this.g();
            this.h.B.c("litParticles");
            atx2.b(cpk2, f2);
            bjr.a();
            this.a(0, f2);
            this.h.B.c("particles");
            atx2.a(cpk2, f2);
            this.f();
        }
        cja.a(false);
        cja.p();
        this.h.B.c("weather");
        this.c(f2);
        cja.a(true);
        fr2.a(cpk2, f2);
        cja.k();
        cja.p();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.a(516, 0.1f);
        this.a(0, f2);
        cja.l();
        cja.a(false);
        this.h.P().a(dam.g);
        cja.j(7425);
        this.h.B.c("translucent");
        fr2.a(kj.d, (double)f2, n2, cpk2);
        cja.j(7424);
        cja.a(true);
        cja.p();
        cja.k();
        cja.o();
        if (cpk2.aV + (double)cpk2.A() >= 128.0) {
            this.h.B.c("aboveClouds");
            this.a(fr2, f2, n2);
        }
        this.h.B.c("hand");
        if (this.C) {
            cja.k(256);
            this.b(f2, n2);
        }
    }

    private void a(fr fr2, float f2, int n2) {
        if (this.h.u.e() != 0) {
            this.h.B.c("clouds");
            cja.l(5889);
            cja.C();
            org.lwjgl.util.a.j.a(this.a(f2, true), (float)this.h.d / (float)this.h.e, 0.05f, this.k * 4.0f);
            cja.l(5888);
            cja.D();
            this.a(0, f2);
            fr2.b(f2, n2);
            cja.o();
            cja.E();
            cja.l(5889);
            cja.C();
            org.lwjgl.util.a.j.a(this.a(f2, true), (float)this.h.d / (float)this.h.e, 0.05f, this.k * cmk.a);
            cja.l(5888);
        }
    }

    private void n() {
        float f2 = this.h.f.j(1.0f);
        if (!this.h.u.j) {
            f2 /= 2.0f;
        }
        if (f2 == 0.0f) {
            return;
        }
        this.j.setSeed((long)this.m * 312987231L);
        cpk cpk2 = this.h.ab();
        ym ym2 = this.h.f;
        cmz cmz2 = new cmz(cpk2);
        int n2 = 10;
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = 0.0;
        int n3 = 0;
        int n4 = (int)(100.0f * f2 * f2);
        if (this.h.u.aD == 1) {
            n4 >>= 1;
        } else if (this.h.u.aD == 2) {
            n4 = 0;
        }
        for (int i2 = 0; i2 < n4; ++i2) {
            cmz cmz3 = ym2.o(cmz2.e(this.j.nextInt(10) - this.j.nextInt(10), 0, this.j.nextInt(10) - this.j.nextInt(10)));
            anr anr2 = ym2.a(cmz3);
            cmz cmz4 = cmz3.h();
            dbk dbk2 = ym2.n(cmz4);
            if (cmz3.b() > cmz2.b() + 10 || cmz3.b() < cmz2.b() - 10 || !anr2.d() || !(anr2.c(cmz3) >= 0.15f)) continue;
            double d5 = this.j.nextDouble();
            double d6 = this.j.nextDouble();
            cxt cxt2 = dbk2.c((bnj)ym2, cmz4);
            if (dbk2.a() == ahk.i || dbk2.t() == blg.df) {
                this.h.f.a(lz.l, (double)cmz3.a() + d5, (double)((float)cmz3.b() + 0.1f) - cxt2.b, (double)cmz3.c() + d6, 0.0, 0.0, 0.0, new int[0]);
                continue;
            }
            if (dbk2.a() == ahk.a) continue;
            if (this.j.nextInt(++n3) == 0) {
                d2 = (double)cmz4.a() + d5;
                d3 = (double)((float)cmz4.b() + 0.1f) + cxt2.e - 1.0;
                d4 = (double)cmz4.c() + d6;
            }
            this.h.f.a(lz.N, (double)cmz4.a() + d5, (double)((float)cmz4.b() + 0.1f) + cxt2.e, (double)cmz4.c() + d6, 0.0, 0.0, 0.0, new int[0]);
        }
        if (n3 > 0 && this.j.nextInt(3) < this.N++) {
            this.N = 0;
            if (d3 > (double)(cmz2.b() + 1) && ym2.o(cmz2).b() > cmk.d((float)cmz2.b())) {
                this.h.f.a(d2, d3, d4, dah.gO, csg.d, 0.1f, 0.5f, false);
            } else {
                this.h.f.a(d2, d3, d4, dah.gN, csg.d, 0.2f, 1.0f, false);
            }
        }
    }

    protected void c(float f2) {
        float f3 = this.h.f.j(f2);
        if (f3 <= 0.0f) {
            return;
        }
        this.g();
        cpk cpk2 = this.h.ab();
        ym ym2 = this.h.f;
        int n2 = cmk.c(cpk2.aU);
        int n3 = cmk.c(cpk2.aV);
        int n4 = cmk.c(cpk2.aW);
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        cja.q();
        cja.a(0.0f, 1.0f, 0.0f);
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        cja.a(516, 0.1f);
        double d2 = cpk2.br + (cpk2.aU - cpk2.br) * (double)f2;
        double d3 = cpk2.bs + (cpk2.aV - cpk2.bs) * (double)f2;
        double d4 = cpk2.bt + (cpk2.aW - cpk2.bt) * (double)f2;
        int n5 = cmk.c(d3);
        int n6 = 5;
        if (this.h.u.j) {
            n6 = 10;
        }
        int n7 = -1;
        float f4 = (float)this.m + f2;
        bix2.c(-d2, -d3, -d4);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        pj pj2 = new pj();
        for (int i2 = n4 - n6; i2 <= n4 + n6; ++i2) {
            for (int i3 = n2 - n6; i3 <= n2 + n6; ++i3) {
                double d5;
                double d6;
                double d7;
                int n8;
                int n9 = (i2 - n4 + 16) * 32 + i3 - n2 + 16;
                double d8 = (double)this.O[n9] * 0.5;
                double d9 = (double)this.P[n9] * 0.5;
                pj2.a(i3, 0, i2);
                anr anr2 = ym2.a(pj2);
                if (!anr2.d() && !anr2.c()) continue;
                int n10 = ym2.o(pj2).b();
                int n11 = n3 - n6;
                int n12 = n3 + n6;
                if (n11 < n10) {
                    n11 = n10;
                }
                if (n12 < n10) {
                    n12 = n10;
                }
                if ((n8 = n10) < n5) {
                    n8 = n5;
                }
                if (n11 == n12) continue;
                this.j.setSeed(i3 * i3 * 3121 + i3 * 45238971 ^ i2 * i2 * 418711 + i2 * 13761);
                pj2.a(i3, n11, i2);
                float f5 = anr2.c(pj2);
                if (ym2.t_().a(f5, n10) >= 0.15f) {
                    if (n7 != 0) {
                        if (n7 >= 0) {
                            bha2.b();
                        }
                        n7 = 0;
                        this.h.P().a(f);
                        bix2.a(7, bxb.d);
                    }
                    d7 = -((double)(this.m + i3 * i3 * 3121 + i3 * 45238971 + i2 * i2 * 418711 + i2 * 13761 & 0x1F) + (double)f2) / 32.0 * (3.0 + this.j.nextDouble());
                    d6 = (double)((float)i3 + 0.5f) - cpk2.aU;
                    d5 = (double)((float)i2 + 0.5f) - cpk2.aW;
                    float f6 = cmk.a(d6 * d6 + d5 * d5) / (float)n6;
                    float f7 = ((1.0f - f6 * f6) * 0.5f + 0.5f) * f3;
                    pj2.a(i3, n8, i2);
                    int n13 = ym2.b((cmz)pj2, 0);
                    int n14 = n13 >> 16 & 0xFFFF;
                    int n15 = n13 & 0xFFFF;
                    bix2.b((double)i3 - d8 + 0.5, (double)n12, (double)i2 - d9 + 0.5).a(0.0, (double)n11 * 0.25 + d7).a(1.0f, 1.0f, 1.0f, f7).a(n14, n15).d();
                    bix2.b((double)i3 + d8 + 0.5, (double)n12, (double)i2 + d9 + 0.5).a(1.0, (double)n11 * 0.25 + d7).a(1.0f, 1.0f, 1.0f, f7).a(n14, n15).d();
                    bix2.b((double)i3 + d8 + 0.5, (double)n11, (double)i2 + d9 + 0.5).a(1.0, (double)n12 * 0.25 + d7).a(1.0f, 1.0f, 1.0f, f7).a(n14, n15).d();
                    bix2.b((double)i3 - d8 + 0.5, (double)n11, (double)i2 - d9 + 0.5).a(0.0, (double)n12 * 0.25 + d7).a(1.0f, 1.0f, 1.0f, f7).a(n14, n15).d();
                    continue;
                }
                if (n7 != 1) {
                    if (n7 >= 0) {
                        bha2.b();
                    }
                    n7 = 1;
                    this.h.P().a(g);
                    bix2.a(7, bxb.d);
                }
                d7 = -((float)(this.m & 0x1FF) + f2) / 512.0f;
                d6 = this.j.nextDouble() + (double)f4 * 0.01 * (double)((float)this.j.nextGaussian());
                d5 = this.j.nextDouble() + (double)(f4 * (float)this.j.nextGaussian()) * 0.001;
                double d10 = (double)((float)i3 + 0.5f) - cpk2.aU;
                double d11 = (double)((float)i2 + 0.5f) - cpk2.aW;
                float f8 = cmk.a(d10 * d10 + d11 * d11) / (float)n6;
                float f9 = ((1.0f - f8 * f8) * 0.3f + 0.5f) * f3;
                pj2.a(i3, n8, i2);
                int n16 = (ym2.b((cmz)pj2, 0) * 3 + 0xF000F0) / 4;
                int n17 = n16 >> 16 & 0xFFFF;
                int n18 = n16 & 0xFFFF;
                bix2.b((double)i3 - d8 + 0.5, (double)n12, (double)i2 - d9 + 0.5).a(0.0 + d6, (double)n11 * 0.25 + d7 + d5).a(1.0f, 1.0f, 1.0f, f9).a(n17, n18).d();
                bix2.b((double)i3 + d8 + 0.5, (double)n12, (double)i2 + d9 + 0.5).a(1.0 + d6, (double)n11 * 0.25 + d7 + d5).a(1.0f, 1.0f, 1.0f, f9).a(n17, n18).d();
                bix2.b((double)i3 + d8 + 0.5, (double)n11, (double)i2 + d9 + 0.5).a(1.0 + d6, (double)n12 * 0.25 + d7 + d5).a(1.0f, 1.0f, 1.0f, f9).a(n17, n18).d();
                bix2.b((double)i3 - d8 + 0.5, (double)n11, (double)i2 - d9 + 0.5).a(0.0 + d6, (double)n12 * 0.25 + d7 + d5).a(1.0f, 1.0f, 1.0f, f9).a(n17, n18).d();
            }
        }
        if (n7 >= 0) {
            bha2.b();
        }
        bix2.c(0.0, 0.0, 0.0);
        cja.p();
        cja.k();
        cja.a(516, 0.1f);
        this.f();
    }

    public void h() {
        cnt cnt2 = new cnt(this.h);
        cja.k(256);
        cja.l(5889);
        cja.C();
        cja.a(0.0, cnt2.c(), cnt2.d(), 0.0, 1000.0, 3000.0);
        cja.l(5888);
        cja.C();
        cja.c(0.0f, 0.0f, -2000.0f);
    }

    private void h(float f2) {
        float f3;
        float f4;
        float f5;
        Object object;
        ym ym2 = this.h.f;
        cpk cpk2 = this.h.ab();
        float f6 = 0.25f + 0.75f * (float)this.h.u.d / 32.0f;
        f6 = 1.0f - (float)Math.pow(f6, 0.25);
        amj amj2 = ym2.a(this.h.ab(), f2);
        float f7 = (float)amj2.b;
        float f8 = (float)amj2.c;
        float f9 = (float)amj2.d;
        amj amj3 = ym2.f(f2);
        this.R = (float)amj3.b;
        this.S = (float)amj3.c;
        this.T = (float)amj3.d;
        if (this.h.u.d >= 4) {
            float[] arrf;
            double d2 = cmk.a(ym2.d(f2)) > 0.0f ? -1.0 : 1.0;
            object = new amj(d2, 0.0, 0.0);
            f5 = (float)cpk2.l(f2).b((amj)object);
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 > 0.0f && (arrf = ym2.q.a(ym2.c(f2), f2)) != null) {
                this.R = this.R * (1.0f - (f5 *= arrf[3])) + arrf[0] * f5;
                this.S = this.S * (1.0f - f5) + arrf[1] * f5;
                this.T = this.T * (1.0f - f5) + arrf[2] * f5;
            }
        }
        this.R += (f7 - this.R) * f6;
        this.S += (f8 - this.S) * f6;
        this.T += (f9 - this.T) * f6;
        float f10 = ym2.j(f2);
        if (f10 > 0.0f) {
            f4 = 1.0f - f10 * 0.5f;
            float f11 = 1.0f - f10 * 0.4f;
            this.R *= f4;
            this.S *= f4;
            this.T *= f11;
        }
        if ((f4 = ym2.h(f2)) > 0.0f) {
            float f12 = 1.0f - f4 * 0.5f;
            this.R *= f12;
            this.S *= f12;
            this.T *= f12;
        }
        object = bsx.a(this.h.f, cpk2, f2);
        if (this.B) {
            amj amj4 = ym2.e(f2);
            this.R = (float)amj4.b;
            this.S = (float)amj4.c;
            this.T = (float)amj4.d;
        } else if (object.a() == ahk.h) {
            f5 = 0.0f;
            if (cpk2 instanceof bga) {
                f5 = (float)acz.c((bga)cpk2) * 0.2f;
                if (((bga)cpk2).b(ake.m)) {
                    f5 = f5 * 0.3f + 0.6f;
                }
            }
            this.R = 0.02f + f5;
            this.S = 0.02f + f5;
            this.T = 0.2f + f5;
        } else if (object.a() == ahk.i) {
            this.R = 0.6f;
            this.S = 0.1f;
            this.T = 0.0f;
        }
        float f13 = this.U + (this.V - this.U) * f2;
        this.R *= f13;
        this.S *= f13;
        this.T *= f13;
        double d3 = (cpk2.bs + (cpk2.aV - cpk2.bs) * (double)f2) * ym2.q.k();
        if (cpk2 instanceof bga && ((bga)cpk2).b(ake.o)) {
            int n2 = ((bga)cpk2).c(ake.o).b();
            d3 = n2 < 20 ? (d3 *= (double)(1.0f - (float)n2 / 20.0f)) : 0.0;
        }
        if (d3 < 1.0) {
            if (d3 < 0.0) {
                d3 = 0.0;
            }
            d3 *= d3;
            this.R = (float)((double)this.R * d3);
            this.S = (float)((double)this.S * d3);
            this.T = (float)((double)this.T * d3);
        }
        if (this.z > 0.0f) {
            float f14 = this.A + (this.z - this.A) * f2;
            this.R = this.R * (1.0f - f14) + this.R * 0.7f * f14;
            this.S = this.S * (1.0f - f14) + this.S * 0.6f * f14;
            this.T = this.T * (1.0f - f14) + this.T * 0.6f * f14;
        }
        if (cpk2 instanceof bga && ((bga)cpk2).b(ake.p)) {
            float f15 = this.a((bga)cpk2, f2);
            f3 = 1.0f / this.R;
            if (f3 > 1.0f / this.S) {
                f3 = 1.0f / this.S;
            }
            if (f3 > 1.0f / this.T) {
                f3 = 1.0f / this.T;
            }
            this.R = this.R * (1.0f - f15) + this.R * f3 * f15;
            this.S = this.S * (1.0f - f15) + this.S * f3 * f15;
            this.T = this.T * (1.0f - f15) + this.T * f3 * f15;
        }
        if (this.h.u.f) {
            float f16 = (this.R * 30.0f + this.S * 59.0f + this.T * 11.0f) / 100.0f;
            f3 = (this.R * 30.0f + this.S * 70.0f) / 100.0f;
            float f17 = (this.R * 30.0f + this.T * 70.0f) / 100.0f;
            this.R = f16;
            this.S = f3;
            this.T = f17;
        }
        cja.a(this.R, this.S, this.T, 0.0f);
    }

    private void a(int n2, float f2) {
        cpk cpk2 = this.h.ab();
        cja.b(2918, this.a(this.R, this.S, this.T, 1.0f));
        cja.a(0.0f, -1.0f, 0.0f);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        dbk dbk2 = bsx.a(this.h.f, cpk2, f2);
        if (cpk2 instanceof bga && ((bga)cpk2).b(ake.o)) {
            float f3 = 5.0f;
            int n3 = ((bga)cpk2).c(ake.o).b();
            if (n3 < 20) {
                f3 = 5.0f + (this.k - 5.0f) * (1.0f - (float)n3 / 20.0f);
            }
            cja.a(aoj.a);
            if (n2 == -1) {
                cja.b(0.0f);
                cja.c(f3 * 0.8f);
            } else {
                cja.b(f3 * 0.25f);
                cja.c(f3);
            }
            if (GLContext.a().fk) {
                cja.c(34138, 34139);
            }
        } else if (this.B) {
            cja.a(aoj.b);
            cja.a(0.1f);
        } else if (dbk2.a() == ahk.h) {
            cja.a(aoj.b);
            if (cpk2 instanceof bga) {
                if (((bga)cpk2).b(ake.m)) {
                    cja.a(0.01f);
                } else {
                    cja.a(0.1f - (float)acz.c((bga)cpk2) * 0.03f);
                }
            } else {
                cja.a(0.1f);
            }
        } else if (dbk2.a() == ahk.i) {
            cja.a(aoj.b);
            cja.a(2.0f);
        } else {
            float f4 = this.k;
            cja.a(aoj.a);
            if (n2 == -1) {
                cja.b(0.0f);
                cja.c(f4);
            } else {
                cja.b(f4 * 0.75f);
                cja.c(f4);
            }
            if (GLContext.a().fk) {
                cja.c(34138, 34139);
            }
            if (this.h.f.q.c((int)cpk2.aU, (int)cpk2.aW) || this.h.r.i().e()) {
                cja.b(f4 * 0.05f);
                cja.c(Math.min(f4, 192.0f) * 0.5f);
            }
        }
        cja.g();
        cja.n();
        cja.a(1028, 4608);
    }

    private FloatBuffer a(float f2, float f3, float f4, float f5) {
        this.Q.clear();
        this.Q.put(f2).put(f3).put(f4).put(f5);
        this.Q.flip();
        return this.Q;
    }

    public bte i() {
        return this.l;
    }

    public static void a(deb deb2, String string, float f2, float f3, float f4, int n2, float f5, float f6, boolean bl2, boolean bl3) {
        cja.D();
        cja.c(f2, f3, f4);
        cja.a(0.0f, 1.0f, 0.0f);
        cja.b(-f5, 0.0f, 1.0f, 0.0f);
        cja.b((float)(bl2 ? -1 : 1) * f6, 1.0f, 0.0f, 0.0f);
        cja.b(-0.025f, -0.025f, 0.025f);
        cja.f();
        cja.a(false);
        if (!bl3) {
            cja.i();
        }
        cja.l();
        cja.a(bjt.l, afi.j, bjt.e, afi.n);
        int n3 = deb2.a(string) / 2;
        cja.w();
        bha bha2 = bha.a();
        bix bix2 = bha2.c();
        bix2.a(7, bxb.f);
        bix2.b((double)(-n3 - 1), (double)(-1 + n2), 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        bix2.b((double)(-n3 - 1), (double)(8 + n2), 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        bix2.b((double)(n3 + 1), (double)(8 + n2), 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        bix2.b((double)(n3 + 1), (double)(-1 + n2), 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        bha2.b();
        cja.v();
        if (!bl3) {
            deb2.a(string, -deb2.a(string) / 2, n2, 0x20FFFFFF);
            cja.j();
        }
        cja.a(true);
        deb2.a(string, -deb2.a(string) / 2, n2, bl3 ? 0x20FFFFFF : -1);
        cja.e();
        cja.k();
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.E();
    }

    static /* synthetic */ bxy a(cwz cwz2) {
        return cwz2.h;
    }

    static {
        ac = new bpx[]{new bpx("shaders/post/notch.json"), new bpx("shaders/post/fxaa.json"), new bpx("shaders/post/art.json"), new bpx("shaders/post/bumpy.json"), new bpx("shaders/post/blobs2.json"), new bpx("shaders/post/pencil.json"), new bpx("shaders/post/color_convolve.json"), new bpx("shaders/post/deconverge.json"), new bpx("shaders/post/flip.json"), new bpx("shaders/post/invert.json"), new bpx("shaders/post/ntsc.json"), new bpx("shaders/post/outline.json"), new bpx("shaders/post/phosphor.json"), new bpx("shaders/post/scan_pincushion.json"), new bpx("shaders/post/sobel.json"), new bpx("shaders/post/bits.json"), new bpx("shaders/post/desaturate.json"), new bpx("shaders/post/green.json"), new bpx("shaders/post/blur.json"), new bpx("shaders/post/wobble.json"), new bpx("shaders/post/blobs.json"), new bpx("shaders/post/antialias.json"), new bpx("shaders/post/creeper.json"), new bpx("shaders/post/spider.json")};
        d = ac.length;
    }
}

