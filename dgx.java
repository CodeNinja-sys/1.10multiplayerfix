/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class dgx
extends vq {
    private final zv a;
    private bqk b;
    private boolean c;

    public dgx(zv zv2) {
        super(zv2, 1.0, 10);
        this.a = zv2;
        this.a(1);
    }

    @Override
    public boolean b() {
        if (!this.a.aQ.F().b("mobGriefing")) {
            return false;
        }
        if (this.a.ar() != null) {
            return false;
        }
        if (!this.a.ap().m()) {
            return false;
        }
        Random random = this.a.aW();
        if (random.nextInt(10) == 0) {
            this.b = bqk.a(random);
            cmz cmz2 = new cmz(this.a.aU, this.a.aV + 0.5, this.a.aW).c(this.b);
            dbk dbk2 = this.a.aQ.n(cmz2);
            if (aob.m(dbk2)) {
                this.c = true;
                return true;
            }
        }
        this.c = false;
        return super.b();
    }

    @Override
    public boolean a() {
        if (this.c) {
            return false;
        }
        return super.a();
    }

    @Override
    public void c() {
        if (!this.c) {
            super.c();
            return;
        }
        iu iu2 = this.a.aQ;
        cmz cmz2 = new cmz(this.a.aU, this.a.aV + 0.5, this.a.aW).c(this.b);
        dbk dbk2 = iu2.n(cmz2);
        if (aob.m(dbk2)) {
            iu2.a(cmz2, blg.be.s().a(aob.a, (Comparable)((Object)btc.a(dbk2))), 3);
            this.a.at();
            this.a.ak_();
        }
    }
}

