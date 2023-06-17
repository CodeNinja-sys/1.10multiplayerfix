/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.a.c.a;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.a.c.a.e;
import org.apache.commons.a.c.a.f;
import org.apache.commons.a.c.a.h;

public final class i
extends h {
    private final Set a;

    private i(Set set) {
        this.a = Collections.unmodifiableSet(set);
    }

    @Override
    public boolean a(String string) {
        return this.a.contains(string);
    }

    @Override
    public String a() {
        return (String)this.a.iterator().next();
    }

    public Set d() {
        return this.a;
    }

    @Override
    public boolean b() {
        return this.a.isEmpty();
    }

    @Override
    public boolean c() {
        return this.a.size() == 1;
    }

    @Override
    public h a(h h2) {
        if (h2 == e.b) {
            return h2;
        }
        if (h2 == e.c) {
            return this;
        }
        i i2 = (i)h2;
        HashSet<String> hashSet = new HashSet<String>(Math.min(this.a.size(), i2.a.size()));
        for (String string : this.a) {
            if (!i2.a.contains(string)) continue;
            hashSet.add(string);
        }
        return i.a(hashSet);
    }

    public String toString() {
        return "Languages(" + this.a.toString() + ")";
    }

    /* synthetic */ i(Set set, f f2) {
        this(set);
    }
}

