/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.a;

import java.io.InputStream;
import java.util.Enumeration;
import org.apache.commons.compress.a.d;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.h.ab;
import org.apache.commons.compress.archivers.h.aq;

class f
implements d {
    private final aq a;
    private final Enumeration b;
    private ab c;

    f(aq aq2) {
        this.a = aq2;
        this.b = aq2.c();
    }

    public boolean a() {
        return this.b.hasMoreElements();
    }

    public a b() {
        this.c = (ab)this.b.nextElement();
        return this.c;
    }

    public InputStream c() {
        return this.a.b(this.c);
    }
}

