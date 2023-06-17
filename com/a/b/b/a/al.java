/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.an;
import com.a.b.d.a;
import com.a.b.d.d;
import com.a.b.d.e;
import java.net.InetAddress;

final class al
extends an {
    al() {
    }

    public InetAddress b(a a2) {
        if (a2.f() == d.i) {
            a2.j();
            return null;
        }
        return InetAddress.getByName(a2.h());
    }

    public void a(e e2, InetAddress inetAddress) {
        e2.b(inetAddress == null ? null : inetAddress.getHostAddress());
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

