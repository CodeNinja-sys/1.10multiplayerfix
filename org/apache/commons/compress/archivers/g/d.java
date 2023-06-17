/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.g;

import org.apache.commons.compress.archivers.g.e;
import org.apache.commons.compress.archivers.g.f;

public class d
implements e {
    private final boolean b;

    public d(byte[] arrby) {
        int n2 = 0;
        this.b = f.a(arrby, n2 += 504);
    }

    public boolean a() {
        return this.b;
    }
}

