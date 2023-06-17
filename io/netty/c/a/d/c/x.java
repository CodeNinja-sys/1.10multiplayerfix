/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d.c;

import io.netty.c.a.d.ar;
import io.netty.c.a.d.c.ag;
import io.netty.c.a.d.c.av;
import io.netty.c.a.d.c.r;
import io.netty.c.a.d.c.t;
import io.netty.c.a.d.c.u;
import io.netty.c.a.d.c.v;
import io.netty.c.a.d.c.w;
import java.net.URI;

public final class x {
    private x() {
    }

    public static r a(URI uRI, av av2, String string, boolean bl2, ar ar2) {
        return x.a(uRI, av2, string, bl2, ar2, 65536);
    }

    public static r a(URI uRI, av av2, String string, boolean bl2, ar ar2, int n2) {
        if (av2 == av.e) {
            return new w(uRI, av.e, string, bl2, ar2, n2);
        }
        if (av2 == av.d) {
            return new v(uRI, av.d, string, bl2, ar2, n2);
        }
        if (av2 == av.c) {
            return new u(uRI, av.c, string, bl2, ar2, n2);
        }
        if (av2 == av.b) {
            return new t(uRI, av.b, string, ar2, n2);
        }
        throw new ag("Protocol version " + (Object)((Object)av2) + " not supported.");
    }
}

