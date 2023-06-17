/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.iz;
import java.util.Iterator;

public abstract class jb {
    static final int c = 4;

    static int a(int n2, int n3) {
        if (n3 < 0) {
            throw new AssertionError((Object)"cannot store more than MAX_VALUE elements");
        }
        int n4 = n2 + (n2 >> 1) + 1;
        if (n4 < n3) {
            n4 = Integer.highestOneBit(n3 - 1) << 1;
        }
        if (n4 < 0) {
            n4 = Integer.MAX_VALUE;
        }
        return n4;
    }

    jb() {
    }

    public abstract jb b(Object var1);

    public jb a(Object ... arrobject) {
        for (Object object : arrobject) {
            this.b(object);
        }
        return this;
    }

    public jb a(Iterable iterable) {
        for (Object t2 : iterable) {
            this.b(t2);
        }
        return this;
    }

    public jb a(Iterator iterator) {
        while (iterator.hasNext()) {
            this.b(iterator.next());
        }
        return this;
    }

    public abstract iz a();
}

