/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.a;
import com.a.a.d.agm;
import com.a.a.d.fe;
import com.a.a.d.zz;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.EnumMap;
import java.util.Map;

public final class fd
extends a {
    private transient Class b;
    private transient Class c;
    private static final long d = 0L;

    public static fd a(Class class_, Class class_2) {
        return new fd(class_, class_2);
    }

    public static fd a(Map map) {
        fd fd2 = fd.a(fd.b(map), fd.d(map));
        fd2.putAll(map);
        return fd2;
    }

    private fd(Class class_, Class class_2) {
        super((Map)agm.a(new EnumMap(class_)), agm.a(new EnumMap(class_2)));
        this.b = class_;
        this.c = class_2;
    }

    static Class b(Map map) {
        if (map instanceof fd) {
            return ((fd)map).d();
        }
        if (map instanceof fe) {
            return ((fe)map).d();
        }
        cl.a(!map.isEmpty());
        return ((Enum)map.keySet().iterator().next()).getDeclaringClass();
    }

    private static Class d(Map map) {
        if (map instanceof fd) {
            return ((fd)map).c;
        }
        cl.a(!map.isEmpty());
        return ((Enum)map.values().iterator().next()).getDeclaringClass();
    }

    public Class d() {
        return this.b;
    }

    public Class e() {
        return this.c;
    }

    Enum a(Enum enum_) {
        return (Enum)cl.a(enum_);
    }

    Enum b(Enum enum_) {
        return (Enum)cl.a(enum_);
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.b);
        objectOutputStream.writeObject(this.c);
        zz.a((Map)this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.b = (Class)objectInputStream.readObject();
        this.c = (Class)objectInputStream.readObject();
        this.a(agm.a(new EnumMap(this.b)), agm.a(new EnumMap(this.c)));
        zz.a((Map)this, objectInputStream);
    }
}

