/*
 * Decompiled with CFR 0.150.
 */
public class jq
extends cwv {
    private float b = 1.0f;
    public boolean a;
    private final oi c;
    private final float r;
    private final float s;

    public jq(int n2, int n3, int n4, oi oi2) {
        this(n2, n3, n4, oi2, 0.0f, 1.0f);
    }

    public jq(int n2, int n3, int n4, oi oi2, float f2, float f3) {
        super(n2, n3, n4, 150, 20, "");
        this.c = oi2;
        this.r = f2;
        this.s = f3;
        bxy bxy2 = bxy.B();
        this.b = oi2.b(bxy2.u.a(oi2));
        this.i = bxy2.u.c(oi2);
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
            this.b = cmk.a(this.b, 0.0f, 1.0f);
            float f2 = this.c.c(this.b);
            bxy2.u.a(this.c, f2);
            this.b = this.c.b(f2);
            this.i = bxy2.u.c(this.c);
        }
        bxy2.P().a(d);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.c(this.g + (int)(this.b * (float)(this.e - 8)), this.h, 0, 66, 4, 20);
        this.c(this.g + (int)(this.b * (float)(this.e - 8)) + 4, this.h, 196, 66, 4, 20);
    }

    @Override
    public boolean b(bxy bxy2, int n2, int n3) {
        if (super.b(bxy2, n2, n3)) {
            this.b = (float)(n2 - (this.g + 4)) / (float)(this.e - 8);
            this.b = cmk.a(this.b, 0.0f, 1.0f);
            bxy2.u.a(this.c, this.c.c(this.b));
            this.i = bxy2.u.c(this.c);
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

