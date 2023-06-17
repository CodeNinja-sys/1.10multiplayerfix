/*
 * Decompiled with CFR 0.150.
 */
public abstract class ic
extends pc {
    protected static final dbk a = blg.cI.a(crw.b);
    protected static final dbk b = blg.cI.a(crw.c);
    protected static final dbk c = blg.cI.a(crw.d);
    protected static final dbk d = b;
    protected static final dbk e = blg.cJ.s();
    protected static final dbk f = blg.j.s();
    protected static final int g = ic.a(2, 0, 0);
    protected static final int h = ic.a(2, 2, 0);
    protected static final int i = ic.a(0, 1, 0);
    protected static final int j = ic.a(4, 1, 0);
    protected cgd k;

    protected static final int a(int n2, int n3, int n4) {
        return n3 * 25 + n4 * 5 + n2;
    }

    public ic() {
        super(0);
    }

    public ic(int n2) {
        super(n2);
    }

    public ic(bqk bqk2, awx awx2) {
        super(1);
        this.a(bqk2);
        this.l = awx2;
    }

    protected ic(int n2, bqk bqk2, cgd cgd2, int n3, int n4, int n5) {
        super(n2);
        this.a(bqk2);
        this.k = cgd2;
        int n6 = cgd2.a;
        int n7 = n6 % 5;
        int n8 = n6 / 5 % 5;
        int n9 = n6 / 25;
        this.l = bqk2 == bqk.c || bqk2 == bqk.d ? new awx(0, 0, 0, n3 * 8 - 1, n4 * 4 - 1, n5 * 8 - 1) : new awx(0, 0, 0, n5 * 8 - 1, n4 * 4 - 1, n3 * 8 - 1);
        switch (bqk2) {
            case c: {
                this.l.a(n7 * 8, n9 * 4, -(n8 + n5) * 8 + 1);
                break;
            }
            case d: {
                this.l.a(n7 * 8, n9 * 4, n8 * 8);
                break;
            }
            case e: {
                this.l.a(-(n8 + n5) * 8 + 1, n9 * 4, n7 * 8);
                break;
            }
            default: {
                this.l.a(n8 * 8, n9 * 4, n7 * 8);
            }
        }
    }

    @Override
    protected void a(bvp bvp2) {
    }

    @Override
    protected void b(bvp bvp2) {
    }

    protected void a(iu iu2, awx awx2, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (bl2 && this.a(iu2, i3, i2, i4, awx2).a() == ahk.a) continue;
                    if (this.a(i2) >= iu2.u()) {
                        this.a(iu2, blg.a.s(), i3, i2, i4, awx2);
                        continue;
                    }
                    this.a(iu2, f, i3, i2, i4, awx2);
                }
            }
        }
    }

    protected void a(iu iu2, awx awx2, int n2, int n3, boolean bl2) {
        if (bl2) {
            this.a(iu2, awx2, n2 + 0, 0, n3 + 0, n2 + 2, 0, n3 + 8 - 1, a, a, false);
            this.a(iu2, awx2, n2 + 5, 0, n3 + 0, n2 + 8 - 1, 0, n3 + 8 - 1, a, a, false);
            this.a(iu2, awx2, n2 + 3, 0, n3 + 0, n2 + 4, 0, n3 + 2, a, a, false);
            this.a(iu2, awx2, n2 + 3, 0, n3 + 5, n2 + 4, 0, n3 + 8 - 1, a, a, false);
            this.a(iu2, awx2, n2 + 3, 0, n3 + 2, n2 + 4, 0, n3 + 2, b, b, false);
            this.a(iu2, awx2, n2 + 3, 0, n3 + 5, n2 + 4, 0, n3 + 5, b, b, false);
            this.a(iu2, awx2, n2 + 2, 0, n3 + 3, n2 + 2, 0, n3 + 4, b, b, false);
            this.a(iu2, awx2, n2 + 5, 0, n3 + 3, n2 + 5, 0, n3 + 4, b, b, false);
        } else {
            this.a(iu2, awx2, n2 + 0, 0, n3 + 0, n2 + 8 - 1, 0, n3 + 8 - 1, a, a, false);
        }
    }

    protected void a(iu iu2, awx awx2, int n2, int n3, int n4, int n5, int n6, int n7, dbk dbk2) {
        for (int i2 = n3; i2 <= n6; ++i2) {
            for (int i3 = n2; i3 <= n5; ++i3) {
                for (int i4 = n4; i4 <= n7; ++i4) {
                    if (this.a(iu2, i3, i2, i4, awx2) != f) continue;
                    this.a(iu2, dbk2, i3, i2, i4, awx2);
                }
            }
        }
    }

    protected boolean a(awx awx2, int n2, int n3, int n4, int n5) {
        int n6 = this.a(n2, n3);
        int n7 = this.b(n2, n3);
        int n8 = this.a(n4, n5);
        int n9 = this.b(n4, n5);
        return awx2.a(Math.min(n6, n8), Math.min(n7, n9), Math.max(n6, n8), Math.max(n7, n9));
    }

    protected boolean a(iu iu2, awx awx2, int n2, int n3, int n4) {
        int n5;
        int n6;
        int n7 = this.a(n2, n4);
        if (awx2.a(new cmz(n7, n6 = this.a(n3), n5 = this.b(n2, n4)))) {
            bym bym2 = new bym(iu2);
            bym2.d(true);
            bym2.b_(bym2.bo());
            bym2.a_((double)n7 + 0.5, n6, (double)n5 + 0.5, 0.0f, 0.0f);
            bym2.a(iu2.C(new cmz(bym2)), null);
            iu2.b(bym2);
            return true;
        }
        return false;
    }
}

