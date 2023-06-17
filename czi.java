/*
 * Decompiled with CFR 0.150.
 */
public class czi
implements ds {
    private zz a;
    private cz[] b;

    public czi() {
    }

    public czi(int n2, short[] arrs, bhm bhm2) {
        this.a = new zz(bhm2.b, bhm2.c);
        this.b = new cz[n2];
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = new cz(this, arrs[i2], bhm2);
        }
    }

    @Override
    public void a(si si2) {
        this.a = new zz(si2.K(), si2.K());
        this.b = new cz[si2.e()];
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = new cz(this, si2.G(), (dbk)bfa.w.a(si2.e()));
        }
    }

    @Override
    public void b(si si2) {
        si2.E(this.a.a);
        si2.E(this.a.b);
        si2.d(this.b.length);
        for (cz cz2 : this.b) {
            si2.C(cz2.b());
            si2.d(bfa.w.a(cz2.c()));
        }
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public cz[] a() {
        return this.b;
    }

    static /* synthetic */ zz a(czi czi2) {
        return czi2.a;
    }
}

