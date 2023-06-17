/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c.a;

import io.netty.util.c.a.a;
import io.netty.util.c.a.ae;
import io.netty.util.c.a.av;
import io.netty.util.c.a.d;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

final class m
extends d
implements Iterator {
    m(av[] arrav, int n2, int n3, int n4, a a2) {
        super(arrav, n2, n3, n4, a2);
    }

    public final Map.Entry a() {
        av av2 = this.d;
        if (av2 == null) {
            throw new NoSuchElementException();
        }
        Object object = av2.c;
        Object object2 = av2.d;
        this.b = av2;
        this.c();
        return new ae(object, object2, this.a);
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

