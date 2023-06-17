/*
 * Decompiled with CFR 0.150.
 */
public class ceg
extends qa {
    protected ceg(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4, 0.0, 0.0, 0.0);
        this.i *= (double)0.3f;
        this.j = Math.random() * (double)0.2f + (double)0.1f;
        this.k *= (double)0.3f;
        this.z = 1.0f;
        this.A = 1.0f;
        this.B = 1.0f;
        this.d(19 + this.q.nextInt(4));
        this.a(0.01f, 0.01f);
        this.y = 0.06f;
        this.w = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void b() {
        cmz cmz2;
        dbk dbk2;
        ahk ahk2;
        this.c = this.f;
        this.d = this.g;
        this.e = this.h;
        this.j -= (double)this.y;
        this.a(this.i, this.j, this.k);
        this.i *= (double)0.98f;
        this.j *= (double)0.98f;
        this.k *= (double)0.98f;
        if (this.w-- <= 0) {
            this.h();
        }
        if (this.l) {
            if (Math.random() < 0.5) {
                this.h();
            }
            this.i *= (double)0.7f;
            this.k *= (double)0.7f;
        }
        if ((ahk2 = (dbk2 = this.b.n(cmz2 = new cmz(this.f, this.g, this.h))).a()).d() || ahk2.a()) {
            double d2 = dbk2.t() instanceof en ? (double)(1.0f - en.b((Integer)dbk2.b(en.a))) : dbk2.c((bnj)this.b, (cmz)cmz2).e;
            double d3 = (double)cmk.c(this.g) + d2;
            if (this.g < d3) {
                this.h();
            }
        }
    }
}

