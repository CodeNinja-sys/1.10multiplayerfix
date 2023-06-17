/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class jr
extends ced {
    private boolean a;

    public jr() {
    }

    public jr(yj yj2, int n2, Random random, awx awx2, bqk bqk2) {
        super(yj2, n2);
        this.a(bqk2);
        this.l = awx2;
        this.a = random.nextBoolean();
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Terrace", this.a);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = bvp2.p("Terrace");
    }

    public static jr a(yj yj2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        awx awx2 = awx.a(n2, n3, n4, 0, 0, 0, 5, 6, 5, bqk2);
        if (pc.a(list, awx2) != null) {
            return null;
        }
        return new jr(yj2, n5, random, awx2, bqk2);
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.g < 0) {
            this.g = this.b(iu2, awx2);
            if (this.g < 0) {
                return true;
            }
            this.l.a(0, this.g - this.l.e + 6 - 1, 0);
        }
        dbk dbk2 = this.a(blg.e.s());
        dbk dbk3 = this.a(blg.f.s());
        dbk dbk4 = this.a(blg.aw.s().a(qi.a, (Comparable)((Object)bqk.c)));
        dbk dbk5 = this.a(blg.r.s());
        dbk dbk6 = this.a(blg.aO.s());
        this.a(iu2, awx2, 0, 0, 0, 4, 0, 4, dbk2, dbk2, false);
        this.a(iu2, awx2, 0, 4, 0, 4, 4, 4, dbk5, dbk5, false);
        this.a(iu2, awx2, 1, 4, 1, 3, 4, 3, dbk3, dbk3, false);
        this.a(iu2, dbk2, 0, 1, 0, awx2);
        this.a(iu2, dbk2, 0, 2, 0, awx2);
        this.a(iu2, dbk2, 0, 3, 0, awx2);
        this.a(iu2, dbk2, 4, 1, 0, awx2);
        this.a(iu2, dbk2, 4, 2, 0, awx2);
        this.a(iu2, dbk2, 4, 3, 0, awx2);
        this.a(iu2, dbk2, 0, 1, 4, awx2);
        this.a(iu2, dbk2, 0, 2, 4, awx2);
        this.a(iu2, dbk2, 0, 3, 4, awx2);
        this.a(iu2, dbk2, 4, 1, 4, awx2);
        this.a(iu2, dbk2, 4, 2, 4, awx2);
        this.a(iu2, dbk2, 4, 3, 4, awx2);
        this.a(iu2, awx2, 0, 1, 1, 0, 3, 3, dbk3, dbk3, false);
        this.a(iu2, awx2, 4, 1, 1, 4, 3, 3, dbk3, dbk3, false);
        this.a(iu2, awx2, 1, 1, 4, 3, 3, 4, dbk3, dbk3, false);
        this.a(iu2, blg.bj.s(), 0, 2, 2, awx2);
        this.a(iu2, blg.bj.s(), 2, 2, 4, awx2);
        this.a(iu2, blg.bj.s(), 4, 2, 2, awx2);
        this.a(iu2, dbk3, 1, 1, 0, awx2);
        this.a(iu2, dbk3, 1, 2, 0, awx2);
        this.a(iu2, dbk3, 1, 3, 0, awx2);
        this.a(iu2, dbk3, 2, 3, 0, awx2);
        this.a(iu2, dbk3, 3, 3, 0, awx2);
        this.a(iu2, dbk3, 3, 2, 0, awx2);
        this.a(iu2, dbk3, 3, 1, 0, awx2);
        if (this.a(iu2, 2, 0, -1, awx2).a() == ahk.a && this.a(iu2, 2, -1, -1, awx2).a() != ahk.a) {
            this.a(iu2, dbk4, 2, 0, -1, awx2);
            if (this.a(iu2, 2, -1, -1, awx2).t() == blg.da) {
                this.a(iu2, blg.c.s(), 2, -1, -1, awx2);
            }
        }
        this.a(iu2, awx2, 1, 1, 1, 3, 3, 3, blg.a.s(), blg.a.s(), false);
        if (this.a) {
            this.a(iu2, dbk6, 0, 5, 0, awx2);
            this.a(iu2, dbk6, 1, 5, 0, awx2);
            this.a(iu2, dbk6, 2, 5, 0, awx2);
            this.a(iu2, dbk6, 3, 5, 0, awx2);
            this.a(iu2, dbk6, 4, 5, 0, awx2);
            this.a(iu2, dbk6, 0, 5, 4, awx2);
            this.a(iu2, dbk6, 1, 5, 4, awx2);
            this.a(iu2, dbk6, 2, 5, 4, awx2);
            this.a(iu2, dbk6, 3, 5, 4, awx2);
            this.a(iu2, dbk6, 4, 5, 4, awx2);
            this.a(iu2, dbk6, 4, 5, 1, awx2);
            this.a(iu2, dbk6, 4, 5, 2, awx2);
            this.a(iu2, dbk6, 4, 5, 3, awx2);
            this.a(iu2, dbk6, 0, 5, 1, awx2);
            this.a(iu2, dbk6, 0, 5, 2, awx2);
            this.a(iu2, dbk6, 0, 5, 3, awx2);
        }
        if (this.a) {
            dbk dbk7 = blg.au.s().a(def.a, (Comparable)((Object)bqk.d));
            this.a(iu2, dbk7, 3, 1, 3, awx2);
            this.a(iu2, dbk7, 3, 2, 3, awx2);
            this.a(iu2, dbk7, 3, 3, 3, awx2);
            this.a(iu2, dbk7, 3, 4, 3, awx2);
        }
        this.a(iu2, bqk.c, 2, 3, 1, awx2);
        for (int i2 = 0; i2 < 5; ++i2) {
            for (int i3 = 0; i3 < 5; ++i3) {
                this.c(iu2, i3, 6, i2, awx2);
                this.b(iu2, dbk2, i3, -1, i2, awx2);
            }
        }
        this.a(iu2, awx2, 1, 1, 2, 1);
        return true;
    }
}

