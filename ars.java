/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ars {
    private final String j;
    protected List a = ov.a();
    protected int[][] b;
    private gf k;
    protected boolean c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    private float l;
    private float m;
    private float n;
    private float o;
    protected int h;
    protected int i;

    protected ars(String string) {
        this.j = string;
    }

    protected static ars a(bpx bpx2) {
        return new ars(bpx2.toString());
    }

    public void a(int n2, int n3, int n4, int n5, boolean bl2) {
        this.d = n4;
        this.e = n5;
        this.c = bl2;
        float f2 = (float)((double)0.01f / (double)n2);
        float f3 = (float)((double)0.01f / (double)n3);
        this.l = (float)n4 / (float)((double)n2) + f2;
        this.m = (float)(n4 + this.f) / (float)((double)n2) - f2;
        this.n = (float)n5 / (float)n3 + f3;
        this.o = (float)(n5 + this.g) / (float)n3 - f3;
    }

    public void a(ars ars2) {
        this.d = ars2.d;
        this.e = ars2.e;
        this.f = ars2.f;
        this.g = ars2.g;
        this.c = ars2.c;
        this.l = ars2.l;
        this.m = ars2.m;
        this.n = ars2.n;
        this.o = ars2.o;
    }

    public int a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public int d() {
        return this.g;
    }

    public float e() {
        return this.l;
    }

    public float f() {
        return this.m;
    }

    public float a(double d2) {
        float f2 = this.m - this.l;
        return this.l + f2 * (float)d2 / 16.0f;
    }

    public float a(float f2) {
        float f3 = this.m - this.l;
        return (f2 - this.l) / f3 * 16.0f;
    }

    public float g() {
        return this.n;
    }

    public float h() {
        return this.o;
    }

    public float b(double d2) {
        float f2 = this.o - this.n;
        return this.n + f2 * (float)d2 / 16.0f;
    }

    public float b(float f2) {
        float f3 = this.o - this.n;
        return (f2 - this.n) / f3 * 16.0f;
    }

    public String i() {
        return this.j;
    }

    public void j() {
        ++this.i;
        if (this.i >= this.k.a(this.h)) {
            int n2 = this.k.c(this.h);
            int n3 = this.k.c() == 0 ? this.a.size() : this.k.c();
            this.h = (this.h + 1) % n3;
            this.i = 0;
            int n4 = this.k.c(this.h);
            if (n2 != n4 && n4 >= 0 && n4 < this.a.size()) {
                anq.a((int[][])this.a.get(n4), this.f, this.g, this.d, this.e, false, false);
            }
        } else if (this.k.e()) {
            this.n();
        }
    }

    private void n() {
        int n2;
        int n3;
        double d2 = 1.0 - (double)this.i / (double)this.k.a(this.h);
        int n4 = this.k.c(this.h);
        if (n4 != (n3 = this.k.c((this.h + 1) % (n2 = this.k.c() == 0 ? this.a.size() : this.k.c()))) && n3 >= 0 && n3 < this.a.size()) {
            int[][] arrn = (int[][])this.a.get(n4);
            int[][] arrn2 = (int[][])this.a.get(n3);
            if (this.b == null || this.b.length != arrn.length) {
                this.b = new int[arrn.length][];
            }
            for (int i2 = 0; i2 < arrn.length; ++i2) {
                if (this.b[i2] == null) {
                    this.b[i2] = new int[arrn[i2].length];
                }
                if (i2 >= arrn2.length || arrn2[i2].length != arrn[i2].length) continue;
                for (int i3 = 0; i3 < arrn[i2].length; ++i3) {
                    int n5 = arrn[i2][i3];
                    int n6 = arrn2[i2][i3];
                    int n7 = this.a(d2, n5 >> 16 & 0xFF, n6 >> 16 & 0xFF);
                    int n8 = this.a(d2, n5 >> 8 & 0xFF, n6 >> 8 & 0xFF);
                    int n9 = this.a(d2, n5 & 0xFF, n6 & 0xFF);
                    this.b[i2][i3] = n5 & 0xFF000000 | n7 << 16 | n8 << 8 | n9;
                }
            }
            anq.a(this.b, this.f, this.g, this.d, this.e, false, false);
        }
    }

    private int a(double d2, int n2, int n3) {
        return (int)(d2 * (double)n2 + (1.0 - d2) * (double)n3);
    }

    public int[][] a(int n2) {
        return (int[][])this.a.get(n2);
    }

    public int k() {
        return this.a.size();
    }

    public void b(int n2) {
        this.f = n2;
    }

    public void c(int n2) {
        this.g = n2;
    }

    public void a(ddt ddt2, boolean bl2) {
        this.o();
        this.f = ddt2.a;
        this.g = ddt2.b;
        if (bl2) {
            this.g = this.f;
        } else if (ddt2.b != ddt2.a) {
            throw new RuntimeException("broken aspect ratio and not an animation");
        }
    }

    public void a(dbr dbr2, int n2) {
        BufferedImage bufferedImage = anq.a(dbr2.b());
        gf gf2 = (gf)dbr2.a("animation");
        int[][] arrarrn = new int[n2][];
        arrarrn[0] = new int[bufferedImage.getWidth() * bufferedImage.getHeight()];
        bufferedImage.getRGB(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight(), arrarrn[0], 0, bufferedImage.getWidth());
        if (gf2 == null) {
            this.a.add(arrarrn);
        } else {
            int n3 = bufferedImage.getHeight() / this.f;
            if (gf2.c() > 0) {
                Iterator iterator = gf2.f().iterator();
                while (iterator.hasNext()) {
                    int n4 = (Integer)iterator.next();
                    if (n4 >= n3) {
                        throw new RuntimeException("invalid frameindex " + n4);
                    }
                    this.e(n4);
                    this.a.set(n4, ars.a(arrarrn, this.f, this.f, n4));
                }
                this.k = gf2;
            } else {
                ArrayList arrayList = ov.a();
                for (int i2 = 0; i2 < n3; ++i2) {
                    this.a.add(ars.a(arrarrn, this.f, this.f, i2));
                    arrayList.add(new cfo(i2, -1));
                }
                this.k = new gf(arrayList, this.f, this.g, gf2.d(), gf2.e());
            }
        }
    }

    public void d(int n2) {
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            int[][] arrn = (int[][])this.a.get(i2);
            if (arrn == null) continue;
            try {
                arrayList.add(anq.a(n2, this.f, arrn));
                continue;
            }
            catch (Throwable throwable) {
                cet cet2 = cet.a(throwable, "Generating mipmaps for frame");
                sx sx2 = cet2.a("Frame being iterated");
                sx2.a("Frame index", i2);
                sx2.a("Frame sizes", new beh(this, arrn));
                throw new oz(cet2);
            }
        }
        this.a(arrayList);
    }

    private void e(int n2) {
        if (this.a.size() > n2) {
            return;
        }
        for (int i2 = this.a.size(); i2 <= n2; ++i2) {
            this.a.add(null);
        }
    }

    private static int[][] a(int[][] arrn, int n2, int n3, int n4) {
        int[][] arrarrn = new int[arrn.length][];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            int[] arrn2 = arrn[i2];
            if (arrn2 == null) continue;
            arrarrn[i2] = new int[(n2 >> i2) * (n3 >> i2)];
            System.arraycopy(arrn2, n4 * arrarrn[i2].length, arrarrn[i2], 0, arrarrn[i2].length);
        }
        return arrarrn;
    }

    public void l() {
        this.a.clear();
    }

    public boolean m() {
        return this.k != null;
    }

    public void a(List list) {
        this.a = list;
    }

    private void o() {
        this.k = null;
        this.a(ov.a());
        this.h = 0;
        this.i = 0;
    }

    public String toString() {
        return "TextureAtlasSprite{name='" + this.j + '\'' + ", frameCount=" + this.a.size() + ", rotated=" + this.c + ", x=" + this.d + ", y=" + this.e + ", height=" + this.g + ", width=" + this.f + ", u0=" + this.l + ", u1=" + this.m + ", v0=" + this.n + ", v1=" + this.o + '}';
    }
}

