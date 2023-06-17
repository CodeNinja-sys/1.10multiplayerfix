/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.j;

import java.io.Serializable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.logging.log4j.core.d.p;
import org.apache.logging.log4j.core.e.a;
import org.apache.logging.log4j.core.e.h;
import org.apache.logging.log4j.core.j.d;
import org.apache.logging.log4j.core.j.e;
import org.apache.logging.log4j.core.k;

public class b
implements e {
    private static final AtomicReference a = new AtomicReference();
    private static final d b;
    private static final org.apache.logging.log4j.d.d c;
    private static final ConcurrentMap d;

    @Override
    public k a(String string, ClassLoader classLoader, boolean bl2) {
        return this.a(string, classLoader, bl2, null);
    }

    @Override
    public k a(String string, ClassLoader classLoader, boolean bl2, URI uRI) {
        boolean bl3;
        Serializable serializable;
        if (bl2) {
            k k2 = (k)org.apache.logging.log4j.core.e.a.a.get();
            if (k2 != null) {
                return k2;
            }
            return this.b();
        }
        if (classLoader != null) {
            return this.a(classLoader, uRI);
        }
        if (h.a()) {
            try {
                serializable = Class.class;
                bl3 = false;
                int n2 = 2;
                while (serializable != null && (serializable = h.a(n2)) != null) {
                    if (((Class)serializable).getName().equals(string)) {
                        bl3 = true;
                    } else if (bl3) break;
                    ++n2;
                }
                if (serializable != null) {
                    return this.a(((Class)serializable).getClassLoader(), uRI);
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (b != null && (serializable = b.a(string)) != null) {
            ClassLoader classLoader2 = ((Class)serializable).getClassLoader() != null ? ((Class)serializable).getClassLoader() : ClassLoader.getSystemClassLoader();
            return this.a(classLoader2, uRI);
        }
        serializable = new Throwable();
        bl3 = false;
        String string2 = null;
        Object object = ((Throwable)serializable).getStackTrace();
        int n3 = ((StackTraceElement[])object).length;
        for (int i2 = 0; i2 < n3; ++i2) {
            StackTraceElement stackTraceElement = object[i2];
            if (stackTraceElement.getClassName().equals(string)) {
                bl3 = true;
                continue;
            }
            if (!bl3) continue;
            string2 = stackTraceElement.getClassName();
            break;
        }
        if (string2 != null) {
            try {
                return this.a(p.a(string2).getClassLoader(), uRI);
            }
            catch (ClassNotFoundException classNotFoundException) {
                // empty catch block
            }
        }
        if ((object = (k)org.apache.logging.log4j.core.e.a.a.get()) != null) {
            return object;
        }
        return this.b();
    }

    @Override
    public void a(k k2) {
        for (Map.Entry entry : d.entrySet()) {
            k k3 = (k)((WeakReference)((AtomicReference)entry.getValue()).get()).get();
            if (k3 != k2) continue;
            d.remove(entry.getKey());
        }
    }

    @Override
    public List a() {
        ArrayList<k> arrayList = new ArrayList<k>();
        Collection collection = d.values();
        for (AtomicReference atomicReference : collection) {
            k k2 = (k)((WeakReference)atomicReference.get()).get();
            if (k2 == null) continue;
            arrayList.add(k2);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private k a(ClassLoader classLoader, URI uRI) {
        String string = classLoader.toString();
        AtomicReference atomicReference = (AtomicReference)d.get(string);
        if (atomicReference == null) {
            Object object;
            Object object2;
            if (uRI == null) {
                for (object2 = classLoader.getParent(); object2 != null; object2 = ((ClassLoader)object2).getParent()) {
                    k k2;
                    atomicReference = (AtomicReference)d.get(object2.toString());
                    if (atomicReference == null || (k2 = (k)((Reference)(object = (WeakReference)atomicReference.get())).get()) == null) continue;
                    return k2;
                }
            }
            object2 = new k(string, null, uRI);
            object = new AtomicReference<WeakReference<Object>>();
            ((AtomicReference)object).set(new WeakReference<Object>(object2));
            d.putIfAbsent(classLoader.toString(), object);
            object2 = (k)((WeakReference)((AtomicReference)d.get(string)).get()).get();
            return object2;
        }
        WeakReference weakReference = (WeakReference)atomicReference.get();
        k k3 = (k)weakReference.get();
        if (k3 != null) {
            if (k3.h() == null && uRI != null) {
                c.a("Setting configuration to {}", new Object[]{uRI});
                k3.a(uRI);
            } else if (k3.h() != null && uRI != null && !k3.h().equals(uRI)) {
                c.f("locateContext called with URI {}. Existing LoggerContext has URI {}", uRI, k3.h());
            }
            return k3;
        }
        k3 = new k(string, null, uRI);
        atomicReference.compareAndSet(weakReference, new WeakReference<k>(k3));
        return k3;
    }

    private k b() {
        k k2 = (k)a.get();
        if (k2 != null) {
            return k2;
        }
        a.compareAndSet(null, new k("Default"));
        return (k)a.get();
    }

    static {
        c = org.apache.logging.log4j.d.d.k();
        d = new ConcurrentHashMap();
        if (h.a()) {
            b = null;
        } else {
            d d2;
            try {
                d2 = new d(null);
                if (d2.a(b.class.getName()) == null) {
                    d2 = null;
                    c.b("Unable to obtain call stack from security manager.");
                }
            }
            catch (Exception exception) {
                d2 = null;
                c.a("Unable to install security manager", (Throwable)exception);
            }
            b = d2;
        }
    }
}

