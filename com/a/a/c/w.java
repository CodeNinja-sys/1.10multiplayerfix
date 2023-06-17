/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cl;
import com.a.a.c.l;
import com.a.a.c.y;

class w
implements y {
    w() {
    }

    @Override
    public void a(l l2, String string, String string2) {
        cl.a(string2 == null, (Object)"recordStats does not take values");
        cl.a(l2.g == null, (Object)"recordStats already set");
        l2.g = true;
    }
}

