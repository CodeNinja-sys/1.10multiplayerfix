/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.at;
import a.a.a.a.b.ax;
import a.a.a.a.g;
import java.util.Map;

public class ay
implements at,
Map.Entry {
    final /* synthetic */ ax a;

    protected ay(ax ax2) {
        this.a = ax2;
    }

    @Override
    public Long a() {
        return this.a.b;
    }

    public Object getValue() {
        return this.a.c;
    }

    @Override
    public long b() {
        return this.a.b;
    }

    public Object setValue(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        if (entry.getKey() == null || !(entry.getKey() instanceof Long)) {
            return false;
        }
        return this.a.b == (Long)entry.getKey() && (this.a.c == null ? entry.getValue() == null : this.a.c.equals(entry.getValue()));
    }

    @Override
    public int hashCode() {
        return g.d(this.a.b) ^ (this.a.c == null ? 0 : this.a.c.hashCode());
    }

    public String toString() {
        return this.a.b + "->" + this.a.c;
    }

    public /* synthetic */ Object getKey() {
        return this.a();
    }
}

