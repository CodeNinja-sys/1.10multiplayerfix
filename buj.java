/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;

public class buj
extends dbd
implements avf,
azs {
    private static final int[] a = new int[]{3};
    private static final int[] b = new int[]{0, 1, 2, 3};
    private static final int[] c = new int[]{0, 1, 2, 4};
    private bhl[] d = new bhl[5];
    private int e;
    private boolean[] f;
    private azg g;
    private String h;
    private int i;

    @Override
    public String i_() {
        return this.j_() ? this.h : "container.brewing";
    }

    @Override
    public boolean j_() {
        return this.h != null && !this.h.isEmpty();
    }

    public void a(String string) {
        this.h = string;
    }

    @Override
    public int aI_() {
        return this.d.length;
    }

    @Override
    public void a() {
        boolean[] arrbl;
        boolean bl2;
        if (this.i <= 0 && this.d[4] != null && this.d[4].a() == hp.bN) {
            this.i = 20;
            --this.d[4].b;
            if (this.d[4].b <= 0) {
                this.d[4] = null;
            }
            this.c_();
        }
        boolean bl3 = this.o();
        boolean bl4 = bl2 = this.e > 0;
        if (bl2) {
            boolean bl5;
            --this.e;
            boolean bl6 = bl5 = this.e == 0;
            if (bl5 && bl3) {
                this.p();
                this.c_();
            } else if (!bl3) {
                this.e = 0;
                this.c_();
            } else if (this.g != this.d[3].a()) {
                this.e = 0;
                this.c_();
            }
        } else if (bl3 && this.i > 0) {
            --this.i;
            this.e = 400;
            this.g = this.d[3].a();
            this.c_();
        }
        if (!this.k.C && !Arrays.equals(arrbl = this.k(), this.f)) {
            this.f = arrbl;
            dbk dbk2 = this.k.n(this.y());
            if (!(dbk2.t() instanceof cfw)) {
                return;
            }
            for (int i2 = 0; i2 < cfw.a.length; ++i2) {
                dbk2 = dbk2.a(cfw.a[i2], Boolean.valueOf(arrbl[i2]));
            }
            this.k.a(this.l, dbk2, 2);
        }
    }

    public boolean[] k() {
        boolean[] arrbl = new boolean[3];
        for (int i2 = 0; i2 < 3; ++i2) {
            if (this.d[i2] == null) continue;
            arrbl[i2] = true;
        }
        return arrbl;
    }

    private boolean o() {
        if (this.d[3] == null || this.d[3].b <= 0) {
            return false;
        }
        bhl bhl2 = this.d[3];
        if (!qs.a(bhl2)) {
            return false;
        }
        for (int i2 = 0; i2 < 3; ++i2) {
            bhl bhl3 = this.d[i2];
            if (bhl3 == null || !qs.a(bhl3, bhl2)) continue;
            return true;
        }
        return false;
    }

    private void p() {
        bhl bhl2 = this.d[3];
        for (int i2 = 0; i2 < 3; ++i2) {
            this.d[i2] = qs.d(bhl2, this.d[i2]);
        }
        --bhl2.b;
        cmz cmz2 = this.y();
        if (bhl2.a().q()) {
            bhl bhl3 = new bhl(bhl2.a().p());
            if (bhl2.b <= 0) {
                bhl2 = bhl3;
            } else {
                ckw.a(this.k, (double)cmz2.a(), (double)cmz2.b(), (double)cmz2.c(), bhl3);
            }
        }
        if (bhl2.b <= 0) {
            bhl2 = null;
        }
        this.d[3] = bhl2;
        this.k.b(1035, cmz2, 0);
    }

    public static void a(cgy cgy2) {
        cgy2.a(bst.d, (cui)new ml("Cauldron", new String[]{"Items"}));
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bmh bmh2 = bvp2.c("Items", 10);
        this.d = new bhl[this.aI_()];
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            bvp bvp3 = bmh2.b(i2);
            byte by2 = bvp3.f("Slot");
            if (by2 < 0 || by2 >= this.d.length) continue;
            this.d[by2] = bhl.a(bvp3);
        }
        this.e = bvp2.g("BrewTime");
        if (bvp2.b("CustomName", 8)) {
            this.h = bvp2.l("CustomName");
        }
        this.i = bvp2.f("Fuel");
    }

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        bvp2.a("BrewTime", (short)this.e);
        bmh bmh2 = new bmh();
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            if (this.d[i2] == null) continue;
            bvp bvp3 = new bvp();
            bvp3.a("Slot", (byte)i2);
            this.d[i2].b(bvp3);
            bmh2.a(bvp3);
        }
        bvp2.a("Items", bmh2);
        if (this.j_()) {
            bvp2.a("CustomName", this.h);
        }
        bvp2.a("Fuel", (byte)this.i);
        return bvp2;
    }

    @Override
    public bhl a(int n2) {
        if (n2 >= 0 && n2 < this.d.length) {
            return this.d[n2];
        }
        return null;
    }

    @Override
    public bhl a(int n2, int n3) {
        return cjk.a(this.d, n2, n3);
    }

    @Override
    public bhl b(int n2) {
        return cjk.a(this.d, n2);
    }

    @Override
    public void a(int n2, bhl bhl2) {
        if (n2 >= 0 && n2 < this.d.length) {
            this.d[n2] = bhl2;
        }
    }

    @Override
    public int d() {
        return 64;
    }

    @Override
    public boolean a(bdl bdl2) {
        if (this.k.q(this.l) != this) {
            return false;
        }
        return !(bdl2.i((double)this.l.a() + 0.5, (double)this.l.b() + 0.5, (double)this.l.c() + 0.5) > 64.0);
    }

    @Override
    public void b(bdl bdl2) {
    }

    @Override
    public void c(bdl bdl2) {
    }

    @Override
    public boolean b(int n2, bhl bhl2) {
        if (n2 == 3) {
            return qs.a(bhl2);
        }
        azg azg2 = bhl2.a();
        if (n2 == 4) {
            return azg2 == hp.bN;
        }
        return azg2 == hp.bG || azg2 == hp.bH || azg2 == hp.bI || azg2 == hp.bJ;
    }

    @Override
    public int[] a(bqk bqk2) {
        if (bqk2 == bqk.b) {
            return a;
        }
        if (bqk2 == bqk.a) {
            return b;
        }
        return c;
    }

    @Override
    public boolean a(int n2, bhl bhl2, bqk bqk2) {
        return this.b(n2, bhl2);
    }

    @Override
    public boolean b(int n2, bhl bhl2, bqk bqk2) {
        if (n2 == 3) {
            return bhl2.a() == hp.bJ;
        }
        return true;
    }

    @Override
    public String n() {
        return "minecraft:brewing_stand";
    }

    @Override
    public apq a(cps cps2, bdl bdl2) {
        return new bol(cps2, this);
    }

    @Override
    public int c(int n2) {
        switch (n2) {
            case 0: {
                return this.e;
            }
            case 1: {
                return this.i;
            }
        }
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
        switch (n2) {
            case 0: {
                this.e = n3;
                break;
            }
            case 1: {
                this.i = n3;
            }
        }
    }

    @Override
    public int f() {
        return 2;
    }

    @Override
    public void g() {
        Arrays.fill(this.d, null);
    }
}

