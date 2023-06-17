/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class axv
extends awm {
    private final List a = ov.a();
    private final cyn b = new cyn();
    private final List w = ov.a();
    private final asq[][] x;
    private int y;
    private final ckg z;
    private alo A;

    public axv(bxy bxy2, int n2, int n3, int n4, int n5, int n6, ckg ckg2, asq[] ... arrasq) {
        super(bxy2, n2, n3, n4, n5, n6);
        this.z = ckg2;
        this.x = arrasq;
        this.m = false;
        this.q();
        this.r();
    }

    private void q() {
        for (asq[] arrasq : this.x) {
            for (int i2 = 0; i2 < arrasq.length; i2 += 2) {
                asq asq2 = arrasq[i2];
                asq asq3 = i2 < arrasq.length - 1 ? arrasq[i2 + 1] : null;
                alo alo2 = this.a(asq2, 0, asq3 == null);
                alo alo3 = this.a(asq3, 160, asq2 == null);
                cqp cqp2 = new cqp(alo2, alo3);
                this.a.add(cqp2);
                if (asq2 != null && alo2 != null) {
                    this.b.a(asq2.b(), alo2);
                    if (alo2 instanceof cld) {
                        this.w.add((cld)alo2);
                    }
                }
                if (asq3 == null || alo3 == null) continue;
                this.b.a(asq3.b(), alo3);
                if (!(alo3 instanceof cld)) continue;
                this.w.add((cld)alo3);
            }
        }
    }

    private void r() {
        this.a.clear();
        for (int i2 = 0; i2 < this.x[this.y].length; i2 += 2) {
            asq asq2 = this.x[this.y][i2];
            asq asq3 = i2 < this.x[this.y].length - 1 ? this.x[this.y][i2 + 1] : null;
            alo alo2 = (alo)this.b.a(asq2.b());
            alo alo3 = asq3 != null ? (alo)this.b.a(asq3.b()) : null;
            cqp cqp2 = new cqp(alo2, alo3);
            this.a.add(cqp2);
        }
    }

    public void b(int n2) {
        if (n2 == this.y) {
            return;
        }
        int n3 = this.y;
        this.y = n2;
        this.r();
        this.e(n3, n2);
        this.p = 0.0f;
    }

    public int l() {
        return this.y;
    }

    public int m() {
        return this.x.length;
    }

    public alo n() {
        return this.A;
    }

    public void o() {
        if (this.y > 0) {
            this.b(this.y - 1);
        }
    }

    public void p() {
        if (this.y < this.x.length - 1) {
            this.b(this.y + 1);
        }
    }

    public alo g(int n2) {
        return (alo)this.b.a(n2);
    }

    private void e(int n2, int n3) {
        for (asq asq2 : this.x[n2]) {
            if (asq2 == null) continue;
            this.a((alo)this.b.a(asq2.b()), false);
        }
        for (asq asq2 : this.x[n3]) {
            if (asq2 == null) continue;
            this.a((alo)this.b.a(asq2.b()), true);
        }
    }

    private void a(alo alo2, boolean bl2) {
        if (alo2 instanceof cwv) {
            ((cwv)alo2).l = bl2;
        } else if (alo2 instanceof cld) {
            ((cld)alo2).e(bl2);
        } else if (alo2 instanceof arw) {
            ((arw)alo2).f = bl2;
        }
    }

    private alo a(asq asq2, int n2, boolean bl2) {
        if (asq2 instanceof ddl) {
            return this.a(this.d / 2 - 155 + n2, 0, (ddl)asq2);
        }
        if (asq2 instanceof bvf) {
            return this.a(this.d / 2 - 155 + n2, 0, (bvf)asq2);
        }
        if (asq2 instanceof aad) {
            return this.a(this.d / 2 - 155 + n2, 0, (aad)asq2);
        }
        if (asq2 instanceof agv) {
            return this.a(this.d / 2 - 155 + n2, 0, (agv)asq2, bl2);
        }
        return null;
    }

    public void c(boolean bl2) {
        for (cqp cqp2 : this.a) {
            if (cqp.a(cqp2) instanceof cwv) {
                ((cwv)cqp.a((cqp)cqp2)).k = bl2;
            }
            if (!(cqp.b(cqp2) instanceof cwv)) continue;
            ((cwv)cqp.b((cqp)cqp2)).k = bl2;
        }
    }

    @Override
    public boolean b(int n2, int n3, int n4) {
        boolean bl2 = super.b(n2, n3, n4);
        int n5 = this.c(n2, n3);
        if (n5 >= 0) {
            cqp cqp2 = this.h(n5);
            if (this.A != cqp.c(cqp2) && this.A != null && this.A instanceof cld) {
                ((cld)this.A).b(false);
            }
            this.A = cqp.c(cqp2);
        }
        return bl2;
    }

    private dv a(int n2, int n3, ddl ddl2) {
        dv dv2 = new dv(this.z, ddl2.b(), n2, n3, ddl2.c(), ddl2.e(), ddl2.f(), ddl2.g(), ddl2.a());
        dv2.l = ddl2.d();
        return dv2;
    }

    private ahv a(int n2, int n3, bvf bvf2) {
        ahv ahv2 = new ahv(this.z, bvf2.b(), n2, n3, bvf2.c(), bvf2.a());
        ahv2.l = bvf2.d();
        return ahv2;
    }

    private cld a(int n2, int n3, aad aad2) {
        cld cld2 = new cld(aad2.b(), this.c.k, n2, n3, 150, 20);
        cld2.a(aad2.c());
        cld2.a(this.z);
        cld2.e(aad2.d());
        cld2.a(aad2.a());
        return cld2;
    }

    private arw a(int n2, int n3, agv agv2, boolean bl2) {
        arw arw2 = bl2 ? new arw(this.c.k, agv2.b(), n2, n3, this.d - n2 * 2, 20, -1) : new arw(this.c.k, agv2.b(), n2, n3, 150, 20, -1);
        arw2.f = agv2.d();
        arw2.a(agv2.c());
        arw2.a();
        return arw2;
    }

    public void a(char c2, int n2) {
        if (!(this.A instanceof cld)) {
            return;
        }
        cld cld2 = (cld)this.A;
        if (cjn.e(n2)) {
            int n3;
            String string = cjn.l();
            String[] arrstring = string.split(";");
            int n4 = n3 = this.w.indexOf(this.A);
            for (String string2 : arrstring) {
                ((cld)this.w.get(n4)).a(string2);
                n4 = n4 == this.w.size() - 1 ? 0 : ++n4;
                if (n4 == n3) break;
            }
            return;
        }
        if (n2 == 15) {
            cld2.b(false);
            int n5 = this.w.indexOf(this.A);
            n5 = cjn.o() ? (n5 == 0 ? this.w.size() - 1 : --n5) : (n5 == this.w.size() - 1 ? 0 : ++n5);
            this.A = (alo)this.w.get(n5);
            cld2 = (cld)this.A;
            cld2.b(true);
            int n6 = cld2.b + this.j;
            int n7 = cld2.b;
            if (n6 > this.g) {
                this.p += (float)(n6 - this.g);
            } else if (n7 < this.f) {
                this.p = n7;
            }
        } else {
            cld2.a(c2, n2);
        }
    }

    public cqp h(int n2) {
        return (cqp)this.a.get(n2);
    }

    @Override
    public int a() {
        return this.a.size();
    }

    @Override
    public int d() {
        return 400;
    }

    @Override
    protected int c() {
        return super.c() + 32;
    }

    @Override
    public /* synthetic */ ye c(int n2) {
        return this.h(n2);
    }
}

