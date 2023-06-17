/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.l;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.a.l.a;
import org.apache.a.l.j;

public class b
extends a
implements Serializable,
Cloneable {
    private static final long a = -7086398485908701455L;
    private final Map b = new ConcurrentHashMap();

    public Object a(String string) {
        return this.b.get(string);
    }

    public j a(String string, Object object) {
        if (string == null) {
            return this;
        }
        if (object != null) {
            this.b.put(string, object);
        } else {
            this.b.remove(string);
        }
        return this;
    }

    public boolean b(String string) {
        if (this.b.containsKey(string)) {
            this.b.remove(string);
            return true;
        }
        return false;
    }

    public void a(String[] arrstring, Object object) {
        for (String string : arrstring) {
            this.a(string, object);
        }
    }

    public boolean e(String string) {
        return this.a(string) != null;
    }

    public boolean f(String string) {
        return this.b.get(string) != null;
    }

    public void a() {
        this.b.clear();
    }

    public j e() {
        try {
            return (j)this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new UnsupportedOperationException("Cloning not supported");
        }
    }

    public Object clone() {
        b b2 = (b)super.clone();
        this.a(b2);
        return b2;
    }

    public void a(j j2) {
        for (Map.Entry entry : this.b.entrySet()) {
            j2.a((String)entry.getKey(), entry.getValue());
        }
    }

    public Set f() {
        return new HashSet(this.b.keySet());
    }
}

