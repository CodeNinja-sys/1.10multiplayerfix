/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.c.b;
import com.c.c.d.a.aa;
import com.c.c.d.a.o;
import java.io.IOException;

class p
extends Thread {
    final /* synthetic */ long a;
    final /* synthetic */ o b;

    p(o o2, long l2) {
        this.b = o2;
        this.a = l2;
    }

    @Override
    public void run() {
        m m2 = m.a();
        try {
            o.a(this.b, m2.a(this.a));
            this.b.b();
        }
        catch (b b2) {
            o.c().b("Couldn't get own world");
            net.minecraft.s.b.a(new aa(b2.getMessage(), o.a(this.b)));
        }
        catch (IOException iOException) {
            o.c().b("Couldn't parse response getting own world");
        }
    }
}

