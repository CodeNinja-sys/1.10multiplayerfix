/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a.at;
import java.util.Map;

public class g
implements at {
    protected int a;
    protected Object b;

    public g(Integer n2, Object object) {
        this.a = n2;
        this.b = object;
    }

    public g(int n2, Object object) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public Integer a() {
        return this.a;
    }

    @Override
    public int b() {
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
        if (entry.getKey() == null || !(entry.getKey() instanceof Integer)) {
            return false;
        }
        return this.a == (Integer)entry.getKey() && (this.b == null ? entry.getValue() == null : this.b.equals(entry.getValue()));
    }

    @Override
    public int hashCode() {
        return this.a ^ (this.b == null ? 0 : this.b.hashCode());
    }

    public String toString() {
        return this.a + "->" + this.b;
    }

    public /* synthetic */ Object getKey() {
        return this.a();
    }
}

