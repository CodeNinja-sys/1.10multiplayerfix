/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.FromNativeConverter;
import com.sun.jna.ToNativeConverter;
import com.sun.jna.bt;
import com.sun.jna.bu;
import com.sun.jna.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class k
implements bu {
    private List i = new ArrayList();
    private List j = new ArrayList();
    static Class a;
    static Class b;
    static Class c;
    static Class d;
    static Class e;
    static Class f;
    static Class g;
    static Class h;

    private Class c(Class class_) {
        if (class_ == (a == null ? (a = k.a("java.lang.Boolean")) : a)) {
            return Boolean.TYPE;
        }
        if (class_ == Boolean.TYPE) {
            return a == null ? (a = k.a("java.lang.Boolean")) : a;
        }
        if (class_ == (b == null ? (b = k.a("java.lang.Byte")) : b)) {
            return Byte.TYPE;
        }
        if (class_ == Byte.TYPE) {
            return b == null ? (b = k.a("java.lang.Byte")) : b;
        }
        if (class_ == (c == null ? (c = k.a("java.lang.Character")) : c)) {
            return Character.TYPE;
        }
        if (class_ == Character.TYPE) {
            return c == null ? (c = k.a("java.lang.Character")) : c;
        }
        if (class_ == (d == null ? (d = k.a("java.lang.Short")) : d)) {
            return Short.TYPE;
        }
        if (class_ == Short.TYPE) {
            return d == null ? (d = k.a("java.lang.Short")) : d;
        }
        if (class_ == (e == null ? (e = k.a("java.lang.Integer")) : e)) {
            return Integer.TYPE;
        }
        if (class_ == Integer.TYPE) {
            return e == null ? (e = k.a("java.lang.Integer")) : e;
        }
        if (class_ == (f == null ? (f = k.a("java.lang.Long")) : f)) {
            return Long.TYPE;
        }
        if (class_ == Long.TYPE) {
            return f == null ? (f = k.a("java.lang.Long")) : f;
        }
        if (class_ == (g == null ? (g = k.a("java.lang.Float")) : g)) {
            return Float.TYPE;
        }
        if (class_ == Float.TYPE) {
            return g == null ? (g = k.a("java.lang.Float")) : g;
        }
        if (class_ == (h == null ? (h = k.a("java.lang.Double")) : h)) {
            return Double.TYPE;
        }
        if (class_ == Double.TYPE) {
            return h == null ? (h = k.a("java.lang.Double")) : h;
        }
        return null;
    }

    public void a(Class class_, ToNativeConverter toNativeConverter) {
        this.i.add(new l(class_, toNativeConverter));
        Class class_2 = this.c(class_);
        if (class_2 != null) {
            this.i.add(new l(class_2, toNativeConverter));
        }
    }

    public void a(Class class_, FromNativeConverter fromNativeConverter) {
        this.j.add(new l(class_, fromNativeConverter));
        Class class_2 = this.c(class_);
        if (class_2 != null) {
            this.j.add(new l(class_2, fromNativeConverter));
        }
    }

    protected void a(Class class_, bt bt2) {
        this.a(class_, (FromNativeConverter)bt2);
        this.a(class_, (ToNativeConverter)bt2);
    }

    private Object a(Class class_, List list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            l l2 = (l)iterator.next();
            if (!l2.a.isAssignableFrom(class_)) continue;
            return l2.b;
        }
        return null;
    }

    public FromNativeConverter a(Class class_) {
        return (FromNativeConverter)this.a(class_, this.j);
    }

    public ToNativeConverter b(Class class_) {
        return (ToNativeConverter)this.a(class_, this.i);
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

