/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;

public class cvr
extends gj {
    private static final bcz c = bwm.a(cvr.class, cbf.f);
    private static final bcz d = bwm.a(cvr.class, cbf.b);
    private float e = 1.0f;

    public cvr(iu iu2) {
        super(iu2);
    }

    public cvr(iu iu2, cmz cmz2, bqk bqk2) {
        super(iu2, cmz2);
        this.a(bqk2);
    }

    @Override
    protected void a() {
        this.bY().a(c, cg.f());
        this.bY().a(d, 0);
    }

    @Override
    public float ap_() {
        return 0.0f;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        if (!ahy2.e() && this.w() != null) {
            if (!this.aQ.C) {
                this.b(ahy2.b(), false);
                this.a(dah.cX, 1.0f, 1.0f);
                this.a((bhl)null);
            }
            return true;
        }
        return super.a(ahy2, f2);
    }

    @Override
    public int j() {
        return 12;
    }

    @Override
    public int k() {
        return 12;
    }

    @Override
    public boolean a(double d2) {
        double d3 = 16.0;
        return d2 < (d3 *= 64.0 * cvr.cz()) * d3;
    }

    @Override
    public void b(cpk cpk2) {
        this.a(dah.cV, 1.0f, 1.0f);
        this.b(cpk2, true);
    }

    @Override
    public void n() {
        this.a(dah.cW, 1.0f, 1.0f);
    }

    public void b(cpk cpk2, boolean bl2) {
        if (!this.aQ.F().b("doEntityDrops")) {
            return;
        }
        bhl bhl2 = this.w();
        if (cpk2 instanceof bdl) {
            bdl bdl2 = (bdl)cpk2;
            if (bdl2.G.d) {
                this.b(bhl2);
                return;
            }
        }
        if (bl2) {
            this.a(new bhl(hp.bZ), 0.0f);
        }
        if (bhl2 != null && this.bx.nextFloat() < this.e) {
            bhl2 = bhl2.j();
            this.b(bhl2);
            this.a(bhl2, 0.0f);
        }
    }

    private void b(bhl bhl2) {
        if (bhl2 == null) {
            return;
        }
        if (bhl2.a() == hp.bk) {
            aph aph2 = ((ayb)bhl2.a()).a(bhl2, this.aQ);
            aph2.i.remove("frame-" + this.bW());
        }
        bhl2.a((cvr)null);
    }

    public bhl w() {
        return (bhl)((cg)this.bY().a(c)).d();
    }

    public void a(bhl bhl2) {
        this.a(bhl2, true);
    }

    private void a(bhl bhl2, boolean bl2) {
        if (bhl2 != null) {
            bhl2 = bhl2.j();
            bhl2.b = 1;
            bhl2.a(this);
        }
        this.bY().b(c, cg.c(bhl2));
        this.bY().b(c);
        if (bhl2 != null) {
            this.a(dah.cU, 1.0f, 1.0f);
        }
        if (bl2 && this.a != null) {
            this.aQ.f(this.a, blg.a);
        }
    }

    @Override
    public void a(bcz bcz2) {
        bhl bhl2;
        if (bcz2.equals(c) && (bhl2 = this.w()) != null && bhl2.z() != this) {
            bhl2.a(this);
        }
    }

    public int B() {
        return (Integer)this.bY().a(d);
    }

    public void c(int n2) {
        this.a(n2, true);
    }

    private void a(int n2, boolean bl2) {
        this.bY().b(d, n2 % 8);
        if (bl2 && this.a != null) {
            this.aQ.f(this.a, blg.a);
        }
    }

    public static void a(cgy cgy2) {
        cgy2.a(bst.e, (cui)new amo("ItemFrame", new String[]{"Item"}));
    }

    @Override
    public void a(bvp bvp2) {
        if (this.w() != null) {
            bvp2.a("Item", this.w().b(new bvp()));
            bvp2.a("ItemRotation", (byte)this.B());
            bvp2.a("ItemDropChance", this.e);
        }
        super.a(bvp2);
    }

    @Override
    public void b(bvp bvp2) {
        bvp bvp3 = bvp2.o("Item");
        if (bvp3 != null && !bvp3.j()) {
            this.a(bhl.a(bvp3), false);
            this.a((int)bvp2.f("ItemRotation"), false);
            if (bvp2.b("ItemDropChance", 99)) {
                this.e = bvp2.j("ItemDropChance");
            }
        }
        super.b(bvp2);
    }

    @Override
    public boolean a(bdl bdl2, bhl bhl2, bqp bqp2) {
        if (this.w() == null) {
            if (bhl2 != null && !this.aQ.C) {
                this.a(bhl2);
                if (!bdl2.G.d) {
                    --bhl2.b;
                }
            }
        } else if (!this.aQ.C) {
            this.a(dah.cY, 1.0f, 1.0f);
            this.c(this.B() + 1);
        }
        return true;
    }

    public int C() {
        if (this.w() == null) {
            return 0;
        }
        return this.B() % 8 + 1;
    }
}

