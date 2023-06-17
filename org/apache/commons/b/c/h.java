/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.c;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Proxy;

public class h
extends ObjectInputStream {
    private final ClassLoader a;

    public h(ClassLoader classLoader, InputStream inputStream) {
        super(inputStream);
        this.a = classLoader;
    }

    protected Class resolveClass(ObjectStreamClass objectStreamClass) {
        Class<?> class_ = Class.forName(objectStreamClass.getName(), false, this.a);
        if (class_ != null) {
            return class_;
        }
        return super.resolveClass(objectStreamClass);
    }

    protected Class resolveProxyClass(String[] arrstring) {
        Class[] arrclass = new Class[arrstring.length];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            arrclass[i2] = Class.forName(arrstring[i2], false, this.a);
        }
        try {
            return Proxy.getProxyClass(this.a, arrclass);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return super.resolveProxyClass(arrstring);
        }
    }
}

