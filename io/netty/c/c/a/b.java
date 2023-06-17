/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c.a;

import io.netty.b.bi;
import io.netty.b.w;
import io.netty.c.c.a.c;
import io.netty.c.c.a.d;
import io.netty.c.c.a.i;
import io.netty.util.b.z;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Pattern;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;

public final class b
extends i {
    private static final Pattern a = Pattern.compile("^[0-9a-fA-F:]+$");
    private static final Pattern b = Pattern.compile(":");
    private static final int c = 20;
    private static final int d = 40;
    private static final z e = new c();
    private final TrustManager f = new d(this);
    private final byte[][] g;

    public b(Iterable iterable) {
        this(io.netty.c.c.a.b.a(iterable));
    }

    public b(String ... arrstring) {
        this(io.netty.c.c.a.b.a(Arrays.asList(arrstring)));
    }

    public b(byte[] ... arrby) {
        if (arrby == null) {
            throw new NullPointerException("fingerprints");
        }
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (byte[] arrby2 : arrby) {
            if (arrby2 == null) break;
            if (arrby2.length != 20) {
                throw new IllegalArgumentException("malformed fingerprint: " + w.a(bi.a(arrby2)) + " (expected: SHA1)");
            }
            arrayList.add(arrby2.clone());
        }
        this.g = (byte[][])arrayList.toArray((T[])new byte[arrayList.size()][]);
    }

    private static byte[][] a(Iterable iterable) {
        String string;
        if (iterable == null) {
            throw new NullPointerException("fingerprints");
        }
        ArrayList arrayList = new ArrayList();
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext() && (string = (String)iterator.next()) != null) {
            if (!a.matcher(string).matches()) {
                throw new IllegalArgumentException("malformed fingerprint: " + string);
            }
            if ((string = b.matcher(string).replaceAll("")).length() != 40) {
                throw new IllegalArgumentException("malformed fingerprint: " + string + " (expected: SHA1)");
            }
            byte[] arrby = new byte[20];
            for (int i2 = 0; i2 < arrby.length; ++i2) {
                int n2 = i2 << 1;
                arrby[i2] = (byte)Integer.parseInt(string.substring(n2, n2 + 2), 16);
            }
        }
        return (byte[][])arrayList.toArray((T[])new byte[arrayList.size()][]);
    }

    @Override
    protected void a(KeyStore keyStore) {
    }

    @Override
    protected void a(ManagerFactoryParameters managerFactoryParameters) {
    }

    @Override
    protected TrustManager[] a() {
        return new TrustManager[]{this.f};
    }

    static /* synthetic */ byte[][] a(b b2) {
        return b2.g;
    }

    static /* synthetic */ z b() {
        return e;
    }
}

