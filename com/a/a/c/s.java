/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cl;
import com.a.a.c.bw;
import com.a.a.c.l;
import com.a.a.c.y;

class s
implements y {
    private final bw a;

    public s(bw bw2) {
        this.a = bw2;
    }

    @Override
    public void a(l l2, String string, String string2) {
        cl.a(string2 == null, "key %s does not take values", new Object[]{string});
        cl.a(l2.e == null, "%s was already set to %s", new Object[]{string, l2.e});
        l2.e = this.a;
    }
}

