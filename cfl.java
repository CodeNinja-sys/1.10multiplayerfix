/*
 * Decompiled with CFR 0.150.
 */
import java.util.UUID;

public abstract class cfl
extends xy {
    public static final UUID t = UUID.fromString("E199AD21-BA8A-4C53-8D13-6182D5C69D3A");
    public static final cs u = new cs(t, "Fleeing speed bonus", 2.0, 2).a(false);
    private cmz a = cmz.e;
    private float b = -1.0f;
    private final ck c;
    private boolean d;
    private float e = cfh.g.a();

    public cfl(iu iu2) {
        super(iu2);
        this.c = new byi(this, 1.0);
    }

    public float a(cmz cmz2) {
        return 0.0f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean h() {
        if (!super.h()) return false;
        cmz cmz2 = new cmz(this.aU, this.cD().b, this.aW);
        if (!(this.a(cmz2) >= 0.0f)) return false;
        return true;
    }

    public boolean aS() {
        return !this.l.m();
    }

    public boolean aT() {
        return this.d(new cmz(this));
    }

    public boolean d(cmz cmz2) {
        if (this.b == -1.0f) {
            return true;
        }
        return this.a.f(cmz2) < (double)(this.b * this.b);
    }

    public void a(cmz cmz2, int n2) {
        this.a = cmz2;
        this.b = n2;
    }

    public cmz aU() {
        return this.a;
    }

    public float bN() {
        return this.b;
    }

    public void bO() {
        this.b = -1.0f;
    }

    public boolean bP() {
        return this.b != -1.0f;
    }

    @Override
    protected void aF() {
        super.aF();
        if (this.aG() && this.aH() != null && this.aH().aQ == this.aQ) {
            cpk cpk2 = this.aH();
            this.a(new cmz((int)cpk2.aU, (int)cpk2.aV, (int)cpk2.aW), 5);
            float f2 = this.k(cpk2);
            if (this instanceof nb && ((nb)this).C()) {
                if (f2 > 10.0f) {
                    this.a(true, true);
                }
                return;
            }
            if (!this.d) {
                this.m.a(2, this.c);
                if (this.ap() instanceof vp) {
                    this.e = this.a(cfh.g);
                    this.a(cfh.g, 0.0f);
                }
                this.d = true;
            }
            this.c(f2);
            if (f2 > 4.0f) {
                this.ap().a(cpk2, 1.0);
            }
            if (f2 > 6.0f) {
                double d2 = (cpk2.aU - this.aU) / (double)f2;
                double d3 = (cpk2.aV - this.aV) / (double)f2;
                double d4 = (cpk2.aW - this.aW) / (double)f2;
                this.aX += d2 * Math.abs(d2) * 0.4;
                this.aY += d3 * Math.abs(d3) * 0.4;
                this.aZ += d4 * Math.abs(d4) * 0.4;
            }
            if (f2 > 10.0f) {
                this.a(true, true);
            }
        } else if (!this.aG() && this.d) {
            this.d = false;
            this.m.a(this.c);
            if (this.ap() instanceof vp) {
                this.a(cfh.g, this.e);
            }
            this.bO();
        }
    }

    protected void c(float f2) {
    }
}

