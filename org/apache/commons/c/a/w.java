/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.c.a.ae;
import org.apache.commons.c.a.af;
import org.apache.commons.c.a.c;

public class w
implements Iterable {
    public static final String a = "";
    private static final String b = "differs from";
    private final List c;
    private final Object d;
    private final Object e;
    private final af f;

    w(Object object, Object object2, List list, af af2) {
        if (object == null) {
            throw new IllegalArgumentException("Left hand object cannot be null");
        }
        if (object2 == null) {
            throw new IllegalArgumentException("Right hand object cannot be null");
        }
        if (list == null) {
            throw new IllegalArgumentException("List of differences cannot be null");
        }
        this.c = list;
        this.d = object;
        this.e = object2;
        this.f = af2 == null ? af.a : af2;
    }

    public List a() {
        return Collections.unmodifiableList(this.c);
    }

    public int b() {
        return this.c.size();
    }

    public af c() {
        return this.f;
    }

    public String toString() {
        return this.a(this.f);
    }

    public String a(af af2) {
        if (this.c.size() == 0) {
            return a;
        }
        ae ae2 = new ae(this.d, af2);
        ae ae3 = new ae(this.e, af2);
        for (c c2 : this.c) {
            ae2.a(c2.b(), c2.f());
            ae3.a(c2.b(), c2.e());
        }
        return String.format("%s %s %s", ae2.j(), b, ae3.j());
    }

    public Iterator iterator() {
        return this.c.iterator();
    }
}

