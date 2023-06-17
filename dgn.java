/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class dgn
extends ced {
    public dgn() {
    }

    public dgn(yj yj2, int n2, Random random, int n3, int n4) {
        super(yj2, n2);
        this.a(afj.a.a(random));
        this.l = this.e().l() == ctv.c ? new awx(n3, 64, n4, n3 + 6 - 1, 78, n4 + 6 - 1) : new awx(n3, 64, n4, n3 + 6 - 1, 78, n4 + 6 - 1);
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        ccv.b((yj)pc2, list, random, this.l.a - 1, this.l.e - 4, this.l.c + 1, bqk.e, this.c());
        ccv.b((yj)pc2, list, random, this.l.d + 1, this.l.e - 4, this.l.c + 1, bqk.f, this.c());
        ccv.b((yj)pc2, list, random, this.l.a + 1, this.l.e - 4, this.l.c - 1, bqk.c, this.c());
        ccv.b((yj)pc2, list, random, this.l.a + 1, this.l.e - 4, this.l.f + 1, bqk.d, this.c());
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.g < 0) {
            this.g = this.b(iu2, awx2);
            if (this.g < 0) {
                return true;
            }
            this.l.a(0, this.g - this.l.e + 3, 0);
        }
        dbk dbk2 = this.a(blg.e.s());
        dbk dbk3 = this.a(blg.aO.s());
        this.a(iu2, awx2, 1, 0, 1, 4, 12, 4, dbk2, blg.i.s(), false);
        this.a(iu2, blg.a.s(), 2, 12, 2, awx2);
        this.a(iu2, blg.a.s(), 3, 12, 2, awx2);
        this.a(iu2, blg.a.s(), 2, 12, 3, awx2);
        this.a(iu2, blg.a.s(), 3, 12, 3, awx2);
        this.a(iu2, dbk3, 1, 13, 1, awx2);
        this.a(iu2, dbk3, 1, 14, 1, awx2);
        this.a(iu2, dbk3, 4, 13, 1, awx2);
        this.a(iu2, dbk3, 4, 14, 1, awx2);
        this.a(iu2, dbk3, 1, 13, 4, awx2);
        this.a(iu2, dbk3, 1, 14, 4, awx2);
        this.a(iu2, dbk3, 4, 13, 4, awx2);
        this.a(iu2, dbk3, 4, 14, 4, awx2);
        this.a(iu2, awx2, 1, 15, 1, 4, 15, 4, dbk2, dbk2, false);
        for (int i2 = 0; i2 <= 5; ++i2) {
            for (int i3 = 0; i3 <= 5; ++i3) {
                if (i3 != 0 && i3 != 5 && i2 != 0 && i2 != 5) continue;
                this.a(iu2, blg.e.s(), i3, 11, i2, awx2);
                this.c(iu2, i3, 12, i2, awx2);
            }
        }
        return true;
    }
}

