/*
 * Decompiled with CFR 0.150.
 */
public abstract class awm
extends st {
    public awm(bxy bxy2, int n2, int n3, int n4, int n5, int n6) {
        super(bxy2, n2, n3, n4, n5, n6);
    }

    @Override
    protected void a(int n2, boolean bl2, int n3, int n4) {
    }

    @Override
    protected boolean a(int n2) {
        return false;
    }

    @Override
    protected void b() {
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.c(n2).a(n2, n3, n4, this.d(), n5, n6, n7, this.d(n7) && this.c(n6, n7) == n2);
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        this.c(n2).a(n2, n3, n4);
    }

    public boolean b(int n2, int n3, int n4) {
        int n5;
        if (this.d(n3) && (n5 = this.c(n2, n3)) >= 0) {
            int n6 = this.i + this.d / 2 - this.d() / 2 + 2;
            int n7 = this.f + 4 - this.h() + n5 * this.j + this.v;
            int n8 = n2 - n6;
            int n9 = n3 - n7;
            if (this.c(n5).a(n5, n2, n3, n4, n8, n9)) {
                this.b(false);
                return true;
            }
        }
        return false;
    }

    public boolean c(int n2, int n3, int n4) {
        for (int i2 = 0; i2 < this.a(); ++i2) {
            int n5 = this.i + this.d / 2 - this.d() / 2 + 2;
            int n6 = this.f + 4 - this.h() + i2 * this.j + this.v;
            int n7 = n2 - n5;
            int n8 = n3 - n6;
            this.c(i2).b(i2, n2, n3, n4, n7, n8);
        }
        this.b(true);
        return false;
    }

    public abstract ye c(int var1);
}

