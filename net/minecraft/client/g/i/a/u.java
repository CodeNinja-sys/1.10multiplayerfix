/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.ag;
import net.minecraft.m.cd;
import net.minecraft.u.bp;
import net.minecraft.w.h.ad;
import net.minecraft.w.h.e;

public class u
implements s {
    private static final bp a = new bp("textures/entity/wolf/wolf_collar.png");
    private final ag b;

    public u(ag ag2) {
        this.b = ag2;
    }

    public void a(e e2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (e2.z() && !e2.cD()) {
            this.b.a(a);
            cd cd2 = cd.b(e2.s().b());
            float[] arrf = ad.a(cd2);
            bd.d(arrf[0], arrf[1], arrf[2]);
            this.b.f().a(e2, f2, f3, f5, f6, f7, f8);
        }
    }

    @Override
    public boolean bZ_() {
        return true;
    }
}

