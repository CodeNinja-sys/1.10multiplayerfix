/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.g;
import net.minecraft.c.a;

class clt
extends cxh {
    final /* synthetic */ jf a;

    clt(jf jf2) {
        this.a = jf2;
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
        return this.a.b_();
    }

    @Override
    public void a(String string) {
        super.a(string);
        this.a.c_();
    }

    @Override
    public void h() {
        dbk dbk2 = this.a.k.n(this.a.l);
        this.a.b_().a(this.a.l, dbk2, dbk2, 3);
    }

    @Override
    public int i() {
        return 0;
    }

    @Override
    public void a(g g2) {
        g2.E(this.a.l.a());
        g2.E(this.a.l.b());
        g2.E(this.a.l.c());
    }

    @Override
    public cpk n_() {
        return null;
    }

    @Override
    public a o_() {
        return this.a.k.f();
    }
}

