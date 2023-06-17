/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.UUID;

public class dcg
extends cpk {
    private bga a;
    private cpk b;
    private bqk c;
    private int d;
    private double e;
    private double f;
    private double g;
    private UUID h;
    private cmz i;
    private UUID j;
    private cmz k;

    public dcg(iu iu2) {
        super(iu2);
        this.a_(0.3125f, 0.3125f);
        this.bv = true;
    }

    @Override
    public csg y() {
        return csg.f;
    }

    public dcg(iu iu2, double d2, double d3, double d4, double d5, double d6, double d7) {
        this(iu2);
        this.a_(d2, d3, d4, this.ba, this.bb);
        this.aX = d5;
        this.aY = d6;
        this.aZ = d7;
    }

    public dcg(iu iu2, bga bga2, cpk cpk2, ctv ctv2) {
        this(iu2);
        this.a = bga2;
        cmz cmz2 = new cmz(bga2);
        double d2 = (double)cmz2.a() + 0.5;
        double d3 = (double)cmz2.b() + 0.5;
        double d4 = (double)cmz2.c() + 0.5;
        this.a_(d2, d3, d4, this.ba, this.bb);
        this.b = cpk2;
        this.c = bqk.b;
        this.a(ctv2);
    }

    @Override
    protected void a(bvp bvp2) {
        bvp bvp3;
        cmz cmz2;
        if (this.a != null) {
            cmz2 = new cmz(this.a);
            bvp3 = ayj.a(this.a.cx());
            bvp3.a("X", cmz2.a());
            bvp3.a("Y", cmz2.b());
            bvp3.a("Z", cmz2.c());
            bvp2.a("Owner", bvp3);
        }
        if (this.b != null) {
            cmz2 = new cmz(this.b);
            bvp3 = ayj.a(this.b.cx());
            bvp3.a("X", cmz2.a());
            bvp3.a("Y", cmz2.b());
            bvp3.a("Z", cmz2.c());
            bvp2.a("Target", bvp3);
        }
        if (this.c != null) {
            bvp2.a("Dir", this.c.b());
        }
        bvp2.a("Steps", this.d);
        bvp2.a("TXD", this.e);
        bvp2.a("TYD", this.f);
        bvp2.a("TZD", this.g);
    }

    @Override
    protected void b(bvp bvp2) {
        bvp bvp3;
        this.d = bvp2.h("Steps");
        this.e = bvp2.k("TXD");
        this.f = bvp2.k("TYD");
        this.g = bvp2.k("TZD");
        if (bvp2.b("Dir", 99)) {
            this.c = bqk.a(bvp2.h("Dir"));
        }
        if (bvp2.b("Owner", 10)) {
            bvp3 = bvp2.o("Owner");
            this.h = ayj.b(bvp3);
            this.i = new cmz(bvp3.h("X"), bvp3.h("Y"), bvp3.h("Z"));
        }
        if (bvp2.b("Target", 10)) {
            bvp3 = bvp2.o("Target");
            this.j = ayj.b(bvp3);
            this.k = new cmz(bvp3.h("X"), bvp3.h("Y"), bvp3.h("Z"));
        }
    }

    @Override
    protected void a() {
    }

    private void a(bqk bqk2) {
        this.c = bqk2;
    }

    private void a(ctv ctv2) {
        cmz cmz2;
        double d2 = 0.5;
        if (this.b == null) {
            cmz2 = new cmz(this).h();
        } else {
            d2 = (double)this.b.bm * 0.5;
            cmz2 = new cmz(this.b.aU, this.b.aV + d2, this.b.aW);
        }
        double d3 = (double)cmz2.a() + 0.5;
        double d4 = (double)cmz2.b() + d2;
        double d5 = (double)cmz2.c() + 0.5;
        bqk bqk2 = null;
        if (cmz2.e(this.aU, this.aV, this.aW) >= 4.0) {
            cmz cmz3 = new cmz(this);
            ArrayList arrayList = ov.a();
            if (ctv2 != ctv.a) {
                if (cmz3.a() < cmz2.a() && this.aQ.c(cmz3.l())) {
                    arrayList.add(bqk.f);
                } else if (cmz3.a() > cmz2.a() && this.aQ.c(cmz3.k())) {
                    arrayList.add(bqk.e);
                }
            }
            if (ctv2 != ctv.b) {
                if (cmz3.b() < cmz2.b() && this.aQ.c(cmz3.g())) {
                    arrayList.add(bqk.b);
                } else if (cmz3.b() > cmz2.b() && this.aQ.c(cmz3.h())) {
                    arrayList.add(bqk.a);
                }
            }
            if (ctv2 != ctv.c) {
                if (cmz3.c() < cmz2.c() && this.aQ.c(cmz3.j())) {
                    arrayList.add(bqk.d);
                } else if (cmz3.c() > cmz2.c() && this.aQ.c(cmz3.i())) {
                    arrayList.add(bqk.c);
                }
            }
            bqk2 = bqk.a(this.bx);
            if (arrayList.isEmpty()) {
                for (int i2 = 5; !this.aQ.c(cmz3.c(bqk2)) && i2 > 0; --i2) {
                    bqk2 = bqk.a(this.bx);
                }
            } else {
                bqk2 = (bqk)arrayList.get(this.bx.nextInt(arrayList.size()));
            }
            d3 = this.aU + (double)bqk2.h();
            d4 = this.aV + (double)bqk2.i();
            d5 = this.aW + (double)bqk2.j();
        }
        this.a(bqk2);
        double d6 = d3 - this.aU;
        double d7 = d4 - this.aV;
        double d8 = d5 - this.aW;
        double d9 = cmk.a(d6 * d6 + d7 * d7 + d8 * d8);
        if (d9 == 0.0) {
            this.e = 0.0;
            this.f = 0.0;
            this.g = 0.0;
        } else {
            this.e = d6 / d9 * 0.15;
            this.f = d7 / d9 * 0.15;
            this.g = d8 / d9 * 0.15;
        }
        this.bO = true;
        this.d = 10 + this.bx.nextInt(5) * 10;
    }

    @Override
    public void bb_() {
        Object object;
        Object object2;
        Object object3;
        if (!this.aQ.C && this.aQ.Q() == ct.a) {
            this.ak_();
            return;
        }
        super.bb_();
        if (!this.aQ.C) {
            if (this.b == null && this.j != null) {
                object3 = this.aQ.a(bga.class, new cxt(this.k.e(-2, -2, -2), this.k.e(2, 2, 2)));
                object2 = object3.iterator();
                while (object2.hasNext()) {
                    object = (bga)object2.next();
                    if (!((cpk)object).cx().equals(this.j)) continue;
                    this.b = object;
                    break;
                }
                this.j = null;
            }
            if (this.a == null && this.h != null) {
                object3 = this.aQ.a(bga.class, new cxt(this.i.e(-2, -2, -2), this.i.e(2, 2, 2)));
                object2 = object3.iterator();
                while (object2.hasNext()) {
                    object = (bga)object2.next();
                    if (!((cpk)object).cx().equals(this.h)) continue;
                    this.a = object;
                    break;
                }
                this.h = null;
            }
            if (!(this.b == null || !this.b.bj() || this.b instanceof bdl && ((bdl)this.b).aL())) {
                this.e = cmk.a(this.e * 1.025, -1.0, 1.0);
                this.f = cmk.a(this.f * 1.025, -1.0, 1.0);
                this.g = cmk.a(this.g * 1.025, -1.0, 1.0);
                this.aX += (this.e - this.aX) * 0.2;
                this.aY += (this.f - this.aY) * 0.2;
                this.aZ += (this.g - this.aZ) * 0.2;
            } else if (!this.cf()) {
                this.aY -= 0.04;
            }
            object3 = cen.a(this, true, false, this.a);
            if (object3 != null) {
                this.a((auu)object3);
            }
        }
        this.d(this.aU + this.aX, this.aV + this.aY, this.aW + this.aZ);
        cen.a(this, 0.5f);
        if (this.aQ.C) {
            this.aQ.a(lz.R, this.aU - this.aX, this.aV - this.aY + 0.15, this.aW - this.aZ, 0.0, 0.0, 0.0, new int[0]);
        } else if (this.b != null && !this.b.bk) {
            if (this.d > 0) {
                --this.d;
                if (this.d == 0) {
                    this.a(this.c == null ? null : this.c.l());
                }
            }
            if (this.c != null) {
                object3 = new cmz(this);
                object2 = this.c.l();
                if (this.aQ.d(((cmz)object3).c(this.c), false)) {
                    this.a((ctv)object2);
                } else {
                    object = new cmz(this.b);
                    if (object2 == ctv.a && ((cjx)object3).a() == ((cjx)object).a() || object2 == ctv.c && ((cjx)object3).c() == ((cjx)object).c() || object2 == ctv.b && ((cjx)object3).b() == ((cjx)object).b()) {
                        this.a((ctv)object2);
                    }
                }
            }
        }
    }

    @Override
    public boolean y_() {
        return false;
    }

    @Override
    public boolean a(double d2) {
        return d2 < 16384.0;
    }

    @Override
    public float a(float f2) {
        return 1.0f;
    }

    @Override
    public int b(float f2) {
        return 0xF000F0;
    }

    protected void a(auu auu2) {
        if (auu2.d == null) {
            ((alj)this.aQ).a(lz.b, this.aU, this.aV, this.aW, 2, 0.2, 0.2, 0.2, 0.0, new int[0]);
            this.a(dah.fg, 1.0f, 1.0f);
        } else {
            boolean bl2 = auu2.d.a(ahy.a((cpk)this, this.a).d(), 4.0f);
            if (bl2) {
                this.a(this.a, auu2.d);
                if (auu2.d instanceof bga) {
                    ((bga)auu2.d).b(new cko(ake.y, 200));
                }
            }
        }
        this.ak_();
    }

    @Override
    public boolean bc_() {
        return true;
    }

    @Override
    public boolean a(ahy ahy2, float f2) {
        if (!this.aQ.C) {
            this.a(dah.fh, 1.0f, 1.0f);
            ((alj)this.aQ).a(lz.j, this.aU, this.aV, this.aW, 15, 0.2, 0.2, 0.2, 0.0, new int[0]);
            this.ak_();
        }
        return true;
    }
}

