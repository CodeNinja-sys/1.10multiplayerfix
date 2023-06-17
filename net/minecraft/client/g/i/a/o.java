/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.ad;
import net.minecraft.client.g.bc;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.e;
import net.minecraft.client.j.ai;
import net.minecraft.client.j.ap;
import net.minecraft.w.e.av;

public class o
implements s {
    private final e a;
    private final ap b = new ai(0);

    public o(e e2) {
        this.a = e2;
    }

    public void a(av av2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (!av2.cD()) {
            bd.c(1.0f, 1.0f, 1.0f, 1.0f);
            bd.y();
            bd.l();
            bd.a(ad.l, bc.j);
            this.b.a(this.a.f());
            this.b.a(av2, f2, f3, f5, f6, f7, f8);
            bd.k();
            bd.z();
        }
    }

    @Override
    public boolean bZ_() {
        return true;
    }
}

