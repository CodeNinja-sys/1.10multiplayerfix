/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Set;

public class jp
extends cxn {
    private static final Set w = aad.a(hp.P, hp.bo, hp.bn, hp.cU);
    public float a;
    public float b;
    public float c;
    public float d;
    public float e = 1.0f;
    public int f;
    public boolean g;

    public jp(iu iu2) {
        super(iu2);
        this.a_(0.4f, 0.7f);
        this.f = this.bx.nextInt(6000) + 6000;
        this.a(cfh.g, 0.0f);
    }

    @Override
    protected void n() {
        this.m.a(0, new baf(this));
        this.m.a(1, new aro(this, 1.4));
        this.m.a(2, new ky(this, 1.0));
        this.m.a(3, new af((cfl)this, 1.0, false, w));
        this.m.a(4, new adk(this, 1.1));
        this.m.a(5, new vq(this, 1.0));
        this.m.a(6, new chx(this, bdl.class, 6.0f));
        this.m.a(7, new bzv(this));
    }

    @Override
    public float A() {
        return this.bm;
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(4.0);
        this.a(cgz.d).a(0.25);
    }

    @Override
    public void Q_() {
        super.Q_();
        this.d = this.a;
        this.c = this.b;
        this.b = (float)((double)this.b + (double)(this.be ? -1 : 4) * 0.3);
        this.b = cmk.a(this.b, 0.0f, 1.0f);
        if (!this.be && this.e < 1.0f) {
            this.e = 1.0f;
        }
        this.e = (float)((double)this.e * 0.9);
        if (!this.be && this.aY < 0.0) {
            this.aY *= 0.6;
        }
        this.a += this.e * 2.0f;
        if (!(this.aQ.C || this.R_() || this.x() || --this.f > 0)) {
            this.a(dah.aa, 1.0f, (this.bx.nextFloat() - this.bx.nextFloat()) * 0.2f + 1.0f);
            this.a(hp.aW, 1);
            this.f = this.bx.nextInt(6000) + 6000;
        }
    }

    @Override
    public void a(float f2, float f3) {
    }

    @Override
    protected bi q() {
        return dah.Y;
    }

    @Override
    protected bi r() {
        return dah.ab;
    }

    @Override
    protected bi s() {
        return dah.Z;
    }

    @Override
    protected void a(cmz cmz2, bfa bfa2) {
        this.a(dah.ac, 0.15f, 1.0f);
    }

    @Override
    protected bpx u() {
        return bvm.C;
    }

    public jp a(alf alf2) {
        return new jp(this.aQ);
    }

    @Override
    public boolean a(bhl bhl2) {
        return bhl2 != null && w.contains(bhl2.a());
    }

    @Override
    protected int c_(bdl bdl2) {
        if (this.x()) {
            return 10;
        }
        return super.c_(bdl2);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Chicken");
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.g = bvp2.p("IsChickenJockey");
        if (bvp2.e("EggLayTime")) {
            this.f = bvp2.h("EggLayTime");
        }
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("IsChickenJockey", this.g);
        bvp2.a("EggLayTime", this.f);
    }

    @Override
    protected boolean k() {
        return this.x() && !this.cq();
    }

    @Override
    public void c(cpk cpk2) {
        super.c(cpk2);
        float f2 = cmk.a(this.ah * ((float)Math.PI / 180));
        float f3 = cmk.b(this.ah * ((float)Math.PI / 180));
        float f4 = 0.1f;
        float f5 = 0.0f;
        cpk2.d(this.aU + (double)(0.1f * f2), this.aV + (double)(this.bm * 0.5f) + cpk2.Z_() + 0.0, this.aW - (double)(0.1f * f3));
        if (cpk2 instanceof bga) {
            ((bga)cpk2).ah = this.ah;
        }
    }

    public boolean x() {
        return this.g;
    }

    public void b(boolean bl2) {
        this.g = bl2;
    }

    @Override
    public /* synthetic */ alf b(alf alf2) {
        return this.a(alf2);
    }
}

