/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.HashMap;
import java.util.Map;

class ai
extends ObjectInputStream {
    private static final Map a = new HashMap();
    private final ClassLoader b;

    public ai(InputStream inputStream, ClassLoader classLoader) {
        super(inputStream);
        this.b = classLoader;
        a.put("byte", Byte.TYPE);
        a.put("short", Short.TYPE);
        a.put("int", Integer.TYPE);
        a.put("long", Long.TYPE);
        a.put("float", Float.TYPE);
        a.put("double", Double.TYPE);
        a.put("boolean", Boolean.TYPE);
        a.put("char", Character.TYPE);
        a.put("void", Void.TYPE);
    }

    protected Class resolveClass(ObjectStreamClass objectStreamClass) {
        String string = objectStreamClass.getName();
        try {
            return Class.forName(string, false, this.b);
        }
        catch (ClassNotFoundException classNotFoundException) {
            try {
                return Class.forName(string, false, Thread.currentThread().getContextClassLoader());
            }
            catch (ClassNotFoundException classNotFoundException2) {
                Class class_ = (Class)a.get(string);
                if (class_ != null) {
                    return class_;
                }
                throw classNotFoundException2;
            }
        }
    }
}

