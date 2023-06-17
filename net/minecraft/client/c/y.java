/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import e.a.p;
import net.minecraft.client.c.aa;
import net.minecraft.client.c.o;
import net.minecraft.client.c.v;
import net.minecraft.u.bu;

class y
implements Runnable {
    final /* synthetic */ v a;

    y(v v2) {
        this.a = v2;
    }

    @Override
    public void run() {
        p.a(new aa(this));
        v v2 = this.a;
        v2.getClass();
        v.a(this.a, new o(v2, null));
        v.a(this.a, true);
        v.a(this.a).e(v.b(this.a).a(bu.a));
        v.g().d(v.h(), "Sound engine started");
    }
}

