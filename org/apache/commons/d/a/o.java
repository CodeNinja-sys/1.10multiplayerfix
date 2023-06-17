/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.d.a;

import java.util.Enumeration;
import org.apache.commons.d.a.n;
import org.apache.commons.d.a.q;

class o
implements Enumeration {
    private final Enumeration a;
    private final n b;

    o(n n2, Enumeration enumeration) {
        this.b = n2;
        this.a = enumeration;
    }

    public boolean hasMoreElements() {
        return this.a.hasMoreElements();
    }

    public Object nextElement() {
        q q2 = (q)this.a.nextElement();
        return q.a(q2);
    }
}

