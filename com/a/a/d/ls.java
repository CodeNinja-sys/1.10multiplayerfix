/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.kk;
import com.a.a.d.kn;
import com.a.a.d.lr;
import com.a.a.d.lt;
import com.a.a.d.ov;
import com.a.a.d.vi;
import com.a.a.d.yd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;

public final class ls
extends kn {
    public ls() {
        this.a = new lt();
    }

    public ls a(Object object, Object object2) {
        this.a.a(cl.a(object), cl.a(object2));
        return this;
    }

    public ls a(Map.Entry entry) {
        this.a.a(cl.a(entry.getKey()), cl.a(entry.getValue()));
        return this;
    }

    public ls a(Object object, Iterable iterable) {
        Collection collection = this.a.c(cl.a(object));
        for (Object t2 : iterable) {
            collection.add(cl.a(t2));
        }
        return this;
    }

    public ls a(Object object, Object ... arrobject) {
        return this.a(object, Arrays.asList(arrobject));
    }

    public ls a(vi vi2) {
        for (Map.Entry entry : vi2.c().entrySet()) {
            this.a(entry.getKey(), (Iterable)entry.getValue());
        }
        return this;
    }

    public ls a(Comparator comparator) {
        this.b = (Comparator)cl.a(comparator);
        return this;
    }

    public ls b(Comparator comparator) {
        super.c(comparator);
        return this;
    }

    public lr a() {
        if (this.b != null) {
            lt lt2 = new lt();
            ArrayList arrayList = ov.a(this.a.c().entrySet());
            Collections.sort(arrayList, yd.a(this.b).h());
            for (Map.Entry entry : arrayList) {
                lt2.c(entry.getKey(), (Iterable)entry.getValue());
            }
            this.a = lt2;
        }
        return lr.a(this.a, this.c);
    }

    @Override
    public /* synthetic */ kk b() {
        return this.a();
    }

    @Override
    public /* synthetic */ kn c(Comparator comparator) {
        return this.b(comparator);
    }

    @Override
    public /* synthetic */ kn d(Comparator comparator) {
        return this.a(comparator);
    }

    @Override
    public /* synthetic */ kn b(vi vi2) {
        return this.a(vi2);
    }

    @Override
    public /* synthetic */ kn b(Object object, Object[] arrobject) {
        return this.a(object, arrobject);
    }

    @Override
    public /* synthetic */ kn b(Object object, Iterable iterable) {
        return this.a(object, iterable);
    }

    @Override
    public /* synthetic */ kn b(Map.Entry entry) {
        return this.a(entry);
    }

    @Override
    public /* synthetic */ kn b(Object object, Object object2) {
        return this.a(object, object2);
    }
}

