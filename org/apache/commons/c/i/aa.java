/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import java.util.Locale;
import java.util.TimeZone;

class aa {
    private final TimeZone a;
    private final int b;
    private final Locale c;

    aa(TimeZone timeZone, boolean bl2, int n2, Locale locale) {
        this.a = timeZone;
        this.b = bl2 ? n2 | Integer.MIN_VALUE : n2;
        this.c = locale;
    }

    public int hashCode() {
        return (this.b * 31 + this.c.hashCode()) * 31 + this.a.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof aa) {
            aa aa2 = (aa)object;
            return this.a.equals(aa2.a) && this.b == aa2.b && this.c.equals(aa2.c);
        }
        return false;
    }
}

