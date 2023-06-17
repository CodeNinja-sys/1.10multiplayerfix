/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.a;
import a.a.a.a.b.as;
import a.a.a.a.b.at;
import a.a.a.a.b.c;
import a.a.a.a.b.e;
import a.a.a.a.b.ec;
import a.a.a.a.c.ad;
import a.a.a.a.c.aq;
import a.a.a.a.c.w;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class b
extends a
implements as,
Serializable {
    private static final long b = -4940583368468432370L;

    protected b() {
    }

    @Override
    public boolean containsValue(Object object) {
        return this.c().contains(object);
    }

    @Override
    public boolean b(long l2) {
        return this.b().a(l2);
    }

    public void putAll(Map map) {
        int n2 = map.size();
        Iterator iterator = map.entrySet().iterator();
        if (map instanceof as) {
            while (n2-- != 0) {
                at at2 = (at)iterator.next();
                this.a(at2.b(), at2.getValue());
            }
        } else {
            while (n2-- != 0) {
                Map.Entry entry = iterator.next();
                this.a((Long)entry.getKey(), entry.getValue());
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public ec b() {
        return new c(this);
    }

    @Override
    public w c() {
        return new e(this);
    }

    @Override
    public aq d() {
        return this.bG_();
    }

    @Override
    public int hashCode() {
        int n2 = 0;
        int n3 = this.size();
        ad ad2 = this.d().a();
        while (n3-- != 0) {
            n2 += ((Map.Entry)ad2.next()).hashCode();
        }
        return n2;
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
        if (map.size() != this.size()) {
            return false;
        }
        return this.d().containsAll(map.entrySet());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        ad ad2 = this.d().a();
        int n2 = this.size();
        boolean bl2 = true;
        stringBuilder.append("{");
        while (n2-- != 0) {
            if (bl2) {
                bl2 = false;
            } else {
                stringBuilder.append(", ");
            }
            at at2 = (at)ad2.next();
            stringBuilder.append(String.valueOf(at2.b()));
            stringBuilder.append("=>");
            if (this == at2.getValue()) {
                stringBuilder.append("(this map)");
                continue;
            }
            stringBuilder.append(String.valueOf(at2.getValue()));
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
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

