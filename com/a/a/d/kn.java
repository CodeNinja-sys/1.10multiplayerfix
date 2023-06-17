/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.cl;
import com.a.a.d.kk;
import com.a.a.d.ko;
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.d.vi;
import com.a.a.d.yd;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class kn {
    vi a = new ko();
    Comparator b;
    Comparator c;

    public kn b(Object object, Object object2) {
        cl.a(object, object2);
        this.a.a(object, object2);
        return this;
    }

    public kn b(Map.Entry entry) {
        return this.b(entry.getKey(), entry.getValue());
    }

    public kn b(Object object, Iterable iterable) {
        if (object == null) {
            throw new NullPointerException("null key in entry: null=" + mq.c(iterable));
        }
        Collection collection = this.a.c(object);
        for (Object t2 : iterable) {
            cl.a(object, t2);
            collection.add(t2);
        }
        return this;
    }

    public kn b(Object object, Object ... arrobject) {
        return this.b(object, Arrays.asList(arrobject));
    }

    public kn b(vi vi2) {
        for (Map.Entry entry : vi2.c().entrySet()) {
            this.b(entry.getKey(), (Iterable)entry.getValue());
        }
        return this;
    }

    public kn d(Comparator comparator) {
        this.b = (Comparator)com.a.a.b.cl.a(comparator);
        return this;
    }

    public kn c(Comparator comparator) {
        this.c = (Comparator)com.a.a.b.cl.a(comparator);
        return this;
    }

    public kk b() {
        if (this.c != null) {
            for (Collection collection : this.a.c().values()) {
                List list = (List)collection;
                Collections.sort(list, this.c);
            }
        }
        if (this.b != null) {
            Collection collection;
            ko ko2 = new ko();
            collection = ov.a(this.a.c().entrySet());
            Collections.sort(collection, yd.a(this.b).h());
            for (Map.Entry entry : collection) {
                ko2.c(entry.getKey(), (Iterable)entry.getValue());
            }
            this.a = ko2;
        }
        return kk.c(this.a);
    }
}

