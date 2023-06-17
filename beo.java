/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;

public class beo
extends ArrayList {
    public beo() {
    }

    public beo(bvp bvp2) {
        this.a(bvp2);
    }

    public jc a(bhl bhl2, bhl bhl3, int n2) {
        if (n2 > 0 && n2 < this.size()) {
            jc jc2 = (jc)this.get(n2);
            if (this.a(bhl2, jc2.a()) && (bhl3 == null && !jc2.c() || jc2.c() && this.a(bhl3, jc2.b())) && bhl2.b >= jc2.a().b && (!jc2.c() || bhl3.b >= jc2.b().b)) {
                return jc2;
            }
            return null;
        }
        for (int i2 = 0; i2 < this.size(); ++i2) {
            jc jc3 = (jc)this.get(i2);
            if (!this.a(bhl2, jc3.a()) || bhl2.b < jc3.a().b || (jc3.c() || bhl3 != null) && (!jc3.c() || !this.a(bhl3, jc3.b()) || bhl3.b < jc3.b().b)) continue;
            return jc3;
        }
        return null;
    }

    private boolean a(bhl bhl2, bhl bhl3) {
        return bhl.c(bhl2, bhl3) && (!bhl3.n() || bhl2.n() && ayj.a(bhl3.o(), bhl2.o(), false));
    }

    public void a(si si2) {
        si2.B((byte)(this.size() & 0xFF));
        for (int i2 = 0; i2 < this.size(); ++i2) {
            jc jc2 = (jc)this.get(i2);
            si2.a(jc2.a());
            si2.a(jc2.d());
            bhl bhl2 = jc2.b();
            si2.a(bhl2 != null);
            if (bhl2 != null) {
                si2.a(bhl2);
            }
            si2.a(jc2.h());
            si2.E(jc2.e());
            si2.E(jc2.f());
        }
    }

    public static beo b(si si2) {
        beo beo2 = new beo();
        int n2 = si2.E() & 0xFF;
        for (int i2 = 0; i2 < n2; ++i2) {
            bhl bhl2 = si2.i();
            bhl bhl3 = si2.i();
            bhl bhl4 = null;
            if (si2.D()) {
                bhl4 = si2.i();
            }
            boolean bl2 = si2.D();
            int n3 = si2.K();
            int n4 = si2.K();
            jc jc2 = new jc(bhl2, bhl4, bhl3, n3, n4);
            if (bl2) {
                jc2.i();
            }
            beo2.add(jc2);
        }
        return beo2;
    }

    public void a(bvp bvp2) {
        bmh bmh2 = bvp2.c("Recipes", 10);
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            bvp bvp3 = bmh2.b(i2);
            this.add(new jc(bvp3));
        }
    }

    public bvp a() {
        bvp bvp2 = new bvp();
        bmh bmh2 = new bmh();
        for (int i2 = 0; i2 < this.size(); ++i2) {
            jc jc2 = (jc)this.get(i2);
            bmh2.a(jc2.k());
        }
        bvp2.a("Recipes", bmh2);
        return bvp2;
    }
}

