/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import com.a.b.x;
import java.net.URI;
import java.net.URISyntaxException;

final class aj
extends an {
    aj() {
    }

    public URI b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        try {
            String string = a2.h();
            return "null".equals(string) ? null : new URI(string);
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new x(uRISyntaxException);
        }
    }

    public void a(e e2, URI uRI) {
        e2.b(uRI == null ? null : uRI.toASCIIString());
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

