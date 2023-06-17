/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import com.a.a.b.cm;
import com.a.b.ag;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.IOException;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.Random;
import javax.imageio.ImageIO;
import net.minecraft.a.p;
import net.minecraft.client.f.j;
import net.minecraft.client.f.s;
import net.minecraft.client.g.a.f;
import net.minecraft.client.g.a.m;
import net.minecraft.client.g.ad;
import net.minecraft.client.g.am;
import net.minecraft.client.g.ao;
import net.minecraft.client.g.ar;
import net.minecraft.client.g.ay;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.bs;
import net.minecraft.client.g.cd;
import net.minecraft.client.g.ch;
import net.minecraft.client.g.ci;
import net.minecraft.client.g.cl;
import net.minecraft.client.g.cs;
import net.minecraft.client.g.g;
import net.minecraft.client.g.g.b;
import net.minecraft.client.g.g.e;
import net.minecraft.client.g.o;
import net.minecraft.client.g.v;
import net.minecraft.client.h.a;
import net.minecraft.client.k.ce;
import net.minecraft.client.k.cv;
import net.minecraft.client.m.h;
import net.minecraft.client.r;
import net.minecraft.g.av;
import net.minecraft.g.cn;
import net.minecraft.k.i;
import net.minecraft.m.cu;
import net.minecraft.q.b.q;
import net.minecraft.u.aj;
import net.minecraft.u.bj;
import net.minecraft.u.bo;
import net.minecraft.u.bp;
import net.minecraft.u.br;
import net.minecraft.u.bu;
import net.minecraft.w.e.au;
import net.minecraft.w.e.bi;
import net.minecraft.w.h.y;
import net.minecraft.w.l;
import net.minecraft.w.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.dx;

public class cc
implements j {
    private static final d e = org.apache.logging.log4j.c.c();
    private static final bp f = new bp("textures/environment/rain.png");
    private static final bp g = new bp("textures/environment/snow.png");
    public static boolean a;
    public static int b;
    private final r h;
    private final s i;
    private final Random j = new Random();
    private float k;
    public final bs c;
    private final net.minecraft.client.k.bc l;
    private int m;
    private n n;
    private final bj o = new bj();
    private final bj p = new bj();
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
    private long F = net.minecraft.client.r.I();
    private long G;
    private final m H;
    private final int[] I;
    private final bp J;
    private boolean K;
    private float L;
    private float M;
    private int N;
    private final float[] O = new float[1024];
    private final float[] P = new float[1024];
    private final FloatBuffer Q = net.minecraft.client.g.v.e(16);
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
    private h ab;
    private static final bp[] ac;
    public static final int d;
    private int ad = d;
    private boolean ae;
    private int af;

    static {
        ac = new bp[]{new bp("shaders/post/notch.json"), new bp("shaders/post/fxaa.json"), new bp("shaders/post/art.json"), new bp("shaders/post/bumpy.json"), new bp("shaders/post/blobs2.json"), new bp("shaders/post/pencil.json"), new bp("shaders/post/color_convolve.json"), new bp("shaders/post/deconverge.json"), new bp("shaders/post/flip.json"), new bp("shaders/post/invert.json"), new bp("shaders/post/ntsc.json"), new bp("shaders/post/outline.json"), new bp("shaders/post/phosphor.json"), new bp("shaders/post/scan_pincushion.json"), new bp("shaders/post/sobel.json"), new bp("shaders/post/bits.json"), new bp("shaders/post/desaturate.json"), new bp("shaders/post/green.json"), new bp("shaders/post/blur.json"), new bp("shaders/post/wobble.json"), new bp("shaders/post/blobs.json"), new bp("shaders/post/antialias.json"), new bp("shaders/post/creeper.json"), new bp("shaders/post/spider.json")};
        d = ac.length;
    }

    public cc(r r2, s s2) {
        this.h = r2;
        this.i = s2;
        this.c = r2.ad();
        this.l = new net.minecraft.client.k.bc(r2.N());
        this.H = new m(16, 16);
        this.J = r2.N().a("lightMap", this.H);
        this.I = this.H.b();
        this.ab = null;
        for (int i2 = 0; i2 < 32; ++i2) {
            for (int i3 = 0; i3 < 32; ++i3) {
                float f2 = i3 - 16;
                float f3 = i2 - 16;
                float f4 = net.minecraft.u.b.n.c(f2 * f2 + f3 * f3);
                this.O[i2 << 5 | i3] = -f3 / f4;
                this.P[i2 << 5 | i3] = f2 / f4;
            }
        }
    }

    public boolean a() {
        return ay.O && this.ab != null;
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

    public void a(n n2) {
        if (ay.O) {
            if (this.ab != null) {
                this.ab.a();
            }
            this.ab = null;
            if (n2 instanceof bi) {
                this.a(new bp("shaders/post/creeper.json"));
            } else if (n2 instanceof net.minecraft.w.e.c) {
                this.a(new bp("shaders/post/spider.json"));
            } else if (n2 instanceof au) {
                this.a(new bp("shaders/post/invert.json"));
            }
        }
    }

    private void a(bp bp2) {
        try {
            this.ab = new h(this.h.N(), this.i, this.h.b(), bp2);
            this.ab.a(this.h.e, this.h.f);
            this.ae = true;
        }
        catch (IOException iOException) {
            e.f("Failed to load shader: {}", bp2, iOException);
            this.ad = d;
            this.ae = false;
        }
        catch (ag ag2) {
            e.f("Failed to load shader: {}", bp2, ag2);
            this.ad = d;
            this.ae = false;
        }
    }

    @Override
    public void a(s s2) {
        if (this.ab != null) {
            this.ab.a();
        }
        this.ab = null;
        if (this.ad == d) {
            this.a(this.h.Z());
        } else {
            this.a(ac[this.ad]);
        }
    }

    public void d() {
        float f2;
        float f3;
        if (ay.O && net.minecraft.client.m.g.b() == null) {
            net.minecraft.client.m.g.a();
        }
        this.j();
        this.k();
        this.U = this.V;
        this.r = 4.0f;
        if (this.h.w.ax) {
            f3 = this.h.w.b * 0.6f + 0.2f;
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
        if (this.h.Z() == null) {
            this.h.a(this.h.j);
        }
        f3 = this.h.h.m(new net.minecraft.u.b.b(this.h.Z()));
        f2 = (float)this.h.w.d / 32.0f;
        float f4 = f3 * (1.0f - f2) + f2;
        this.V += (f4 - this.V) * 0.1f;
        ++this.m;
        this.c.a();
        this.n();
        this.A = this.z;
        if (this.h.t.i().d()) {
            this.z += 0.05f;
            if (this.z > 1.0f) {
                this.z = 1.0f;
            }
        } else if (this.z > 0.0f) {
            this.z -= 0.0125f;
        }
    }

    public h e() {
        return this.ab;
    }

    public void a(int n2, int n3) {
        if (ay.O) {
            if (this.ab != null) {
                this.ab.a(n2, n3);
            }
            this.h.i.a(n2, n3);
        }
    }

    public void a(float f2) {
        n n2 = this.h.Z();
        if (n2 != null && this.h.h != null) {
            this.h.D.a("pick");
            this.h.k = null;
            double d2 = this.h.d.d();
            this.h.v = n2.a(d2, f2);
            net.minecraft.u.b.s s2 = n2.o(f2);
            boolean bl2 = false;
            int n3 = 3;
            double d3 = d2;
            if (this.h.d.i()) {
                d2 = d3 = 6.0;
            } else if (d2 > 3.0) {
                bl2 = true;
            }
            if (this.h.v != null) {
                d3 = this.h.v.c.f(s2);
            }
            net.minecraft.u.b.s s3 = n2.i(f2);
            net.minecraft.u.b.s s4 = s2.b(s3.b * d2, s3.c * d2, s3.d * d2);
            this.n = null;
            net.minecraft.u.b.s s5 = null;
            float f3 = 1.0f;
            List list = this.h.h.a(n2, n2.cT().a(s3.b * d2, s3.c * d2, s3.d * d2).b(1.0, 1.0, 1.0), com.a.a.b.cn.a(net.minecraft.u.r.e, (cm)new ch(this)));
            double d4 = d3;
            for (int i2 = 0; i2 < list.size(); ++i2) {
                double d5;
                n n4 = (n)list.get(i2);
                net.minecraft.u.b.a a2 = n4.cT().b(n4.cu());
                net.minecraft.u.b.o o2 = a2.b(s2, s4);
                if (a2.a(s2)) {
                    if (!(d4 >= 0.0)) continue;
                    this.n = n4;
                    s5 = o2 == null ? s2 : o2.c;
                    d4 = 0.0;
                    continue;
                }
                if (o2 == null || !((d5 = s2.f(o2.c)) < d4) && d4 != 0.0) continue;
                if (n4.dd() == n2.dd()) {
                    if (d4 != 0.0) continue;
                    this.n = n4;
                    s5 = o2.c;
                    continue;
                }
                this.n = n4;
                s5 = o2.c;
                d4 = d5;
            }
            if (this.n != null && bl2 && s2.f(s5) > 3.0) {
                this.n = null;
                this.h.v = new net.minecraft.u.b.o(net.minecraft.u.b.p.a, s5, null, new net.minecraft.u.b.b(s5));
            }
            if (this.n != null && (d4 < d3 || this.h.v == null)) {
                this.h.v = new net.minecraft.u.b.o(this.n, s5);
                if (this.n instanceof l || this.n instanceof net.minecraft.w.f.l) {
                    this.h.k = this.n;
                }
            }
            this.h.D.b();
        }
    }

    private void j() {
        float f2 = 1.0f;
        if (this.h.Z() instanceof a) {
            a a2 = (a)this.h.Z();
            f2 = a2.l();
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
        net.minecraft.g.c.b b2;
        if (this.X) {
            return 90.0f;
        }
        n n2 = this.h.Z();
        float f3 = 70.0f;
        if (bl2) {
            f3 = this.h.w.az;
            f3 *= this.y + (this.x - this.y) * f2;
        }
        if (n2 instanceof l && ((l)n2).bo() <= 0.0f) {
            float f4 = (float)((l)n2).Y + f2;
            f3 /= (1.0f - 500.0f / (f4 + 500.0f)) * 2.0f + 1.0f;
        }
        if ((b2 = ao.a(this.h.h, n2, f2)).d() == net.minecraft.g.a.h.h) {
            f3 = f3 * 60.0f / 70.0f;
        }
        return f3;
    }

    private void d(float f2) {
        if (this.h.Z() instanceof l) {
            float f3;
            l l2 = (l)this.h.Z();
            float f4 = (float)l2.V - f2;
            if (l2.bo() <= 0.0f) {
                f3 = (float)l2.Y + f2;
                bd.b(40.0f - 8000.0f / (f3 + 200.0f), 0.0f, 0.0f, 1.0f);
            }
            if (f4 < 0.0f) {
                return;
            }
            f4 /= (float)l2.W;
            f4 = net.minecraft.u.b.n.a(f4 * f4 * f4 * f4 * (float)Math.PI);
            f3 = l2.X;
            bd.b(-f3, 0.0f, 1.0f, 0.0f);
            bd.b(-f4 * 14.0f, 0.0f, 0.0f, 1.0f);
            bd.b(f3, 0.0f, 1.0f, 0.0f);
        }
    }

    private void e(float f2) {
        if (this.h.Z() instanceof net.minecraft.w.a.b) {
            net.minecraft.w.a.b b2 = (net.minecraft.w.a.b)this.h.Z();
            float f3 = b2.bo - b2.bn;
            float f4 = -(b2.bo + f3 * f2);
            float f5 = b2.v + (b2.w - b2.v) * f2;
            float f6 = b2.ag + (b2.ah - b2.ag) * f2;
            bd.c(net.minecraft.u.b.n.a(f4 * (float)Math.PI) * f5 * 0.5f, -Math.abs(net.minecraft.u.b.n.b(f4 * (float)Math.PI) * f5), 0.0f);
            bd.b(net.minecraft.u.b.n.a(f4 * (float)Math.PI) * f5 * 3.0f, 0.0f, 0.0f, 1.0f);
            bd.b(Math.abs(net.minecraft.u.b.n.b(f4 * (float)Math.PI - 0.2f) * f5) * 5.0f, 1.0f, 0.0f, 0.0f);
            bd.b(f6, 1.0f, 0.0f, 0.0f);
        }
    }

    private void f(float f2) {
        Object object;
        n n2 = this.h.Z();
        float f3 = n2.ce_();
        double d2 = n2.aR + (n2.aU - n2.aR) * (double)f2;
        double d3 = n2.aS + (n2.aV - n2.aS) * (double)f2 + (double)f3;
        double d4 = n2.aT + (n2.aW - n2.aT) * (double)f2;
        if (n2 instanceof l && ((l)n2).ae()) {
            f3 = (float)((double)f3 + 1.0);
            bd.c(0.0f, 0.3f, 0.0f);
            if (!this.h.w.ay) {
                object = new net.minecraft.u.b.b(n2);
                net.minecraft.g.c.b b2 = this.h.h.n((net.minecraft.u.b.b)object);
                cn cn2 = b2.c();
                if (cn2 == net.minecraft.a.p.C) {
                    int n3 = ((net.minecraft.u.ad)((Object)b2.a(av.j))).c();
                    bd.b((float)(n3 * 90), 0.0f, 1.0f, 0.0f);
                }
                bd.b(n2.bc + (n2.ba - n2.bc) * f2 + 180.0f, 0.0f, -1.0f, 0.0f);
                bd.b(n2.bd + (n2.bb - n2.bd) * f2, -1.0f, 0.0f, 0.0f);
            }
        } else if (this.h.w.as > 0) {
            double d5 = this.r + (4.0f - this.r) * f2;
            if (this.h.w.ay) {
                bd.c(0.0f, 0.0f, (float)(-d5));
            } else {
                float f4 = n2.ba;
                float f5 = n2.bb;
                if (this.h.w.as == 2) {
                    f5 += 180.0f;
                }
                double d6 = (double)(-net.minecraft.u.b.n.a(f4 * ((float)Math.PI / 180)) * net.minecraft.u.b.n.b(f5 * ((float)Math.PI / 180))) * d5;
                double d7 = (double)(net.minecraft.u.b.n.b(f4 * ((float)Math.PI / 180)) * net.minecraft.u.b.n.b(f5 * ((float)Math.PI / 180))) * d5;
                double d8 = (double)(-net.minecraft.u.b.n.a(f5 * ((float)Math.PI / 180))) * d5;
                for (int i2 = 0; i2 < 8; ++i2) {
                    double d9;
                    net.minecraft.u.b.o o2;
                    float f6 = (i2 & 1) * 2 - 1;
                    float f7 = (i2 >> 1 & 1) * 2 - 1;
                    float f8 = (i2 >> 2 & 1) * 2 - 1;
                    if ((o2 = this.h.h.a(new net.minecraft.u.b.s(d2 + (double)(f6 *= 0.1f), d3 + (double)(f7 *= 0.1f), d4 + (double)(f8 *= 0.1f)), new net.minecraft.u.b.s(d2 - d6 + (double)f6 + (double)f8, d3 - d8 + (double)f7, d4 - d7 + (double)f8))) == null || !((d9 = o2.c.f(new net.minecraft.u.b.s(d2, d3, d4))) < d5)) continue;
                    d5 = d9;
                }
                if (this.h.w.as == 2) {
                    bd.b(180.0f, 0.0f, 1.0f, 0.0f);
                }
                bd.b(n2.bb - f5, 1.0f, 0.0f, 0.0f);
                bd.b(n2.ba - f4, 0.0f, 1.0f, 0.0f);
                bd.c(0.0f, 0.0f, (float)(-d5));
                bd.b(f4 - n2.ba, 0.0f, 1.0f, 0.0f);
                bd.b(f5 - n2.bb, 1.0f, 0.0f, 0.0f);
            }
        } else {
            bd.c(0.0f, 0.0f, 0.05f);
        }
        if (!this.h.w.ay) {
            bd.b(n2.bd + (n2.bb - n2.bd) * f2, 1.0f, 0.0f, 0.0f);
            if (n2 instanceof y) {
                object = (y)n2;
                bd.b(((y)object).an + (((y)object).am - ((y)object).an) * f2 + 180.0f, 0.0f, 1.0f, 0.0f);
            } else {
                bd.b(n2.bc + (n2.ba - n2.bc) * f2 + 180.0f, 0.0f, 1.0f, 0.0f);
            }
        }
        bd.c(0.0f, -f3, 0.0f);
        d2 = n2.aR + (n2.aU - n2.aR) * (double)f2;
        d3 = n2.aS + (n2.aV - n2.aS) * (double)f2 + (double)f3;
        d4 = n2.aT + (n2.aW - n2.aT) * (double)f2;
        this.B = this.h.i.a(d2, d3, d4, f2);
    }

    private void a(float f2, int n2) {
        float f3;
        this.k = this.h.w.d * 16;
        bd.l(5889);
        bd.C();
        float f4 = 0.07f;
        if (this.h.w.f) {
            bd.c((float)(-(n2 * 2 - 1)) * 0.07f, 0.0f, 0.0f);
        }
        if (this.Y != 1.0) {
            bd.c((float)this.Z, (float)(-this.aa), 0.0f);
            bd.a(this.Y, this.Y, 1.0);
        }
        org.lwjgl.util.a.j.a(this.a(f2, true), (float)this.h.e / (float)this.h.f, 0.05f, this.k * net.minecraft.u.b.n.a);
        bd.l(5888);
        bd.C();
        if (this.h.w.f) {
            bd.c((float)(n2 * 2 - 1) * 0.1f, 0.0f, 0.0f);
        }
        this.d(f2);
        if (this.h.w.e) {
            this.e(f2);
        }
        if ((f3 = this.h.j.n + (this.h.j.m - this.h.j.n) * f2) > 0.0f) {
            int n3 = 20;
            if (this.h.j.b(net.minecraft.a.c.i)) {
                n3 = 7;
            }
            float f5 = 5.0f / (f3 * f3 + 5.0f) - f3 * 0.04f;
            f5 *= f5;
            bd.b(((float)this.m + f2) * (float)n3, 0.0f, 1.0f, 1.0f);
            bd.b(1.0f / f5, 1.0f, 1.0f);
            bd.b(-((float)this.m + f2) * (float)n3, 0.0f, 1.0f, 1.0f);
        }
        this.f(f2);
        if (this.X) {
            switch (this.W) {
                case 0: {
                    bd.b(90.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 1: {
                    bd.b(180.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 2: {
                    bd.b(-90.0f, 0.0f, 1.0f, 0.0f);
                    break;
                }
                case 3: {
                    bd.b(90.0f, 1.0f, 0.0f, 0.0f);
                    break;
                }
                case 4: {
                    bd.b(-90.0f, 1.0f, 0.0f, 0.0f);
                }
            }
        }
    }

    private void b(float f2, int n2) {
        if (!this.X) {
            boolean bl2;
            bd.l(5889);
            bd.C();
            float f3 = 0.07f;
            if (this.h.w.f) {
                bd.c((float)(-(n2 * 2 - 1)) * 0.07f, 0.0f, 0.0f);
            }
            org.lwjgl.util.a.j.a(this.a(f2, false), (float)this.h.e / (float)this.h.f, 0.05f, this.k * 2.0f);
            bd.l(5888);
            bd.C();
            if (this.h.w.f) {
                bd.c((float)(n2 * 2 - 1) * 0.1f, 0.0f, 0.0f);
            }
            bd.D();
            this.d(f2);
            if (this.h.w.e) {
                this.e(f2);
            }
            boolean bl3 = bl2 = this.h.Z() instanceof l && ((l)this.h.Z()).ae();
            if (!(this.h.w.as != 0 || bl2 || this.h.w.ar || this.h.d.a())) {
                this.g();
                this.c.a(f2);
                this.f();
            }
            bd.E();
            if (this.h.w.as == 0 && !bl2) {
                this.c.b(f2);
                this.d(f2);
            }
            if (this.h.w.e) {
                this.e(f2);
            }
        }
    }

    public void f() {
        bd.g(ay.r);
        bd.w();
        bd.g(ay.q);
    }

    public void g() {
        bd.g(ay.r);
        bd.l(5890);
        bd.C();
        float f2 = 0.00390625f;
        bd.b(0.00390625f, 0.00390625f, 0.00390625f);
        bd.c(8.0f, 8.0f, 8.0f);
        bd.l(5888);
        this.h.N().a(this.J);
        bd.b(3553, 10241, 9729);
        bd.b(3553, 10240, 9729);
        bd.b(3553, 10242, 10496);
        bd.b(3553, 10243, 10496);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.v();
        bd.g(ay.q);
    }

    private void k() {
        this.M = (float)((double)this.M + (Math.random() - Math.random()) * Math.random() * Math.random());
        this.M = (float)((double)this.M * 0.9);
        this.L += this.M - this.L;
        this.K = true;
    }

    private void g(float f2) {
        if (this.K) {
            this.h.D.a("lightTex");
            net.minecraft.client.i.d d2 = this.h.h;
            if (d2 != null) {
                float f3 = d2.b(1.0f);
                float f4 = f3 * 0.95f + 0.05f;
                for (int i2 = 0; i2 < 256; ++i2) {
                    float f5;
                    float f6;
                    float f7 = d2.q.o()[i2 / 16] * f4;
                    float f8 = d2.q.o()[i2 % 16] * (this.L * 0.1f + 1.5f);
                    if (d2.T() > 0) {
                        f7 = d2.q.o()[i2 / 16];
                    }
                    float f9 = f7 * (f3 * 0.65f + 0.35f);
                    float f10 = f7 * (f3 * 0.65f + 0.35f);
                    float f11 = f8 * ((f8 * 0.6f + 0.4f) * 0.6f + 0.4f);
                    float f12 = f8 * (f8 * f8 * 0.6f + 0.4f);
                    float f13 = f9 + f8;
                    float f14 = f10 + f11;
                    float f15 = f7 + f12;
                    f13 = f13 * 0.96f + 0.03f;
                    f14 = f14 * 0.96f + 0.03f;
                    f15 = f15 * 0.96f + 0.03f;
                    if (this.z > 0.0f) {
                        f6 = this.A + (this.z - this.A) * f2;
                        f13 = f13 * (1.0f - f6) + f13 * 0.7f * f6;
                        f14 = f14 * (1.0f - f6) + f14 * 0.6f * f6;
                        f15 = f15 * (1.0f - f6) + f15 * 0.6f * f6;
                    }
                    if (d2.q.a().a() == 1) {
                        f13 = 0.22f + f8 * 0.75f;
                        f14 = 0.28f + f11 * 0.75f;
                        f15 = 0.25f + f12 * 0.75f;
                    }
                    if (this.h.j.b(net.minecraft.a.c.p)) {
                        f6 = this.a(this.h.j, f2);
                        f5 = 1.0f / f13;
                        if (f5 > 1.0f / f14) {
                            f5 = 1.0f / f14;
                        }
                        if (f5 > 1.0f / f15) {
                            f5 = 1.0f / f15;
                        }
                        f13 = f13 * (1.0f - f6) + f13 * f5 * f6;
                        f14 = f14 * (1.0f - f6) + f14 * f5 * f6;
                        f15 = f15 * (1.0f - f6) + f15 * f5 * f6;
                    }
                    if (f13 > 1.0f) {
                        f13 = 1.0f;
                    }
                    if (f14 > 1.0f) {
                        f14 = 1.0f;
                    }
                    if (f15 > 1.0f) {
                        f15 = 1.0f;
                    }
                    f6 = this.h.w.aA;
                    f5 = 1.0f - f13;
                    float f16 = 1.0f - f14;
                    float f17 = 1.0f - f15;
                    f5 = 1.0f - f5 * f5 * f5 * f5;
                    f16 = 1.0f - f16 * f16 * f16 * f16;
                    f17 = 1.0f - f17 * f17 * f17 * f17;
                    f13 = f13 * (1.0f - f6) + f5 * f6;
                    f14 = f14 * (1.0f - f6) + f16 * f6;
                    f15 = f15 * (1.0f - f6) + f17 * f6;
                    f13 = f13 * 0.96f + 0.03f;
                    f14 = f14 * 0.96f + 0.03f;
                    f15 = f15 * 0.96f + 0.03f;
                    if (f13 > 1.0f) {
                        f13 = 1.0f;
                    }
                    if (f14 > 1.0f) {
                        f14 = 1.0f;
                    }
                    if (f15 > 1.0f) {
                        f15 = 1.0f;
                    }
                    if (f13 < 0.0f) {
                        f13 = 0.0f;
                    }
                    if (f14 < 0.0f) {
                        f14 = 0.0f;
                    }
                    if (f15 < 0.0f) {
                        f15 = 0.0f;
                    }
                    int n2 = 255;
                    int n3 = (int)(f13 * 255.0f);
                    int n4 = (int)(f14 * 255.0f);
                    int n5 = (int)(f15 * 255.0f);
                    this.I[i2] = 0xFF000000 | n3 << 16 | n4 << 8 | n5;
                }
                this.H.a();
                this.K = false;
                this.h.D.b();
            }
        }
    }

    private float a(l l2, float f2) {
        int n2 = l2.c(net.minecraft.a.c.p).b();
        return n2 > 200 ? 1.0f : 0.7f + net.minecraft.u.b.n.a(((float)n2 - f2) * (float)Math.PI * 0.2f) * 0.3f;
    }

    public void a(float f2, long l2) {
        int n2;
        boolean bl2 = dx.j();
        if (!(bl2 || !this.h.w.z || this.h.w.A && org.lwjgl.a.j.a(1))) {
            if (net.minecraft.client.r.I() - this.F > 500L) {
                this.h.q();
            }
        } else {
            this.F = net.minecraft.client.r.I();
        }
        this.h.D.a("mouse");
        if (bl2 && net.minecraft.client.r.b && this.h.z && !org.lwjgl.a.j.z()) {
            org.lwjgl.a.j.b(false);
            org.lwjgl.a.j.a(dx.C() / 2, dx.D() / 2 - 20);
            org.lwjgl.a.j.b(true);
        }
        if (this.h.z && bl2) {
            this.h.x.c();
            float f3 = this.h.w.b * 0.6f + 0.2f;
            float f4 = f3 * f3 * f3 * 8.0f;
            float f5 = (float)this.h.x.a * f4;
            float f6 = (float)this.h.x.b * f4;
            n2 = 1;
            if (this.h.w.c) {
                n2 = -1;
            }
            if (this.h.w.ax) {
                this.s += f5;
                this.t += f6;
                float f7 = f2 - this.w;
                this.w = f2;
                f5 = this.u * f7;
                f6 = this.v * f7;
                this.h.j.f(f5, f6 * (float)n2);
            } else {
                this.s = 0.0f;
                this.t = 0.0f;
                this.h.j.f(f5, f6 * (float)n2);
            }
        }
        this.h.D.b();
        if (!this.h.u) {
            a = this.h.w.f;
            cv cv2 = new cv(this.h);
            int n3 = cv2.a();
            int n4 = cv2.b();
            int n5 = org.lwjgl.a.j.q() * n3 / this.h.e;
            n2 = n4 - org.lwjgl.a.j.r() * n4 / this.h.f - 1;
            int n6 = this.h.w.h;
            if (this.h.h != null) {
                this.h.D.a("level");
                int n7 = Math.min(net.minecraft.client.r.ae(), n6);
                n7 = Math.max(n7, 60);
                long l3 = System.nanoTime() - l2;
                long l4 = Math.max((long)(1000000000 / n7 / 4) - l3, 0L);
                this.b(f2, System.nanoTime() + l4);
                if (this.h.E() && this.E < net.minecraft.client.r.I() - 1000L) {
                    this.E = net.minecraft.client.r.I();
                    if (!this.h.F().I()) {
                        this.l();
                    }
                }
                if (ay.O) {
                    this.h.i.b();
                    if (this.ab != null && this.ae) {
                        bd.l(5890);
                        bd.D();
                        bd.C();
                        this.ab.a(f2);
                        bd.E();
                    }
                    this.h.b().a(true);
                }
                this.G = System.nanoTime();
                this.h.D.c("gui");
                if (!this.h.w.ar || this.h.o != null) {
                    bd.a(516, 0.1f);
                    this.h.t.a(f2);
                }
                this.h.D.b();
            } else {
                bd.b(0, 0, this.h.e, this.h.f);
                bd.l(5889);
                bd.C();
                bd.l(5888);
                bd.C();
                this.h();
                this.G = System.nanoTime();
            }
            if (this.h.o != null) {
                bd.k(256);
                try {
                    this.h.o.a(n5, n2, f2);
                }
                catch (Throwable throwable) {
                    net.minecraft.k.a a2 = net.minecraft.k.a.a(throwable, "Rendering screen");
                    i i2 = a2.a("Screen render details");
                    i2.a("Screen name", new cl(this));
                    i2.a("Mouse location", new cd(this, n5, n2));
                    i2.a("Screen size", new o(this, cv2));
                    throw new bo(a2);
                }
            }
        }
    }

    private void l() {
        if (this.h.i.g() > 10 && this.h.i.k() && !this.h.F().I()) {
            BufferedImage bufferedImage = br.a(this.h.e, this.h.f, this.h.b());
            int n2 = bufferedImage.getWidth();
            int n3 = bufferedImage.getHeight();
            int n4 = 0;
            int n5 = 0;
            if (n2 > n3) {
                n4 = (n2 - n3) / 2;
                n2 = n3;
            } else {
                n5 = (n3 - n2) / 2;
            }
            try {
                BufferedImage bufferedImage2 = new BufferedImage(64, 64, 1);
                Graphics2D graphics2D = bufferedImage2.createGraphics();
                graphics2D.drawImage(bufferedImage, 0, 0, 64, 64, n4, n5, n4 + n2, n5 + n2, null);
                graphics2D.dispose();
                ImageIO.write((RenderedImage)bufferedImage2, "png", this.h.F().J());
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
        n n2 = this.h.Z();
        boolean bl3 = bl2 = n2 instanceof net.minecraft.w.a.b && !this.h.w.ar;
        if (bl2 && !((net.minecraft.w.a.b)n2).J.e) {
            cu cu2 = ((net.minecraft.w.a.b)n2).bC();
            if (this.h.v != null && this.h.v.a == net.minecraft.u.b.p.b) {
                net.minecraft.u.b.b b2 = this.h.v.a();
                cn cn2 = this.h.h.n(b2).c();
                bl2 = this.h.d.l() == net.minecraft.q.am.e ? cn2.n() && this.h.h.q(b2) instanceof net.minecraft.h.y : cu2 != null && (cu2.a(cn2) || cu2.b(cn2));
            }
        }
        return bl2;
    }

    public void b(float f2, long l2) {
        this.g(f2);
        if (this.h.Z() == null) {
            this.h.a(this.h.j);
        }
        this.a(f2);
        bd.j();
        bd.d();
        bd.a(516, 0.5f);
        this.h.D.a("center");
        if (this.h.w.f) {
            b = 0;
            bd.a(false, true, true, false);
            this.a(0, f2, l2);
            b = 1;
            bd.a(true, false, false, false);
            this.a(1, f2, l2);
            bd.a(true, true, true, false);
        } else {
            this.a(2, f2, l2);
        }
        this.h.D.b();
    }

    private void a(int n2, float f2, long l2) {
        ar ar2 = this.h.i;
        net.minecraft.client.a.f f3 = this.h.l;
        boolean bl2 = this.m();
        bd.p();
        this.h.D.c("clear");
        bd.b(0, 0, this.h.e, this.h.f);
        this.h(f2);
        bd.k(16640);
        this.h.D.c("camera");
        this.a(f2, n2);
        ao.a(this.h.j, this.h.w.as == 2);
        this.h.D.c("frustum");
        net.minecraft.client.g.g.b.a();
        this.h.D.c("culling");
        e e2 = new e();
        n n3 = this.h.Z();
        double d2 = n3.br + (n3.aU - n3.br) * (double)f2;
        double d3 = n3.bs + (n3.aV - n3.bs) * (double)f2;
        double d4 = n3.bt + (n3.aW - n3.bt) * (double)f2;
        e2.a(d2, d3, d4);
        if (this.h.w.d >= 4) {
            this.a(-1, f2);
            this.h.D.c("sky");
            bd.l(5889);
            bd.C();
            org.lwjgl.util.a.j.a(this.a(f2, true), (float)this.h.e / (float)this.h.f, 0.05f, this.k * 2.0f);
            bd.l(5888);
            ar2.a(f2, n2);
            bd.l(5889);
            bd.C();
            org.lwjgl.util.a.j.a(this.a(f2, true), (float)this.h.e / (float)this.h.f, 0.05f, this.k * net.minecraft.u.b.n.a);
            bd.l(5888);
        }
        this.a(0, f2);
        bd.j(7425);
        if (n3.aV + (double)n3.ce_() < 128.0) {
            this.a(ar2, f2, n2);
        }
        this.h.D.c("prepareterrain");
        this.a(0, f2);
        this.h.N().a(net.minecraft.client.g.a.f.b);
        am.a();
        this.h.D.c("terrain_setup");
        ar2.a(n3, f2, e2, this.af++, this.h.j.a());
        if (n2 == 0 || n2 == 2) {
            this.h.D.c("updatechunks");
            this.h.i.a(l2);
        }
        this.h.D.c("terrain");
        bd.l(5888);
        bd.D();
        bd.c();
        ar2.a(net.minecraft.u.c.a, (double)f2, n2, n3);
        bd.d();
        ar2.a(net.minecraft.u.c.b, (double)f2, n2, n3);
        this.h.N().b(net.minecraft.client.g.a.f.b).b(false, false);
        ar2.a(net.minecraft.u.c.c, (double)f2, n2, n3);
        this.h.N().b(net.minecraft.client.g.a.f.b).d();
        bd.j(7424);
        bd.a(516, 0.1f);
        if (!this.X) {
            bd.l(5888);
            bd.E();
            bd.D();
            am.b();
            this.h.D.c("entities");
            ar2.a(n3, e2, f2);
            am.a();
            this.f();
        }
        bd.l(5888);
        bd.E();
        if (bl2 && this.h.v != null && !n3.a(net.minecraft.g.a.h.h)) {
            net.minecraft.w.a.b b2 = (net.minecraft.w.a.b)n3;
            bd.c();
            this.h.D.c("outline");
            ar2.a(b2, this.h.v, 0, f2);
            bd.d();
        }
        if (this.h.r.a()) {
            this.h.r.a(f2, l2);
        }
        this.h.D.c("destroyProgress");
        bd.l();
        bd.a(net.minecraft.client.g.ad.l, bc.e, net.minecraft.client.g.ad.e, bc.n);
        this.h.N().b(net.minecraft.client.g.a.f.b).b(false, false);
        ar2.a(ci.a(), ci.a().c(), n3, f2);
        this.h.N().b(net.minecraft.client.g.a.f.b).d();
        bd.k();
        if (!this.X) {
            this.g();
            this.h.D.c("litParticles");
            f3.b(n3, f2);
            am.a();
            this.a(0, f2);
            this.h.D.c("particles");
            f3.a(n3, f2);
            this.f();
        }
        bd.a(false);
        bd.p();
        this.h.D.c("weather");
        this.c(f2);
        bd.a(true);
        ar2.a(n3, f2);
        bd.k();
        bd.p();
        bd.a(net.minecraft.client.g.ad.l, bc.j, net.minecraft.client.g.ad.e, bc.n);
        bd.a(516, 0.1f);
        this.a(0, f2);
        bd.l();
        bd.a(false);
        this.h.N().a(net.minecraft.client.g.a.f.b);
        bd.j(7425);
        this.h.D.c("translucent");
        ar2.a(net.minecraft.u.c.d, (double)f2, n2, n3);
        bd.j(7424);
        bd.a(true);
        bd.p();
        bd.k();
        bd.o();
        if (n3.aV + (double)n3.ce_() >= 128.0) {
            this.h.D.c("aboveClouds");
            this.a(ar2, f2, n2);
        }
        this.h.D.c("hand");
        if (this.C) {
            bd.k(256);
            this.b(f2, n2);
        }
    }

    private void a(ar ar2, float f2, int n2) {
        if (this.h.w.e() != 0) {
            this.h.D.c("clouds");
            bd.l(5889);
            bd.C();
            org.lwjgl.util.a.j.a(this.a(f2, true), (float)this.h.e / (float)this.h.f, 0.05f, this.k * 4.0f);
            bd.l(5888);
            bd.D();
            this.a(0, f2);
            ar2.b(f2, n2);
            bd.o();
            bd.E();
            bd.l(5889);
            bd.C();
            org.lwjgl.util.a.j.a(this.a(f2, true), (float)this.h.e / (float)this.h.f, 0.05f, this.k * net.minecraft.u.b.n.a);
            bd.l(5888);
        }
    }

    private void n() {
        float f2 = this.h.h.j(1.0f);
        if (!this.h.w.j) {
            f2 /= 2.0f;
        }
        if (f2 != 0.0f) {
            this.j.setSeed((long)this.m * 312987231L);
            n n2 = this.h.Z();
            net.minecraft.client.i.d d2 = this.h.h;
            net.minecraft.u.b.b b2 = new net.minecraft.u.b.b(n2);
            int n3 = 10;
            double d3 = 0.0;
            double d4 = 0.0;
            double d5 = 0.0;
            int n4 = 0;
            int n5 = (int)(100.0f * f2 * f2);
            if (this.h.w.aD == 1) {
                n5 >>= 1;
            } else if (this.h.w.aD == 2) {
                n5 = 0;
            }
            for (int i2 = 0; i2 < n5; ++i2) {
                net.minecraft.u.b.b b3 = d2.o(b2.a(this.j.nextInt(10) - this.j.nextInt(10), 0, this.j.nextInt(10) - this.j.nextInt(10)));
                q q2 = d2.a(b3);
                net.minecraft.u.b.b b4 = b3.c();
                net.minecraft.g.c.b b5 = d2.n(b4);
                if (b3.k() > b2.k() + 10 || b3.k() < b2.k() - 10 || !q2.g() || !(q2.c(b3) >= 0.15f)) continue;
                double d6 = this.j.nextDouble();
                double d7 = this.j.nextDouble();
                net.minecraft.u.b.a a2 = b5.c((net.minecraft.q.n)d2, b4);
                if (b5.d() != net.minecraft.g.a.h.i && b5.c() != net.minecraft.a.p.df) {
                    if (b5.d() == net.minecraft.g.a.h.a) continue;
                    if (this.j.nextInt(++n4) == 0) {
                        d3 = (double)b4.cy_() + d6;
                        d4 = (double)((float)b4.k() + 0.1f) + a2.e - 1.0;
                        d5 = (double)b4.l() + d7;
                    }
                    this.h.h.a(aj.N, (double)b4.cy_() + d6, (double)((float)b4.k() + 0.1f) + a2.e, (double)b4.l() + d7, 0.0, 0.0, 0.0, new int[0]);
                    continue;
                }
                this.h.h.a(aj.l, (double)b3.cy_() + d6, (double)((float)b3.k() + 0.1f) - a2.b, (double)b3.l() + d7, 0.0, 0.0, 0.0, new int[0]);
            }
            if (n4 > 0 && this.j.nextInt(3) < this.N++) {
                this.N = 0;
                if (d4 > (double)(b2.k() + 1) && d2.o(b2).k() > net.minecraft.u.b.n.d((float)b2.k())) {
                    this.h.h.a(d3, d4, d5, net.minecraft.a.f.gO, bu.d, 0.1f, 0.5f, false);
                } else {
                    this.h.h.a(d3, d4, d5, net.minecraft.a.f.gN, bu.d, 0.2f, 1.0f, false);
                }
            }
        }
    }

    protected void c(float f2) {
        float f3 = this.h.h.j(f2);
        if (f3 > 0.0f) {
            this.g();
            n n2 = this.h.Z();
            net.minecraft.client.i.d d2 = this.h.h;
            int n3 = net.minecraft.u.b.n.c(n2.aU);
            int n4 = net.minecraft.u.b.n.c(n2.aV);
            int n5 = net.minecraft.u.b.n.c(n2.aW);
            ci ci2 = ci.a();
            g g2 = ci2.c();
            bd.q();
            bd.a(0.0f, 1.0f, 0.0f);
            bd.l();
            bd.a(net.minecraft.client.g.ad.l, bc.j, net.minecraft.client.g.ad.e, bc.n);
            bd.a(516, 0.1f);
            double d3 = n2.br + (n2.aU - n2.br) * (double)f2;
            double d4 = n2.bs + (n2.aV - n2.bs) * (double)f2;
            double d5 = n2.bt + (n2.aW - n2.bt) * (double)f2;
            int n6 = net.minecraft.u.b.n.c(d4);
            int n7 = 5;
            if (this.h.w.j) {
                n7 = 10;
            }
            int n8 = -1;
            float f4 = (float)this.m + f2;
            g2.c(-d3, -d4, -d5);
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            net.minecraft.u.b.g g3 = new net.minecraft.u.b.g();
            for (int i2 = n5 - n7; i2 <= n5 + n7; ++i2) {
                for (int i3 = n3 - n7; i3 <= n3 + n7; ++i3) {
                    double d6;
                    double d7;
                    double d8;
                    int n9 = (i2 - n5 + 16) * 32 + i3 - n3 + 16;
                    double d9 = (double)this.O[n9] * 0.5;
                    double d10 = (double)this.P[n9] * 0.5;
                    g3.b(i3, 0, i2);
                    q q2 = d2.a(g3);
                    if (!q2.g() && !q2.f()) continue;
                    int n10 = d2.o(g3).k();
                    int n11 = n4 - n7;
                    int n12 = n4 + n7;
                    if (n11 < n10) {
                        n11 = n10;
                    }
                    if (n12 < n10) {
                        n12 = n10;
                    }
                    int n13 = n10;
                    if (n10 < n6) {
                        n13 = n6;
                    }
                    if (n11 == n12) continue;
                    this.j.setSeed(i3 * i3 * 3121 + i3 * 45238971 ^ i2 * i2 * 418711 + i2 * 13761);
                    g3.b(i3, n11, i2);
                    float f5 = q2.c(g3);
                    if (d2.k().a(f5, n10) >= 0.15f) {
                        if (n8 != 0) {
                            if (n8 >= 0) {
                                ci2.b();
                            }
                            n8 = 0;
                            this.h.N().a(f);
                            g2.a(7, net.minecraft.client.g.d.b.d);
                        }
                        d8 = -((double)(this.m + i3 * i3 * 3121 + i3 * 45238971 + i2 * i2 * 418711 + i2 * 13761 & 0x1F) + (double)f2) / 32.0 * (3.0 + this.j.nextDouble());
                        d7 = (double)((float)i3 + 0.5f) - n2.aU;
                        d6 = (double)((float)i2 + 0.5f) - n2.aW;
                        float f6 = net.minecraft.u.b.n.a(d7 * d7 + d6 * d6) / (float)n7;
                        float f7 = ((1.0f - f6 * f6) * 0.5f + 0.5f) * f3;
                        g3.b(i3, n13, i2);
                        int n14 = d2.b((net.minecraft.u.b.b)g3, 0);
                        int n15 = n14 >> 16 & 0xFFFF;
                        int n16 = n14 & 0xFFFF;
                        g2.b((double)i3 - d9 + 0.5, (double)n12, (double)i2 - d10 + 0.5).a(0.0, (double)n11 * 0.25 + d8).a(1.0f, 1.0f, 1.0f, f7).a(n15, n16).d();
                        g2.b((double)i3 + d9 + 0.5, (double)n12, (double)i2 + d10 + 0.5).a(1.0, (double)n11 * 0.25 + d8).a(1.0f, 1.0f, 1.0f, f7).a(n15, n16).d();
                        g2.b((double)i3 + d9 + 0.5, (double)n11, (double)i2 + d10 + 0.5).a(1.0, (double)n12 * 0.25 + d8).a(1.0f, 1.0f, 1.0f, f7).a(n15, n16).d();
                        g2.b((double)i3 - d9 + 0.5, (double)n11, (double)i2 - d10 + 0.5).a(0.0, (double)n12 * 0.25 + d8).a(1.0f, 1.0f, 1.0f, f7).a(n15, n16).d();
                        continue;
                    }
                    if (n8 != 1) {
                        if (n8 >= 0) {
                            ci2.b();
                        }
                        n8 = 1;
                        this.h.N().a(g);
                        g2.a(7, net.minecraft.client.g.d.b.d);
                    }
                    d8 = -((float)(this.m & 0x1FF) + f2) / 512.0f;
                    d7 = this.j.nextDouble() + (double)f4 * 0.01 * (double)((float)this.j.nextGaussian());
                    d6 = this.j.nextDouble() + (double)(f4 * (float)this.j.nextGaussian()) * 0.001;
                    double d11 = (double)((float)i3 + 0.5f) - n2.aU;
                    double d12 = (double)((float)i2 + 0.5f) - n2.aW;
                    float f8 = net.minecraft.u.b.n.a(d11 * d11 + d12 * d12) / (float)n7;
                    float f9 = ((1.0f - f8 * f8) * 0.3f + 0.5f) * f3;
                    g3.b(i3, n13, i2);
                    int n17 = (d2.b((net.minecraft.u.b.b)g3, 0) * 3 + 0xF000F0) / 4;
                    int n18 = n17 >> 16 & 0xFFFF;
                    int n19 = n17 & 0xFFFF;
                    g2.b((double)i3 - d9 + 0.5, (double)n12, (double)i2 - d10 + 0.5).a(0.0 + d7, (double)n11 * 0.25 + d8 + d6).a(1.0f, 1.0f, 1.0f, f9).a(n18, n19).d();
                    g2.b((double)i3 + d9 + 0.5, (double)n12, (double)i2 + d10 + 0.5).a(1.0 + d7, (double)n11 * 0.25 + d8 + d6).a(1.0f, 1.0f, 1.0f, f9).a(n18, n19).d();
                    g2.b((double)i3 + d9 + 0.5, (double)n11, (double)i2 + d10 + 0.5).a(1.0 + d7, (double)n12 * 0.25 + d8 + d6).a(1.0f, 1.0f, 1.0f, f9).a(n18, n19).d();
                    g2.b((double)i3 - d9 + 0.5, (double)n11, (double)i2 - d10 + 0.5).a(0.0 + d7, (double)n12 * 0.25 + d8 + d6).a(1.0f, 1.0f, 1.0f, f9).a(n18, n19).d();
                }
            }
            if (n8 >= 0) {
                ci2.b();
            }
            g2.c(0.0, 0.0, 0.0);
            bd.p();
            bd.k();
            bd.a(516, 0.1f);
            this.f();
        }
    }

    public void h() {
        cv cv2 = new cv(this.h);
        bd.k(256);
        bd.l(5889);
        bd.C();
        bd.a(0.0, cv2.c(), cv2.d(), 0.0, 1000.0, 3000.0);
        bd.l(5888);
        bd.C();
        bd.c(0.0f, 0.0f, -2000.0f);
    }

    private void h(float f2) {
        float f3;
        float f4;
        float f5;
        Object object;
        net.minecraft.client.i.d d2 = this.h.h;
        n n2 = this.h.Z();
        float f6 = 0.25f + 0.75f * (float)this.h.w.d / 32.0f;
        f6 = 1.0f - (float)Math.pow(f6, 0.25);
        net.minecraft.u.b.s s2 = d2.a(this.h.Z(), f2);
        float f7 = (float)s2.b;
        float f8 = (float)s2.c;
        float f9 = (float)s2.d;
        net.minecraft.u.b.s s3 = d2.f(f2);
        this.R = (float)s3.b;
        this.S = (float)s3.c;
        this.T = (float)s3.d;
        if (this.h.w.d >= 4) {
            float[] arrf;
            double d3 = net.minecraft.u.b.n.a(d2.d(f2)) > 0.0f ? -1.0 : 1.0;
            object = new net.minecraft.u.b.s(d3, 0.0, 0.0);
            f5 = (float)n2.i(f2).b((net.minecraft.u.b.s)object);
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 > 0.0f && (arrf = d2.q.a(d2.c(f2), f2)) != null) {
                this.R = this.R * (1.0f - (f5 *= arrf[3])) + arrf[0] * f5;
                this.S = this.S * (1.0f - f5) + arrf[1] * f5;
                this.T = this.T * (1.0f - f5) + arrf[2] * f5;
            }
        }
        this.R += (f7 - this.R) * f6;
        this.S += (f8 - this.S) * f6;
        this.T += (f9 - this.T) * f6;
        float f10 = d2.j(f2);
        if (f10 > 0.0f) {
            f4 = 1.0f - f10 * 0.5f;
            float f11 = 1.0f - f10 * 0.4f;
            this.R *= f4;
            this.S *= f4;
            this.T *= f11;
        }
        if ((f4 = d2.h(f2)) > 0.0f) {
            float f12 = 1.0f - f4 * 0.5f;
            this.R *= f12;
            this.S *= f12;
            this.T *= f12;
        }
        object = ao.a(this.h.h, n2, f2);
        if (this.B) {
            net.minecraft.u.b.s s4 = d2.e(f2);
            this.R = (float)s4.b;
            this.S = (float)s4.c;
            this.T = (float)s4.d;
        } else if (object.d() == net.minecraft.g.a.h.h) {
            f5 = 0.0f;
            if (n2 instanceof l) {
                f5 = (float)net.minecraft.o.f.c((l)n2) * 0.2f;
                if (((l)n2).b(net.minecraft.a.c.m)) {
                    f5 = f5 * 0.3f + 0.6f;
                }
            }
            this.R = 0.02f + f5;
            this.S = 0.02f + f5;
            this.T = 0.2f + f5;
        } else if (object.d() == net.minecraft.g.a.h.i) {
            this.R = 0.6f;
            this.S = 0.1f;
            this.T = 0.0f;
        }
        float f13 = this.U + (this.V - this.U) * f2;
        this.R *= f13;
        this.S *= f13;
        this.T *= f13;
        double d4 = (n2.bs + (n2.aV - n2.bs) * (double)f2) * d2.q.k();
        if (n2 instanceof l && ((l)n2).b(net.minecraft.a.c.o)) {
            int n3 = ((l)n2).c(net.minecraft.a.c.o).b();
            d4 = n3 < 20 ? (d4 *= (double)(1.0f - (float)n3 / 20.0f)) : 0.0;
        }
        if (d4 < 1.0) {
            if (d4 < 0.0) {
                d4 = 0.0;
            }
            d4 *= d4;
            this.R = (float)((double)this.R * d4);
            this.S = (float)((double)this.S * d4);
            this.T = (float)((double)this.T * d4);
        }
        if (this.z > 0.0f) {
            float f14 = this.A + (this.z - this.A) * f2;
            this.R = this.R * (1.0f - f14) + this.R * 0.7f * f14;
            this.S = this.S * (1.0f - f14) + this.S * 0.6f * f14;
            this.T = this.T * (1.0f - f14) + this.T * 0.6f * f14;
        }
        if (n2 instanceof l && ((l)n2).b(net.minecraft.a.c.p)) {
            float f15 = this.a((l)n2, f2);
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
        if (this.h.w.f) {
            float f16 = (this.R * 30.0f + this.S * 59.0f + this.T * 11.0f) / 100.0f;
            f3 = (this.R * 30.0f + this.S * 70.0f) / 100.0f;
            float f17 = (this.R * 30.0f + this.T * 70.0f) / 100.0f;
            this.R = f16;
            this.S = f3;
            this.T = f17;
        }
        bd.a(this.R, this.S, this.T, 0.0f);
    }

    private void a(int n2, float f2) {
        n n3 = this.h.Z();
        bd.b(2918, this.a(this.R, this.S, this.T, 1.0f));
        bd.a(0.0f, -1.0f, 0.0f);
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        net.minecraft.g.c.b b2 = ao.a(this.h.h, n3, f2);
        if (n3 instanceof l && ((l)n3).b(net.minecraft.a.c.o)) {
            float f3 = 5.0f;
            int n4 = ((l)n3).c(net.minecraft.a.c.o).b();
            if (n4 < 20) {
                f3 = 5.0f + (this.k - 5.0f) * (1.0f - (float)n4 / 20.0f);
            }
            bd.a(cs.a);
            if (n2 == -1) {
                bd.b(0.0f);
                bd.c(f3 * 0.8f);
            } else {
                bd.b(f3 * 0.25f);
                bd.c(f3);
            }
            if (GLContext.a().fk) {
                bd.c(34138, 34139);
            }
        } else if (this.B) {
            bd.a(cs.b);
            bd.a(0.1f);
        } else if (b2.d() == net.minecraft.g.a.h.h) {
            bd.a(cs.b);
            if (n3 instanceof l) {
                if (((l)n3).b(net.minecraft.a.c.m)) {
                    bd.a(0.01f);
                } else {
                    bd.a(0.1f - (float)net.minecraft.o.f.c((l)n3) * 0.03f);
                }
            } else {
                bd.a(0.1f);
            }
        } else if (b2.d() == net.minecraft.g.a.h.i) {
            bd.a(cs.b);
            bd.a(2.0f);
        } else {
            float f4 = this.k;
            bd.a(cs.a);
            if (n2 == -1) {
                bd.b(0.0f);
                bd.c(f4);
            } else {
                bd.b(f4 * 0.75f);
                bd.c(f4);
            }
            if (GLContext.a().fk) {
                bd.c(34138, 34139);
            }
            if (this.h.h.q.c((int)n3.aU, (int)n3.aW) || this.h.t.i().e()) {
                bd.b(f4 * 0.05f);
                bd.c(Math.min(f4, 192.0f) * 0.5f);
            }
        }
        bd.g();
        bd.n();
        bd.a(1028, 4608);
    }

    private FloatBuffer a(float f2, float f3, float f4, float f5) {
        this.Q.clear();
        this.Q.put(f2).put(f3).put(f4).put(f5);
        this.Q.flip();
        return this.Q;
    }

    public net.minecraft.client.k.bc i() {
        return this.l;
    }

    public static void a(ce ce2, String string, float f2, float f3, float f4, int n2, float f5, float f6, boolean bl2, boolean bl3) {
        bd.D();
        bd.c(f2, f3, f4);
        bd.a(0.0f, 1.0f, 0.0f);
        bd.b(-f5, 0.0f, 1.0f, 0.0f);
        bd.b((float)(bl2 ? -1 : 1) * f6, 1.0f, 0.0f, 0.0f);
        bd.b(-0.025f, -0.025f, 0.025f);
        bd.f();
        bd.a(false);
        if (!bl3) {
            bd.i();
        }
        bd.l();
        bd.a(net.minecraft.client.g.ad.l, bc.j, net.minecraft.client.g.ad.e, bc.n);
        int n3 = ce2.a(string) / 2;
        bd.w();
        ci ci2 = ci.a();
        g g2 = ci2.c();
        g2.a(7, net.minecraft.client.g.d.b.f);
        g2.b((double)(-n3 - 1), (double)(-1 + n2), 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        g2.b((double)(-n3 - 1), (double)(8 + n2), 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        g2.b((double)(n3 + 1), (double)(8 + n2), 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        g2.b((double)(n3 + 1), (double)(-1 + n2), 0.0).a(0.0f, 0.0f, 0.0f, 0.25f).d();
        ci2.b();
        bd.v();
        if (!bl3) {
            ce2.a(string, -ce2.a(string) / 2, n2, 0x20FFFFFF);
            bd.j();
        }
        bd.a(true);
        ce2.a(string, -ce2.a(string) / 2, n2, bl3 ? 0x20FFFFFF : -1);
        bd.e();
        bd.k();
        bd.c(1.0f, 1.0f, 1.0f, 1.0f);
        bd.E();
    }

    static /* synthetic */ r a(cc cc2) {
        return cc2.h;
    }
}

