/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.l;

import java.util.HashSet;
import java.util.Set;
import org.apache.a.l.a;
import org.apache.a.l.j;
import org.apache.a.l.k;

public final class e
extends a {
    private final j a;
    private final j b;

    public e(j j2, j j3) {
        this.a = (j)org.apache.a.o.a.a(j2, "Local HTTP parameters");
        this.b = j3;
    }

    public j e() {
        j j2 = this.a.e();
        return new e(j2, this.b);
    }

    public Object a(String string) {
        Object object = this.a.a(string);
        if (object == null && this.b != null) {
            object = this.b.a(string);
        }
        return object;
    }

    public boolean b(String string) {
        return this.a.b(string);
    }

    public j a(String string, Object object) {
        return this.a.a(string, object);
    }

    public j a() {
        return this.b;
    }

    public Set f() {
        HashSet hashSet = new HashSet(this.a(this.b));
        hashSet.addAll(this.a(this.a));
        return hashSet;
    }

    public Set b() {
        return new HashSet(this.a(this.b));
    }

    public Set c() {
        return new HashSet(this.a(this.a));
    }

    private Set a(j j2) {
        if (j2 instanceof k) {
            return ((k)((Object)j2)).f();
        }
        throw new UnsupportedOperationException("HttpParams instance does not implement HttpParamsNames");
    }
}

