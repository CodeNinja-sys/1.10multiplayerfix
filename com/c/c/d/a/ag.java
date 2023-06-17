/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.a.n;
import com.c.c.c.b;
import com.c.c.d.a.af;
import java.io.IOException;

class ag
extends Thread {
    final /* synthetic */ af a;

    ag(af af2, String string) {
        this.a = af2;
        super(string);
    }

    @Override
    public void run() {
        m m2 = m.a();
        try {
            n n2 = m2.i();
            if (!n2.equals((Object)n.a)) {
                return;
            }
        }
        catch (b b2) {
            if (b2.a != 401) {
                af.a(false);
            }
            return;
        }
        catch (IOException iOException) {
            af.a(false);
            return;
        }
        af.b(true);
    }
}

