/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.c.c.b.u;
import java.util.Comparator;

final class j
implements Comparator {
    j() {
    }

    public int a(u u2, u u3) {
        return u2.a() - u3.a();
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((u)object, (u)object2);
    }
}

