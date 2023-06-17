/*
 * Decompiled with CFR 0.150.
 */
public class bop
extends dbd
implements avf,
azs {
    private static final int[] a = new int[]{0};
    private static final int[] b = new int[]{2, 1};
    private static final int[] c = new int[]{1};
    private bhl[] d = new bhl[3];
    private int e;
    private int f;
    private int g;
    private int h;
    private String i;

    @Override
    public int aI_() {
        return this.d.length;
    }

    @Override
    public bhl a(int n2) {
        return this.d[n2];
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
        boolean bl2 = bhl2 != null && bhl2.a(this.d[n2]) && bhl.a(bhl2, this.d[n2]);
        this.d[n2] = bhl2;
        if (bhl2 != null && bhl2.b > this.d()) {
            bhl2.b = this.d();
        }
        if (n2 == 0 && !bl2) {
            this.h = this.a(bhl2);
            this.g = 0;
            this.c_();
        }
    }

    @Override
    public String i_() {
        return this.j_() ? this.i : "container.furnace";
    }

    @Override
    public boolean j_() {
        return this.i != null && !this.i.isEmpty();
    }

    public void a(String string) {
        this.i = string;
    }

    public static void a(cgy cgy2) {
        cgy2.a(bst.d, (cui)new ml("Furnace", new String[]{"Items"}));
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
        this.e = bvp2.g("BurnTime");
        this.g = bvp2.g("CookTime");
        this.h = bvp2.g("CookTimeTotal");
        this.f = bop.b(this.d[1]);
        if (bvp2.b("CustomName", 8)) {
            this.i = bvp2.l("CustomName");
        }
    }

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        bvp2.a("BurnTime", (short)this.e);
        bvp2.a("CookTime", (short)this.g);
        bvp2.a("CookTimeTotal", (short)this.h);
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
            bvp2.a("CustomName", this.i);
        }
        return bvp2;
    }

    @Override
    public int d() {
        return 64;
    }

    public boolean k() {
        return this.e > 0;
    }

    public static boolean a(tb tb2) {
        return tb2.c(0) > 0;
    }

    @Override
    public void a() {
        boolean bl2 = this.k();
        boolean bl3 = false;
        if (this.k()) {
            --this.e;
        }
        if (!this.k.C) {
            if (this.k() || this.d[1] != null && this.d[0] != null) {
                if (!this.k() && this.p()) {
                    this.f = this.e = bop.b(this.d[1]);
                    if (this.k()) {
                        bl3 = true;
                        if (this.d[1] != null) {
                            --this.d[1].b;
                            if (this.d[1].b == 0) {
                                azg azg2 = this.d[1].a().p();
                                bhl bhl2 = this.d[1] = azg2 != null ? new bhl(azg2) : null;
                            }
                        }
                    }
                }
                if (this.k() && this.p()) {
                    ++this.g;
                    if (this.g == this.h) {
                        this.g = 0;
                        this.h = this.a(this.d[0]);
                        this.o();
                        bl3 = true;
                    }
                } else {
                    this.g = 0;
                }
            } else if (!this.k() && this.g > 0) {
                this.g = cmk.a(this.g - 2, 0, this.h);
            }
            if (bl2 != this.k()) {
                bl3 = true;
                aer.a(this.k(), this.k, this.l);
            }
        }
        if (bl3) {
            this.c_();
        }
    }

    public int a(bhl bhl2) {
        return 200;
    }

    private boolean p() {
        if (this.d[0] == null) {
            return false;
        }
        bhl bhl2 = gu.a().a(this.d[0]);
        if (bhl2 == null) {
            return false;
        }
        if (this.d[2] == null) {
            return true;
        }
        if (!this.d[2].a(bhl2)) {
            return false;
        }
        if (this.d[2].b < this.d() && this.d[2].b < this.d[2].b()) {
            return true;
        }
        return this.d[2].b < bhl2.b();
    }

    public void o() {
        if (!this.p()) {
            return;
        }
        bhl bhl2 = gu.a().a(this.d[0]);
        if (this.d[2] == null) {
            this.d[2] = bhl2.j();
        } else if (this.d[2].a() == bhl2.a()) {
            ++this.d[2].b;
        }
        if (this.d[0].a() == azg.a(blg.v) && this.d[0].h() == 1 && this.d[1] != null && this.d[1].a() == hp.ay) {
            this.d[1] = new bhl(hp.az);
        }
        --this.d[0].b;
        if (this.d[0].b <= 0) {
            this.d[0] = null;
        }
    }

    public static int b(bhl bhl2) {
        if (bhl2 == null) {
            return 0;
        }
        azg azg2 = bhl2.a();
        if (azg2 instanceof ge && bfa.a(azg2) != blg.a) {
            bfa bfa2 = bfa.a(azg2);
            if (bfa2 == blg.bM) {
                return 150;
            }
            if (bfa2.s().a() == ahk.d) {
                return 300;
            }
            if (bfa2 == blg.cA) {
                return 16000;
            }
        }
        if (azg2 instanceof xi && "WOOD".equals(((xi)azg2).g())) {
            return 200;
        }
        if (azg2 instanceof bof && "WOOD".equals(((bof)azg2).g())) {
            return 200;
        }
        if (azg2 instanceof axj && "WOOD".equals(((axj)azg2).f())) {
            return 200;
        }
        if (azg2 == hp.A) {
            return 100;
        }
        if (azg2 == hp.j) {
            return 1600;
        }
        if (azg2 == hp.aA) {
            return 20000;
        }
        if (azg2 == azg.a(blg.g)) {
            return 100;
        }
        if (azg2 == hp.bC) {
            return 2400;
        }
        return 0;
    }

    public static boolean c(bhl bhl2) {
        return bop.b(bhl2) > 0;
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
        if (n2 == 2) {
            return false;
        }
        if (n2 == 1) {
            bhl bhl3 = this.d[1];
            return bop.c(bhl2) || ael.e(bhl2) && (bhl3 == null || bhl3.a() != hp.ay);
        }
        return true;
    }

    @Override
    public int[] a(bqk bqk2) {
        if (bqk2 == bqk.a) {
            return b;
        }
        if (bqk2 == bqk.b) {
            return a;
        }
        return c;
    }

    @Override
    public boolean a(int n2, bhl bhl2, bqk bqk2) {
        return this.b(n2, bhl2);
    }

    @Override
    public boolean b(int n2, bhl bhl2, bqk bqk2) {
        azg azg2;
        return bqk2 != bqk.a || n2 != 1 || (azg2 = bhl2.a()) == hp.az || azg2 == hp.ay;
    }

    @Override
    public String n() {
        return "minecraft:furnace";
    }

    @Override
    public apq a(cps cps2, bdl bdl2) {
        return new dk(cps2, this);
    }

    @Override
    public int c(int n2) {
        switch (n2) {
            case 0: {
                return this.e;
            }
            case 1: {
                return this.f;
            }
            case 2: {
                return this.g;
            }
            case 3: {
                return this.h;
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
                this.f = n3;
                break;
            }
            case 2: {
                this.g = n3;
                break;
            }
            case 3: {
                this.h = n3;
            }
        }
    }

    @Override
    public int f() {
        return 4;
    }

    @Override
    public void g() {
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            this.d[i2] = null;
        }
    }
}

