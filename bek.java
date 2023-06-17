/*
 * Decompiled with CFR 0.150.
 */
class bek
extends cwv {
    private final bpx a;
    private final int b;
    private final int c;
    private boolean r;

    protected bek(int n2, int n3, int n4, bpx bpx2, int n5, int n6) {
        super(n2, n3, n4, 22, 22, "");
        this.a = bpx2;
        this.b = n5;
        this.c = n6;
    }

    @Override
    public void c(bxy bxy2, int n2, int n3) {
        if (!this.l) {
            return;
        }
        bxy2.P().a(ame.f());
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.m = n2 >= this.g && n3 >= this.h && n2 < this.g + this.e && n3 < this.h + this.f;
        int n4 = 219;
        int n5 = 0;
        if (!this.k) {
            n5 += this.e * 2;
        } else if (this.r) {
            n5 += this.e * 1;
        } else if (this.m) {
            n5 += this.e * 3;
        }
        this.c(this.g, this.h, n5, 219, this.e, this.f);
        if (!ame.f().equals(this.a)) {
            bxy2.P().a(this.a);
        }
        this.c(this.g + 2, this.h + 2, this.b, this.c, 18, 18);
    }

    public boolean a() {
        return this.r;
    }

    public void b(boolean bl2) {
        this.r = bl2;
    }
}

