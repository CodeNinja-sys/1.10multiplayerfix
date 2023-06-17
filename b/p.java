/*
 * Decompiled with CFR 0.150.
 */
package b;

import b.ae;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class p
extends RuntimeException {
    private static final long a = -1L;
    private final List b = new ArrayList();

    protected p(Collection collection) {
        this.b.addAll(collection);
    }

    protected p(Collection collection, Throwable throwable) {
        super(throwable);
        this.b.addAll(collection);
    }

    public Collection a() {
        return Collections.unmodifiableCollection(this.b);
    }

    protected final String b() {
        return this.a((String)this.b.get(0));
    }

    protected final String a(String string) {
        return "'" + string + "'";
    }

    protected final String c() {
        StringBuilder stringBuilder = new StringBuilder("[");
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(this.a((String)iterator.next()));
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    static p b(String string) {
        return new ae(string);
    }
}

