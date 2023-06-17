/*
 * Decompiled with CFR 0.150.
 */
public class aeu
extends azg {
    public final int a = 32;
    private final int b;
    private final float c;
    private final boolean d;
    private boolean e;
    private cko f;
    private float n;

    public aeu(int n2, float f2, boolean bl2) {
        this.b = n2;
        this.d = bl2;
        this.c = f2;
        this.a(zm.h);
    }

    public aeu(int n2, boolean bl2) {
        this(n2, 0.6f, bl2);
    }

    @Override
    public bhl a(bhl bhl2, iu iu2, bga bga2) {
        --bhl2.b;
        if (bga2 instanceof bdl) {
            bdl bdl2 = (bdl)bga2;
            bdl2.aE().a(this, bhl2);
            iu2.a(null, bdl2.aU, bdl2.aV, bdl2.aW, dah.ek, csg.h, 0.5f, iu2.p.nextFloat() * 0.1f + 0.9f);
            this.a(bhl2, iu2, bdl2);
            bdl2.a(bpv.b(this));
        }
        return bhl2;
    }

    protected void a(bhl bhl2, iu iu2, bdl bdl2) {
        if (!iu2.C && this.f != null && iu2.p.nextFloat() < this.n) {
            bdl2.b(new cko(this.f));
        }
    }

    @Override
    public int e_(bhl bhl2) {
        return 32;
    }

    @Override
    public cga d_(bhl bhl2) {
        return cga.b;
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        if (bdl2.d(this.e)) {
            bdl2.b(bqp2);
            return new wx(cey.a, bhl2);
        }
        return new wx(cey.c, bhl2);
    }

    public int g(bhl bhl2) {
        return this.b;
    }

    public float h(bhl bhl2) {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }

    public aeu a(cko cko2, float f2) {
        this.f = cko2;
        this.n = f2;
        return this;
    }

    public aeu g() {
        this.e = true;
        return this;
    }
}

