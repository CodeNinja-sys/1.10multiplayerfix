/*
 * Decompiled with CFR 0.150.
 */
public class czc
extends qa {
    private final ahk a;
    private int K;

    protected czc(iu iu2, double d2, double d3, double d4, ahk ahk2) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.i = 0.0;
        this.j = 0.0;
        this.k = 0.0;
        if (ahk2 == ahk.h) {
            this.z = 0.0f;
            this.A = 0.0f;
            this.B = 1.0f;
        } else {
            this.z = 1.0f;
            this.A = 0.0f;
            this.B = 0.0f;
        }
        this.d(113);
        this.a(0.01f, 0.01f);
        this.y = 0.06f;
        this.a = ahk2;
        this.K = 40;
        this.w = (int)(64.0 / (Math.random() * 0.8 + 0.2));
        this.i = 0.0;
        this.j = 0.0;
        this.k = 0.0;
    }

    @Override
    public int a(float f2) {
        if (this.a == ahk.h) {
            return super.a(f2);
        }
        return 257;
    }

    @Override
    public void b() {
        cmz cmz2;
        dbk dbk2;
        ahk ahk2;
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
        if (this.a == ahk.h) {
            this.z = 0.2f;
            this.A = 0.3f;
            this.B = 1.0f;
        } else {
            this.z = 1.0f;
            this.A = 16.0f / (float)(40 - this.K + 16);
            this.B = 4.0f / (float)(40 - this.K + 8);
        }
        this.j -= (double)this.y;
        if (this.K-- > 0) {
            this.i *= 0.02;
            this.j *= 0.02;
            this.k *= 0.02;
            this.d(113);
        } else {
            this.d(112);
        }
        this.a(this.i, this.j, this.k);
        this.i *= (double)0.98f;
        this.j *= (double)0.98f;
        this.k *= (double)0.98f;
        if (this.w-- <= 0) {
            this.h();
        }
        if (this.l) {
            if (this.a == ahk.h) {
                this.h();
                this.b.a(lz.f, this.f, this.g, this.h, 0.0, 0.0, 0.0, new int[0]);
            } else {
                this.d(114);
            }
            this.i *= (double)0.7f;
            this.k *= (double)0.7f;
        }
        if ((ahk2 = (dbk2 = this.b.n(cmz2 = new cmz(this.f, this.g, this.h))).a()).d() || ahk2.a()) {
            double d2;
            double d3 = 0.0;
            if (dbk2.t() instanceof en) {
                d3 = en.b((Integer)dbk2.b(en.a));
            }
            if (this.g < (d2 = (double)(cmk.c(this.g) + 1) - d3)) {
                this.h();
            }
        }
    }
}

