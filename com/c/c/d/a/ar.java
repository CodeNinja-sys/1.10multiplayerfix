/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.b.m;
import com.c.c.c.b;
import com.c.c.d.a.aq;

class ar
extends Thread {
    final /* synthetic */ aq a;

    ar(aq aq2, String string) {
        this.a = aq2;
        super(string);
    }

    @Override
    public void run() {
        com.c.c.a.m m2 = com.c.c.a.m.a();
        try {
            aq.a(this.a).a(m2.a(1, 10, m.a));
            aq.b(this.a).a(m2.a(1, 10, m.c));
        }
        catch (b b2) {
            aq.b().b("Couldn't fetch templates in reset world", (Throwable)b2);
        }
    }
}

