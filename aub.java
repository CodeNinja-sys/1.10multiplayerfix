/*
 * Decompiled with CFR 0.150.
 */
class aub
extends cwv {
    private final csg r;
    private final String s;
    public float a;
    public boolean b;
    final /* synthetic */ wl c;

    public aub(wl wl2, int n2, int n3, int n4, csg csg2, boolean bl2) {
        this.c = wl2;
        super(n2, n3, n4, bl2 ? 310 : 150, 20, "");
        this.a = 1.0f;
        this.r = csg2;
        this.s = bf.a("soundCategory." + csg2.a(), new Object[0]);
        this.i = this.s + ": " + wl2.a(csg2);
        this.a = wl.a(wl2).a(csg2);
    }

    @Override
    protected int a(boolean bl2) {
        return 0;
    }

    @Override
    protected void a(bxy bxy2, int n2, int n3) {
        if (!this.l) {
            return;
        }
        if (this.b) {
            this.a = (float)(n2 - (this.g + 4)) / (float)(this.e - 8);
            this.a = cmk.a(this.a, 0.0f, 1.0f);
            bxy2.u.a(this.r, this.a);
            bxy2.u.b();
            this.i = this.s + ": " + this.c.a(this.r);
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.c(this.g + (int)(this.a * (float)(this.e - 8)), this.h, 0, 66, 4, 20);
        this.c(this.g + (int)(this.a * (float)(this.e - 8)) + 4, this.h, 196, 66, 4, 20);
    }

    @Override
    public boolean b(bxy bxy2, int n2, int n3) {
        if (super.b(bxy2, n2, n3)) {
            this.a = (float)(n2 - (this.g + 4)) / (float)(this.e - 8);
            this.a = cmk.a(this.a, 0.0f, 1.0f);
            bxy2.u.a(this.r, this.a);
            bxy2.u.b();
            this.i = this.s + ": " + this.c.a(this.r);
            this.b = true;
            return true;
        }
        return false;
    }

    @Override
    public void a(bro bro2) {
    }

    @Override
    public void a(int n2, int n3) {
        if (this.b) {
            this.c.u.W().a(ol.a(dah.gE, 1.0f));
        }
        this.b = false;
    }
}

