/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g.c;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.id;
import net.minecraft.q.k;
import net.minecraft.u.ad;

public class c {
    private final k a;
    private final net.minecraft.u.b.b b;
    private final net.minecraft.u.b.b c;
    private final ad d;
    private final List e = ov.a();
    private final List f = ov.a();

    public c(k k2, net.minecraft.u.b.b b2, ad ad2, boolean bl2) {
        this.a = k2;
        this.b = b2;
        if (bl2) {
            this.d = ad2;
            this.c = b2.a(ad2);
        } else {
            this.d = ad2.e();
            this.c = b2.a(ad2, 2);
        }
    }

    public boolean a() {
        this.e.clear();
        this.f.clear();
        b b2 = this.a.n(this.c);
        if (!id.a(b2, this.a, this.c, this.d, false)) {
            if (b2.r() == net.minecraft.g.a.b.b) {
                this.f.add(this.c);
                return true;
            }
            return false;
        }
        if (!this.a(this.c)) {
            return false;
        }
        for (int i2 = 0; i2 < this.e.size(); ++i2) {
            net.minecraft.u.b.b b3 = (net.minecraft.u.b.b)this.e.get(i2);
            if (this.a.n(b3).c() != p.cE || this.b(b3)) continue;
            return false;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(net.minecraft.u.b.b var1_1) {
        var2_2 = this.a.n(var1_1);
        var3_3 = var2_2.c();
        if (var2_2.d() == h.a) {
            return true;
        }
        if (!id.a(var2_2, this.a, var1_1, this.d, false)) {
            return true;
        }
        if (var1_1.equals(this.b)) {
            return true;
        }
        if (this.e.contains(var1_1)) {
            return true;
        }
        var4_4 = 1;
        if (var4_4 + this.e.size() <= 12) ** GOTO lbl20
        return false;
lbl-1000:
        // 1 sources

        {
            var5_5 = var1_1.a(this.d.e(), var4_4);
            var2_2 = this.a.n(var5_5);
            var3_3 = var2_2.c();
            if (var2_2.d() == h.a || !id.a(var2_2, this.a, var5_5, this.d, false) || var5_5.equals(this.b)) break;
            if (++var4_4 + this.e.size() <= 12) continue;
            return false;
lbl20:
            // 2 sources

            ** while (var3_3 == p.cE)
        }
lbl21:
        // 2 sources

        var5_6 = 0;
        for (var6_7 = var4_4 - 1; var6_7 >= 0; ++var5_6, --var6_7) {
            this.e.add(var1_1.a(this.d.e(), var6_7));
        }
        var6_7 = 1;
        while (true) {
            block13: {
                if ((var8_9 = this.e.indexOf(var7_8 = var1_1.a(this.d, var6_7))) <= -1) break block13;
                this.a(var5_6, var8_9);
                var9_10 = 0;
                ** GOTO lbl54
            }
            var2_2 = this.a.n(var7_8);
            if (var2_2.d() == h.a) {
                return true;
            }
            if (id.a(var2_2, this.a, var7_8, this.d, true) == false) return false;
            if (var7_8.equals(this.b)) {
                return false;
            }
            if (var2_2.r() == net.minecraft.g.a.b.b) {
                this.f.add(var7_8);
                return true;
            }
            if (this.e.size() >= 12) {
                return false;
            }
            this.e.add(var7_8);
            ++var5_6;
            ++var6_7;
        }
lbl-1000:
        // 1 sources

        {
            var10_11 = (net.minecraft.u.b.b)this.e.get(var9_10);
            if (this.a.n(var10_11).c() == p.cE && !this.b(var10_11)) {
                return false;
            }
            ++var9_10;
lbl54:
            // 2 sources

            ** while (var9_10 <= var8_9 + var5_6)
        }
lbl55:
        // 1 sources

        return true;
    }

    private void a(int n2, int n3) {
        ArrayList arrayList = ov.a();
        ArrayList arrayList2 = ov.a();
        ArrayList arrayList3 = ov.a();
        arrayList.addAll(this.e.subList(0, n3));
        arrayList2.addAll(this.e.subList(this.e.size() - n2, this.e.size()));
        arrayList3.addAll(this.e.subList(n3, this.e.size() - n2));
        this.e.clear();
        this.e.addAll(arrayList);
        this.e.addAll(arrayList2);
        this.e.addAll(arrayList3);
    }

    private boolean b(net.minecraft.u.b.b b2) {
        for (ad ad2 : ad.values()) {
            if (ad2.l() == this.d.l() || this.a(b2.a(ad2))) continue;
            return false;
        }
        return true;
    }

    public List b() {
        return this.e;
    }

    public List c() {
        return this.f;
    }
}

