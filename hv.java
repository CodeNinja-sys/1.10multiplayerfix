/*
 * Decompiled with CFR 0.150.
 */
public class hv
implements ds {
    private cmz a;
    private int b;
    private bvp c;

    public hv() {
    }

    public hv(cmz cmz2, int n2, bvp bvp2) {
        this.a = cmz2;
        this.b = n2;
        this.c = bvp2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.c();
        this.b = si2.F();
        this.c = si2.h();
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.B((byte)this.b);
        si2.a(this.c);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public cmz a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public bvp c() {
        return this.c;
    }
}

