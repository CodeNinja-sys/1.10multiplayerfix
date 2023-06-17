/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.ov;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class agq
extends dbd
implements avf,
azs {
    public static final bfv[][] a = new bfv[][]{{ake.a, ake.c}, {ake.k, ake.h}, {ake.e}, {ake.j}};
    private static final Set b = aad.a();
    private final List c = ov.a();
    private long d;
    private float e;
    private boolean f;
    private int g = -1;
    private bfv h;
    private bfv i;
    private bhl j;
    private String o;

    @Override
    public void a() {
        if (this.k.z() % 80L == 0L) {
            this.h();
        }
    }

    public void h() {
        if (this.k != null) {
            this.p();
            this.o();
        }
    }

    private void o() {
        if (this.f && this.g > 0 && !this.k.C && this.h != null) {
            double d2 = this.g * 10 + 10;
            int n2 = 0;
            if (this.g >= 4 && this.h == this.i) {
                n2 = 1;
            }
            int n3 = (9 + this.g * 2) * 20;
            int n4 = this.l.a();
            int n5 = this.l.b();
            int n6 = this.l.c();
            cxt cxt2 = new cxt(n4, n5, n6, n4 + 1, n5 + 1, n6 + 1).b(d2).a(0.0, this.k.K(), 0.0);
            List list = this.k.a(bdl.class, cxt2);
            for (bdl bdl2 : list) {
                bdl2.b(new cko(this.h, n3, n2, true, true));
            }
            if (this.g >= 4 && this.h != this.i && this.i != null) {
                for (bdl bdl2 : list) {
                    bdl2.b(new cko(this.i, n3, 0, true, true));
                }
            }
        }
    }

    private void p() {
        int n2;
        int n3 = this.g;
        int n4 = this.l.a();
        int n5 = this.l.b();
        int n6 = this.l.c();
        this.g = 0;
        this.c.clear();
        this.f = true;
        bke bke2 = new bke(ne.a(dck.a));
        this.c.add(bke2);
        boolean bl2 = true;
        pj pj2 = new pj();
        for (n2 = n5 + 1; n2 < 256; ++n2) {
            float[] arrf;
            Object object = this.k.n(pj2.a(n4, n2, n6));
            if (object.t() == blg.cG) {
                arrf = ne.a((dck)((Object)object.b(ajr.a)));
            } else if (object.t() == blg.cH) {
                arrf = ne.a((dck)((Object)object.b(cqe.f)));
            } else {
                if (object.c() < 15 || object.t() == blg.h) {
                    bke2.a();
                    continue;
                }
                this.f = false;
                this.c.clear();
                break;
            }
            if (!bl2) {
                arrf = new float[]{(bke2.b()[0] + arrf[0]) / 2.0f, (bke2.b()[1] + arrf[1]) / 2.0f, (bke2.b()[2] + arrf[2]) / 2.0f};
            }
            if (Arrays.equals(arrf, bke2.b())) {
                bke2.a();
            } else {
                bke2 = new bke(arrf);
                this.c.add(bke2);
            }
            bl2 = false;
        }
        if (this.f) {
            int n7;
            n2 = 1;
            while (n2 <= 4 && (n7 = n5 - n2) >= 0) {
                boolean bl3 = true;
                block2: for (int i2 = n4 - n2; i2 <= n4 + n2 && bl3; ++i2) {
                    for (int i3 = n6 - n2; i3 <= n6 + n2; ++i3) {
                        bfa bfa2 = this.k.n(new cmz(i2, n7, i3)).t();
                        if (bfa2 == blg.bT || bfa2 == blg.R || bfa2 == blg.ah || bfa2 == blg.S) continue;
                        bl3 = false;
                        continue block2;
                    }
                }
                if (!bl3) break;
                this.g = n2++;
            }
            if (this.g == 0) {
                this.f = false;
            }
        }
        if (!this.k.C && this.g == 4 && n3 < this.g) {
            for (Object object : this.k.a(bdl.class, new cxt(n4, n5, n6, n4, n5 - 4, n6).b(10.0, 5.0, 10.0))) {
                ((bdl)object).a((cyd)bpa.K);
            }
        }
    }

    public List j() {
        return this.c;
    }

    public float k() {
        if (!this.f) {
            return 0.0f;
        }
        int n2 = (int)(this.k.z() - this.d);
        this.d = this.k.z();
        if (n2 > 1) {
            this.e -= (float)n2 / 40.0f;
            if (this.e < 0.0f) {
                this.e = 0.0f;
            }
        }
        this.e += 0.025f;
        if (this.e > 1.0f) {
            this.e = 1.0f;
        }
        return this.e;
    }

    @Override
    public hv a_() {
        return new hv(this.l, 3, this.b());
    }

    @Override
    public bvp b() {
        return this.b(new bvp());
    }

    @Override
    public double d_() {
        return 65536.0;
    }

    private static bfv d(int n2) {
        bfv bfv2 = bfv.a(n2);
        return b.contains(bfv2) ? bfv2 : null;
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        this.h = agq.d(bvp2.h("Primary"));
        this.i = agq.d(bvp2.h("Secondary"));
        this.g = bvp2.h("Levels");
    }

    @Override
    public bvp b(bvp bvp2) {
        super.b(bvp2);
        bvp2.a("Primary", bfv.a(this.h));
        bvp2.a("Secondary", bfv.a(this.i));
        bvp2.a("Levels", this.g);
        return bvp2;
    }

    @Override
    public int aI_() {
        return 1;
    }

    @Override
    public bhl a(int n2) {
        if (n2 == 0) {
            return this.j;
        }
        return null;
    }

    @Override
    public bhl a(int n2, int n3) {
        if (n2 == 0 && this.j != null) {
            if (n3 >= this.j.b) {
                bhl bhl2 = this.j;
                this.j = null;
                return bhl2;
            }
            this.j.b -= n3;
            return new bhl(this.j.a(), n3, this.j.h());
        }
        return null;
    }

    @Override
    public bhl b(int n2) {
        if (n2 == 0) {
            bhl bhl2 = this.j;
            this.j = null;
            return bhl2;
        }
        return null;
    }

    @Override
    public void a(int n2, bhl bhl2) {
        if (n2 == 0) {
            this.j = bhl2;
        }
    }

    @Override
    public String i_() {
        return this.j_() ? this.o : "container.beacon";
    }

    @Override
    public boolean j_() {
        return this.o != null && !this.o.isEmpty();
    }

    public void a(String string) {
        this.o = string;
    }

    @Override
    public int d() {
        return 1;
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
        return bhl2.a() == hp.bY || bhl2.a() == hp.k || bhl2.a() == hp.m || bhl2.a() == hp.l;
    }

    @Override
    public String n() {
        return "minecraft:beacon";
    }

    @Override
    public apq a(cps cps2, bdl bdl2) {
        return new bmj(cps2, this);
    }

    @Override
    public int c(int n2) {
        switch (n2) {
            case 0: {
                return this.g;
            }
            case 1: {
                return bfv.a(this.h);
            }
            case 2: {
                return bfv.a(this.i);
            }
        }
        return 0;
    }

    @Override
    public void b(int n2, int n3) {
        switch (n2) {
            case 0: {
                this.g = n3;
                break;
            }
            case 1: {
                this.h = agq.d(n3);
                break;
            }
            case 2: {
                this.i = agq.d(n3);
            }
        }
    }

    @Override
    public int f() {
        return 3;
    }

    @Override
    public void g() {
        this.j = null;
    }

    @Override
    public boolean a_(int n2, int n3) {
        if (n2 == 1) {
            this.h();
            return true;
        }
        return super.a_(n2, n3);
    }

    @Override
    public int[] a(bqk bqk2) {
        return new int[0];
    }

    @Override
    public boolean a(int n2, bhl bhl2, bqk bqk2) {
        return false;
    }

    @Override
    public boolean b(int n2, bhl bhl2, bqk bqk2) {
        return false;
    }

    static {
        for (bfv[] arrbfv : a) {
            Collections.addAll(b, arrbfv);
        }
    }
}

