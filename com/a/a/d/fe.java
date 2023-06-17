/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.a;
import com.a.a.d.agm;
import com.a.a.d.fd;
import com.a.a.d.sz;
import com.a.a.d.zz;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public final class fe
extends a {
    private transient Class b;
    private static final long c = 0L;

    public static fe a(Class class_) {
        return new fe(class_);
    }

    public static fe a(Map map) {
        fe fe2 = fe.a(fd.b(map));
        fe2.putAll(map);
        return fe2;
    }

    private fe(Class class_) {
        super((Map)agm.a(new EnumMap(class_)), sz.a(((Enum[])class_.getEnumConstants()).length));
        this.b = class_;
    }

    Enum a(Enum enum_) {
        return (Enum)cl.a(enum_);
    }

    public Object a(Enum enum_, Object object) {
        return super.put(enum_, object);
    }

    public Object b(Enum enum_, Object object) {
        return super.a(enum_, object);
    }

    public Class d() {
        return this.b;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.b);
        zz.a((Map)this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.b = (Class)objectInputStream.readObject();
        this.a(agm.a(new EnumMap(this.b)), new HashMap(((Enum[])this.b.getEnumConstants()).length * 3 / 2));
        zz.a((Map)this, objectInputStream);
    }

    @Override
    public /* synthetic */ Object a(Object object, Object object2) {
        return this.b((Enum)object, object2);
    }

    @Override
    public /* synthetic */ Object put(Object object, Object object2) {
        return this.a((Enum)object, object2);
    }
}

