/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

class col
extends ck {
    private final bgv a;

    public col(bgv bgv2) {
        this.a = bgv2;
    }

    @Override
    public boolean b() {
        if (this.a.aL() != null) {
            return false;
        }
        if (!this.a.aQ.F().b("mobGriefing")) {
            return false;
        }
        return this.a.aW().nextInt(20) == 0;
    }

    @Override
    public void e() {
        boolean bl2;
        Random random = this.a.aW();
        iu iu2 = this.a.aQ;
        int n2 = cmk.c(this.a.aU - 2.0 + random.nextDouble() * 4.0);
        int n3 = cmk.c(this.a.aV + random.nextDouble() * 3.0);
        int n4 = cmk.c(this.a.aW - 2.0 + random.nextDouble() * 4.0);
        cmz cmz2 = new cmz(n2, n3, n4);
        dbk dbk2 = iu2.n(cmz2);
        bfa bfa2 = dbk2.t();
        auu auu2 = iu2.a(new amj((float)cmk.c(this.a.aU) + 0.5f, (float)n3 + 0.5f, (float)cmk.c(this.a.aW) + 0.5f), new amj((float)n2 + 0.5f, (float)n3 + 0.5f, (float)n4 + 0.5f), false, true, false);
        boolean bl3 = bl2 = auu2 != null && auu2.a().equals(cmz2);
        if (bgv.aN().contains(bfa2) && bl2) {
            this.a.a(dbk2);
            iu2.f(cmz2);
        }
    }
}

