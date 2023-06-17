/*
 * Decompiled with CFR 0.150.
 */
class ou
extends cwv {
    private final boolean a;

    public ou(int n2, int n3, int n4, boolean bl2) {
        super(n2, n3, n4, 23, 13, "");
        this.a = bl2;
    }

    @Override
    public void c(bxy bxy2, int n2, int n3) {
        if (!this.l) {
            return;
        }
        boolean bl2 = n2 >= this.g && n3 >= this.h && n2 < this.g + this.e && n3 < this.h + this.f;
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        bxy2.P().a(zk.f());
        int n4 = 0;
        int n5 = 192;
        if (bl2) {
            n4 += 23;
        }
        if (!this.a) {
            n5 += 13;
        }
        this.c(this.g, this.h, n4, n5, 23, 13);
    }
}

