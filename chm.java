/*
 * Decompiled with CFR 0.150.
 */
public class chm
extends ux {
    private final avq a;
    private final bdl b;
    private int g;
    private final fc h;

    public chm(bdl bdl2, fc fc2, avq avq2, int n2, int n3, int n4) {
        super(avq2, n2, n3, n4);
        this.b = bdl2;
        this.h = fc2;
        this.a = avq2;
    }

    @Override
    public boolean a(bhl bhl2) {
        return false;
    }

    @Override
    public bhl a(int n2) {
        if (this.b()) {
            this.g += Math.min(n2, this.a().b);
        }
        return super.a(n2);
    }

    @Override
    protected void a(bhl bhl2, int n2) {
        this.g += n2;
        this.d(bhl2);
    }

    @Override
    protected void d(bhl bhl2) {
        bhl2.a(this.b.aQ, this.b, this.g);
        this.g = 0;
    }

    @Override
    public void a(bdl bdl2, bhl bhl2) {
        bhl bhl3;
        bhl bhl4;
        this.d(bhl2);
        jc jc2 = this.a.i();
        if (jc2 != null && (this.a(jc2, bhl4 = this.a.a(0), bhl3 = this.a.a(1)) || this.a(jc2, bhl3, bhl4))) {
            this.h.a(jc2);
            bdl2.a(bpv.I);
            if (bhl4 != null && bhl4.b <= 0) {
                bhl4 = null;
            }
            if (bhl3 != null && bhl3.b <= 0) {
                bhl3 = null;
            }
            this.a.a(0, bhl4);
            this.a.a(1, bhl3);
        }
    }

    private boolean a(jc jc2, bhl bhl2, bhl bhl3) {
        bhl bhl4 = jc2.a();
        bhl bhl5 = jc2.b();
        if (bhl2 != null && bhl2.a() == bhl4.a() && bhl2.b >= bhl4.b) {
            if (bhl5 != null && bhl3 != null && bhl5.a() == bhl3.a() && bhl3.b >= bhl5.b) {
                bhl2.b -= bhl4.b;
                bhl3.b -= bhl5.b;
                return true;
            }
            if (bhl5 == null && bhl3 == null) {
                bhl2.b -= bhl4.b;
                return true;
            }
        }
        return false;
    }
}

