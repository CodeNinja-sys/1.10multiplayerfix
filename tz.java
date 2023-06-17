/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class tz
extends des {
    private int b;
    public long a;
    private int c;
    private final boolean d;

    public tz(iu iu2, double d2, double d3, double d4, boolean bl2) {
        super(iu2);
        this.a_(d2, d3, d4, 0.0f, 0.0f);
        this.b = 2;
        this.a = this.bx.nextLong();
        this.c = this.bx.nextInt(3) + 1;
        this.d = bl2;
        cmz cmz2 = new cmz(this);
        if (!bl2 && !iu2.C && iu2.F().b("doFireTick") && (iu2.Q() == ct.c || iu2.Q() == ct.d) && iu2.a(cmz2, 10)) {
            if (iu2.n(cmz2).a() == ahk.a && blg.ab.a(iu2, cmz2)) {
                iu2.a(cmz2, blg.ab.s());
            }
            for (int i2 = 0; i2 < 4; ++i2) {
                cmz cmz3 = cmz2.e(this.bx.nextInt(3) - 1, this.bx.nextInt(3) - 1, this.bx.nextInt(3) - 1);
                if (iu2.n(cmz3).a() != ahk.a || !blg.ab.a(iu2, cmz3)) continue;
                iu2.a(cmz3, blg.ab.s());
            }
        }
    }

    @Override
    public csg y() {
        return csg.d;
    }

    @Override
    public void bb_() {
        super.bb_();
        if (this.b == 2) {
            this.aQ.a(null, this.aU, this.aV, this.aW, dah.dn, csg.d, 10000.0f, 0.8f + this.bx.nextFloat() * 0.2f);
            this.aQ.a(null, this.aU, this.aV, this.aW, dah.dm, csg.d, 2.0f, 0.5f + this.bx.nextFloat() * 0.2f);
        }
        --this.b;
        if (this.b < 0) {
            if (this.c == 0) {
                this.ak_();
            } else if (this.b < -this.bx.nextInt(10)) {
                --this.c;
                this.b = 1;
                if (!this.d && !this.aQ.C) {
                    this.a = this.bx.nextLong();
                    cmz cmz2 = new cmz(this);
                    if (this.aQ.F().b("doFireTick") && this.aQ.a(cmz2, 10) && this.aQ.n(cmz2).a() == ahk.a && blg.ab.a(this.aQ, cmz2)) {
                        this.aQ.a(cmz2, blg.ab.s());
                    }
                }
            }
        }
        if (this.b >= 0) {
            if (this.aQ.C) {
                this.aQ.d(2);
            } else if (!this.d) {
                double d2 = 3.0;
                List list = this.aQ.b((cpk)this, new cxt(this.aU - 3.0, this.aV - 3.0, this.aW - 3.0, this.aU + 3.0, this.aV + 6.0 + 3.0, this.aW + 3.0));
                for (int i2 = 0; i2 < list.size(); ++i2) {
                    cpk cpk2 = (cpk)list.get(i2);
                    cpk2.a(this);
                }
            }
        }
    }

    @Override
    protected void a() {
    }

    @Override
    protected void b(bvp bvp2) {
    }

    @Override
    protected void a(bvp bvp2) {
    }
}

