/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.af;
import a.a.a.a.b.as;
import a.a.a.a.b.ay;
import a.a.a.a.b.ec;
import a.a.a.a.b.ed;
import a.a.a.a.c.aq;
import a.a.a.a.c.ar;
import a.a.a.a.c.w;
import a.a.a.a.g;
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
    protected transient ec e;
    protected transient w f;

    protected ax(long l2, Object object) {
        super(l2, object);
    }

    @Override
    public boolean containsValue(Object object) {
        return this.c == null ? object == null : this.c.equals(object);
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    public aq bG_() {
        if (this.d == null) {
            this.d = ar.a(new ay(this));
        }
        return this.d;
    }

    @Override
    public ec b() {
        if (this.e == null) {
            this.e = ed.a(this.b);
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
        return this.bG_();
    }

    @Override
    public int hashCode() {
        return a.a.a.a.g.d(this.b) ^ (this.c == null ? 0 : this.c.hashCode());
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

