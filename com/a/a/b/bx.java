/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.by;
import com.a.a.b.bz;
import com.a.a.b.ca;
import com.a.a.b.cb;
import com.a.a.b.cl;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class bx {
    private final String a;

    public static bx a(String string) {
        return new bx(string);
    }

    public static bx a(char c2) {
        return new bx(String.valueOf(c2));
    }

    private bx(String string) {
        this.a = (String)cl.a(string);
    }

    private bx(bx bx2) {
        this.a = bx2.a;
    }

    public Appendable a(Appendable appendable, Iterable iterable) {
        return this.a(appendable, iterable.iterator());
    }

    public Appendable a(Appendable appendable, Iterator iterator) {
        cl.a(appendable);
        if (iterator.hasNext()) {
            appendable.append(this.a(iterator.next()));
            while (iterator.hasNext()) {
                appendable.append(this.a);
                appendable.append(this.a(iterator.next()));
            }
        }
        return appendable;
    }

    public final Appendable a(Appendable appendable, Object[] arrobject) {
        return this.a(appendable, Arrays.asList(arrobject));
    }

    public final Appendable a(Appendable appendable, Object object, Object object2, Object ... arrobject) {
        return this.a(appendable, bx.b(object, object2, arrobject));
    }

    public final StringBuilder a(StringBuilder stringBuilder, Iterable iterable) {
        return this.a(stringBuilder, iterable.iterator());
    }

    public final StringBuilder a(StringBuilder stringBuilder, Iterator iterator) {
        try {
            this.a((Appendable)stringBuilder, iterator);
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
        return stringBuilder;
    }

    public final StringBuilder a(StringBuilder stringBuilder, Object[] arrobject) {
        return this.a(stringBuilder, Arrays.asList(arrobject));
    }

    public final StringBuilder a(StringBuilder stringBuilder, Object object, Object object2, Object ... arrobject) {
        return this.a(stringBuilder, bx.b(object, object2, arrobject));
    }

    public final String a(Iterable iterable) {
        return this.a(iterable.iterator());
    }

    public final String a(Iterator iterator) {
        return this.a(new StringBuilder(), iterator).toString();
    }

    public final String a(Object[] arrobject) {
        return this.a(Arrays.asList(arrobject));
    }

    public final String a(Object object, Object object2, Object ... arrobject) {
        return this.a(bx.b(object, object2, arrobject));
    }

    public bx b(String string) {
        cl.a(string);
        return new by(this, this, string);
    }

    public bx a() {
        return new bz(this, this);
    }

    public cb c(String string) {
        return new cb(this, string, null);
    }

    CharSequence a(Object object) {
        cl.a(object);
        return object instanceof CharSequence ? (CharSequence)object : object.toString();
    }

    private static Iterable b(Object object, Object object2, Object[] arrobject) {
        cl.a(arrobject);
        return new ca(arrobject, object, object2);
    }

    /* synthetic */ bx(bx bx2, by by2) {
        this(bx2);
    }

    static /* synthetic */ String a(bx bx2) {
        return bx2.a;
    }
}

