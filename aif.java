/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class aif
extends ck {
    private final bgv a;

    public aif(bgv bgv2) {
        this.a = bgv2;
    }

    @Override
    public boolean b() {
        if (this.a.aL() == null) {
            return false;
        }
        if (!this.a.aQ.F().b("mobGriefing")) {
            return false;
        }
        return this.a.aW().nextInt(2000) == 0;
    }

    @Override
    public void e() {
        Random random = this.a.aW();
        iu iu2 = this.a.aQ;
        int n2 = cmk.c(this.a.aU - 1.0 + random.nextDouble() * 2.0);
        int n3 = cmk.c(this.a.aV + random.nextDouble() * 2.0);
        int n4 = cmk.c(this.a.aW - 1.0 + random.nextDouble() * 2.0);
        cmz cmz2 = new cmz(n2, n3, n4);
        dbk dbk2 = iu2.n(cmz2);
        dbk dbk3 = iu2.n(cmz2.h());
        dbk dbk4 = this.a.aL();
        if (dbk4 != null && this.a(iu2, cmz2, dbk4.t(), dbk2, dbk3)) {
            iu2.a(cmz2, dbk4, 3);
            this.a.a((dbk)null);
        }
    }

    private boolean a(iu iu2, cmz cmz2, bfa bfa2, dbk dbk2, dbk dbk3) {
        if (!bfa2.a(iu2, cmz2)) {
            return false;
        }
        if (dbk2.a() != ahk.a) {
            return false;
        }
        if (dbk3.a() == ahk.a) {
            return false;
        }
        return dbk3.h();
    }
}

