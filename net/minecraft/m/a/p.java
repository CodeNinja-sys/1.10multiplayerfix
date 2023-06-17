/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import net.minecraft.h.af;
import net.minecraft.m.a.u;
import net.minecraft.m.cu;
import net.minecraft.q.k;

public class p
implements u {
    private final int a;
    private final int b;
    private final cu[] c;
    private final cu d;
    private boolean e;

    public p(int n2, int n3, cu[] arrcu, cu cu2) {
        this.a = n2;
        this.b = n3;
        this.c = arrcu;
        this.d = cu2;
    }

    @Override
    public cu b() {
        return this.d;
    }

    @Override
    public cu[] b(af af2) {
        cu[] arrcu = new cu[af2.e()];
        for (int i2 = 0; i2 < arrcu.length; ++i2) {
            cu cu2 = af2.a(i2);
            if (cu2 == null || !cu2.a().q()) continue;
            arrcu[i2] = new cu(cu2.a().p());
        }
        return arrcu;
    }

    @Override
    public boolean a(af af2, k k2) {
        for (int i2 = 0; i2 <= 3 - this.a; ++i2) {
            for (int i3 = 0; i3 <= 3 - this.b; ++i3) {
                if (this.a(af2, i2, i3, true)) {
                    return true;
                }
                if (!this.a(af2, i2, i3, false)) continue;
                return true;
            }
        }
        return false;
    }

    private boolean a(af af2, int n2, int n3, boolean bl2) {
        for (int i2 = 0; i2 < 3; ++i2) {
            for (int i3 = 0; i3 < 3; ++i3) {
                cu cu2;
                int n4 = i2 - n2;
                int n5 = i3 - n3;
                cu cu3 = null;
                if (n4 >= 0 && n5 >= 0 && n4 < this.a && n5 < this.b) {
                    cu3 = bl2 ? this.c[this.a - n4 - 1 + n5 * this.a] : this.c[n4 + n5 * this.a];
                }
                if ((cu2 = af2.c(i2, i3)) == null && cu3 == null) continue;
                if (cu2 == null && cu3 != null || cu2 != null && cu3 == null) {
                    return false;
                }
                if (cu3.a() != cu2.a()) {
                    return false;
                }
                if (cu3.h() == 32767 || cu3.h() == cu2.h()) continue;
                return false;
            }
        }
        return true;
    }

    @Override
    public cu a(af af2) {
        cu cu2 = this.b().j();
        if (this.e) {
            for (int i2 = 0; i2 < af2.e(); ++i2) {
                cu cu3 = af2.a(i2);
                if (cu3 == null || !cu3.n()) continue;
                cu2.d(cu3.o().g());
            }
        }
        return cu2;
    }

    @Override
    public int a() {
        return this.a * this.b;
    }
}

