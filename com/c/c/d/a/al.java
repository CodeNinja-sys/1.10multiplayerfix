/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.b.d;
import com.c.c.c.b;
import com.c.c.d.a.ai;

class al
extends Thread {
    final /* synthetic */ int a;
    final /* synthetic */ ai b;

    al(ai ai2, String string, int n2) {
        this.b = ai2;
        this.a = n2;
        super(string);
    }

    @Override
    public void run() {
        try {
            m m2 = m.a();
            m2.a(((d)ai.a((ai)this.b).get((int)this.a)).a);
            ai.a(this.b, this.a);
        }
        catch (b b2) {
            ai.b().b("Couldn't accept invite");
        }
    }
}

