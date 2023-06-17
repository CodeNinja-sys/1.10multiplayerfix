/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.aab;
import com.a.a.d.vi;
import com.a.a.d.xc;
import com.a.a.d.xd;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.Map;

final class zz {
    private zz() {
    }

    static int a(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    static void a(Map map, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    static void a(Map map, ObjectInputStream objectInputStream) {
        int n2 = objectInputStream.readInt();
        zz.a(map, objectInputStream, n2);
    }

    static void a(Map map, ObjectInputStream objectInputStream, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            Object object2 = objectInputStream.readObject();
            map.put(object, object2);
        }
    }

    static void a(xc xc2, ObjectOutputStream objectOutputStream) {
        int n2 = xc2.aS_().size();
        objectOutputStream.writeInt(n2);
        for (xd xd2 : xc2.aS_()) {
            objectOutputStream.writeObject(xd2.a());
            objectOutputStream.writeInt(xd2.b());
        }
    }

    static void a(xc xc2, ObjectInputStream objectInputStream) {
        int n2 = objectInputStream.readInt();
        zz.a(xc2, objectInputStream, n2);
    }

    static void a(xc xc2, ObjectInputStream objectInputStream, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            int n3 = objectInputStream.readInt();
            xc2.a(object, n3);
        }
    }

    static void a(vi vi2, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(vi2.c().size());
        for (Map.Entry entry : vi2.c().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection)entry.getValue()).size());
            for (Object e2 : (Collection)entry.getValue()) {
                objectOutputStream.writeObject(e2);
            }
        }
    }

    static void a(vi vi2, ObjectInputStream objectInputStream) {
        int n2 = objectInputStream.readInt();
        zz.a(vi2, objectInputStream, n2);
    }

    static void a(vi vi2, ObjectInputStream objectInputStream, int n2) {
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = objectInputStream.readObject();
            Collection collection = vi2.c(object);
            int n3 = objectInputStream.readInt();
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object2 = objectInputStream.readObject();
                collection.add(object2);
            }
        }
    }

    static aab a(Class class_, String string) {
        try {
            Field field = class_.getDeclaredField(string);
            return new aab(field, null);
        }
        catch (NoSuchFieldException noSuchFieldException) {
            throw new AssertionError((Object)noSuchFieldException);
        }
    }
}

