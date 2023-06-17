/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.c.b;
import com.c.c.d.a.ai;

class aj
extends Thread {
    final /* synthetic */ ai a;

    aj(ai ai2, String string) {
        this.a = ai2;
        super(string);
    }

    @Override
    public void run() {
        m m2 = m.a();
        try {
            ai.a(this.a, m2.l().a);
        }
        catch (b b2) {
            ai.b().b("Couldn't list invites");
        }
        finally {
            ai.a(this.a, true);
        }
    }
}

