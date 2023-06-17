/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;
import java.util.Random;

public class ne
extends cxn {
    private static final bcz a = bwm.a(ne.class, cbf.a);
    private final yo b = new yo(new lo(this), 2, 1);
    private static final Map c = sz.a(dck.class);
    private int d;
    private cg e;

    public static float[] a(dck dck2) {
        return (float[])c.get(dck2);
    }

    public ne(iu iu2) {
        super(iu2);
        this.a_(0.9f, 1.3f);
        this.b.a(0, new bhl(hp.bd));
        this.b.a(1, new bhl(hp.bd));
    }

    @Override
    protected void n() {
        this.e = new cg(this);
        this.m.a(0, new baf(this));
        this.m.a(1, new aro(this, 1.25));
        this.m.a(2, new ky(this, 1.0));
        this.m.a(3, new af((cfl)this, 1.1, hp.Q, false));
        this.m.a(4, new adk(this, 1.1));
        this.m.a(5, this.e);
        this.m.a(6, new vq(this, 1.0));
        this.m.a(7, new chx(this, bdl.class, 6.0f));
        this.m.a(8, new bzv(this));
    }

    @Override
    protected void o() {
        this.d = this.e.f();
        super.o();
    }

    @Override
    public void Q_() {
        if (this.aQ.C) {
            this.d = Math.max(0, this.d - 1);
        }
        super.Q_();
    }

    @Override
    protected void p() {
        super.p();
        this.a(cgz.a).a(8.0);
        this.a(cgz.d).a(0.23f);
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(a, (byte)0);
    }

    @Override
    protected bpx u() {
        if (this.B()) {
            return bvm.M;
        }
        switch (this.x()) {
            default: {
                return bvm.N;
            }
            case b: {
                return bvm.O;
            }
            case c: {
                return bvm.P;
            }
            case d: {
                return bvm.Q;
            }
            case e: {
                return bvm.R;
            }
            case f: {
                return bvm.S;
            }
            case g: {
                return bvm.T;
            }
            case h: {
                return bvm.U;
            }
            case i: {
                return bvm.V;
            }
            case j: {
                return bvm.W;
            }
            case k: {
                return bvm.X;
            }
            case l: {
                return bvm.Y;
            }
            case m: {
                return bvm.Z;
            }
            case n: {
                return bvm.aa;
            }
            case o: {
                return bvm.ab;
            }
            case p: 
        }
        return bvm.ac;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 10) {
            this.d = 40;
        } else {
            super.a(by2);
        }
    }

    public float d(float f2) {
        if (this.d <= 0) {
            return 0.0f;
        }
        if (this.d >= 4 && this.d <= 36) {
            return 1.0f;
        }
        if (this.d < 4) {
            return ((float)this.d - f2) / 4.0f;
        }
        return -((float)(this.d - 40) - f2) / 4.0f;
    }

    public float e(float f2) {
        if (this.d > 4 && this.d <= 36) {
            float f3 = ((float)(this.d - 4) - f2) / 32.0f;
            return 0.62831855f + 0.21991149f * cmk.a(f3 * 28.7f);
        }
        if (this.d > 0) {
            return 0.62831855f;
        }
        return this.bb * ((float)Math.PI / 180);
    }

    @Override
    public boolean a(bdl bdl2, bqp bqp2, bhl bhl2) {
        if (bhl2 != null && bhl2.a() == hp.bl && !this.B() && !this.R_()) {
            if (!this.aQ.C) {
                this.b(true);
                int n2 = 1 + this.bx.nextInt(3);
                for (int i2 = 0; i2 < n2; ++i2) {
                    er er2 = this.a(new bhl(azg.a(blg.L), 1, this.x().b()), 1.0f);
                    er2.aY += (double)(this.bx.nextFloat() * 0.05f);
                    er2.aX += (double)((this.bx.nextFloat() - this.bx.nextFloat()) * 0.1f);
                    er2.aZ += (double)((this.bx.nextFloat() - this.bx.nextFloat()) * 0.1f);
                }
            }
            bhl2.a(1, (bga)bdl2);
            this.a(dah.fa, 1.0f, 1.0f);
        }
        return super.a(bdl2, bqp2, bhl2);
    }

    public static void a(cgy cgy2) {
        xy.a(cgy2, "Sheep");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Sheared", this.B());
        bvp2.a("Color", (byte)this.x().b());
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        this.b(bvp2.p("Sheared"));
        this.b(dck.b(bvp2.f("Color")));
    }

    @Override
    protected bi q() {
        return dah.eX;
    }

    @Override
    protected bi r() {
        return dah.eZ;
    }

    @Override
    protected bi s() {
        return dah.eY;
    }

    @Override
    protected void a(cmz cmz2, bfa bfa2) {
        this.a(dah.fb, 0.15f, 1.0f);
    }

    public dck x() {
        return dck.b((Byte)this.bE.a(a) & 0xF);
    }

    public void b(dck dck2) {
        byte by2 = (Byte)this.bE.a(a);
        this.bE.b(a, (byte)(by2 & 0xF0 | dck2.b() & 0xF));
    }

    public boolean B() {
        return ((Byte)this.bE.a(a) & 0x10) != 0;
    }

    public void b(boolean bl2) {
        byte by2 = (Byte)this.bE.a(a);
        if (bl2) {
            this.bE.b(a, (byte)(by2 | 0x10));
        } else {
            this.bE.b(a, (byte)(by2 & 0xFFFFFFEF));
        }
    }

    public static dck a(Random random) {
        int n2 = random.nextInt(100);
        if (n2 < 5) {
            return dck.p;
        }
        if (n2 < 10) {
            return dck.h;
        }
        if (n2 < 15) {
            return dck.i;
        }
        if (n2 < 18) {
            return dck.m;
        }
        if (random.nextInt(500) == 0) {
            return dck.g;
        }
        return dck.a;
    }

    public ne a(alf alf2) {
        ne ne2 = (ne)alf2;
        ne ne3 = new ne(this.aQ);
        ne3.b(this.a(this, ne2));
        return ne3;
    }

    @Override
    public void S_() {
        this.b(false);
        if (this.R_()) {
            this.i(60);
        }
    }

    @Override
    public aql a(bgp bgp2, aql aql2) {
        aql2 = super.a(bgp2, aql2);
        this.b(ne.a(this.aQ.p));
        return aql2;
    }

    private dck a(cxn cxn2, cxn cxn3) {
        int n2 = ((ne)cxn2).x().c();
        int n3 = ((ne)cxn3).x().c();
        this.b.a(0).b(n2);
        this.b.a(1).b(n3);
        bhl bhl2 = gx.a().a(this.b, ((ne)cxn2).aQ);
        int n4 = bhl2 != null && bhl2.a() == hp.bd ? bhl2.h() : (this.aQ.p.nextBoolean() ? n2 : n3);
        return dck.a(n4);
    }

    @Override
    public float A() {
        return 0.95f * this.bm;
    }

    @Override
    public /* synthetic */ alf b(alf alf2) {
        return this.a(alf2);
    }

    static {
        c.put(dck.a, new float[]{1.0f, 1.0f, 1.0f});
        c.put(dck.b, new float[]{0.85f, 0.5f, 0.2f});
        c.put(dck.c, new float[]{0.7f, 0.3f, 0.85f});
        c.put(dck.d, new float[]{0.4f, 0.6f, 0.85f});
        c.put(dck.e, new float[]{0.9f, 0.9f, 0.2f});
        c.put(dck.f, new float[]{0.5f, 0.8f, 0.1f});
        c.put(dck.g, new float[]{0.95f, 0.5f, 0.65f});
        c.put(dck.h, new float[]{0.3f, 0.3f, 0.3f});
        c.put(dck.i, new float[]{0.6f, 0.6f, 0.6f});
        c.put(dck.j, new float[]{0.3f, 0.5f, 0.6f});
        c.put(dck.k, new float[]{0.5f, 0.25f, 0.7f});
        c.put(dck.l, new float[]{0.2f, 0.3f, 0.7f});
        c.put(dck.m, new float[]{0.4f, 0.3f, 0.2f});
        c.put(dck.n, new float[]{0.4f, 0.5f, 0.2f});
        c.put(dck.o, new float[]{0.6f, 0.2f, 0.2f});
        c.put(dck.p, new float[]{0.1f, 0.1f, 0.1f});
    }
}

