/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.c;

import io.netty.c.a.c.ac;
import io.netty.c.a.c.d;
import io.netty.c.a.c.e;
import io.netty.c.a.c.i;
import io.netty.c.a.c.l;
import io.netty.c.a.c.y;
import io.netty.c.a.c.z;
import io.netty.util.c.ae;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.u;

public final class x {
    private static final g a = h.a(x.class);
    private static final boolean b = ae.a("io.netty.noJdkZlibDecoder", true);

    public static z a(int n2) {
        if (u.d() < 7) {
            return new e(n2);
        }
        return new l(n2);
    }

    public static z a(ac ac2) {
        if (u.d() < 7) {
            return new e(ac2);
        }
        return new l(ac2);
    }

    public static z a(ac ac2, int n2) {
        if (u.d() < 7) {
            return new e(ac2, n2);
        }
        return new l(ac2, n2);
    }

    public static z a(ac ac2, int n2, int n3, int n4) {
        if (u.d() < 7) {
            return new e(ac2, n2, n3, n4);
        }
        return new l(ac2, n2);
    }

    public static z a(byte[] arrby) {
        if (u.d() < 7) {
            return new e(arrby);
        }
        return new l(arrby);
    }

    public static z a(int n2, byte[] arrby) {
        if (u.d() < 7) {
            return new e(n2, arrby);
        }
        return new l(n2, arrby);
    }

    public static z a(int n2, int n3, int n4, byte[] arrby) {
        if (u.d() < 7) {
            return new e(n2, n3, n4, arrby);
        }
        return new l(n2, arrby);
    }

    public static y a() {
        if (u.d() < 7 || b) {
            return new d();
        }
        return new i();
    }

    public static y b(ac ac2) {
        if (u.d() < 7 || b) {
            return new d(ac2);
        }
        return new i(ac2);
    }

    public static y b(byte[] arrby) {
        if (u.d() < 7 || b) {
            return new d(arrby);
        }
        return new i(arrby);
    }

    private x() {
    }

    static {
        a.b("-Dio.netty.noJdkZlibDecoder: {}", (Object)b);
    }
}

