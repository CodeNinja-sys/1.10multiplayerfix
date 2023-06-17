/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cg;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class tp
extends bjv {
    private static final bcz d = bwm.a(er.class, cbf.f);
    private static final d e = org.apache.logging.log4j.c.c();

    public tp(iu iu2) {
        super(iu2);
    }

    public tp(iu iu2, bga bga2, bhl bhl2) {
        super(iu2, bga2);
        this.a(bhl2);
    }

    public tp(iu iu2, double d2, double d3, double d4, bhl bhl2) {
        super(iu2, d2, d3, d4);
        if (bhl2 != null) {
            this.a(bhl2);
        }
    }

    @Override
    protected void a() {
        this.bY().a(d, cg.f());
    }

    public bhl k() {
        bhl bhl2 = (bhl)((cg)this.bY().a(d)).d();
        if (bhl2 == null || bhl2.a() != hp.bH && bhl2.a() != hp.bI) {
            if (this.aQ != null) {
                e.b("ThrownPotion entity {} has no item?!", this.bW());
            }
            return new bhl(hp.bH);
        }
        return bhl2;
    }

    public void a(bhl bhl2) {
        this.bY().b(d, cg.c(bhl2));
        this.bY().b(d);
    }

    @Override
    protected float n() {
        return 0.05f;
    }

    @Override
    protected void a(auu auu2) {
        if (this.aQ.C) {
            return;
        }
        bhl bhl2 = this.k();
        hy hy2 = anl.c(bhl2);
        List list = anl.a(bhl2);
        if (auu2.a == bmw.b && hy2 == im.b && list.isEmpty()) {
            cmz cmz2 = auu2.a().c(auu2.b);
            this.a(cmz2);
            for (bqk bqk2 : afj.a) {
                this.a(cmz2.c(bqk2));
            }
            this.aQ.b(2002, new cmz(this), hy.a(hy2));
            this.ak_();
            return;
        }
        if (!list.isEmpty()) {
            if (this.w()) {
                gw gw2 = new gw(this.aQ, this.aU, this.aV, this.aW);
                gw2.a(this.p());
                gw2.c(3.0f);
                gw2.d(-0.5f);
                gw2.g(10);
                gw2.e(-gw2.f() / (float)gw2.q());
                gw2.a(hy2);
                for (cko cko2 : anl.b(bhl2)) {
                    gw2.a(new cko(cko2.a(), cko2.b(), cko2.c()));
                }
                this.aQ.b(gw2);
            } else {
                cxt cxt2 = this.cD().b(4.0, 2.0, 4.0);
                List list2 = this.aQ.a(bga.class, cxt2);
                if (!list2.isEmpty()) {
                    for (bga bga2 : list2) {
                        double d2;
                        if (!bga2.I_() || !((d2 = this.l(bga2)) < 16.0)) continue;
                        double d3 = 1.0 - Math.sqrt(d2) / 4.0;
                        if (bga2 == auu2.d) {
                            d3 = 1.0;
                        }
                        for (cko cko3 : list) {
                            bfv bfv2 = cko3.a();
                            if (bfv2.a()) {
                                bfv2.a(this, this.p(), bga2, cko3.c(), d3);
                                continue;
                            }
                            int n2 = (int)(d3 * (double)cko3.b() + 0.5);
                            if (n2 <= 20) continue;
                            bga2.b(new cko(bfv2, n2, cko3.c()));
                        }
                    }
                }
            }
        }
        this.aQ.b(2002, new cmz(this), hy.a(hy2));
        this.ak_();
    }

    private boolean w() {
        return this.k().a() == hp.bI;
    }

    private void a(cmz cmz2) {
        if (this.aQ.n(cmz2).t() == blg.ab) {
            this.aQ.a(cmz2, blg.a.s(), 2);
        }
    }

    public static void a(cgy cgy2) {
        bjv.a(cgy2, "ThrownPotion");
        cgy2.a(bst.e, (cui)new amo("ThrownPotion", new String[]{"Potion"}));
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        bhl bhl2 = bhl.a(bvp2.o("Potion"));
        if (bhl2 == null) {
            this.ak_();
        } else {
            this.a(bhl2);
        }
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        bhl bhl2 = this.k();
        if (bhl2 != null) {
            bvp2.a("Potion", bhl2.b(new bvp()));
        }
    }
}

