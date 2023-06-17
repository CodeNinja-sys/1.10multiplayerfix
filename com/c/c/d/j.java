/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d;

import com.c.c.a.m;
import com.c.c.d.f;
import com.c.c.d.g;
import com.c.c.d.k;
import java.util.List;

class j
implements Runnable {
    final /* synthetic */ f a;

    private j(f f2) {
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
                List list = m2.e().a;
                if (list != null) {
                    f.a(this.a, list);
                    f.b(this.a, list);
                    f.b(this.a).put(k.a, true);
                } else {
                    f.j().f("Realms server list was null or empty");
                }
            }
        }
        catch (Exception exception) {
            f.b(this.a).put(k.a, true);
            f.j().b("Couldn't get server list", (Throwable)exception);
        }
    }

    /* synthetic */ j(f f2, g g2) {
        this(f2);
    }
}

