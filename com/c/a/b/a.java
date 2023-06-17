/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.b;

import com.c.a.b.b;
import com.c.a.b.c;
import com.c.a.c.i;
import com.c.a.f;
import com.c.a.g;
import com.c.a.j;
import java.net.Proxy;
import org.apache.commons.c.ao;

public class a
extends g {
    protected a(Proxy proxy) {
        super(proxy);
    }

    public c b(com.c.a.a a2) {
        ao.a(a2);
        if (a2 != com.c.a.a.a) {
            throw new IllegalArgumentException("Legacy authentication cannot handle anything but Minecraft");
        }
        return new c(this);
    }

    public b d() {
        return new b(this);
    }

    @Override
    public f b() {
        throw new UnsupportedOperationException("Legacy authentication service has no profile repository");
    }

    @Override
    public /* synthetic */ i a() {
        return this.d();
    }

    @Override
    public /* synthetic */ j a(com.c.a.a a2) {
        return this.b(a2);
    }
}

