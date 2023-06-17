/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.c.b;
import com.c.c.d.a.aa;
import com.c.c.d.a.o;
import com.c.c.d.a.s;
import java.io.IOException;

class t
extends Thread {
    final /* synthetic */ long a;
    final /* synthetic */ s b;

    t(s s2, long l2) {
        this.b = s2;
        this.a = l2;
    }

    @Override
    public void run() {
        m m2 = m.a();
        try {
            s.a(this.b, m2.a(this.a));
            if (com.c.c.e.s.a(s.a(this.b)) && !s.a((s)this.b).k) {
                net.minecraft.s.b.a(new o(s.b(this.b), s.a((s)this.b).a));
                return;
            }
            s.c(this.b);
            if (s.d(this.b)) {
                s.e(this.b);
            } else {
                s.f(this.b);
            }
        }
        catch (b b2) {
            s.e().b("Couldn't get own world");
            net.minecraft.s.b.a(new aa(b2.getMessage(), s.b(this.b)));
        }
        catch (IOException iOException) {
            s.e().b("Couldn't parse response getting own world");
        }
    }
}

