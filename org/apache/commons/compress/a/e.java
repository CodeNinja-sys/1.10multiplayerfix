/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.a;

import java.io.InputStream;
import org.apache.commons.compress.a.d;
import org.apache.commons.compress.archivers.a;
import org.apache.commons.compress.archivers.c;

class e
implements d {
    private final c a;
    private a b;

    e(c c2) {
        this.a = c2;
    }

    public boolean a() {
        this.b = this.a.a();
        return this.b != null;
    }

    public a b() {
        return this.b;
    }

    public InputStream c() {
        return this.a;
    }
}

