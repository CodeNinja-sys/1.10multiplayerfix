/*
 * Decompiled with CFR 0.150.
 */
package com.c.c;

import com.c.c.a;
import com.c.c.a.m;
import com.c.c.b.i;
import com.c.c.c.b;
import com.c.c.d.a.aa;
import net.minecraft.s.n;

class g
extends Thread {
    final /* synthetic */ a a;

    g(a a2, String string) {
        this.a = a2;
        super(string);
    }

    @Override
    public void run() {
        try {
            i i2 = com.c.c.a.a(this.a, com.c.c.a.d(this.a));
            if (i2 != null) {
                m m2 = m.a();
                m2.d(i2.a);
                com.c.c.a.m().a(i2);
                com.c.c.a.e(this.a).remove(i2);
                com.c.c.a.b(this.a, -1L);
                com.c.c.a.f(this.a).b(false);
            }
        }
        catch (b b2) {
            com.c.c.a.l().b("Couldn't configure world");
            net.minecraft.s.b.a(new aa(b2, (n)this.a));
        }
    }
}

