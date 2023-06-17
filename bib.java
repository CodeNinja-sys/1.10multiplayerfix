/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class bib
extends cwt {
    private static final bcz f = bwm.a(bib.class, cbf.b);
    private hy g = im.a;
    private final Set h = aad.a();

    public bib(iu iu2) {
        super(iu2);
    }

    public bib(iu iu2, double d2, double d3, double d4) {
        super(iu2, d2, d3, d4);
    }

    public bib(iu iu2, bga bga2) {
        super(iu2, bga2);
    }

    public void a(bhl bhl2) {
        if (bhl2.a() == hp.i) {
            this.g = anl.c(bhl2.o());
            List list = anl.b(bhl2);
            if (!list.isEmpty()) {
                for (cko cko2 : list) {
                    this.h.add(new cko(cko2));
                }
            }
            this.bE.b(f, anl.a(anl.a(this.g, (Collection)list)));
        } else if (bhl2.a() == hp.g) {
            this.g = im.a;
            this.h.clear();
            this.bE.b(f, 0);
        }
    }

    public void a(cko cko2) {
        this.h.add(cko2);
        this.bY().b(f, anl.a(anl.a(this.g, (Collection)this.h)));
    }

    @Override
    protected void a() {
        super.a();
        this.bE.a(f, 0);
    }

    @Override
    public void bb_() {
        super.bb_();
        if (this.aQ.C) {
            if (this.a) {
                if (this.b % 5 == 0) {
                    this.d(1);
                }
            } else {
                this.d(2);
            }
        } else if (this.a && this.b != 0 && !this.h.isEmpty() && this.b >= 600) {
            this.aQ.a((cpk)this, (byte)0);
            this.g = im.a;
            this.h.clear();
            this.bE.b(f, 0);
        }
    }

    private void d(int n2) {
        int n3 = this.n();
        if (n3 == 0 || n2 <= 0) {
            return;
        }
        double d2 = (double)(n3 >> 16 & 0xFF) / 255.0;
        double d3 = (double)(n3 >> 8 & 0xFF) / 255.0;
        double d4 = (double)(n3 >> 0 & 0xFF) / 255.0;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.aQ.a(lz.p, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl, this.aV + this.bx.nextDouble() * (double)this.bm, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl, d2, d3, d4, new int[0]);
        }
    }

    public int n() {
        return (Integer)this.bE.a(f);
    }

    public static void a(cgy cgy2) {
        cwt.a(cgy2, "TippedArrow");
    }

    @Override
    public void a(bvp bvp2) {
        super.a(bvp2);
        if (this.g != im.a && this.g != null) {
            bvp2.a("Potion", ((bpx)hy.a.b(this.g)).toString());
        }
        if (!this.h.isEmpty()) {
            bmh bmh2 = new bmh();
            for (cko cko2 : this.h) {
                bmh2.a(cko2.a(new bvp()));
            }
            bvp2.a("CustomPotionEffects", bmh2);
        }
    }

    @Override
    public void b(bvp bvp2) {
        super.b(bvp2);
        if (bvp2.b("Potion", 8)) {
            this.g = anl.c(bvp2);
        }
        for (cko cko2 : anl.b(bvp2)) {
            this.a(cko2);
        }
        if (this.g != im.a || !this.h.isEmpty()) {
            this.bE.b(f, anl.a(anl.a(this.g, (Collection)this.h)));
        }
    }

    @Override
    protected void b(bga bga2) {
        super.b(bga2);
        for (cko cko2 : this.g.a()) {
            bga2.b(new cko(cko2.a(), cko2.b() / 8, cko2.c(), cko2.d(), cko2.e()));
        }
        if (!this.h.isEmpty()) {
            for (cko cko2 : this.h) {
                bga2.b(cko2);
            }
        }
    }

    @Override
    protected bhl p() {
        if (this.h.isEmpty() && this.g == im.a) {
            return new bhl(hp.g);
        }
        bhl bhl2 = new bhl(hp.i);
        anl.a(bhl2, this.g);
        anl.a(bhl2, (Collection)this.h);
        return bhl2;
    }

    @Override
    public void a(byte by2) {
        if (by2 == 0) {
            int n2 = this.n();
            if (n2 > 0) {
                double d2 = (double)(n2 >> 16 & 0xFF) / 255.0;
                double d3 = (double)(n2 >> 8 & 0xFF) / 255.0;
                double d4 = (double)(n2 >> 0 & 0xFF) / 255.0;
                for (int i2 = 0; i2 < 20; ++i2) {
                    this.aQ.a(lz.p, this.aU + (this.bx.nextDouble() - 0.5) * (double)this.bl, this.aV + this.bx.nextDouble() * (double)this.bm, this.aW + (this.bx.nextDouble() - 0.5) * (double)this.bl, d2, d3, d4, new int[0]);
                }
            }
        } else {
            super.a(by2);
        }
    }
}

