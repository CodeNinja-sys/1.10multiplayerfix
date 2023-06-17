/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import java.io.InvalidObjectException;
import java.text.Format;

public class er
extends Format.Field {
    private static final long b = 7510380454602616157L;
    public static final er a = new er("message argument field");

    protected er(String string) {
        super(string);
    }

    protected Object readResolve() {
        if (this.getClass() != er.class) {
            throw new InvalidObjectException("A subclass of MessageFormat.Field must implement readResolve.");
        }
        if (this.getName().equals(a.getName())) {
            return a;
        }
        throw new InvalidObjectException("Unknown attribute name.");
    }
}

