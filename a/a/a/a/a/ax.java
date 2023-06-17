/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.af;
import a.a.a.a.a.as;
import a.a.a.a.a.ay;
import a.a.a.a.a.eb;
import a.a.a.a.a.ec;
import a.a.a.a.c.aq;
import a.a.a.a.c.ar;
import a.a.a.a.c.w;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ax
extends af
implements as,
Serializable,
Cloneable {
    private static final long g = -7046029254386353129L;
    protected transient aq d;
    protected transient eb e;
    protected transient w f;

    protected ax(int n2, Object object) {
        super(n2, object);
    }

    @Override
    public boolean containsValue(Object object) {
        return this.c == null ? object == null : this.c.equals(object);
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public aq bD_() {
        if (this.d == null) {
            this.d = ar.a(new ay(this));
        }
        return this.d;
    }

    @Override
    public eb b() {
        if (this.e == null) {
            this.e = ec.a(this.b);
        }
        return this.e;
    }

    @Override
    public w c() {
        if (this.f == null) {
            this.f = ar.a(this.c);
        }
        return this.f;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public aq d() {
        return this.bD_();
    }

    @Override
    public int hashCode() {
        return this.b ^ (this.c == null ? 0 : this.c.hashCode());
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Map)) {
            return false;
        }
        Map map = (Map)object;
        if (map.size() != 1) {
            return false;
        }
        return ((Map.Entry)this.d().a().next()).equals(map.entrySet().iterator().next());
    }

    public String toString() {
        return "{" + this.b + "=>" + this.c + "}";
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

