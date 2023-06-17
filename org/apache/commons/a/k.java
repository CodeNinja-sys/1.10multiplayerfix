/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a;

import java.util.Comparator;
import org.apache.commons.a.h;
import org.apache.commons.a.j;

public class k
implements Comparator {
    private final j a;

    public k() {
        this.a = null;
    }

    public k(j j2) {
        this.a = j2;
    }

    public int compare(Object object, Object object2) {
        int n2 = 0;
        try {
            Comparable comparable = (Comparable)this.a.b(object);
            Comparable comparable2 = (Comparable)this.a.b(object2);
            n2 = comparable.compareTo(comparable2);
        }
        catch (h h2) {
            n2 = 0;
        }
        return n2;
    }
}

