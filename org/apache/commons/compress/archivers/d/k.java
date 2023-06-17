/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.d;

import java.util.Comparator;
import org.apache.commons.compress.archivers.d.e;
import org.apache.commons.compress.archivers.d.j;

class k
implements Comparator {
    final /* synthetic */ j a;

    k(j j2) {
        this.a = j2;
    }

    public int a(e e2, e e3) {
        if (e2.m() == null || e3.m() == null) {
            return Integer.MAX_VALUE;
        }
        return e2.m().compareTo(e3.m());
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((e)object, (e)object2);
    }
}

