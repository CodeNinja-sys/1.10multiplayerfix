/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.util.Comparator;
import org.apache.commons.b.a;

final class c
implements Comparator {
    c() {
    }

    public int a(a a2, a a3) {
        int n2;
        int n3 = a2.b();
        if (n3 > (n2 = a3.b())) {
            return -1;
        }
        if (n2 > n3) {
            return 1;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((a)object, (a)object2);
    }
}

