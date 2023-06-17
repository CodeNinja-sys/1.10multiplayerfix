/*
 * Decompiled with CFR 0.150.
 */
public class dv
extends cwv {
    private float b = 1.0f;
    public boolean a;
    private final String c;
    private final float r;
    private final float s;
    private final ckg t;
    private ceh u;

    public dv(ckg ckg2, int n2, int n3, int n4, String string, float f2, float f3, float f4, ceh ceh2) {
        super(n2, n3, n4, 150, 20, "");
        this.c = string;
        this.r = f2;
        this.s = f3;
        this.b = (f4 - f2) / (f3 - f2);
        this.u = ceh2;
        this.t = ckg2;
        this.i = this.d();
    }

    public float a() {
        return this.r + (this.s - this.r) * this.b;
    }

    public void a(float f2, boolean bl2) {
        this.b = (f2 - this.r) / (this.s - this.r);
        this.i = this.d();
        if (bl2) {
            this.t.a(this.j, this.a());
        }
    }

    public float b() {
        return this.b;
    }

    private String d() {
        if (this.u == null) {
            return bf.a(this.c, new Object[0]) + ": " + this.a();
        }
        return this.u.a(this.j, bf.a(this.c, new Object[0]), this.a());
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
        if (this.a) {
            this.b = (float)(n2 - (this.g + 4)) / (float)(this.e - 8);
            if (this.b < 0.0f) {
                this.b = 0.0f;
            }
            if (this.b > 1.0f) {
                this.b = 1.0f;
            }
            this.i = this.d();
            this.t.a(this.j, this.a());
        }
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.c(this.g + (int)(this.b * (float)(this.e - 8)), this.h, 0, 66, 4, 20);
        this.c(this.g + (int)(this.b * (float)(this.e - 8)) + 4, this.h, 196, 66, 4, 20);
    }

    public void a(float f2) {
        this.b = f2;
        this.i = this.d();
        this.t.a(this.j, this.a());
    }

    @Override
    public boolean b(bxy bxy2, int n2, int n3) {
        if (super.b(bxy2, n2, n3)) {
            this.b = (float)(n2 - (this.g + 4)) / (float)(this.e - 8);
            if (this.b < 0.0f) {
                this.b = 0.0f;
            }
            if (this.b > 1.0f) {
                this.b = 1.0f;
            }
            this.i = this.d();
            this.t.a(this.j, this.a());
            this.a = true;
            return true;
        }
        return false;
    }

    @Override
    public void a(int n2, int n3) {
        this.a = false;
    }
}

