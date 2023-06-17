/*
 * Decompiled with CFR 0.150.
 */
public class apo
extends cwv {
    private boolean a;

    public apo(int n2, int n3, int n4) {
        super(n2, n3, n4, 20, 20, "");
    }

    public boolean a() {
        return this.a;
    }

    public void b(boolean bl2) {
        this.a = bl2;
    }

    @Override
    public void c(bxy bxy2, int n2, int n3) {
        boolean bl2;
        if (!this.l) {
            return;
        }
        bxy2.P().a(cwv.d);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        boolean bl3 = bl2 = n2 >= this.g && n3 >= this.h && n2 < this.g + this.e && n3 < this.h + this.f;
        bnz bnz2 = this.a ? (!this.k ? bnz.c : (bl2 ? bnz.b : bnz.a)) : (!this.k ? bnz.f : (bl2 ? bnz.e : bnz.d));
        this.c(this.g, this.h, bnz2.a(), bnz2.b(), this.e, this.f);
    }
}

