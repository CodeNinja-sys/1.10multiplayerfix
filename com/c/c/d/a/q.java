/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a;
import com.c.c.a.m;
import com.c.c.b.l;
import com.c.c.c.b;
import com.c.c.d.a.ae;
import com.c.c.d.a.o;
import com.c.c.e.h;
import java.io.IOException;

class q
extends Thread {
    final /* synthetic */ o a;

    q(o o2) {
        this.a = o2;
    }

    @Override
    public void run() {
        m m2 = m.a();
        if (o.b((o)this.a).e.equals((Object)l.a)) {
            h h2 = new h(o.b(this.a), this.a, o.a(this.a), true);
            ae ae2 = new ae(this.a, h2);
            ae2.b();
            net.minecraft.s.b.a(ae2);
        } else {
            try {
                ((a)o.a(this.a)).a(m2.a(o.c(this.a)));
            }
            catch (b b2) {
                o.c().b("Couldn't get own world");
                net.minecraft.s.b.a(o.a(this.a));
            }
            catch (IOException iOException) {
                o.c().b("Couldn't parse response getting own world");
                net.minecraft.s.b.a(o.a(this.a));
            }
        }
    }
}

