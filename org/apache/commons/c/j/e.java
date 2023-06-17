/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.j;

import java.io.Serializable;
import java.util.Map;
import org.apache.commons.c.a.b;
import org.apache.commons.c.aa;
import org.apache.commons.c.j.a;

public abstract class e
implements Serializable,
Comparable,
Map.Entry {
    private static final long a = 4954918890077093841L;

    public static e b(Object object, Object object2) {
        return new a(object, object2);
    }

    public abstract Object f();

    public abstract Object e();

    public final Object getKey() {
        return this.f();
    }

    public Object getValue() {
        return this.e();
    }

    public int a(e e2) {
        return new b().b(this.f(), e2.f()).b(this.e(), e2.e()).b();
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry)object;
            return aa.b(this.getKey(), entry.getKey()) && aa.b(this.getValue(), entry.getValue());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return (this.getKey() == null ? 0 : this.getKey().hashCode()) ^ (this.getValue() == null ? 0 : this.getValue().hashCode());
    }

    public String toString() {
        return "" + '(' + this.f() + ',' + this.e() + ')';
    }

    public String a(String string) {
        return String.format(string, this.f(), this.e());
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((e)object);
    }
}

