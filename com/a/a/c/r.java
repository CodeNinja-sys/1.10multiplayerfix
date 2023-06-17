/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cl;
import com.a.a.c.l;
import com.a.a.c.y;

abstract class r
implements y {
    r() {
    }

    protected abstract void a(l var1, int var2);

    @Override
    public void a(l l2, String string, String string2) {
        cl.a(string2 != null && !string2.isEmpty(), "value of key %s omitted", new Object[]{string});
        try {
            this.a(l2, Integer.parseInt(string2));
        }
        catch (NumberFormatException numberFormatException) {
            throw new IllegalArgumentException(String.format("key %s value set to %s, must be integer", string, string2), numberFormatException);
        }
    }
}

