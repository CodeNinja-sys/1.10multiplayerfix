/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;
import java.util.UUID;

public abstract class nb
extends cxn
implements uf {
    protected static final bcz a = bwm.a(nb.class, cbf.a);
    protected static final bcz b = bwm.a(nb.class, cbf.m);
    protected awa c;

    public nb(iu iu2) {
        super(iu2);
        this.x();
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, (byte)0);
        this.bE.a(b, cg.f());
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        if (this.D() == null) {
            bvp2.a("OwnerUUID", "");
        } else {
            bvp2.a("OwnerUUID", this.D().toString());
        }
        bvp2.a("Sitting", this.C());
    }

    @Override
    public void b(bvp bvp2) {
        String string;
        super.b(bvp2);
        if (bvp2.b("OwnerUUID", 8)) {
            string = bvp2.l("OwnerUUID");
        } else {
            String string2 = bvp2.l("Owner");
            string = dee.a(this.o_(), string2);
        }
        if (!string.isEmpty()) {
            try {
                this.a(UUID.fromString(string));
                this.a(true);
            }
            catch (Throwable throwable) {
                this.a(false);
            }
        }
        if (this.c != null) {
            this.c.a(bvp2.p("Sitting"));
        }
        this.c(bvp2.p("Sitting"));
    }

    @Override
    public boolean c(bdl bdl2) {
        return this.B() && this.a(bdl2);
    }

    protected void b(boolean bl2) {
        lz lz2 = lz.I;
        if (!bl2) {
            lz2 = lz.l;
        }
        for (int i2 = 0; i2 < 7; ++i2) {
            double d2 = this.bx.nextGaussian() * 0.02;
            double d3 = this.bx.nextGaussian() * 0.02;
            double d4 = this.bx.nextGaussian() * 0.02;
            this.aQ.a(lz2, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 0.5 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, d2, d3, d4, new int[0]);
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 7) {
            this.b(true);
        } else if (by2 == 6) {
            this.b(false);
        } else {
            super.a(by2);
        }
    }

    public boolean B() {
        return ((Byte)this.bE.a(a) & 4) != 0;
    }

    public void a(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        if (bl2) {
            this.bE.b(a, (byte)(by2 | 4));
        } else {
            this.bE.b(a, (byte)(by2 & 0xFFFFFFFB));
        }
        this.x();
    }

    protected void x() {
    }

    public boolean C() {
        return ((Byte)this.bE.a(a) & 1) != 0;
    }

    public void c(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        if (bl2) {
            this.bE.b(a, (byte)(by2 | 1));
        } else {
            this.bE.b(a, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    @Override
    public UUID D() {
        return (UUID)((cg)this.bE.a(b)).d();
    }

    public void a(UUID uUID) {
        this.bE.b(b, cg.c(uUID));
    }

    public bga E() {
        try {
            UUID uUID = this.D();
            if (uUID == null) {
                return null;
            }
            return this.aQ.a(uUID);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public boolean a(bga bga2) {
        return bga2 == this.E();
    }

    public awa F() {
        return this.c;
    }

    public boolean a(bga bga2, bga bga3) {
        return true;
    }

    @Override
    public ccw as_() {
        bga bga2;
        if (this.B() && (bga2 = this.E()) != null) {
            return bga2.as_();
        }
        return super.as_();
    }

    @Override
    public boolean d(cpk cpk2) {
        if (this.B()) {
            bga bga2 = this.E();
            if (cpk2 == bga2) {
                return true;
            }
            if (bga2 != null) {
                return bga2.d(cpk2);
            }
        }
        return super.d(cpk2);
    }

    @Override
    public void a(ahy ahy2) {
        if (!this.aQ.C && this.aQ.F().b("showDeathMessages") && this.E() instanceof czt) {
            this.E().a(this.bm().b());
        }
        super.a(ahy2);
    }

    @Override
    public /* synthetic */ cpk H() {
        return this.E();
    }
}

