/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.a.bc;
import net.minecraft.s.n;
import net.minecraft.s.s;

class bd
extends s {
    final /* synthetic */ bc a;

    public bd(bc bc2, int n2, int n3, int n4, int n5, int n6, int n7, float f2, float f3) {
        this.a = bc2;
        super(n2, n3, n4, n5, n6, n7, f2, f3);
    }

    @Override
    public String a() {
        return n.f("mco.configure.world.spawnProtection") + ": " + (bc.a(this.a) == 0 ? n.f("mco.configure.world.off") : bc.a(this.a));
    }

    @Override
    public void a(float f2) {
        if (!bc.b(this.a).d()) {
            return;
        }
        bc.a(this.a, (int)f2);
    }
}

