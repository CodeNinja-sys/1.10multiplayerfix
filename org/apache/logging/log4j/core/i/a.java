/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.i.aq;
import org.apache.logging.log4j.d;

public abstract class a
implements aq {
    protected static final d a = org.apache.logging.log4j.d.d.k();
    private final String b;
    private final String c;

    protected a(String string, String string2) {
        this.b = string;
        this.c = string2;
    }

    @Override
    public final String a() {
        return this.b;
    }

    @Override
    public String a(Object object) {
        return this.c;
    }
}

