/*
 * Decompiled with CFR 0.150.
 */
package com.c.c;

import com.c.c.a;
import com.c.c.a.m;
import com.c.c.c.b;
import com.c.c.d.a.aa;
import com.c.c.d.a.ah;
import java.io.IOException;

class d
extends Thread {
    final /* synthetic */ a a;

    d(a a2, String string) {
        this.a = a2;
        super(string);
    }

    @Override
    public void run() {
        m m2 = m.a();
        try {
            Boolean bl2 = m2.g();
            if (bl2.booleanValue()) {
                com.c.c.a.l().d("Realms is available for this user");
                com.c.c.a.c(true);
            } else {
                com.c.c.a.l().d("Realms is not available for this user");
                com.c.c.a.c(false);
                net.minecraft.s.b.a(new ah(com.c.c.a.b(this.a)));
            }
            com.c.c.a.d(true);
        }
        catch (b b2) {
            com.c.c.a.l().b("Couldn't connect to realms: ", b2.toString());
            net.minecraft.s.b.a(new aa(b2, com.c.c.a.b(this.a)));
        }
        catch (IOException iOException) {
            com.c.c.a.l().b("Couldn't connect to realms: ", iOException.getMessage());
            net.minecraft.s.b.a(new aa(iOException.getMessage(), com.c.c.a.b(this.a)));
        }
    }
}

