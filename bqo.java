/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class bqo
extends ajt
implements tb {
    private static final Random d = new Random();
    private bhl[] e = new bhl[9];
    protected String c;

    @Override
    public int aI_() {
        return 9;
    }

    @Override
    public bhl a(int n2) {
        this.d((bdl)null);
        return this.e[n2];
    }

    @Override
    public bhl a(int n2, int n3) {
        this.d((bdl)null);
        bhl bhl2 = cjk.a(this.e, n2, n3);
        if (bhl2 != null) {
            this.c_();
        }
        return bhl2;
    }

    @Override
    public bhl b(int n2) {
        this.d((bdl)null);
        return cjk.a(this.e, n2);
    }

    public int k() {
        this.d((bdl)null);
        int n2 = -1;
        int n3 = 1;
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            if (this.e[i2] == null || d.nextInt(n3++) != 0) continue;
            n2 = i2;
        }
        return n2;
    }

    @Override
    public void a(int n2, bhl bhl2) {
        this.d((bdl)null);
        this.e[n2] = bhl2;
        if (bhl2 != null && bhl2.b > this.d()) {
            bhl2.b = this.d();
        }
        this.c_();
    }

    public int a(bhl bhl2) {
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            if (this.e[i2] != null && this.e[i2].a() != null) continue;
            this.a(i2, bhl2);
            return i2;
        }
        return -1;
    }

    @Override
    public String i_() {
        return this.j_() ? this.c : "container.dispenser";
    }

    public void a(String string) {
        this.c = string;
    }

    @Override
    public boolean j_() {
        return this.c != null;
    }

    public static void a(cgy cgy2) {
        cgy2.a(bst.d, (cui)new ml("Trap", new String[]{"Items"}));
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        if (!this.c(bvp2)) {
            bmh bmh2 = bvp2.c("Items", 10);
            this.e = new bhl[this.aI_()];
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                bvp bvp3 = bmh2.b(i2);
                int n2 = bvp3.f("Slot") & 0xFF;
                if (n2 < 0 || n2 >= this.e.length) continue;
                this.e[n2] = bhl.a(bvp3);
            }
        }
        if (bvp2.b("CustomName", 8)) {
            this.c = bvp2.l("CustomName");
        }
    }

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        if (!this.d(bvp2)) {
            bmh bmh2 = new bmh();
            for (int i2 = 0; i2 < this.e.length; ++i2) {
                if (this.e[i2] == null) continue;
                bvp bvp3 = new bvp();
                bvp3.a("Slot", (byte)i2);
                this.e[i2].b(bvp3);
                bmh2.a(bvp3);
            }
            bvp2.a("Items", bmh2);
        }
        if (this.j_()) {
            bvp2.a("CustomName", this.c);
        }
        return bvp2;
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
        return true;
    }

    @Override
    public String n() {
        return "minecraft:dispenser";
    }

    @Override
    public apq a(cps cps2, bdl bdl2) {
        this.d(bdl2);
        return new clj(cps2, this);
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
    public void g() {
        this.d((bdl)null);
        for (int i2 = 0; i2 < this.e.length; ++i2) {
            this.e[i2] = null;
        }
    }
}

