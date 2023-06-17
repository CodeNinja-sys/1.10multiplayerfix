/*
 * Decompiled with CFR 0.150.
 */
public class cch
extends ro {
    private final cdg c;

    public cch(axb axb2, cdg cdg2) {
        super(axb2);
        this.c = cdg2;
    }

    @Override
    protected void d() {
        this.c.a(this.a.P());
    }

    @Override
    protected int a() {
        return this.c.f();
    }

    @Override
    protected String b() {
        return this.c.e();
    }

    @Override
    protected String c() {
        return this.c.d();
    }

    public cdg k() {
        return this.c;
    }
}

