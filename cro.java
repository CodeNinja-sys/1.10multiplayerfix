/*
 * Decompiled with CFR 0.150.
 */
public class cro
extends cwv {
    public cro(int n2, int n3, int n4) {
        super(n2, n3, n4, 20, 20, "");
    }

    @Override
    public void c(bxy bxy2, int n2, int n3) {
        if (!this.l) {
            return;
        }
        bxy2.P().a(cwv.d);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        boolean bl2 = n2 >= this.g && n3 >= this.h && n2 < this.g + this.e && n3 < this.h + this.f;
        int n4 = 106;
        if (bl2) {
            n4 += this.f;
        }
        this.c(this.g, this.h, 0, n4, this.e, this.f);
    }
}

