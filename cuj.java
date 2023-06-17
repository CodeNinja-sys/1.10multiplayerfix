/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

class cuj
implements ala {
    final /* synthetic */ bxr a;

    cuj(bxr bxr2) {
        this.a = bxr2;
    }

    @Override
    public String i_() {
        return "Sign";
    }

    @Override
    public cbg v() {
        return new aym(this.i_());
    }

    @Override
    public void a(cbg cbg2) {
    }

    @Override
    public boolean a(int n2, String string) {
        return true;
    }

    @Override
    public cmz k_() {
        return this.a.l;
    }

    @Override
    public amj l_() {
        return new amj((double)this.a.l.a() + 0.5, (double)this.a.l.b() + 0.5, (double)this.a.l.c() + 0.5);
    }

    @Override
    public iu m_() {
        return this.a.k;
    }

    @Override
    public cpk n_() {
        return null;
    }

    @Override
    public boolean C_() {
        return false;
    }

    @Override
    public void a(bnw bnw2, int n2) {
    }

    @Override
    public a o_() {
        return this.a.k.f();
    }
}

