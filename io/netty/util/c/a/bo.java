/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import io.netty.util.c.a.av;
import io.netty.util.c.a.d;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class bo
extends d
implements Enumeration,
Iterator {
    bo(av[] arrav, int n2, int n3, int n4, a a2) {
        super(arrav, n2, n3, n4, a2);
    }

    public final Object next() {
        av av2 = this.d;
        if (av2 == null) {
            throw new NoSuchElementException();
        }
        Object object = av2.d;
        this.b = av2;
        this.c();
        return object;
    }

    public final Object nextElement() {
        return this.next();
    }
}

