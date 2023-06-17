/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.e;

import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.apache.a.o.a;

public final class d {
    private final String a;
    private final X509Certificate[] b;

    public d(String string, X509Certificate[] arrx509Certificate) {
        this.a = (String)org.apache.a.o.a.a((Object)string, "Private key type");
        this.b = arrx509Certificate;
    }

    public String a() {
        return this.a;
    }

    public X509Certificate[] b() {
        return this.b;
    }

    public String toString() {
        return this.a + ':' + Arrays.toString(this.b);
    }
}

