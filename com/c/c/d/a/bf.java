/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.c.b;
import com.c.c.d.a.be;
import java.io.IOException;

class bf
extends Thread {
    final /* synthetic */ be a;

    bf(be be2, String string) {
        this.a = be2;
        super(string);
    }

    @Override
    public void run() {
        try {
            m m2 = m.a();
            m2.i(be.a((be)this.a).a);
        }
        catch (b b2) {
            be.b().b("Couldn't delete world");
            be.b().b((Object)b2);
        }
        catch (IOException iOException) {
            be.b().b("Couldn't delete world");
            iOException.printStackTrace();
        }
        net.minecraft.s.b.a(be.b(this.a));
    }
}

