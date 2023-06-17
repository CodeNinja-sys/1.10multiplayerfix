/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

class dea
implements ala {
    final /* synthetic */ cpk a;
    final /* synthetic */ ala b;
    final /* synthetic */ cmz c;
    final /* synthetic */ double d;
    final /* synthetic */ double e;
    final /* synthetic */ double f;
    final /* synthetic */ a g;
    final /* synthetic */ chr h;

    dea(chr chr2, cpk cpk2, ala ala2, cmz cmz2, double d2, double d3, double d4, a a2) {
        this.h = chr2;
        this.a = cpk2;
        this.b = ala2;
        this.c = cmz2;
        this.d = d2;
        this.e = d3;
        this.f = d4;
        this.g = a2;
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
        this.b.a(cbg2);
    }

    @Override
    public boolean a(int n2, String string) {
        return this.b.a(n2, string);
    }

    @Override
    public cmz k_() {
        return this.c;
    }

    @Override
    public amj l_() {
        return new amj(this.d, this.e, this.f);
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
    public boolean C_() {
        return this.g == null || ((iu)((Object)this.g.d[0])).F().b("commandBlockOutput");
    }

    @Override
    public void a(bnw bnw2, int n2) {
        this.a.a(bnw2, n2);
    }

    @Override
    public a o_() {
        return this.a.o_();
    }
}

