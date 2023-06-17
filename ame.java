/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.bi;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ame
extends ab {
    private static final d i = org.apache.logging.log4j.c.c();
    private static final bpx j = new bpx("textures/gui/container/beacon.png");
    private final tb k;
    private qc l;
    private boolean m;

    public ame(cps cps2, tb tb2) {
        super(new bmj(cps2, tb2));
        this.k = tb2;
        this.b = 230;
        this.c = 219;
    }

    @Override
    public void cH_() {
        super.cH_();
        this.l = new qc(this, -1, this.e + 164, this.f + 107);
        this.y.add(this.l);
        this.y.add(new aoq(this, -2, this.e + 190, this.f + 107));
        this.m = true;
        this.l.k = false;
    }

    @Override
    public void d() {
        super.d();
        int n2 = this.k.c(0);
        bfv bfv2 = bfv.a(this.k.c(1));
        bfv bfv3 = bfv.a(this.k.c(2));
        if (this.m && n2 >= 0) {
            wt wt2;
            bfv bfv4;
            int n3;
            int n4;
            int n5;
            int n6;
            this.m = false;
            int n7 = 100;
            for (n6 = 0; n6 <= 2; ++n6) {
                n5 = agq.a[n6].length;
                n4 = n5 * 22 + (n5 - 1) * 2;
                for (n3 = 0; n3 < n5; ++n3) {
                    bfv4 = agq.a[n6][n3];
                    wt2 = new wt(this, n7++, this.e + 76 + n3 * 24 - n4 / 2, this.f + 22 + n6 * 25, bfv4, n6);
                    this.y.add(wt2);
                    if (n6 >= n2) {
                        wt2.k = false;
                        continue;
                    }
                    if (bfv4 != bfv2) continue;
                    wt2.b(true);
                }
            }
            n6 = 3;
            n5 = agq.a[3].length + 1;
            n4 = n5 * 22 + (n5 - 1) * 2;
            for (n3 = 0; n3 < n5 - 1; ++n3) {
                bfv4 = agq.a[3][n3];
                wt2 = new wt(this, n7++, this.e + 167 + n3 * 24 - n4 / 2, this.f + 47, bfv4, 3);
                this.y.add(wt2);
                if (3 >= n2) {
                    wt2.k = false;
                    continue;
                }
                if (bfv4 != bfv3) continue;
                wt2.b(true);
            }
            if (bfv2 != null) {
                wt wt3 = new wt(this, n7++, this.e + 167 + (n5 - 1) * 24 - n4 / 2, this.f + 47, bfv2, 3);
                this.y.add(wt3);
                if (3 >= n2) {
                    wt3.k = false;
                } else if (bfv2 == bfv3) {
                    wt3.b(true);
                }
            }
        }
        this.l.k = this.k.a(0) != null && bfv2 != null;
    }

    @Override
    protected void a(cwv cwv2) {
        if (cwv2.j == -2) {
            this.u.h.a.a(new aqt(this.u.h.p.h));
            this.u.a((cjn)null);
        } else if (cwv2.j == -1) {
            String string = "MC|Beacon";
            si si2 = new si(bi.a());
            si2.E(this.k.c(1));
            si2.E(this.k.c(2));
            this.u.x().a(new pm("MC|Beacon", si2));
            this.u.h.a.a(new aqt(this.u.h.p.h));
            this.u.a((cjn)null);
        } else if (cwv2 instanceof wt) {
            wt wt2 = (wt)cwv2;
            if (wt2.a()) {
                return;
            }
            int n2 = bfv.a(wt.a(wt2));
            if (wt.b(wt2) < 3) {
                this.k.b(1, n2);
            } else {
                this.k.b(2, n2);
            }
            this.y.clear();
            this.cH_();
            this.d();
        }
    }

    @Override
    protected void a(int n2, int n3) {
        bjr.a();
        this.a(this.B, bf.a("tile.beacon.primary", new Object[0]), 62, 10, 0xE0E0E0);
        this.a(this.B, bf.a("tile.beacon.secondary", new Object[0]), 169, 10, 0xE0E0E0);
        for (cwv cwv2 : this.y) {
            if (!cwv2.g()) continue;
            cwv2.b(n2 - this.e, n3 - this.f);
            break;
        }
        bjr.c();
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.P().a(j);
        int n4 = (this.w - this.b) / 2;
        int n5 = (this.x - this.c) / 2;
        this.c(n4, n5, 0, 0, this.b, this.c);
        this.v.a = 100.0f;
        this.v.b(new bhl(hp.bY), n4 + 42, n5 + 109);
        this.v.b(new bhl(hp.k), n4 + 42 + 22, n5 + 109);
        this.v.b(new bhl(hp.m), n4 + 42 + 44, n5 + 109);
        this.v.b(new bhl(hp.l), n4 + 42 + 66, n5 + 109);
        this.v.a = 0.0f;
    }

    static /* synthetic */ bpx f() {
        return j;
    }

    static /* synthetic */ void a(ame ame2, String string, int n2, int n3) {
        ame2.a(string, n2, n3);
    }

    static /* synthetic */ void b(ame ame2, String string, int n2, int n3) {
        ame2.a(string, n2, n3);
    }

    static /* synthetic */ void c(ame ame2, String string, int n2, int n3) {
        ame2.a(string, n2, n3);
    }
}

