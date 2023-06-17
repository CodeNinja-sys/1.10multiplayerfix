/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.ai;
import a.a.a.a.b.at;
import a.a.a.a.g;
import java.util.Map;

final class ao
implements at,
Map.Entry {
    int a;
    final /* synthetic */ ai b;

    ao(ai ai2, int n2) {
        this.b = ai2;
        this.a = n2;
    }

    ao(ai ai2) {
        this.b = ai2;
    }

    @Override
    public Long a() {
        return this.b.j[this.a];
    }

    @Override
    public long b() {
        return this.b.j[this.a];
    }

    public Object getValue() {
        return this.b.k[this.a];
    }

    public Object setValue(Object object) {
        Object object2 = this.b.k[this.a];
        this.b.k[this.a] = object;
        return object2;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        return this.b.j[this.a] == (Long)entry.getKey() && (this.b.k[this.a] == null ? entry.getValue() == null : this.b.k[this.a].equals(entry.getValue()));
    }

    @Override
    public int hashCode() {
        return g.d(this.b.j[this.a]) ^ (this.b.k[this.a] == null ? 0 : this.b.k[this.a].hashCode());
    }

    public String toString() {
        return this.b.j[this.a] + "=>" + this.b.k[this.a];
    }

    public /* synthetic */ Object getKey() {
        return this.a();
    }
}

