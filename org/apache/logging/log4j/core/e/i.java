/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.e;

import java.io.Serializable;

public class i
implements Serializable {
    private static final long a = -2171069569241280505L;
    private final String b;
    private final String c;
    private final boolean d;

    public i(String string, String string2, boolean bl2) {
        this.b = string;
        this.c = string2;
        this.d = bl2;
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public String toString() {
        String string = this.d ? "" : "~";
        return string + "[" + this.b + ":" + this.c + "]";
    }
}

