/*
 * Decompiled with CFR 0.150.
 */
public class bky
extends deg {
    private amj b;

    public bky(brd brd2) {
        super(brd2);
    }

    @Override
    public void a() {
        if (this.b == null) {
            this.b = new amj(this.a.aU, this.a.aV, this.a.aW);
        }
    }

    @Override
    public boolean h() {
        return true;
    }

    @Override
    public void b() {
        this.b = null;
    }

    @Override
    public float f() {
        return 1.0f;
    }

    @Override
    public amj c() {
        return this.b;
    }

    @Override
    public baw d() {
        return baw.k;
    }
}

