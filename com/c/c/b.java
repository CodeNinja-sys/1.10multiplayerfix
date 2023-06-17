/*
 * Decompiled with CFR 0.150.
 */
package com.c.c;

import com.c.c.a;
import com.c.c.a.i;
import com.c.c.a.m;
import com.c.c.b.f;
import java.util.List;

class b
extends Thread {
    final /* synthetic */ a a;

    b(a a2) {
        this.a = a2;
    }

    @Override
    public void run() {
        List list = i.a();
        m m2 = m.a();
        f f2 = new f();
        f2.a = list;
        f2.b = com.c.c.a.a(this.a);
        try {
            m2.a(f2);
        }
        catch (Throwable throwable) {
            com.c.c.a.l().f("Could not send ping result to Realms: ", throwable);
        }
    }
}

