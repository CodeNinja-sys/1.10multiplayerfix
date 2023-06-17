/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.c.c.a;
import com.c.c.a.m;
import com.c.c.b.i;
import com.c.c.c.b;
import com.c.c.d.a.aq;
import com.c.c.d.d;
import com.c.c.e.f;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import net.minecraft.s.n;

public class o
extends d {
    private final String b;
    private final String c;
    private final a d;

    public o(String string, String string2, a a2) {
        this.b = string;
        this.c = string2;
        this.d = a2;
    }

    @Override
    public void run() {
        String string = n.f("mco.create.world.wait");
        this.b(string);
        m m2 = m.a();
        try {
            i i2 = m2.a(this.b, this.c);
            if (i2 != null) {
                this.d.a(true);
                this.d.k();
                aq aq2 = new aq(this.d, i2, this.d.j(), n.f("mco.selectServer.create"), n.f("mco.create.world.subtitle"), 0xA0A0A0, n.f("mco.create.world.skip"));
                aq2.a(n.f("mco.create.world.reset.title"));
                net.minecraft.s.b.a(aq2);
            } else {
                this.a(n.f("mco.trial.unavailable"));
            }
        }
        catch (b b2) {
            f.a().b("Couldn't create trial");
            this.a(b2.toString());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            f.a().b("Couldn't create trial");
            this.a(unsupportedEncodingException.getLocalizedMessage());
        }
        catch (IOException iOException) {
            f.a().b("Could not parse response creating trial");
            this.a(iOException.getLocalizedMessage());
        }
        catch (Exception exception) {
            f.a().b("Could not create trial");
            this.a(exception.getLocalizedMessage());
        }
    }
}

