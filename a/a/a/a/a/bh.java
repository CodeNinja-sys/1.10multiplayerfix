/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.at;
import a.a.a.a.a.bb;
import java.util.Map;

final class bh
implements at,
Map.Entry {
    int a;
    final /* synthetic */ bb b;

    bh(bb bb2, int n2) {
        this.b = bb2;
        this.a = n2;
    }

    bh(bb bb2) {
        this.b = bb2;
    }

    @Override
    public Integer a() {
        return this.b.j[this.a];
    }

    @Override
    public int b() {
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
        return this.b.n.a(this.b.j[this.a], (Integer)entry.getKey()) && (this.b.k[this.a] == null ? entry.getValue() == null : this.b.k[this.a].equals(entry.getValue()));
    }

    @Override
    public int hashCode() {
        return this.b.n.a(this.b.j[this.a]) ^ (this.b.k[this.a] == null ? 0 : this.b.k[this.a].hashCode());
    }

    public String toString() {
        return this.b.j[this.a] + "=>" + this.b.k[this.a];
    }

    public /* synthetic */ Object getKey() {
        return this.a();
    }
}

