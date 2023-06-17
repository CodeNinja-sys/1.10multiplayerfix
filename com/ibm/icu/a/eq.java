/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.er;
import com.ibm.icu.a.es;
import com.ibm.icu.a.et;
import com.ibm.icu.a.eu;
import com.ibm.icu.a.jd;
import com.ibm.icu.util.az;

public class eq
implements az,
Cloneable,
Comparable {
    protected Object[] a;
    protected boolean b;

    public static er a(Object object, Object object2) {
        return new er(object, object2);
    }

    public static es a(Object object, Object object2, Object object3) {
        return new es(object, object2, object3);
    }

    public static et a(Object object, Object object2, Object object3, Object object4) {
        return new et(object, object2, object3, object4);
    }

    public static eu a(Object object, Object object2, Object object3, Object object4, Object object5) {
        return new eu(object, object2, object3, object4, object5);
    }

    public eq a(Object object) {
        return this.a(0, object);
    }

    public Object a() {
        return this.a[0];
    }

    public eq b(Object object) {
        return this.a(1, object);
    }

    public Object b() {
        return this.a[1];
    }

    public eq c(Object object) {
        return this.a(2, object);
    }

    public Object c() {
        return this.a[2];
    }

    public eq d(Object object) {
        return this.a(3, object);
    }

    public Object d() {
        return this.a[3];
    }

    public eq e(Object object) {
        return this.a(4, object);
    }

    public Object e() {
        return this.a[4];
    }

    protected eq a(int n2, Object object) {
        if (this.b) {
            throw new UnsupportedOperationException("Attempt to modify frozen object");
        }
        this.a[n2] = object;
        return this;
    }

    public int hashCode() {
        int n2 = this.a.length;
        for (Object object : this.a) {
            n2 = n2 * 37 + jd.a(object);
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        try {
            eq eq2 = (eq)object;
            if (this.a.length != eq2.a.length) {
                return false;
            }
            int n2 = 0;
            for (Object object2 : this.a) {
                if (jd.b(object2, eq2.a[n2++])) continue;
                return false;
            }
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    public int compareTo(Object object) {
        eq eq2 = (eq)object;
        int n2 = this.a.length - eq2.a.length;
        if (n2 != 0) {
            return n2;
        }
        int n3 = 0;
        for (Object object2 : this.a) {
            if ((n2 = jd.a((Comparable)object2, (Comparable)eq2.a[n3++])) == 0) continue;
            return n2;
        }
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");
        boolean bl2 = true;
        for (Object object : this.a) {
            if (bl2) {
                bl2 = false;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append(object);
        }
        return stringBuilder.append("]").toString();
    }

    public boolean f() {
        return this.b;
    }

    public eq g() {
        this.b = true;
        return this;
    }

    public Object clone() {
        if (this.b) {
            return this;
        }
        try {
            eq eq2 = (eq)super.clone();
            this.a = (Object[])this.a.clone();
            return eq2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    public eq h() {
        try {
            eq eq2 = (eq)super.clone();
            this.a = (Object[])this.a.clone();
            eq2.b = false;
            return eq2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            return null;
        }
    }

    public /* synthetic */ Object i() {
        return this.h();
    }

    public /* synthetic */ Object j() {
        return this.g();
    }
}

