/*
 * Decompiled with CFR 0.150.
 */
class all
extends cel {
    private float i;
    private int j;
    private final akr k;
    private boolean l;

    public all(akr akr2) {
        super(akr2);
        this.k = akr2;
        this.i = 180.0f * akr2.ba / (float)Math.PI;
    }

    public void a(float f2, boolean bl2) {
        this.i = f2;
        this.l = bl2;
    }

    public void a(double d2) {
        this.e = d2;
        this.h = azu.b;
    }

    @Override
    public void a() {
        this.a.aj = this.a.ba = this.a(this.a.ba, this.i, 90.0f);
        this.a.ah = this.a.ba;
        if (this.h != azu.b) {
            this.a.g(0.0f);
            return;
        }
        this.h = azu.a;
        if (this.a.be) {
            this.a.i((float)(this.e * this.a.a(cgz.d).e()));
            if (this.j-- <= 0) {
                this.j = this.k.M();
                if (this.l) {
                    this.j /= 3;
                }
                this.k.ao().a();
                if (this.k.ab()) {
                    this.k.a(this.k.ae(), this.k.t(), ((this.k.aW().nextFloat() - this.k.aW().nextFloat()) * 0.2f + 1.0f) * 0.8f);
                }
            } else {
                this.k.ay = 0.0f;
                this.k.az = 0.0f;
                this.a.i(0.0f);
            }
        } else {
            this.a.i((float)(this.e * this.a.a(cgz.d).e()));
        }
    }
}

