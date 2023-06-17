/*
 * Decompiled with CFR 0.150.
 */
public abstract class qh
implements dci {
    protected qe a;
    private cdp l;
    protected csg b;
    protected bpx c;
    protected float d = 1.0f;
    protected float e = 1.0f;
    protected float f;
    protected float g;
    protected float h;
    protected boolean i;
    protected int j;
    protected btu k = btu.b;

    protected qh(bi bi2, csg csg2) {
        this(bi2.a(), csg2);
    }

    protected qh(bpx bpx2, csg csg2) {
        this.c = bpx2;
        this.b = csg2;
    }

    @Override
    public bpx b() {
        return this.c;
    }

    @Override
    public cdp a(bro bro2) {
        this.l = bro2.a(this.c);
        this.a = this.l == null ? bro.a : this.l.a();
        return this.l;
    }

    @Override
    public qe c() {
        return this.a;
    }

    @Override
    public csg d() {
        return this.b;
    }

    @Override
    public boolean e() {
        return this.i;
    }

    @Override
    public int f() {
        return this.j;
    }

    @Override
    public float g() {
        return this.d * this.a.c();
    }

    @Override
    public float h() {
        return this.e * this.a.d();
    }

    @Override
    public float i() {
        return this.f;
    }

    @Override
    public float j() {
        return this.g;
    }

    @Override
    public float k() {
        return this.h;
    }

    @Override
    public btu l() {
        return this.k;
    }
}

