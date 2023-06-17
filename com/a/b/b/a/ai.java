/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.net.URL;

final class ai
extends an {
    ai() {
    }

    public URL b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        String string = a2.h();
        return "null".equals(string) ? null : new URL(string);
    }

    public void a(e e2, URL uRL) {
        e2.b(uRL == null ? null : uRL.toExternalForm());
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

