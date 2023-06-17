/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.j;

import java.io.Serializable;
import org.apache.commons.c.aa;
import org.apache.commons.c.j.b;

public abstract class f
implements Serializable,
Comparable {
    private static final long a = 1L;

    public static f b(Object object, Object object2, Object object3) {
        return new b(object, object2, object3);
    }

    public abstract Object a();

    public abstract Object b();

    public abstract Object c();

    public int a(f f2) {
        return new org.apache.commons.c.a.b().b(this.a(), f2.a()).b(this.b(), f2.b()).b(this.c(), f2.c()).b();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof f) {
            f f2 = (f)object;
            return aa.b(this.a(), f2.a()) && aa.b(this.b(), f2.b()) && aa.b(this.c(), f2.c());
        }
        return false;
    }

    public int hashCode() {
        return (this.a() == null ? 0 : this.a().hashCode()) ^ (this.b() == null ? 0 : this.b().hashCode()) ^ (this.c() == null ? 0 : this.c().hashCode());
    }

    public String toString() {
        return "" + '(' + this.a() + ',' + this.b() + ',' + this.c() + ')';
    }

    public String a(String string) {
        return String.format(string, this.a(), this.b(), this.c());
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((f)object);
    }
}

