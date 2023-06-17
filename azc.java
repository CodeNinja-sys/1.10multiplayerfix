/*
 * Decompiled with CFR 0.150.
 */
import java.util.Calendar;

public class azc
extends bmm {
    private static final bcz a = bwm.a(azc.class, cbf.a);
    private cmz b;

    public azc(iu iu2) {
        super(iu2);
        this.a_(0.5f, 0.9f);
        this.a(true);
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, (byte)0);
    }

    @Override
    protected float t() {
        return 0.1f;
    }

    @Override
    protected float ac_() {
        return super.ac_() * 0.95f;
    }

    @Override
    protected bi q() {
        if (this.T() && this.bx.nextInt(4) != 0) {
            return null;
        }
        return dah.w;
    }

    @Override
    protected bi r() {
        return dah.y;
    }

    @Override
    protected bi s() {
        return dah.x;
    }

    @Override
    public boolean P() {
        return false;
    }

    @Override
    protected void b(cpk cpk2) {
    }

    @Override
    protected void ae_() {
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(6.0);
    }

    public boolean T() {
        return ((Byte)this.bE.a(a) & 1) != 0;
    }

    public void a(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        if (bl2) {
            this.bE.b(a, (byte)(by2 | 1));
        } else {
            this.bE.b(a, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    @Override
    public void bb_() {
        super.bb_();
        if (this.T()) {
            this.aX = 0.0;
            this.aY = 0.0;
            this.aZ = 0.0;
            this.aV = (double)cmk.c(this.aV) + 1.0 - (double)this.bm;
        } else {
            this.aY *= (double)0.6f;
        }
    }

    @Override
    protected void o() {
        super.o();
        cmz cmz2 = new cmz(this);
        cmz cmz3 = cmz2.g();
        if (this.T()) {
            if (this.aQ.n(cmz3).l()) {
                if (this.bx.nextInt(200) == 0) {
                    this.aj = this.bx.nextInt(360);
                }
                if (this.aQ.b((cpk)this, 4.0) != null) {
                    this.a(false);
                    this.aQ.a(null, 1025, cmz2, 0);
                }
            } else {
                this.a(false);
                this.aQ.a(null, 1025, cmz2, 0);
            }
        } else {
            if (!(this.b == null || this.aQ.c(this.b) && this.b.b() >= 1)) {
                this.b = null;
            }
            if (this.b == null || this.bx.nextInt(30) == 0 || this.b.d((double)((int)this.aU), (double)((int)this.aV), (double)((int)this.aW)) < 4.0) {
                this.b = new cmz((int)this.aU + this.bx.nextInt(7) - this.bx.nextInt(7), (int)this.aV + this.bx.nextInt(6) - 2, (int)this.aW + this.bx.nextInt(7) - this.bx.nextInt(7));
            }
            double d2 = (double)this.b.a() + 0.5 - this.aU;
            double d3 = (double)this.b.b() + 0.1 - this.aV;
            double d4 = (double)this.b.c() + 0.5 - this.aW;
            this.aX += (Math.signum(d2) * 0.5 - this.aX) * (double)0.1f;
            this.aY += (Math.signum(d3) * (double)0.7f - this.aY) * (double)0.1f;
            this.aZ += (Math.signum(d4) * 0.5 - this.aZ) * (double)0.1f;
            float f2 = (float)(cmk.b(this.aZ, this.aX) * 57.2957763671875) - 90.0f;
            float f3 = cmk.g(f2 - this.ba);
            this.az = 0.5f;
            this.ba += f3;
            if (this.bx.nextInt(100) == 0 && this.aQ.n(cmz3).l()) {
                this.a(true);
            }
        }
    }

    @Override
    protected boolean e() {
        return false;
    }

    @Override
    public void a(float f2, float f3) {
    }

    @Override
    protected void a(double d2, boolean bl2, dbk dbk2, cmz cmz2) {
    }

    @Override
    public boolean au_() {
        return true;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (this.c(ahy2)) {
            return false;
        }
        if (!this.aQ.C && this.T()) {
            this.a(false);
        }
        return super.a(ahy2, f2);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Bat");
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.bE.b(a, bvp2.f("BatFlags"));
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("BatFlags", (Byte)this.bE.a(a));
    }

    @Override
    public boolean h() {
        cmz cmz2 = new cmz(this.aU, this.cD().b, this.aW);
        if (cmz2.b() >= this.aQ.u()) {
            return false;
        }
        int n2 = this.aQ.j(cmz2);
        int n3 = 4;
        if (this.a(this.aQ.O())) {
            n3 = 7;
        } else if (this.bx.nextBoolean()) {
            return false;
        }
        if (n2 > this.bx.nextInt(n3)) {
            return false;
        }
        return super.h();
    }

    private boolean a(Calendar calendar) {
        return calendar.get(2) + 1 == 10 && calendar.get(5) >= 20 || calendar.get(2) + 1 == 11 && calendar.get(5) <= 3;
    }

    @Override
    public float A() {
        return this.bm / 2.0f;
    }

    @Override
    protected bpx u() {
        return bvm.ad;
    }
}

