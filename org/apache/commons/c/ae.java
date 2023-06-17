/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.io.Serializable;
import java.util.Comparator;
import org.apache.commons.c.af;

public final class ae
implements Serializable {
    private static final long a = 1L;
    private final Comparator b;
    private final Object c;
    private final Object d;
    private transient int e;
    private transient String f;

    public static ae a(Comparable comparable) {
        return ae.a(comparable, comparable, null);
    }

    public static ae a(Object object, Comparator comparator) {
        return ae.a(object, object, comparator);
    }

    public static ae a(Comparable comparable, Comparable comparable2) {
        return ae.a(comparable, comparable2, null);
    }

    public static ae a(Object object, Object object2, Comparator comparator) {
        return new ae(object, object2, comparator);
    }

    private ae(Object object, Object object2, Comparator comparator) {
        if (object == null || object2 == null) {
            throw new IllegalArgumentException("Elements in a range must not be null: element1=" + object + ", element2=" + object2);
        }
        this.b = comparator == null ? af.a : comparator;
        if (this.b.compare(object, object2) < 1) {
            this.c = object;
            this.d = object2;
        } else {
            this.c = object2;
            this.d = object;
        }
    }

    public Object a() {
        return this.c;
    }

    public Object b() {
        return this.d;
    }

    public Comparator c() {
        return this.b;
    }

    public boolean d() {
        return this.b == af.a;
    }

    public boolean a(Object object) {
        if (object == null) {
            return false;
        }
        return this.b.compare(object, this.c) > -1 && this.b.compare(object, this.d) < 1;
    }

    public boolean b(Object object) {
        if (object == null) {
            return false;
        }
        return this.b.compare(object, this.c) < 0;
    }

    public boolean c(Object object) {
        if (object == null) {
            return false;
        }
        return this.b.compare(object, this.c) == 0;
    }

    public boolean d(Object object) {
        if (object == null) {
            return false;
        }
        return this.b.compare(object, this.d) == 0;
    }

    public boolean e(Object object) {
        if (object == null) {
            return false;
        }
        return this.b.compare(object, this.d) > 0;
    }

    public int f(Object object) {
        if (object == null) {
            throw new NullPointerException("Element is null");
        }
        if (this.b(object)) {
            return -1;
        }
        if (this.e(object)) {
            return 1;
        }
        return 0;
    }

    public boolean a(ae ae2) {
        if (ae2 == null) {
            return false;
        }
        return this.a(ae2.c) && this.a(ae2.d);
    }

    public boolean b(ae ae2) {
        if (ae2 == null) {
            return false;
        }
        return this.b(ae2.d);
    }

    public boolean c(ae ae2) {
        if (ae2 == null) {
            return false;
        }
        return ae2.a(this.c) || ae2.a(this.d) || this.a(ae2.c);
    }

    public boolean d(ae ae2) {
        if (ae2 == null) {
            return false;
        }
        return this.e(ae2.c);
    }

    public ae e(ae ae2) {
        if (!this.c(ae2)) {
            throw new IllegalArgumentException(String.format("Cannot calculate intersection with non-overlapping range %s", ae2));
        }
        if (this.equals(ae2)) {
            return this;
        }
        Object object = this.c().compare(this.c, ae2.c) < 0 ? ae2.c : this.c;
        Object object2 = this.c().compare(this.d, ae2.d) < 0 ? this.d : ae2.d;
        return ae.a(object, object2, this.c());
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        ae ae2 = (ae)object;
        return this.c.equals(ae2.c) && this.d.equals(ae2.d);
    }

    public int hashCode() {
        int n2 = this.e;
        if (this.e == 0) {
            n2 = 17;
            n2 = 37 * n2 + this.getClass().hashCode();
            n2 = 37 * n2 + this.c.hashCode();
            this.e = n2 = 37 * n2 + this.d.hashCode();
        }
        return n2;
    }

    public String toString() {
        String string = this.f;
        if (string == null) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append('[');
            stringBuilder.append(this.c);
            stringBuilder.append("..");
            stringBuilder.append(this.d);
            stringBuilder.append(']');
            this.f = string = stringBuilder.toString();
        }
        return string;
    }

    public String a(String string) {
        return String.format(string, this.c, this.d, this.b);
    }
}

