/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.i;

import org.apache.commons.c.i.j;
import org.apache.commons.c.i.q;

class o
extends q {
    private final String a;

    o(String string) {
        super(null);
        this.a = string;
    }

    @Override
    boolean a() {
        char c2 = this.a.charAt(0);
        if (c2 == '\'') {
            c2 = this.a.charAt(1);
        }
        return Character.isDigit(c2);
    }

    @Override
    boolean a(j j2, StringBuilder stringBuilder) {
        j.a(stringBuilder, this.a, true);
        return false;
    }
}

