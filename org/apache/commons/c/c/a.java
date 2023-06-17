/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.c;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.c.ao;
import org.apache.commons.c.c.b;

public class a
implements Serializable {
    private static final long a = 3593265990380473632L;
    private List b = new CopyOnWriteArrayList();
    private transient Object c;
    private transient Object[] d;

    public static a a(Class class_) {
        return new a(class_);
    }

    public a(Class class_) {
        this(class_, Thread.currentThread().getContextClassLoader());
    }

    public a(Class class_, ClassLoader classLoader) {
        this();
        ao.a((Object)class_, "Listener interface cannot be null.", new Object[0]);
        ao.a((Object)classLoader, "ClassLoader cannot be null.", new Object[0]);
        ao.a(class_.isInterface(), "Class {0} is not an interface", new Object[]{class_.getName()});
        this.a(class_, classLoader);
    }

    private a() {
    }

    public Object a() {
        return this.c;
    }

    public void a(Object object) {
        ao.a(object, "Listener object cannot be null.", new Object[0]);
        this.b.add(object);
    }

    int b() {
        return this.b.size();
    }

    public void b(Object object) {
        ao.a(object, "Listener object cannot be null.", new Object[0]);
        this.b.remove(object);
    }

    public Object[] c() {
        return this.b.toArray(this.d);
    }

    private void a(ObjectOutputStream objectOutputStream) {
        ArrayList arrayList = new ArrayList();
        ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
        for (Object e2 : this.b) {
            try {
                objectOutputStream2.writeObject(e2);
                arrayList.add(e2);
            }
            catch (IOException iOException) {
                objectOutputStream2 = new ObjectOutputStream(new ByteArrayOutputStream());
            }
        }
        objectOutputStream.writeObject(arrayList.toArray(this.d));
    }

    private void a(ObjectInputStream objectInputStream) {
        Object[] arrobject = (Object[])objectInputStream.readObject();
        this.b = new CopyOnWriteArrayList<Object>(arrobject);
        Class<?> class_ = arrobject.getClass().getComponentType();
        this.a(class_, Thread.currentThread().getContextClassLoader());
    }

    private void a(Class class_, ClassLoader classLoader) {
        Object[] arrobject = (Object[])Array.newInstance(class_, 0);
        this.d = arrobject;
        this.b(class_, classLoader);
    }

    private void b(Class class_, ClassLoader classLoader) {
        this.c = class_.cast(Proxy.newProxyInstance(classLoader, new Class[]{class_}, this.d()));
    }

    protected InvocationHandler d() {
        return new b(this);
    }

    static /* synthetic */ List a(a a2) {
        return a2.b;
    }
}

