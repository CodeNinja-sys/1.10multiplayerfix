/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.c.c.a.m;
import com.c.c.c.b;
import com.c.c.d.d;
import com.c.c.e.f;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import net.minecraft.s.n;

public class p
extends d {
    private final String b;
    private final String c;
    private final long d;
    private final n e;

    public p(long l2, String string, String string2, n n2) {
        this.d = l2;
        this.b = string;
        this.c = string2;
        this.e = n2;
    }

    @Override
    public void run() {
        String string = n.f("mco.create.world.wait");
        this.b(string);
        m m2 = m.a();
        try {
            m2.a(this.d, this.b, this.c);
            net.minecraft.s.b.a(this.e);
        }
        catch (b b2) {
            f.a().b("Couldn't create world");
            this.a(b2.toString());
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            f.a().b("Couldn't create world");
            this.a(unsupportedEncodingException.getLocalizedMessage());
        }
        catch (IOException iOException) {
            f.a().b("Could not parse response creating world");
            this.a(iOException.getLocalizedMessage());
        }
        catch (Exception exception) {
            f.a().b("Could not create world");
            this.a(exception.getLocalizedMessage());
        }
    }
}

