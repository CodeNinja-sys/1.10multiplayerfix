/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.c.b;
import com.c.c.d.a.ay;

class az
extends Thread {
    final /* synthetic */ ay a;

    az(ay ay2, String string) {
        this.a = ay2;
        super(string);
    }

    @Override
    public void run() {
        try {
            m m2 = m.a();
            ay.a(this.a, m2.a(ay.a((ay)this.a).b + 1, ay.a((ay)this.a).c, ay.b(this.a)));
            ay.c(this.a).addAll(ay.a((ay)this.a).a);
            if (ay.a((ay)this.a).a.size() == 0) {
                ay.a(this.a, true);
            }
        }
        catch (b b2) {
            ay.b().b("Couldn't fetch templates");
        }
        finally {
            ay.b(this.a, false);
        }
    }
}

