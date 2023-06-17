/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.i.ac;
import org.apache.logging.log4j.core.i.ak;

public abstract class ap
extends ac {
    private final ak b;

    protected ap(String string, String string2, String[] arrstring) {
        super(string, string2);
        this.b = arrstring != null && arrstring.length > 0 ? ak.a(arrstring[0]) : ak.a();
    }

    protected final String a(String string) {
        return this.b.b(string);
    }
}

