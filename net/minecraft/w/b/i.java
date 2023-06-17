/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import com.a.a.b.bl;
import net.minecraft.a.w;
import net.minecraft.h.k;
import net.minecraft.m.cu;
import net.minecraft.w.a.b;
import net.minecraft.w.b.y;
import net.minecraft.w.e.ay;
import net.minecraft.w.e.bi;
import net.minecraft.w.e.d;
import net.minecraft.w.e.v;

class i
implements bl {
    final /* synthetic */ y a;

    i(y y2) {
        this.a = y2;
    }

    public Double a(b b2) {
        cu cu2 = b2.a(k.f);
        if (cu2 != null && cu2.a() == w.ch) {
            boolean bl2;
            int n2 = cu2.g();
            boolean bl3 = this.a.c instanceof ay && ((ay)this.a.c).p() == v.a && n2 == 0;
            boolean bl4 = this.a.c instanceof d && n2 == 2;
            boolean bl5 = bl2 = this.a.c instanceof bi && n2 == 4;
            if (bl3 || bl4 || bl2) {
                return 0.5;
            }
        }
        return 1.0;
    }

    @Override
    public /* synthetic */ Object a(Object object) {
        return this.a((b)object);
    }
}

