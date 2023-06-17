/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.b;

import io.netty.channel.ar;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class b
extends ar
implements Iterable {
    private static final long a = -4093064295562629453L;
    private final Collection b;

    public b(Collection collection) {
        if (collection == null) {
            throw new NullPointerException("causes");
        }
        if (collection.isEmpty()) {
            throw new IllegalArgumentException("causes must be non empty");
        }
        this.b = Collections.unmodifiableCollection(collection);
    }

    public Iterator iterator() {
        return this.b.iterator();
    }
}

