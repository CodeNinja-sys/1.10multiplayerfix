/*
 * Decompiled with CFR 0.150.
 */
public class hx
extends crm {
    protected static final bcz a = bwm.a(hx.class, cbf.a);
    private int c;
    aus b;
    private int d;
    private int e;

    public hx(iu iu2) {
        super(iu2);
        this.a_(1.4f, 2.7f);
    }

    @Override
    protected void n() {
        this.m.a(1, new eu(this, 1.0, true));
        this.m.a(2, new xb(this, 0.9, 32.0f));
        this.m.a(3, new aee(this, 0.6, true));
        this.m.a(4, new byi(this, 1.0));
        this.m.a(5, new aav(this));
        this.m.a(6, new vq(this, 0.6));
        this.m.a(7, new chx(this, bdl.class, 6.0f));
        this.m.a(8, new bzv(this));
        this.n.a(1, new dcv(this));
        this.n.a(2, new ahx((cfl)this, false, new Class[0]));
        this.n.a(3, new cyx(this, xy.class, 10, false, true, new eo(this)));
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, (byte)0);
    }

    @Override
    protected void o() {
        if (--this.c <= 0) {
            this.c = 70 + this.bx.nextInt(50);
            this.b = this.aQ.T().a(new cmz(this), 32);
            if (this.b == null) {
                this.bO();
            } else {
                cmz cmz2 = this.b.a();
                this.a(cmz2, (int)((float)this.b.b() * 0.6f));
            }
        }
        super.o();
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(100.0);
        this.a(cgz.d).a(0.25);
        this.a(cgz.c).a(1.0);
    }

    @Override
    protected int b_(int n2) {
        return n2;
    }

    @Override
    protected void b(cpk cpk2) {
        if (cpk2 instanceof cso && !(cpk2 instanceof ddh) && this.aW().nextInt(20) == 0) {
            this.b((bga)cpk2);
        }
        super.b(cpk2);
    }

    @Override
    public void Q_() {
        int n2;
        int n3;
        int n4;
        dbk dbk2;
        super.Q_();
        if (this.d > 0) {
            --this.d;
        }
        if (this.e > 0) {
            --this.e;
        }
        if (this.aX * this.aX + this.aZ * this.aZ > 2.500000277905201E-7 && this.bx.nextInt(5) == 0 && (dbk2 = this.aQ.n(new cmz(n4 = cmk.c(this.aU), n3 = cmk.c(this.aV - (double)0.2f), n2 = cmk.c(this.aW)))).a() != ahk.a) {
            this.aQ.a(lz.L, this.aU + ((double)this.bx.nextFloat() - 0.5) * (double)this.bl, this.cD().b + 0.1, this.aW + ((double)this.bx.nextFloat() - 0.5) * (double)this.bl, 4.0 * ((double)this.bx.nextFloat() - 0.5), 0.5, ((double)this.bx.nextFloat() - 0.5) * 4.0, bfa.u(dbk2));
        }
    }

    @Override
    public boolean a(Class class_) {
        if (this.D() && bdl.class.isAssignableFrom(class_)) {
            return false;
        }
        if (class_ == ddh.class) {
            return false;
        }
        return super.a(class_);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "VillagerGolem");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("PlayerCreated", this.D());
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.b(bvp2.p("PlayerCreated"));
    }

    @Override
    public boolean a(cpk cpk2) {
        this.d = 10;
        this.aQ.a((cpk)this, (byte)4);
        boolean bl2 = cpk2.a(ahy.b(this), (float)(7 + this.bx.nextInt(15)));
        if (bl2) {
            cpk2.aY += (double)0.4f;
            this.a(this, cpk2);
        }
        this.a(dah.cM, 1.0f, 1.0f);
        return bl2;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 4) {
            this.d = 10;
            this.a(dah.cM, 1.0f, 1.0f);
        } else if (by2 == 11) {
            this.e = 400;
        } else {
            super.a(by2);
        }
    }

    public aus x() {
        return this.b;
    }

    public int B() {
        return this.d;
    }

    public void a(boolean bl2) {
        this.e = bl2 ? 400 : 0;
        this.aQ.a((cpk)this, (byte)11);
    }

    @Override
    protected bi r() {
        return dah.cO;
    }

    @Override
    protected bi s() {
        return dah.cN;
    }

    @Override
    protected void a(cmz cmz2, bfa bfa2) {
        this.a(dah.cP, 1.0f, 1.0f);
    }

    @Override
    protected bpx u() {
        return bvm.z;
    }

    public int C() {
        return this.e;
    }

    public boolean D() {
        return ((Byte)this.bE.a(a) & 1) != 0;
    }

    public void b(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        if (bl2) {
            this.bE.b(a, (byte)(by2 | 1));
        } else {
            this.bE.b(a, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    @Override
    public void a(ahy ahy2) {
        if (!this.D() && this.am != null && this.b != null) {
            this.b.a(this.am.i_(), -5);
        }
        super.a(ahy2);
    }
}

