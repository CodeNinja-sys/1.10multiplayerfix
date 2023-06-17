/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class cvt {
    private final iu a;
    private boolean b;
    private int c = -1;
    private int d;
    private int e;
    private aus f;
    private int g;
    private int h;
    private int i;

    public cvt(iu iu2) {
        this.a = iu2;
    }

    public void a() {
        if (this.a.h()) {
            this.c = 0;
            return;
        }
        if (this.c == 2) {
            return;
        }
        if (this.c == 0) {
            float f2 = this.a.c(0.0f);
            if ((double)f2 < 0.5 || (double)f2 > 0.501) {
                return;
            }
            this.c = this.a.p.nextInt(10) == 0 ? 1 : 2;
            this.b = false;
            if (this.c == 2) {
                return;
            }
        }
        if (this.c == -1) {
            return;
        }
        if (!this.b) {
            if (this.b()) {
                this.b = true;
            } else {
                return;
            }
        }
        if (this.e > 0) {
            --this.e;
            return;
        }
        this.e = 2;
        if (this.d > 0) {
            this.c();
            --this.d;
        } else {
            this.c = 2;
        }
    }

    private boolean b() {
        List list = this.a.g;
        for (bdl bdl2 : list) {
            if (bdl2.aL()) continue;
            this.f = this.a.T().a(new cmz(bdl2), 1);
            if (this.f == null || this.f.c() < 10 || this.f.d() < 20 || this.f.e() < 20) continue;
            cmz cmz2 = this.f.a();
            float f2 = this.f.b();
            boolean bl2 = false;
            for (int i2 = 0; i2 < 10; ++i2) {
                float f3 = this.a.p.nextFloat() * ((float)Math.PI * 2);
                this.g = cmz2.a() + (int)((double)(cmk.b(f3) * f2) * 0.9);
                this.h = cmz2.b();
                this.i = cmz2.c() + (int)((double)(cmk.a(f3) * f2) * 0.9);
                bl2 = false;
                for (aus aus2 : this.a.T().d()) {
                    if (aus2 == this.f || !aus2.a(new cmz(this.g, this.h, this.i))) continue;
                    bl2 = true;
                    break;
                }
                if (!bl2) break;
            }
            if (bl2) {
                return false;
            }
            amj amj2 = this.a(new cmz(this.g, this.h, this.i));
            if (amj2 == null) continue;
            this.e = 0;
            this.d = 20;
            return true;
        }
        return false;
    }

    private boolean c() {
        oe oe2;
        amj amj2 = this.a(new cmz(this.g, this.h, this.i));
        if (amj2 == null) {
            return false;
        }
        try {
            oe2 = new oe(this.a);
            oe2.a(this.a.C(new cmz(oe2)), null);
            oe2.a(cnf.a);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        oe2.a_(amj2.b, amj2.c, amj2.d, this.a.p.nextFloat() * 360.0f, 0.0f);
        this.a.b(oe2);
        cmz cmz2 = this.f.a();
        oe2.a(cmz2, this.f.b());
        return true;
    }

    private amj a(cmz cmz2) {
        for (int i2 = 0; i2 < 10; ++i2) {
            cmz cmz3 = cmz2.e(this.a.p.nextInt(16) - 8, this.a.p.nextInt(6) - 3, this.a.p.nextInt(16) - 8);
            if (!this.f.a(cmz3) || !cnv.a(ais.a, this.a, cmz3)) continue;
            return new amj(cmz3.a(), cmz3.b(), cmz3.c());
        }
        return null;
    }
}

