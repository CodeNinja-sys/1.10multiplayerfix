/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i.a;

import net.minecraft.client.g.i.a.s;
import net.minecraft.client.g.i.al;
import net.minecraft.client.j.ah;
import net.minecraft.u.bp;
import net.minecraft.w.e.ay;
import net.minecraft.w.e.v;

public class r
implements s {
    private static final bp a = new bp("textures/entity/skeleton/stray_overlay.png");
    private final al b;
    private ah c;

    public r(al al2) {
        this.b = al2;
        this.c = new ah(0.25f, true);
    }

    public void a(ay ay2, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        if (ay2.p() == v.c) {
            this.c.a(this.b.f());
            this.c.a(ay2, f2, f3, f4);
            this.b.a(a);
            this.c.a(ay2, f2, f3, f5, f6, f7, f8);
        }
    }

    @Override
    public boolean bZ_() {
        return true;
    }
}

