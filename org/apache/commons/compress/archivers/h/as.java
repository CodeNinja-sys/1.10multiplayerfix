/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.util.Comparator;
import org.apache.commons.compress.archivers.h.ab;
import org.apache.commons.compress.archivers.h.aq;
import org.apache.commons.compress.archivers.h.av;
import org.apache.commons.compress.archivers.h.ax;

class as
implements Comparator {
    final /* synthetic */ aq a;

    as(aq aq2) {
        this.a = aq2;
    }

    public int a(ab ab2, ab ab3) {
        av av2;
        if (ab2 == ab3) {
            return 0;
        }
        av av3 = ab2 instanceof av ? (av)ab2 : null;
        av av4 = av2 = ab3 instanceof av ? (av)ab3 : null;
        if (av3 == null) {
            return 1;
        }
        if (av2 == null) {
            return -1;
        }
        long l2 = ax.b(av3.b()) - ax.b(av2.b());
        return l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ab)object, (ab)object2);
    }
}

