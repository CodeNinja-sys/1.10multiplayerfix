/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import com.a.a.b.cn;

public class cg
extends ck {
    private static final cm b = ail.a(blg.H).a(add.a, cn.a((Object)deq.b));
    private final xy c;
    private final iu d;
    int a;

    public cg(xy xy2) {
        this.c = xy2;
        this.d = xy2.aQ;
        this.a(7);
    }

    @Override
    public boolean b() {
        if (this.c.aW().nextInt(this.c.R_() ? 50 : 1000) != 0) {
            return false;
        }
        cmz cmz2 = new cmz(this.c.aU, this.c.aV, this.c.aW);
        if (b.a(this.d.n(cmz2))) {
            return true;
        }
        return this.d.n(cmz2.h()).t() == blg.c;
    }

    @Override
    public void c() {
        this.a = 40;
        this.d.a((cpk)this.c, (byte)10);
        this.c.ap().n();
    }

    @Override
    public void d() {
        this.a = 0;
    }

    @Override
    public boolean a() {
        return this.a > 0;
    }

    public int f() {
        return this.a;
    }

    @Override
    public void e() {
        this.a = Math.max(0, this.a - 1);
        if (this.a != 4) {
            return;
        }
        cmz cmz2 = new cmz(this.c.aU, this.c.aV, this.c.aW);
        if (b.a(this.d.n(cmz2))) {
            if (this.d.F().b("mobGriefing")) {
                this.d.b(cmz2, false);
            }
            this.c.S_();
        } else {
            cmz cmz3 = cmz2.h();
            if (this.d.n(cmz3).t() == blg.c) {
                if (this.d.F().b("mobGriefing")) {
                    this.d.b(2001, cmz3, bfa.c(blg.c));
                    this.d.a(cmz3, blg.d.s(), 2);
                }
                this.c.S_();
            }
        }
    }
}

