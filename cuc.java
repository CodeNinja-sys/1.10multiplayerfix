/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.g;
import net.minecraft.c.a;

class cuc
extends cxh {
    final /* synthetic */ dbu a;

    cuc(dbu dbu2) {
        this.a = dbu2;
    }

    @Override
    public void h() {
        this.a.bY().b(dbu.M(), this.l());
        this.a.bY().b(dbu.O(), this.k());
    }

    @Override
    public int i() {
        return 1;
    }

    @Override
    public void a(g g2) {
        g2.E(this.a.bW());
    }

    @Override
    public cmz k_() {
        return new cmz(this.a.aU, this.a.aV + 0.5, this.a.aW);
    }

    @Override
    public amj l_() {
        return new amj(this.a.aU, this.a.aV, this.a.aW);
    }

    @Override
    public iu m_() {
        return this.a.aQ;
    }

    @Override
    public cpk n_() {
        return this.a;
    }

    @Override
    public a o_() {
        return this.a.aQ.f();
    }
}

