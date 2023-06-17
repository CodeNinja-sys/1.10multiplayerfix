/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.au;
import com.sun.jna.bs;
import com.sun.jna.bt;
import com.sun.jna.m;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.WeakHashMap;

public class av
implements bt {
    private static final Map c = new WeakHashMap();
    private final Class d;
    private final Class e;
    private final au f;
    static Class a;
    static Class b;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static av a(Class class_) {
        Map map = c;
        synchronized (map) {
            av av2;
            Reference reference = (Reference)c.get(class_);
            av av3 = av2 = reference != null ? (av)reference.get() : null;
            if (av2 == null) {
                av2 = new av(class_);
                c.put(class_, new SoftReference<av>(av2));
            }
            return av2;
        }
    }

    public av(Class class_) {
        if (!(a == null ? (a = av.a("com.sun.jna.au")) : a).isAssignableFrom(class_)) {
            throw new IllegalArgumentException("Type must derive from " + (a == null ? (a = av.a("com.sun.jna.au")) : a));
        }
        this.d = class_;
        this.f = this.b();
        this.e = this.f.b();
    }

    public au b() {
        try {
            return (au)this.d.newInstance();
        }
        catch (InstantiationException instantiationException) {
            String string = "Can't create an instance of " + this.d + ", requires a no-arg constructor: " + instantiationException;
            throw new IllegalArgumentException(string);
        }
        catch (IllegalAccessException illegalAccessException) {
            String string = "Not allowed to create an instance of " + this.d + ", requires a public, no-arg constructor: " + illegalAccessException;
            throw new IllegalArgumentException(string);
        }
    }

    public Object a(Object object, m m2) {
        return this.f.a(object, m2);
    }

    public Class a() {
        return this.e;
    }

    public Object a(Object object, bs bs2) {
        if (object == null) {
            if ((b == null ? (b = av.a("com.sun.jna.ay")) : b).isAssignableFrom(this.e)) {
                return null;
            }
            object = this.b();
        }
        return ((au)object).a();
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

