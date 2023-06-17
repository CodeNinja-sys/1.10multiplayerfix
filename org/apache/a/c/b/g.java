/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.b;

import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import org.apache.a.c.b.a;
import org.apache.a.f;
import org.apache.a.n;

public class g
extends a {
    public g(n n2) {
        super(n2);
    }

    InputStream a(InputStream inputStream) {
        return new GZIPInputStream(inputStream);
    }

    public f e() {
        return null;
    }

    public long c() {
        return -1L;
    }
}

