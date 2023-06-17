/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.c.b;
import com.c.c.d.a.k;

class l
extends Thread {
    final /* synthetic */ k a;

    l(k k2, String string) {
        this.a = k2;
        super(string);
    }

    @Override
    public void run() {
        m m2 = m.a();
        try {
            k.a(this.a, m2.e((long)k.a((k)this.a).a).a);
            k.a(this.a, k.b(this.a).size() == 0);
            k.c(this.a);
        }
        catch (b b2) {
            k.b().b("Couldn't request backups", (Throwable)b2);
        }
    }
}

