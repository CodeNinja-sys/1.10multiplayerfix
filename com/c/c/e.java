/*
 * Decompiled with CFR 0.150.
 */
package com.c.c;

import com.c.c.a;
import com.c.c.a.m;
import com.c.c.c.b;
import java.io.IOException;

class e
extends Thread {
    final /* synthetic */ a a;

    e(a a2, String string) {
        this.a = a2;
        super(string);
    }

    @Override
    public void run() {
        m m2 = m.a();
        try {
            Boolean bl2 = m2.h();
            if (bl2.booleanValue()) {
                m.b();
                com.c.c.a.l().d("Switched to stage");
                com.c.c.a.m().d();
            }
        }
        catch (b b2) {
            com.c.c.a.l().b("Couldn't connect to Realms: " + b2.toString());
        }
        catch (IOException iOException) {
            com.c.c.a.l().b("Couldn't parse response connecting to Realms: " + iOException.getMessage());
        }
    }
}

