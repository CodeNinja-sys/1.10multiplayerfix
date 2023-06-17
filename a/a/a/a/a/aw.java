/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.ae;
import a.a.a.a.a.as;
import a.a.a.a.a.av;
import a.a.a.a.a.eb;
import a.a.a.a.a.ec;
import a.a.a.a.c.aq;
import a.a.a.a.c.ar;
import a.a.a.a.c.w;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class aw
extends ae
implements as,
Serializable,
Cloneable {
    private static final long b = -7046029254386353129L;

    protected aw() {
    }

    @Override
    public boolean containsValue(Object object) {
        return false;
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public aq bD_() {
        return ar.a;
    }

    @Override
    public eb b() {
        return ec.a;
    }

    @Override
    public w c() {
        return ar.a;
    }

    private Object e() {
        return av.a;
    }

    @Override
    public Object clone() {
        return av.a;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public aq d() {
        return this.bD_();
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Map)) {
            return false;
        }
        return ((Map)object).isEmpty();
    }

    public String toString() {
        return "{}";
    }

    public /* synthetic */ Set entrySet() {
        return this.d();
    }

    public /* synthetic */ Collection values() {
        return this.c();
    }

    public /* synthetic */ Set keySet() {
        return this.b();
    }
}

