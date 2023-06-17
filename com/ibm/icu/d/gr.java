/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import java.io.InvalidObjectException;
import java.text.Format;

public class gr
extends Format.Field {
    static final long a = -4516273749929385842L;
    public static final gr b = new gr("sign");
    public static final gr c = new gr("integer");
    public static final gr d = new gr("fraction");
    public static final gr e = new gr("exponent");
    public static final gr f = new gr("exponent sign");
    public static final gr g = new gr("exponent symbol");
    public static final gr h = new gr("decimal separator");
    public static final gr i = new gr("grouping separator");
    public static final gr j = new gr("percent");
    public static final gr k = new gr("per mille");
    public static final gr l = new gr("currency");

    protected gr(String string) {
        super(string);
    }

    protected Object readResolve() {
        if (this.getName().equals(c.getName())) {
            return c;
        }
        if (this.getName().equals(d.getName())) {
            return d;
        }
        if (this.getName().equals(e.getName())) {
            return e;
        }
        if (this.getName().equals(f.getName())) {
            return f;
        }
        if (this.getName().equals(g.getName())) {
            return g;
        }
        if (this.getName().equals(l.getName())) {
            return l;
        }
        if (this.getName().equals(h.getName())) {
            return h;
        }
        if (this.getName().equals(i.getName())) {
            return i;
        }
        if (this.getName().equals(j.getName())) {
            return j;
        }
        if (this.getName().equals(k.getName())) {
            return k;
        }
        if (this.getName().equals(b.getName())) {
            return b;
        }
        throw new InvalidObjectException("An invalid object.");
    }
}

