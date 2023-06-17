/*
 * Decompiled with CFR 0.150.
 */
package com.c.c;

import com.c.c.a;
import com.c.c.a.m;
import com.c.c.a.n;
import com.c.c.c.b;
import com.c.c.d.a.aa;
import com.c.c.d.a.r;
import java.io.IOException;

class c
extends Thread {
    final /* synthetic */ a a;

    c(a a2, String string) {
        this.a = a2;
        super(string);
    }

    @Override
    public void run() {
        m m2 = m.a();
        try {
            n n2 = m2.i();
            if (n2.equals((Object)n.b)) {
                net.minecraft.s.b.a(com.c.c.a.a(new r(com.c.c.a.b(this.a), true)));
                return;
            }
            if (n2.equals((Object)n.c)) {
                net.minecraft.s.b.a(com.c.c.a.a(new r(com.c.c.a.b(this.a), false)));
                return;
            }
            com.c.c.a.c(this.a);
        }
        catch (b b2) {
            com.c.c.a.b(false);
            com.c.c.a.l().b("Couldn't connect to realms: ", b2.toString());
            if (b2.a == 401) {
                net.minecraft.s.b.a(com.c.c.a.a(new aa(net.minecraft.s.n.f("mco.error.invalid.session.title"), net.minecraft.s.n.f("mco.error.invalid.session.message"), com.c.c.a.b(this.a))));
                return;
            }
            net.minecraft.s.b.a(new aa(b2, com.c.c.a.b(this.a)));
            return;
        }
        catch (IOException iOException) {
            com.c.c.a.b(false);
            com.c.c.a.l().b("Couldn't connect to realms: ", iOException.getMessage());
            net.minecraft.s.b.a(new aa(iOException.getMessage(), com.c.c.a.b(this.a)));
            return;
        }
    }
}

