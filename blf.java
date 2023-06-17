/*
 * Decompiled with CFR 0.150.
 */
public class blf
extends azg {
    public blf() {
        this.d(1);
        this.e(238);
        this.a(zm.i);
    }

    @Override
    public boolean a(bhl bhl2, iu iu2, dbk dbk2, cmz cmz2, bga bga2) {
        bhl2.a(1, bga2);
        bfa bfa2 = dbk2.t();
        if (dbk2.a() == ahk.j || bfa2 == blg.G || bfa2 == blg.H || bfa2 == blg.bn || bfa2 == blg.bS || bfa2 == blg.L) {
            return true;
        }
        return super.a(bhl2, iu2, dbk2, cmz2, bga2);
    }

    @Override
    public boolean a(dbk dbk2) {
        bfa bfa2 = dbk2.t();
        return bfa2 == blg.G || bfa2 == blg.af || bfa2 == blg.bS;
    }

    @Override
    public float a(bhl bhl2, dbk dbk2) {
        bfa bfa2 = dbk2.t();
        if (bfa2 == blg.G || dbk2.a() == ahk.j) {
            return 15.0f;
        }
        if (bfa2 == blg.L) {
            return 5.0f;
        }
        return super.a(bhl2, dbk2);
    }
}

