/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.b;

import net.minecraft.b.g;
import net.minecraft.q.c;
import net.minecraft.q.k;
import net.minecraft.u.b.n;
import net.minecraft.u.b.s;
import net.minecraft.w.a.b;
import net.minecraft.w.aa;
import net.minecraft.w.e.af;
import net.minecraft.w.e.d;

public class a {
    private final k a;
    private boolean b;
    private int c = -1;
    private int d;
    private int e;
    private g f;
    private int g;
    private int h;
    private int i;

    public a(k k2) {
        this.a = k2;
    }

    public void a() {
        if (this.a.n()) {
            this.c = 0;
        } else if (this.c != 2) {
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
            if (this.c != -1) {
                if (!this.b) {
                    if (!this.b()) {
                        return;
                    }
                    this.b = true;
                }
                if (this.e > 0) {
                    --this.e;
                } else {
                    this.e = 2;
                    if (this.d > 0) {
                        this.c();
                        --this.d;
                    } else {
                        this.c = 2;
                    }
                }
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean b() {
        var1_1 = this.a.g;
        var2_2 = var1_1.iterator();
        do lbl-1000:
        // 4 sources

        {
            if (!var2_2.hasNext()) {
                return false;
            }
            var3_3 = (b)var2_2.next();
            if (var3_3.a()) ** GOTO lbl-1000
            this.f = this.a.U().a(new net.minecraft.u.b.b(var3_3), 1);
            if (this.f == null || this.f.c() < 10 || this.f.d() < 20 || this.f.e() < 20) ** GOTO lbl-1000
            var4_4 = this.f.a();
            var5_5 = this.f.b();
            var6_6 = false;
            for (var7_8 = 0; var7_8 < 10; ++var7_8) {
                var8_9 = this.a.p.nextFloat() * 6.2831855f;
                this.g = var4_4.cy_() + (int)((double)(n.b(var8_9) * var5_5) * 0.9);
                this.h = var4_4.k();
                this.i = var4_4.l() + (int)((double)(n.a(var8_9) * var5_5) * 0.9);
                var6_6 = false;
                for (g var9_10 : this.a.U().b()) {
                    if (var9_10 == this.f || !var9_10.a(new net.minecraft.u.b.b(this.g, this.h, this.i))) continue;
                    var6_6 = true;
                    break;
                }
                if (!var6_6) break;
            }
            if (!var6_6) continue;
            return false;
        } while ((var7_7 = this.a(new net.minecraft.u.b.b(this.g, this.h, this.i))) == null);
        this.e = 0;
        this.d = 20;
        return true;
    }

    private boolean c() {
        d d2;
        s s2 = this.a(new net.minecraft.u.b.b(this.g, this.h, this.i));
        if (s2 == null) {
            return false;
        }
        try {
            d2 = new d(this.a);
            d2.a(this.a.C(new net.minecraft.u.b.b(d2)), null);
            d2.a(af.a);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
        d2.b(s2.b, s2.c, s2.d, this.a.p.nextFloat() * 360.0f, 0.0f);
        this.a.a(d2);
        net.minecraft.u.b.b b2 = this.f.a();
        d2.a(b2, this.f.b());
        return true;
    }

    private s a(net.minecraft.u.b.b b2) {
        for (int i2 = 0; i2 < 10; ++i2) {
            net.minecraft.u.b.b b3 = b2.a(this.a.p.nextInt(16) - 8, this.a.p.nextInt(6) - 3, this.a.p.nextInt(16) - 8);
            if (!this.f.a(b3) || !net.minecraft.q.c.a(aa.a, this.a, b3)) continue;
            return new s(b3.cy_(), b3.k(), b3.l());
        }
        return null;
    }
}

