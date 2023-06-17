/*
 * Decompiled with CFR 0.150.
 */
public class lw {
    private final iu a;
    private final ctv b;
    private final bqk c;
    private final bqk d;
    private int e;
    private cmz f;
    private int g;
    private int h;

    public lw(iu iu2, cmz cmz2, ctv ctv2) {
        this.a = iu2;
        this.b = ctv2;
        if (ctv2 == ctv.a) {
            this.d = bqk.f;
            this.c = bqk.e;
        } else {
            this.d = bqk.c;
            this.c = bqk.d;
        }
        cmz cmz3 = cmz2;
        while (cmz2.b() > cmz3.b() - 21 && cmz2.b() > 0 && this.a(iu2.n(cmz2.h()).t())) {
            cmz2 = cmz2.h();
        }
        int n2 = this.a(cmz2, this.d) - 1;
        if (n2 >= 0) {
            this.f = cmz2.c(this.d, n2);
            this.h = this.a(this.f, this.c);
            if (this.h < 2 || this.h > 21) {
                this.f = null;
                this.h = 0;
            }
        }
        if (this.f != null) {
            this.g = this.c();
        }
    }

    protected int a(cmz cmz2, bqk bqk2) {
        Object object;
        int n2;
        for (n2 = 0; n2 < 22 && this.a(this.a.n((cmz)(object = cmz2.c(bqk2, n2))).t()) && this.a.n(((cmz)object).h()).t() == blg.Z; ++n2) {
        }
        object = this.a.n(cmz2.c(bqk2, n2)).t();
        if (object == blg.Z) {
            return n2;
        }
        return 0;
    }

    public int a() {
        return this.g;
    }

    public int b() {
        return this.h;
    }

    protected int c() {
        int n2;
        this.g = 0;
        block0: while (this.g < 21) {
            for (n2 = 0; n2 < this.h; ++n2) {
                cmz cmz2 = this.f.c(this.c, n2).b(this.g);
                bfa bfa2 = this.a.n(cmz2).t();
                if (!this.a(bfa2)) break block0;
                if (bfa2 == blg.aY) {
                    ++this.e;
                }
                if (n2 == 0 ? (bfa2 = this.a.n(cmz2.c(this.d)).t()) != blg.Z : n2 == this.h - 1 && (bfa2 = this.a.n(cmz2.c(this.c)).t()) != blg.Z) break block0;
            }
            ++this.g;
        }
        for (n2 = 0; n2 < this.h; ++n2) {
            if (this.a.n(this.f.c(this.c, n2).b(this.g)).t() == blg.Z) continue;
            this.g = 0;
            break;
        }
        if (this.g > 21 || this.g < 3) {
            this.f = null;
            this.h = 0;
            this.g = 0;
            return 0;
        }
        return this.g;
    }

    protected boolean a(bfa bfa2) {
        return bfa2.L == ahk.a || bfa2 == blg.ab || bfa2 == blg.aY;
    }

    public boolean d() {
        return this.f != null && this.h >= 2 && this.h <= 21 && this.g >= 3 && this.g <= 21;
    }

    public void e() {
        for (int i2 = 0; i2 < this.h; ++i2) {
            cmz cmz2 = this.f.c(this.c, i2);
            for (int i3 = 0; i3 < this.g; ++i3) {
                this.a.a(cmz2.b(i3), blg.aY.s().a(axz.a, (Comparable)((Object)this.b)), 2);
            }
        }
    }

    static /* synthetic */ int a(lw lw2) {
        return lw2.e;
    }

    static /* synthetic */ int b(lw lw2) {
        return lw2.h;
    }

    static /* synthetic */ int c(lw lw2) {
        return lw2.g;
    }

    static /* synthetic */ bqk d(lw lw2) {
        return lw2.c;
    }

    static /* synthetic */ cmz e(lw lw2) {
        return lw2.f;
    }
}

