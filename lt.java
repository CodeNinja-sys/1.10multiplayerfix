/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

class lt
implements ala {
    final /* synthetic */ bdl a;
    final /* synthetic */ bxr b;

    lt(bxr bxr2, bdl bdl2) {
        this.b = bxr2;
        this.a = bdl2;
    }

    @Override
    public String i_() {
        return this.a.i_();
    }

    @Override
    public cbg v() {
        return this.a.v();
    }

    @Override
    public void a(cbg cbg2) {
    }

    @Override
    public boolean a(int n2, String string) {
        return n2 <= 2;
    }

    @Override
    public cmz k_() {
        return this.b.l;
    }

    @Override
    public amj l_() {
        return new amj((double)this.b.l.a() + 0.5, (double)this.b.l.b() + 0.5, (double)this.b.l.c() + 0.5);
    }

    @Override
    public iu m_() {
        return this.a.m_();
    }

    @Override
    public cpk n_() {
        return this.a;
    }

    @Override
    public boolean C_() {
        return false;
    }

    @Override
    public void a(bnw bnw2, int n2) {
        if (this.b.k != null && !this.b.k.C) {
            bxr.a(this.b).a(this.b.k.f(), this, bnw2, n2);
        }
    }

    @Override
    public a o_() {
        return this.a.o_();
    }
}

