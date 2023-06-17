/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.a.d.cv;
import com.c.c.b.g;
import java.util.Comparator;

final class j
implements Comparator {
    j() {
    }

    public int a(g g2, g g3) {
        return cv.a().a(Boolean.valueOf(g3.d()), Boolean.valueOf(g2.d())).a((Comparable)((Object)g2.a().toLowerCase()), (Comparable)((Object)g3.a().toLowerCase())).b();
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((g)object, (g)object2);
    }
}

