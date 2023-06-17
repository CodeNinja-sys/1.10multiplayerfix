/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.agm;
import com.a.a.d.ai;
import com.a.a.d.mq;
import com.a.a.d.xc;
import com.a.a.d.zz;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.EnumMap;
import java.util.Iterator;

public final class ff
extends ai {
    private transient Class a;
    private static final long b = 0L;

    public static ff a(Class class_) {
        return new ff(class_);
    }

    public static ff a(Iterable iterable) {
        Iterator iterator = iterable.iterator();
        cl.a(iterator.hasNext(), (Object)"EnumMultiset constructor passed empty Iterable");
        ff ff2 = new ff(((Enum)iterator.next()).getDeclaringClass());
        mq.a(ff2, iterable);
        return ff2;
    }

    public static ff a(Iterable iterable, Class class_) {
        ff ff2 = ff.a(class_);
        mq.a(ff2, iterable);
        return ff2;
    }

    private ff(Class class_) {
        super(agm.a(new EnumMap(class_)));
        this.a = class_;
    }

    private void a(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.a);
        zz.a((xc)this, objectOutputStream);
    }

    private void a(ObjectInputStream objectInputStream) {
        Class class_;
        objectInputStream.defaultReadObject();
        this.a = class_ = (Class)objectInputStream.readObject();
        this.a(agm.a(new EnumMap(this.a)));
        zz.a((xc)this, objectInputStream);
    }
}

