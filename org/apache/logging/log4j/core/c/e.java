/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.g;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i;
import org.apache.logging.log4j.f;

public final class e
implements Iterable,
d,
g {
    private final List a;
    private final boolean b;
    private boolean c;

    private e() {
        this.a = new ArrayList();
        this.b = false;
    }

    private e(List list) {
        if (list == null) {
            this.a = Collections.unmodifiableList(new ArrayList());
            this.b = false;
            return;
        }
        this.a = Collections.unmodifiableList(list);
        this.b = this.a.size() > 0;
    }

    public e a(d d2) {
        ArrayList<d> arrayList = new ArrayList<d>(this.a);
        arrayList.add(d2);
        return new e(Collections.unmodifiableList(arrayList));
    }

    public e b(d d2) {
        ArrayList arrayList = new ArrayList(this.a);
        arrayList.remove(d2);
        return new e(Collections.unmodifiableList(arrayList));
    }

    public Iterator iterator() {
        return this.a.iterator();
    }

    public List c() {
        return this.a;
    }

    public boolean d() {
        return this.b;
    }

    public int h() {
        return this.a.size();
    }

    @Override
    public void e() {
        for (d d2 : this.a) {
            if (!(d2 instanceof g)) continue;
            ((g)((Object)d2)).e();
        }
        this.c = true;
    }

    @Override
    public void f() {
        for (d d2 : this.a) {
            if (!(d2 instanceof g)) continue;
            ((g)((Object)d2)).f();
        }
        this.c = false;
    }

    @Override
    public boolean g() {
        return this.c;
    }

    @Override
    public org.apache.logging.log4j.core.e a() {
        return org.apache.logging.log4j.core.e.b;
    }

    @Override
    public org.apache.logging.log4j.core.e b() {
        return org.apache.logging.log4j.core.e.b;
    }

    @Override
    public org.apache.logging.log4j.core.e a(i i2, b b2, f f2, String string, Object ... arrobject) {
        org.apache.logging.log4j.core.e e2 = org.apache.logging.log4j.core.e.b;
        for (d d2 : this.a) {
            e2 = d2.a(i2, b2, f2, string, arrobject);
            if (e2 != org.apache.logging.log4j.core.e.a && e2 != org.apache.logging.log4j.core.e.c) continue;
            return e2;
        }
        return e2;
    }

    @Override
    public org.apache.logging.log4j.core.e a(i i2, b b2, f f2, Object object, Throwable throwable) {
        org.apache.logging.log4j.core.e e2 = org.apache.logging.log4j.core.e.b;
        for (d d2 : this.a) {
            e2 = d2.a(i2, b2, f2, object, throwable);
            if (e2 != org.apache.logging.log4j.core.e.a && e2 != org.apache.logging.log4j.core.e.c) continue;
            return e2;
        }
        return e2;
    }

    @Override
    public org.apache.logging.log4j.core.e a(i i2, b b2, f f2, m m2, Throwable throwable) {
        org.apache.logging.log4j.core.e e2 = org.apache.logging.log4j.core.e.b;
        for (d d2 : this.a) {
            e2 = d2.a(i2, b2, f2, m2, throwable);
            if (e2 != org.apache.logging.log4j.core.e.a && e2 != org.apache.logging.log4j.core.e.c) continue;
            return e2;
        }
        return e2;
    }

    @Override
    public org.apache.logging.log4j.core.e a(h h2) {
        org.apache.logging.log4j.core.e e2 = org.apache.logging.log4j.core.e.b;
        for (d d2 : this.a) {
            e2 = d2.a(h2);
            if (e2 != org.apache.logging.log4j.core.e.a && e2 != org.apache.logging.log4j.core.e.c) continue;
            return e2;
        }
        return e2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (d d2 : this.a) {
            if (stringBuilder.length() == 0) {
                stringBuilder.append("{");
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append(d2.toString());
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }

    public static e a(d[] arrd) {
        List<Object> list = arrd == null || arrd.length == 0 ? new ArrayList() : Arrays.asList(arrd);
        return new e(list);
    }
}

