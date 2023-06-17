/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d;

import com.c.c.a.m;
import com.c.c.d.f;
import com.c.c.d.g;
import com.c.c.d.k;

class h
implements Runnable {
    final /* synthetic */ f a;

    private h(f f2) {
        this.a = f2;
    }

    @Override
    public void run() {
        if (f.a(this.a)) {
            this.a();
        }
    }

    private void a() {
        try {
            m m2 = m.a();
            if (m2 != null) {
                f.a(this.a, m2.f());
                f.b(this.a).put(k.d, true);
            }
        }
        catch (Exception exception) {
            f.j().b("Couldn't get live stats", (Throwable)exception);
        }
    }

    /* synthetic */ h(f f2, g g2) {
        this(f2);
    }
}

