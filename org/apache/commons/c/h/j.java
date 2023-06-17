/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.h;

import java.util.Map;
import org.apache.commons.c.h.i;

class j
extends i {
    private final Map a;

    j(Map map) {
        this.a = map;
    }

    @Override
    public String a(String string) {
        if (this.a == null) {
            return null;
        }
        Object v2 = this.a.get(string);
        if (v2 == null) {
            return null;
        }
        return v2.toString();
    }
}

