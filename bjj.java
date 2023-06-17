/*
 * Decompiled with CFR 0.150.
 */
public class bjj
implements ds {
    private int a;
    private cmz b;

    public bjj() {
    }

    public bjj(bdl bdl2, cmz cmz2) {
        this.a = bdl2.bW();
        this.b = cmz2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e();
        this.b = si2.c();
    }

    @Override
    public void b(si si2) {
        si2.d(this.a);
        si2.a(this.b);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public bdl a(iu iu2) {
        return (bdl)iu2.a(this.a);
    }

    public cmz a() {
        return this.b;
    }
}

