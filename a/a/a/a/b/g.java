/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.b.at;
import java.util.Map;

public class g
implements at {
    protected long a;
    protected Object b;

    public g(Long l2, Object object) {
        this.a = l2;
        this.b = object;
    }

    public g(long l2, Object object) {
        this.a = l2;
        this.b = object;
    }

    @Override
    public Long a() {
        return this.a;
    }

    @Override
    public long b() {
        return this.a;
    }

    public Object getValue() {
        return this.b;
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
        return this.a == (Long)entry.getKey() && (this.b == null ? entry.getValue() == null : this.b.equals(entry.getValue()));
    }

    @Override
    public int hashCode() {
        return a.a.a.a.g.d(this.a) ^ (this.b == null ? 0 : this.b.hashCode());
    }

    public String toString() {
        return this.a + "->" + this.b;
    }

    public /* synthetic */ Object getKey() {
        return this.a();
    }
}

