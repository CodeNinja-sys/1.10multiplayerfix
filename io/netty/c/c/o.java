/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.b.h;
import io.netty.c.c.a;
import io.netty.c.c.ab;
import io.netty.c.c.c;
import io.netty.c.c.i;
import io.netty.c.c.l;
import io.netty.c.c.q;
import java.io.File;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManagerFactory;

public abstract class o {
    public static ab h() {
        if (i.a()) {
            return ab.b;
        }
        return ab.a;
    }

    public static ab i() {
        return ab.a;
    }

    public static o a(File file, File file2) {
        return o.a(null, file, file2, null, null, null, 0L, 0L);
    }

    public static o a(File file, File file2, String string) {
        return o.a(null, file, file2, string, null, null, 0L, 0L);
    }

    public static o a(File file, File file2, String string, Iterable iterable, Iterable iterable2, long l2, long l3) {
        return o.a(null, file, file2, string, iterable, iterable2, l2, l3);
    }

    public static o a(ab ab2, File file, File file2) {
        return o.a(ab2, file, file2, null, null, null, 0L, 0L);
    }

    public static o a(ab ab2, File file, File file2, String string) {
        return o.a(ab2, file, file2, string, null, null, 0L, 0L);
    }

    public static o a(ab ab2, File file, File file2, String string, Iterable iterable, Iterable iterable2, long l2, long l3) {
        if (ab2 == null) {
            ab2 = i.a() ? ab.b : ab.a;
        }
        switch (ab2) {
            case a: {
                return new c(file, file2, string, iterable, iterable2, l2, l3);
            }
            case b: {
                return new l(file, file2, string, iterable, iterable2, l2, l3);
            }
        }
        throw new Error(ab2.toString());
    }

    public static o j() {
        return o.a(null, null, null, null, null, 0L, 0L);
    }

    public static o a(File file) {
        return o.a(null, file, null, null, null, 0L, 0L);
    }

    public static o a(TrustManagerFactory trustManagerFactory) {
        return o.a(null, null, trustManagerFactory, null, null, 0L, 0L);
    }

    public static o a(File file, TrustManagerFactory trustManagerFactory) {
        return o.a(null, file, trustManagerFactory, null, null, 0L, 0L);
    }

    public static o a(File file, TrustManagerFactory trustManagerFactory, Iterable iterable, Iterable iterable2, long l2, long l3) {
        return o.a(null, file, trustManagerFactory, iterable, iterable2, l2, l3);
    }

    public static o a(ab ab2) {
        return o.a(ab2, null, null, null, null, 0L, 0L);
    }

    public static o a(ab ab2, File file) {
        return o.a(ab2, file, null, null, null, 0L, 0L);
    }

    public static o a(ab ab2, TrustManagerFactory trustManagerFactory) {
        return o.a(ab2, null, trustManagerFactory, null, null, 0L, 0L);
    }

    public static o a(ab ab2, File file, TrustManagerFactory trustManagerFactory) {
        return o.a(ab2, file, trustManagerFactory, null, null, 0L, 0L);
    }

    public static o a(ab ab2, File file, TrustManagerFactory trustManagerFactory, Iterable iterable, Iterable iterable2, long l2, long l3) {
        if (ab2 != null && ab2 != ab.a) {
            throw new SSLException("client context unsupported for: " + (Object)((Object)ab2));
        }
        return new a(file, trustManagerFactory, iterable, iterable2, l2, l3);
    }

    o() {
    }

    public final boolean k() {
        return !this.a();
    }

    public abstract boolean a();

    public abstract List e();

    public abstract long f();

    public abstract long g();

    public abstract List b();

    public abstract SSLEngine a(h var1);

    public abstract SSLEngine a(h var1, String var2, int var3);

    public final q b(h h2) {
        return o.a(this.a(h2));
    }

    public final q b(h h2, String string, int n2) {
        return o.a(this.a(h2, string, n2));
    }

    private static q a(SSLEngine sSLEngine) {
        return new q(sSLEngine);
    }
}

