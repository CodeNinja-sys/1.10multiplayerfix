/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.c;

import com.c.a.a.b;
import java.math.BigInteger;
import net.minecraft.c.c.c;
import net.minecraft.c.c.d;
import net.minecraft.u.m;

class e
extends Thread {
    final /* synthetic */ c a;

    e(c c2, String string) {
        this.a = c2;
        super(string);
    }

    @Override
    public void run() {
        com.c.a.e e2 = c.b(this.a);
        try {
            String string = new BigInteger(m.a("", c.a(this.a).Z().getPublic(), c.c(this.a))).toString(16);
            c.a(this.a, c.a(this.a).aM().a(new com.c.a.e(null, e2.b()), string));
            if (c.b(this.a) != null) {
                c.d().d("UUID of player {} is {}", c.b(this.a).b(), c.b(this.a).a());
                c.a(this.a, d.d);
            } else if (c.a(this.a).ab()) {
                c.d().f("Failed to verify username but will let them in anyway!");
                c.a(this.a, this.a.a(e2));
                c.a(this.a, d.d);
            } else {
                this.a.a("Failed to verify username!");
                c.d().b("Username '{}' tried to join with an invalid session", e2.b());
            }
        }
        catch (b b2) {
            if (c.a(this.a).ab()) {
                c.d().f("Authentication servers are down but will let them in anyway!");
                c.a(this.a, this.a.a(e2));
                c.a(this.a, d.d);
            }
            this.a.a("Authentication servers are down. Please try again later, sorry!");
            c.d().b("Couldn't verify username because servers are unavailable");
        }
    }
}

