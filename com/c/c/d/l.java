/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d;

import com.c.c.a.m;
import com.c.c.d.f;
import com.c.c.d.g;
import com.c.c.d.k;

class l
implements Runnable {
    final /* synthetic */ f a;

    private l(f f2) {
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
                f.a(this.a, m2.n());
                f.b(this.a).put(k.c, true);
            }
        }
        catch (Exception exception) {
            f.j().b("Couldn't get trial availability", (Throwable)exception);
        }
    }

    /* synthetic */ l(f f2, g g2) {
        this(f2);
    }
}

