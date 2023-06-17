/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.io.Serializable;
import org.apache.logging.log4j.a.aa;

class ae
implements Serializable {
    private static final long a = -3476620450287648269L;
    private final String b;
    private final String c;

    public ae(aa aa2) {
        this.b = aa2.a();
        this.c = aa.a(aa2);
    }

    protected Object a() {
        return new aa(this.b, this.c, null);
    }
}

