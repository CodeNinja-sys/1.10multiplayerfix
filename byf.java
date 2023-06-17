/*
 * Decompiled with CFR 0.150.
 */
public abstract class byf {
    public static final float[] a = new float[]{1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f};
    protected iu b;
    private aaf g;
    private String h;
    protected ey c;
    protected boolean d;
    protected boolean e;
    protected final float[] f = new float[16];
    private final float[] i = new float[4];

    public final void a(iu iu2) {
        this.b = iu2;
        this.g = iu2.E().s();
        this.h = iu2.E().z();
        this.c();
        this.b();
    }

    protected void b() {
        float f2 = 0.0f;
        for (int i2 = 0; i2 <= 15; ++i2) {
            float f3 = 1.0f - (float)i2 / 15.0f;
            this.f[i2] = (1.0f - f3) / (f3 * 3.0f + 1.0f) * 1.0f + 0.0f;
        }
    }

    protected void c() {
        aaf aaf2 = this.b.E().s();
        if (aaf2 == aaf.c) {
            bnv bnv2 = bnv.a(this.b.E().z());
            this.c = new cvi(anr.a(bnv2.a(), cff.b));
        } else {
            this.c = aaf2 == aaf.g ? new cvi(cff.c) : new ey(this.b.E());
        }
    }

    public tv d() {
        if (this.g == aaf.c) {
            return new aaq(this.b, this.b.y(), this.b.E().q(), this.h);
        }
        if (this.g == aaf.g) {
            return new bhx(this.b);
        }
        if (this.g == aaf.f) {
            return new qo(this.b, this.b.y(), this.b.E().q(), this.h);
        }
        return new qo(this.b, this.b.y(), this.b.E().q(), this.h);
    }

    public boolean b(int n2, int n3) {
        cmz cmz2 = new cmz(n2, 0, n3);
        if (this.b.a(cmz2).i()) {
            return true;
        }
        return this.b.b(cmz2).t() == blg.c;
    }

    public float a(long l2, float f2) {
        int n2 = (int)(l2 % 24000L);
        float f3 = ((float)n2 + f2) / 24000.0f - 0.25f;
        if (f3 < 0.0f) {
            f3 += 1.0f;
        }
        if (f3 > 1.0f) {
            f3 -= 1.0f;
        }
        float f4 = f3;
        f3 = 1.0f - (float)((Math.cos((double)f3 * Math.PI) + 1.0) / 2.0);
        f3 = f4 + (f3 - f4) / 3.0f;
        return f3;
    }

    public int a(long l2) {
        return (int)(l2 / 24000L % 8L + 8L) % 8;
    }

    public boolean e() {
        return true;
    }

    public float[] a(float f2, float f3) {
        float f4 = 0.4f;
        float f5 = cmk.b(f2 * ((float)Math.PI * 2)) - 0.0f;
        float f6 = -0.0f;
        if (f5 >= -0.4f && f5 <= 0.4f) {
            float f7 = (f5 - -0.0f) / 0.4f * 0.5f + 0.5f;
            float f8 = 1.0f - (1.0f - cmk.a(f7 * (float)Math.PI)) * 0.99f;
            f8 *= f8;
            this.i[0] = f7 * 0.3f + 0.7f;
            this.i[1] = f7 * f7 * 0.7f + 0.2f;
            this.i[2] = f7 * f7 * 0.0f + 0.2f;
            this.i[3] = f8;
            return this.i;
        }
        return null;
    }

    public amj b(float f2, float f3) {
        float f4 = cmk.b(f2 * ((float)Math.PI * 2)) * 2.0f + 0.5f;
        f4 = cmk.a(f4, 0.0f, 1.0f);
        float f5 = 0.7529412f;
        float f6 = 0.84705883f;
        float f7 = 1.0f;
        return new amj(f5 *= f4 * 0.94f + 0.06f, f6 *= f4 * 0.94f + 0.06f, f7 *= f4 * 0.91f + 0.09f);
    }

    public boolean f() {
        return true;
    }

    public float g() {
        return 128.0f;
    }

    public boolean h() {
        return true;
    }

    public cmz i() {
        return null;
    }

    public int j() {
        if (this.g == aaf.c) {
            return 4;
        }
        return this.b.u() + 1;
    }

    public double k() {
        if (this.g == aaf.c) {
            return 1.0;
        }
        return 0.03125;
    }

    public boolean c(int n2, int n3) {
        return false;
    }

    public ey l() {
        return this.c;
    }

    public boolean m() {
        return this.d;
    }

    public boolean n() {
        return this.e;
    }

    public float[] o() {
        return this.f;
    }

    public ajw p() {
        return new ajw();
    }

    public void a(czt czt2) {
    }

    public void b(czt czt2) {
    }

    public abstract cyy a();

    public void q() {
    }

    public void r() {
    }

    public boolean a(int n2, int n3) {
        return true;
    }
}

