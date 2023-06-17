/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import java.util.Random;

public class cdo
extends cjv {
    private final List b = ov.b();

    public cdo() {
    }

    public cdo(int n2, Random random, int n3, int n4, cfn cfn2) {
        super(n2, cfn2);
        this.a = cfn2;
        this.l = new awx(n3, 50, n4, n3 + 7 + random.nextInt(6), 54 + random.nextInt(6), n4 + 7 + random.nextInt(6));
    }

    @Override
    public void a(pc pc2, List list, Random random) {
        awx awx2;
        cjv cjv2;
        int n2;
        int n3 = this.c();
        int n4 = this.l.d() - 3 - 1;
        if (n4 <= 0) {
            n4 = 1;
        }
        for (n2 = 0; n2 < this.l.c() && (n2 += random.nextInt(this.l.c())) + 3 <= this.l.c(); n2 += 4) {
            cjv2 = awc.a(pc2, list, random, this.l.a + n2, this.l.b + random.nextInt(n4) + 1, this.l.c - 1, bqk.c, n3);
            if (cjv2 == null) continue;
            awx2 = cjv2.b();
            this.b.add(new awx(awx2.a, awx2.b, this.l.c, awx2.d, awx2.e, this.l.c + 1));
        }
        for (n2 = 0; n2 < this.l.c() && (n2 += random.nextInt(this.l.c())) + 3 <= this.l.c(); n2 += 4) {
            cjv2 = awc.a(pc2, list, random, this.l.a + n2, this.l.b + random.nextInt(n4) + 1, this.l.f + 1, bqk.d, n3);
            if (cjv2 == null) continue;
            awx2 = cjv2.b();
            this.b.add(new awx(awx2.a, awx2.b, this.l.f - 1, awx2.d, awx2.e, this.l.f));
        }
        for (n2 = 0; n2 < this.l.e() && (n2 += random.nextInt(this.l.e())) + 3 <= this.l.e(); n2 += 4) {
            cjv2 = awc.a(pc2, list, random, this.l.a - 1, this.l.b + random.nextInt(n4) + 1, this.l.c + n2, bqk.e, n3);
            if (cjv2 == null) continue;
            awx2 = cjv2.b();
            this.b.add(new awx(this.l.a, awx2.b, awx2.c, this.l.a + 1, awx2.e, awx2.f));
        }
        for (n2 = 0; n2 < this.l.e() && (n2 += random.nextInt(this.l.e())) + 3 <= this.l.e(); n2 += 4) {
            cjv2 = awc.a(pc2, list, random, this.l.d + 1, this.l.b + random.nextInt(n4) + 1, this.l.c + n2, bqk.f, n3);
            if (cjv2 == null) continue;
            awx2 = cjv2.b();
            this.b.add(new awx(this.l.d - 1, awx2.b, awx2.c, this.l.d, awx2.e, awx2.f));
        }
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        if (this.a(iu2, awx2)) {
            return false;
        }
        this.a(iu2, awx2, this.l.a, this.l.b, this.l.c, this.l.d, this.l.b, this.l.f, blg.d.s(), blg.a.s(), true);
        this.a(iu2, awx2, this.l.a, this.l.b + 1, this.l.c, this.l.d, Math.min(this.l.b + 3, this.l.e), this.l.f, blg.a.s(), blg.a.s(), false);
        for (awx awx3 : this.b) {
            this.a(iu2, awx2, awx3.a, awx3.e - 2, awx3.c, awx3.d, awx3.e, awx3.f, blg.a.s(), blg.a.s(), false);
        }
        this.a(iu2, awx2, this.l.a, this.l.b + 4, this.l.c, this.l.d, this.l.e, this.l.f, blg.a.s(), false);
        return true;
    }

    @Override
    public void a_(int n2, int n3, int n4) {
        super.a_(n2, n3, n4);
        for (awx awx2 : this.b) {
            awx2.a(n2, n3, n4);
        }
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bmh bmh2 = new bmh();
        for (awx awx2 : this.b) {
            bmh2.a(awx2.g());
        }
        bvp2.a("Entrances", bmh2);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        bmh bmh2 = bvp2.c("Entrances", 11);
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            this.b.add(new awx(bmh2.d(i2)));
        }
    }
}

