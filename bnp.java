/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bnp
extends agu {
    private final boolean[] e = new boolean[4];

    public bnp() {
    }

    public bnp(Random random, int n2, int n3) {
        super(random, n2, 64, n3, 21, 15, 21);
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("hasPlacedChest0", this.e[0]);
        bvp2.a("hasPlacedChest1", this.e[1]);
        bvp2.a("hasPlacedChest2", this.e[2]);
        bvp2.a("hasPlacedChest3", this.e[3]);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.e[0] = bvp2.p("hasPlacedChest0");
        this.e[1] = bvp2.p("hasPlacedChest1");
        this.e[2] = bvp2.p("hasPlacedChest2");
        this.e[3] = bvp2.p("hasPlacedChest3");
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        int n2;
        int n3;
        this.a(iu2, awx2, 0, -4, 0, this.a - 1, 0, this.c - 1, blg.A.s(), blg.A.s(), false);
        for (n3 = 1; n3 <= 9; ++n3) {
            this.a(iu2, awx2, n3, n3, n3, this.a - 1 - n3, n3, this.c - 1 - n3, blg.A.s(), blg.A.s(), false);
            this.a(iu2, awx2, n3 + 1, n3, n3 + 1, this.a - 2 - n3, n3, this.c - 2 - n3, blg.a.s(), blg.a.s(), false);
        }
        for (n3 = 0; n3 < this.a; ++n3) {
            for (int i2 = 0; i2 < this.c; ++i2) {
                int n4 = -5;
                this.b(iu2, blg.A.s(), n3, -5, i2, awx2);
            }
        }
        dbk dbk2 = blg.bO.s().a(qi.a, (Comparable)((Object)bqk.c));
        dbk dbk3 = blg.bO.s().a(qi.a, (Comparable)((Object)bqk.d));
        dbk dbk4 = blg.bO.s().a(qi.a, (Comparable)((Object)bqk.f));
        dbk dbk5 = blg.bO.s().a(qi.a, (Comparable)((Object)bqk.e));
        int n5 = ~dck.b.c() & 0xF;
        int n6 = ~dck.l.c() & 0xF;
        this.a(iu2, awx2, 0, 0, 0, 4, 9, 4, blg.A.s(), blg.a.s(), false);
        this.a(iu2, awx2, 1, 10, 1, 3, 10, 3, blg.A.s(), blg.A.s(), false);
        this.a(iu2, dbk2, 2, 10, 0, awx2);
        this.a(iu2, dbk3, 2, 10, 4, awx2);
        this.a(iu2, dbk4, 0, 10, 2, awx2);
        this.a(iu2, dbk5, 4, 10, 2, awx2);
        this.a(iu2, awx2, this.a - 5, 0, 0, this.a - 1, 9, 4, blg.A.s(), blg.a.s(), false);
        this.a(iu2, awx2, this.a - 4, 10, 1, this.a - 2, 10, 3, blg.A.s(), blg.A.s(), false);
        this.a(iu2, dbk2, this.a - 3, 10, 0, awx2);
        this.a(iu2, dbk3, this.a - 3, 10, 4, awx2);
        this.a(iu2, dbk4, this.a - 5, 10, 2, awx2);
        this.a(iu2, dbk5, this.a - 1, 10, 2, awx2);
        this.a(iu2, awx2, 8, 0, 0, 12, 4, 4, blg.A.s(), blg.a.s(), false);
        this.a(iu2, awx2, 9, 1, 0, 11, 3, 4, blg.a.s(), blg.a.s(), false);
        this.a(iu2, blg.A.a(byr.c.b()), 9, 1, 1, awx2);
        this.a(iu2, blg.A.a(byr.c.b()), 9, 2, 1, awx2);
        this.a(iu2, blg.A.a(byr.c.b()), 9, 3, 1, awx2);
        this.a(iu2, blg.A.a(byr.c.b()), 10, 3, 1, awx2);
        this.a(iu2, blg.A.a(byr.c.b()), 11, 3, 1, awx2);
        this.a(iu2, blg.A.a(byr.c.b()), 11, 2, 1, awx2);
        this.a(iu2, blg.A.a(byr.c.b()), 11, 1, 1, awx2);
        this.a(iu2, awx2, 4, 1, 1, 8, 3, 3, blg.A.s(), blg.a.s(), false);
        this.a(iu2, awx2, 4, 1, 2, 8, 2, 2, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 12, 1, 1, 16, 3, 3, blg.A.s(), blg.a.s(), false);
        this.a(iu2, awx2, 12, 1, 2, 16, 2, 2, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 5, 4, 5, this.a - 6, 4, this.c - 6, blg.A.s(), blg.A.s(), false);
        this.a(iu2, awx2, 9, 4, 9, 11, 4, 11, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, 8, 1, 8, 8, 3, 8, blg.A.a(byr.c.b()), blg.A.a(byr.c.b()), false);
        this.a(iu2, awx2, 12, 1, 8, 12, 3, 8, blg.A.a(byr.c.b()), blg.A.a(byr.c.b()), false);
        this.a(iu2, awx2, 8, 1, 12, 8, 3, 12, blg.A.a(byr.c.b()), blg.A.a(byr.c.b()), false);
        this.a(iu2, awx2, 12, 1, 12, 12, 3, 12, blg.A.a(byr.c.b()), blg.A.a(byr.c.b()), false);
        this.a(iu2, awx2, 1, 1, 5, 4, 4, 11, blg.A.s(), blg.A.s(), false);
        this.a(iu2, awx2, this.a - 5, 1, 5, this.a - 2, 4, 11, blg.A.s(), blg.A.s(), false);
        this.a(iu2, awx2, 6, 7, 9, 6, 7, 11, blg.A.s(), blg.A.s(), false);
        this.a(iu2, awx2, this.a - 7, 7, 9, this.a - 7, 7, 11, blg.A.s(), blg.A.s(), false);
        this.a(iu2, awx2, 5, 5, 9, 5, 7, 11, blg.A.a(byr.c.b()), blg.A.a(byr.c.b()), false);
        this.a(iu2, awx2, this.a - 6, 5, 9, this.a - 6, 7, 11, blg.A.a(byr.c.b()), blg.A.a(byr.c.b()), false);
        this.a(iu2, blg.a.s(), 5, 5, 10, awx2);
        this.a(iu2, blg.a.s(), 5, 6, 10, awx2);
        this.a(iu2, blg.a.s(), 6, 6, 10, awx2);
        this.a(iu2, blg.a.s(), this.a - 6, 5, 10, awx2);
        this.a(iu2, blg.a.s(), this.a - 6, 6, 10, awx2);
        this.a(iu2, blg.a.s(), this.a - 7, 6, 10, awx2);
        this.a(iu2, awx2, 2, 4, 4, 2, 6, 4, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, this.a - 3, 4, 4, this.a - 3, 6, 4, blg.a.s(), blg.a.s(), false);
        this.a(iu2, dbk2, 2, 4, 5, awx2);
        this.a(iu2, dbk2, 2, 3, 4, awx2);
        this.a(iu2, dbk2, this.a - 3, 4, 5, awx2);
        this.a(iu2, dbk2, this.a - 3, 3, 4, awx2);
        this.a(iu2, awx2, 1, 1, 3, 2, 2, 3, blg.A.s(), blg.A.s(), false);
        this.a(iu2, awx2, this.a - 3, 1, 3, this.a - 2, 2, 3, blg.A.s(), blg.A.s(), false);
        this.a(iu2, blg.A.s(), 1, 1, 2, awx2);
        this.a(iu2, blg.A.s(), this.a - 2, 1, 2, awx2);
        this.a(iu2, blg.U.a(cev.b.b()), 1, 2, 2, awx2);
        this.a(iu2, blg.U.a(cev.b.b()), this.a - 2, 2, 2, awx2);
        this.a(iu2, dbk5, 2, 1, 2, awx2);
        this.a(iu2, dbk4, this.a - 3, 1, 2, awx2);
        this.a(iu2, awx2, 4, 3, 5, 4, 3, 18, blg.A.s(), blg.A.s(), false);
        this.a(iu2, awx2, this.a - 5, 3, 5, this.a - 5, 3, 17, blg.A.s(), blg.A.s(), false);
        this.a(iu2, awx2, 3, 1, 5, 4, 2, 16, blg.a.s(), blg.a.s(), false);
        this.a(iu2, awx2, this.a - 6, 1, 5, this.a - 5, 2, 16, blg.a.s(), blg.a.s(), false);
        for (n2 = 5; n2 <= 17; n2 += 2) {
            this.a(iu2, blg.A.a(byr.c.b()), 4, 1, n2, awx2);
            this.a(iu2, blg.A.a(byr.b.b()), 4, 2, n2, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), this.a - 5, 1, n2, awx2);
            this.a(iu2, blg.A.a(byr.b.b()), this.a - 5, 2, n2, awx2);
        }
        this.a(iu2, blg.cu.a(n5), 10, 0, 7, awx2);
        this.a(iu2, blg.cu.a(n5), 10, 0, 8, awx2);
        this.a(iu2, blg.cu.a(n5), 9, 0, 9, awx2);
        this.a(iu2, blg.cu.a(n5), 11, 0, 9, awx2);
        this.a(iu2, blg.cu.a(n5), 8, 0, 10, awx2);
        this.a(iu2, blg.cu.a(n5), 12, 0, 10, awx2);
        this.a(iu2, blg.cu.a(n5), 7, 0, 10, awx2);
        this.a(iu2, blg.cu.a(n5), 13, 0, 10, awx2);
        this.a(iu2, blg.cu.a(n5), 9, 0, 11, awx2);
        this.a(iu2, blg.cu.a(n5), 11, 0, 11, awx2);
        this.a(iu2, blg.cu.a(n5), 10, 0, 12, awx2);
        this.a(iu2, blg.cu.a(n5), 10, 0, 13, awx2);
        this.a(iu2, blg.cu.a(n6), 10, 0, 10, awx2);
        for (n2 = 0; n2 <= this.a - 1; n2 += this.a - 1) {
            this.a(iu2, blg.A.a(byr.c.b()), n2, 2, 1, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 2, 2, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2, 2, 3, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2, 3, 1, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 3, 2, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2, 3, 3, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 4, 1, awx2);
            this.a(iu2, blg.A.a(byr.b.b()), n2, 4, 2, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 4, 3, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2, 5, 1, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 5, 2, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2, 5, 3, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 6, 1, awx2);
            this.a(iu2, blg.A.a(byr.b.b()), n2, 6, 2, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 6, 3, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 7, 1, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 7, 2, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 7, 3, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2, 8, 1, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2, 8, 2, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2, 8, 3, awx2);
        }
        for (n2 = 2; n2 <= this.a - 3; n2 += this.a - 3 - 2) {
            this.a(iu2, blg.A.a(byr.c.b()), n2 - 1, 2, 0, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 2, 0, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2 + 1, 2, 0, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2 - 1, 3, 0, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 3, 0, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2 + 1, 3, 0, awx2);
            this.a(iu2, blg.cu.a(n5), n2 - 1, 4, 0, awx2);
            this.a(iu2, blg.A.a(byr.b.b()), n2, 4, 0, awx2);
            this.a(iu2, blg.cu.a(n5), n2 + 1, 4, 0, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2 - 1, 5, 0, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 5, 0, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2 + 1, 5, 0, awx2);
            this.a(iu2, blg.cu.a(n5), n2 - 1, 6, 0, awx2);
            this.a(iu2, blg.A.a(byr.b.b()), n2, 6, 0, awx2);
            this.a(iu2, blg.cu.a(n5), n2 + 1, 6, 0, awx2);
            this.a(iu2, blg.cu.a(n5), n2 - 1, 7, 0, awx2);
            this.a(iu2, blg.cu.a(n5), n2, 7, 0, awx2);
            this.a(iu2, blg.cu.a(n5), n2 + 1, 7, 0, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2 - 1, 8, 0, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2, 8, 0, awx2);
            this.a(iu2, blg.A.a(byr.c.b()), n2 + 1, 8, 0, awx2);
        }
        this.a(iu2, awx2, 8, 4, 0, 12, 6, 0, blg.A.a(byr.c.b()), blg.A.a(byr.c.b()), false);
        this.a(iu2, blg.a.s(), 8, 6, 0, awx2);
        this.a(iu2, blg.a.s(), 12, 6, 0, awx2);
        this.a(iu2, blg.cu.a(n5), 9, 5, 0, awx2);
        this.a(iu2, blg.A.a(byr.b.b()), 10, 5, 0, awx2);
        this.a(iu2, blg.cu.a(n5), 11, 5, 0, awx2);
        this.a(iu2, awx2, 8, -14, 8, 12, -11, 12, blg.A.a(byr.c.b()), blg.A.a(byr.c.b()), false);
        this.a(iu2, awx2, 8, -10, 8, 12, -10, 12, blg.A.a(byr.b.b()), blg.A.a(byr.b.b()), false);
        this.a(iu2, awx2, 8, -9, 8, 12, -9, 12, blg.A.a(byr.c.b()), blg.A.a(byr.c.b()), false);
        this.a(iu2, awx2, 8, -8, 8, 12, -1, 12, blg.A.s(), blg.A.s(), false);
        this.a(iu2, awx2, 9, -11, 9, 11, -1, 11, blg.a.s(), blg.a.s(), false);
        this.a(iu2, blg.az.s(), 10, -11, 10, awx2);
        this.a(iu2, awx2, 9, -13, 9, 11, -13, 11, blg.W.s(), blg.a.s(), false);
        this.a(iu2, blg.a.s(), 8, -11, 10, awx2);
        this.a(iu2, blg.a.s(), 8, -10, 10, awx2);
        this.a(iu2, blg.A.a(byr.b.b()), 7, -10, 10, awx2);
        this.a(iu2, blg.A.a(byr.c.b()), 7, -11, 10, awx2);
        this.a(iu2, blg.a.s(), 12, -11, 10, awx2);
        this.a(iu2, blg.a.s(), 12, -10, 10, awx2);
        this.a(iu2, blg.A.a(byr.b.b()), 13, -10, 10, awx2);
        this.a(iu2, blg.A.a(byr.c.b()), 13, -11, 10, awx2);
        this.a(iu2, blg.a.s(), 10, -11, 8, awx2);
        this.a(iu2, blg.a.s(), 10, -10, 8, awx2);
        this.a(iu2, blg.A.a(byr.b.b()), 10, -10, 7, awx2);
        this.a(iu2, blg.A.a(byr.c.b()), 10, -11, 7, awx2);
        this.a(iu2, blg.a.s(), 10, -11, 12, awx2);
        this.a(iu2, blg.a.s(), 10, -10, 12, awx2);
        this.a(iu2, blg.A.a(byr.b.b()), 10, -10, 13, awx2);
        this.a(iu2, blg.A.a(byr.c.b()), 10, -11, 13, awx2);
        for (bqk bqk2 : afj.a) {
            if (this.e[bqk2.c()]) continue;
            int n7 = bqk2.h() * 2;
            int n8 = bqk2.j() * 2;
            this.e[bqk2.c()] = this.a(iu2, awx2, random, 10 + n7, -11, 10 + n8, bvm.k);
        }
        return true;
    }
}

