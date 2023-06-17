/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class bki
extends aet {
    private final List a;
    private boolean f;
    private zz[] g = new zz[128];
    private double h = 32.0;
    private int i = 3;

    public bki() {
        this.a = ov.a();
        for (anr anr2 : anr.w) {
            if (anr2 == null || !(anr2.j() > 0.0f)) continue;
            this.a.add(anr2);
        }
    }

    public bki(Map map) {
        this();
        for (Map.Entry entry : map.entrySet()) {
            if (((String)entry.getKey()).equals("distance")) {
                this.h = cmk.a((String)entry.getValue(), this.h, 1.0);
                continue;
            }
            if (((String)entry.getKey()).equals("count")) {
                this.g = new zz[cmk.a((String)entry.getValue(), this.g.length, 1)];
                continue;
            }
            if (!((String)entry.getKey()).equals("spread")) continue;
            this.i = cmk.a((String)entry.getValue(), this.i, 1);
        }
    }

    @Override
    public String a() {
        return "Stronghold";
    }

    @Override
    public cmz b(iu iu2, cmz cmz2) {
        if (!this.f) {
            this.c();
            this.f = true;
        }
        cmz cmz3 = null;
        pj pj2 = new pj(0, 0, 0);
        double d2 = Double.MAX_VALUE;
        for (zz zz2 : this.g) {
            pj2.a((zz2.a << 4) + 8, 32, (zz2.b << 4) + 8);
            double d3 = pj2.f(cmz2);
            if (cmz3 == null) {
                cmz3 = new cmz(pj2);
                d2 = d3;
                continue;
            }
            if (!(d3 < d2)) continue;
            cmz3 = new cmz(pj2);
            d2 = d3;
        }
        return cmz3;
    }

    @Override
    protected boolean a(int n2, int n3) {
        if (!this.f) {
            this.c();
            this.f = true;
        }
        for (zz zz2 : this.g) {
            if (n2 != zz2.a || n3 != zz2.b) continue;
            return true;
        }
        return false;
    }

    private void c() {
        this.a(this.e);
        int n2 = 0;
        for (cv cv2 : this.b.c()) {
            if (n2 >= this.g.length) continue;
            this.g[n2++] = new zz(cv2.e(), cv2.f());
        }
        Random random = new Random();
        random.setSeed(this.e.y());
        double d2 = random.nextDouble() * Math.PI * 2.0;
        int n3 = 0;
        int n4 = 0;
        int n5 = this.b.size();
        if (n5 < this.g.length) {
            for (int i2 = 0; i2 < this.g.length; ++i2) {
                double d3 = 4.0 * this.h + this.h * (double)n3 * 6.0 + (random.nextDouble() - 0.5) * (this.h * 2.5);
                int n6 = (int)Math.round(Math.cos(d2) * d3);
                int n7 = (int)Math.round(Math.sin(d2) * d3);
                cmz cmz2 = this.e.t_().a((n6 << 4) + 8, (n7 << 4) + 8, 112, this.a, random);
                if (cmz2 != null) {
                    n6 = cmz2.a() >> 4;
                    n7 = cmz2.c() >> 4;
                }
                if (i2 >= n5) {
                    this.g[i2] = new zz(n6, n7);
                }
                d2 += Math.PI * 2 / (double)this.i;
                if (++n4 != this.i) continue;
                n4 = 0;
                this.i += 2 * this.i / (++n3 + 1);
                this.i = Math.min(this.i, this.g.length - i2);
                d2 += random.nextDouble() * Math.PI * 2.0;
            }
        }
    }

    @Override
    protected List b() {
        ArrayList arrayList = ov.a();
        for (zz zz2 : this.g) {
            if (zz2 == null) continue;
            arrayList.add(zz2.a(64));
        }
        return arrayList;
    }

    @Override
    protected cv b(int n2, int n3) {
        cc cc2 = new cc(this.e, this.d, n2, n3);
        while (cc2.c().isEmpty() || ((afk)cc2.c().get((int)0)).b == null) {
            cc2 = new cc(this.e, this.d, n2, n3);
        }
        return cc2;
    }
}

