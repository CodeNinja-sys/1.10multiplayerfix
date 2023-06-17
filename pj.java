/*
 * Decompiled with CFR 0.150.
 */
public class pj
extends cmz {
    protected int a;
    protected int b;
    protected int c;

    public pj() {
        this(0, 0, 0);
    }

    public pj(cmz cmz2) {
        this(cmz2.a(), cmz2.b(), cmz2.c());
    }

    public pj(int n2, int n3, int n4) {
        super(0, 0, 0);
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    @Override
    public int a() {
        return this.a;
    }

    @Override
    public int b() {
        return this.b;
    }

    @Override
    public int c() {
        return this.c;
    }

    public pj a(int n2, int n3, int n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        return this;
    }

    public pj a(cpk cpk2) {
        return this.a(cpk2.aU, cpk2.aV, cpk2.aW);
    }

    public pj a(double d2, double d3, double d4) {
        return this.a(cmk.c(d2), cmk.c(d3), cmk.c(d4));
    }

    public pj a(cjx cjx2) {
        return this.a(cjx2.a(), cjx2.b(), cjx2.c());
    }

    public pj a(bqk bqk2) {
        return this.a(bqk2, 1);
    }

    public pj a(bqk bqk2, int n2) {
        return this.a(this.a + bqk2.h() * n2, this.b + bqk2.i() * n2, this.c + bqk2.j() * n2);
    }

    public void a(int n2) {
        this.b = n2;
    }

    @Override
    public cmz d() {
        return new cmz(this);
    }

    @Override
    public /* synthetic */ cjx b(cjx cjx2) {
        return super.i(cjx2);
    }
}

