/*
 * Decompiled with CFR 0.150.
 */
class cyr
extends ck {
    private int b;
    final /* synthetic */ aoa a;

    private cyr(aoa aoa2) {
        this.a = aoa2;
    }

    @Override
    public boolean b() {
        return this.a.ar() == null && aoa.a(this.a).nextInt(40) == 0;
    }

    @Override
    public boolean a() {
        return this.a.ar() == null && this.b > 0;
    }

    @Override
    public void c() {
        this.b = 20 * (1 + aoa.b(this.a).nextInt(3));
        this.a.d(30);
    }

    @Override
    public void d() {
        if (this.a.ar() == null) {
            this.a.d(0);
        }
    }

    @Override
    public void e() {
        --this.b;
    }

    /* synthetic */ cyr(aoa aoa2, dfg dfg2) {
        this(aoa2);
    }
}

