/*
 * Decompiled with CFR 0.150.
 */
public class aqc
extends ev {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private float w;

    public aqc(iu iu2) {
        super(iu2);
        this.a_(0.8f, 0.8f);
        this.bx.setSeed(1 + this.bW());
        this.s = 1.0f / (this.bx.nextFloat() + 1.0f) * 0.2f;
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Squid");
    }

    @Override
    protected void n() {
        this.m.a(0, new ix(this));
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(10.0);
    }

    @Override
    public float A() {
        return this.bm * 0.5f;
    }

    @Override
    protected bi q() {
        return dah.gi;
    }

    @Override
    protected bi r() {
        return dah.gk;
    }

    @Override
    protected bi s() {
        return dah.gj;
    }

    @Override
    protected float t() {
        return 0.4f;
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    protected bpx u() {
        return bvm.ah;
    }

    @Override
    public boolean V_() {
        return super.V_();
    }

    @Override
    public void Q_() {
        super.Q_();
        this.b = this.a;
        this.d = this.c;
        this.f = this.e;
        this.q = this.g;
        this.e += this.s;
        if ((double)this.e > Math.PI * 2) {
            if (this.aQ.C) {
                this.e = (float)Math.PI * 2;
            } else {
                this.e = (float)((double)this.e - Math.PI * 2);
                if (this.bx.nextInt(10) == 0) {
                    this.s = 1.0f / (this.bx.nextFloat() + 1.0f) * 0.2f;
                }
                this.aQ.a((cpk)this, (byte)19);
            }
        }
        if (this.bA) {
            float f2;
            if (this.e < (float)Math.PI) {
                f2 = this.e / (float)Math.PI;
                this.g = cmk.a(f2 * f2 * (float)Math.PI) * (float)Math.PI * 0.25f;
                if ((double)f2 > 0.75) {
                    this.r = 1.0f;
                    this.t = 1.0f;
                } else {
                    this.t *= 0.8f;
                }
            } else {
                this.g = 0.0f;
                this.r *= 0.9f;
                this.t *= 0.99f;
            }
            if (!this.aQ.C) {
                this.aX = this.u * this.r;
                this.aY = this.v * this.r;
                this.aZ = this.w * this.r;
            }
            f2 = cmk.a(this.aX * this.aX + this.aZ * this.aZ);
            this.ah += (-((float)cmk.b(this.aX, this.aZ)) * 57.295776f - this.ah) * 0.1f;
            this.ba = this.ah;
            this.c = (float)((double)this.c + Math.PI * (double)this.t * 1.5);
            this.a += (-((float)cmk.b((double)f2, this.aY)) * 57.295776f - this.a) * 0.1f;
        } else {
            this.g = cmk.e(cmk.a(this.e)) * (float)Math.PI * 0.25f;
            if (!this.aQ.C) {
                this.aX = 0.0;
                this.aZ = 0.0;
                if (this.b(ake.y)) {
                    this.aY += 0.05 * (double)(this.c(ake.y).c() + 1) - this.aY;
                } else if (!this.cf()) {
                    this.aY -= 0.08;
                }
                this.aY *= (double)0.98f;
            }
            this.a = (float)((double)this.a + (double)(-90.0f - this.a) * 0.02);
        }
    }

    @Override
    public void b(float f2, float f3) {
        this.b(this.aX, this.aY, this.aZ);
    }

    @Override
    public boolean h() {
        return this.aV > 45.0 && this.aV < (double)this.aQ.u() && super.h();
    }

    @Override
    public void a(byte by2) {
        if (by2 == 19) {
            this.e = 0.0f;
        } else {
            super.a(by2);
        }
    }

    public void a(float f2, float f3, float f4) {
        this.u = f2;
        this.v = f3;
        this.w = f4;
    }

    public boolean M() {
        return this.u != 0.0f || this.v != 0.0f || this.w != 0.0f;
    }

    static /* synthetic */ boolean a(aqc aqc2) {
        return aqc2.bA;
    }
}

