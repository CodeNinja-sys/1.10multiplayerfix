/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public abstract class bub
extends cef
implements bme,
cem {
    private bhl[] a = new bhl[36];
    private boolean b = true;
    private bpx c;
    private long d;

    public bub(iu iu2) {
        super(iu2);
    }

    public bub(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
    }

    @Override
    public void a(ahy ahy2) {
        super.a(ahy2);
        if (this.aQ.F().b("doEntityDrops")) {
            ckw.a(this.aQ, this, (tb)this);
        }
    }

    @Override
    public bhl a(int n2) {
        this.e((bdl)null);
        return this.a[n2];
    }

    @Override
    public bhl a(int n2, int n3) {
        this.e((bdl)null);
        return cjk.a(this.a, n2, n3);
    }

    @Override
    public bhl b(int n2) {
        this.e((bdl)null);
        if (this.a[n2] != null) {
            bhl bhl2 = this.a[n2];
            this.a[n2] = null;
            return bhl2;
        }
        return null;
    }

    @Override
    public void a(int n2, bhl bhl2) {
        this.e((bdl)null);
        this.a[n2] = bhl2;
        if (bhl2 != null && bhl2.b > this.d()) {
            bhl2.b = this.d();
        }
    }

    @Override
    public void c_() {
    }

    @Override
    public boolean a(bdl bdl2) {
        if (this.bk) {
            return false;
        }
        return !(bdl2.l(this) > 64.0);
    }

    @Override
    public void b(bdl bdl2) {
    }

    @Override
    public void c(bdl bdl2) {
    }

    @Override
    public boolean b(int n2, bhl bhl2) {
        return true;
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public cpk e_(int n2) {
        this.b = false;
        return super.e_(n2);
    }

    @Override
    public void ak_() {
        if (this.b) {
            ckw.a(this.aQ, this, (tb)this);
        }
        super.ak_();
    }

    @Override
    public void a_(boolean bl2) {
        this.b = bl2;
    }

    public static void a(cgy cgy2, String string) {
        cef.b(cgy2, string);
        cgy2.a(bst.e, (cui)new ml(string, new String[]{"Items"}));
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        if (this.c != null) {
            bvp2.a("LootTable", this.c.toString());
            if (this.d != 0L) {
                bvp2.a("LootTableSeed", this.d);
            }
        } else {
            bmh bmh2 = new bmh();
            for (int i2 = 0; i2 < this.a.length; ++i2) {
                if (this.a[i2] == null) continue;
                bvp bvp3 = new bvp();
                bvp3.a("Slot", (byte)i2);
                this.a[i2].b(bvp3);
                bmh2.a(bvp3);
            }
            bvp2.a("Items", bmh2);
        }
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.a = new bhl[this.aI_()];
        if (bvp2.b("LootTable", 8)) {
            this.c = new bpx(bvp2.l("LootTable"));
            this.d = bvp2.i("LootTableSeed");
        } else {
            bmh bmh2 = bvp2.c("Items", 10);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                bvp bvp3 = bmh2.b(i2);
                int n2 = bvp3.f("Slot") & 0xFF;
                if (n2 < 0 || n2 >= this.a.length) continue;
                this.a[n2] = bhl.a(bvp3);
            }
        }
    }

    @Override
    public boolean a(bdl bdl2, bhl bhl2, bqp bqp2) {
        if (!this.aQ.C) {
            bdl2.a(this);
        }
        return true;
    }

    @Override
    protected void ax_() {
        float f2 = 0.98f;
        if (this.c == null) {
            int n2 = 15 - apq.b(this);
            f2 += (float)n2 * 0.001f;
        }
        this.aX *= (double)f2;
        this.aY *= 0.0;
        this.aZ *= (double)f2;
    }

    @Override
    public int c(int n2) {
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
    }

    @Override
    public int f() {
        return 0;
    }

    @Override
    public boolean aJ_() {
        return false;
    }

    @Override
    public void a(biu biu2) {
    }

    @Override
    public biu i() {
        return biu.a;
    }

    public void e(bdl bdl2) {
        if (this.c != null) {
            cse cse2 = this.aQ.V().a(this.c);
            this.c = null;
            Random random = this.d == 0L ? new Random() : new Random(this.d);
            bcn bcn2 = new bcn((alj)this.aQ);
            if (bdl2 != null) {
                bcn2.a(bdl2.aT());
            }
            cse2.a(this, random, bcn2.a());
        }
    }

    @Override
    public void g() {
        this.e((bdl)null);
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = null;
        }
    }

    public void a(bpx bpx2, long l2) {
        this.c = bpx2;
        this.d = l2;
    }

    @Override
    public bpx h() {
        return this.c;
    }
}

