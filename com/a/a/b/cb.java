/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.bx;
import com.a.a.b.by;
import com.a.a.b.cl;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public final class cb {
    private final bx a;
    private final String b;

    private cb(bx bx2, String string) {
        this.a = bx2;
        this.b = (String)cl.a(string);
    }

    public Appendable a(Appendable appendable, Map map) {
        return this.a(appendable, map.entrySet());
    }

    public StringBuilder a(StringBuilder stringBuilder, Map map) {
        return this.a(stringBuilder, map.entrySet());
    }

    public String a(Map map) {
        return this.a(map.entrySet());
    }

    public Appendable a(Appendable appendable, Iterable iterable) {
        return this.a(appendable, iterable.iterator());
    }

    public Appendable a(Appendable appendable, Iterator iterator) {
        cl.a(appendable);
        if (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            appendable.append(this.a.a(entry.getKey()));
            appendable.append(this.b);
            appendable.append(this.a.a(entry.getValue()));
            while (iterator.hasNext()) {
                appendable.append(bx.a(this.a));
                Map.Entry entry2 = (Map.Entry)iterator.next();
                appendable.append(this.a.a(entry2.getKey()));
                appendable.append(this.b);
                appendable.append(this.a.a(entry2.getValue()));
            }
        }
        return appendable;
    }

    public StringBuilder a(StringBuilder stringBuilder, Iterable iterable) {
        return this.a(stringBuilder, iterable.iterator());
    }

    public StringBuilder a(StringBuilder stringBuilder, Iterator iterator) {
        try {
            this.a((Appendable)stringBuilder, iterator);
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
        return stringBuilder;
    }

    public String a(Iterable iterable) {
        return this.a(iterable.iterator());
    }

    public String a(Iterator iterator) {
        return this.a(new StringBuilder(), iterator).toString();
    }

    public cb a(String string) {
        return new cb(this.a.b(string), this.b);
    }

    /* synthetic */ cb(bx bx2, String string, by by2) {
        this(bx2, string);
    }
}

