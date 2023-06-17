/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Callback;
import com.sun.jna.Native;
import com.sun.jna.a;
import com.sun.jna.av;
import com.sun.jna.aw;
import com.sun.jna.ay;
import com.sun.jna.bd;
import com.sun.jna.bu;
import com.sun.jna.d;
import com.sun.jna.f;
import com.sun.jna.g;
import com.sun.jna.h;
import com.sun.jna.j;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

class e
extends WeakReference {
    static final Map a = new WeakHashMap();
    static final Map b = new WeakHashMap();
    private static final Method A;
    private static final Map B;
    ay c;
    d d;
    Method e;
    static Class f;
    static Class g;
    static Class h;
    static Class i;
    static Class j;
    static Class k;
    static Class l;
    static Class m;
    static Class n;
    static Class o;
    static Class p;
    static Class q;
    static Class r;
    static Class s;
    static Class t;
    static Class u;
    static Class v;
    static Class w;
    static Class x;
    static Class y;
    static Class z;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void a(Callback callback, j j2) {
        Map map = a;
        synchronized (map) {
            if (j2 != null) {
                B.put(callback, j2);
            } else {
                B.remove(callback);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static ThreadGroup a(Callback callback, f f2) {
        j j2 = null;
        if (callback instanceof g) {
            callback = ((g)callback).c();
        }
        Object object = B;
        synchronized (object) {
            j2 = (j)B.get(callback);
        }
        object = null;
        if (j2 != null) {
            object = j2.b(callback);
            f2.c = j2.a(callback);
            f2.a = j2.c(callback);
            f2.b = j2.d(callback);
            f2.k();
        }
        return object;
    }

    public static Callback a(Class class_, ay ay2) {
        return com.sun.jna.e.a(class_, ay2, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static Callback a(Class class_, ay ay2, boolean bl2) {
        Map map;
        if (ay2 == null) {
            return null;
        }
        if (!class_.isInterface()) {
            throw new IllegalArgumentException("Callback type must be an interface");
        }
        Map map2 = map = a;
        synchronized (map2) {
            Object object;
            Object object2;
            Object object3;
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                object3 = (Callback)iterator.next();
                if (!class_.isAssignableFrom(object3.getClass()) || !ay2.equals(object2 = (object = (e)map.get(object3)) != null ? ((e)object).a() : com.sun.jna.e.c((Callback)object3))) continue;
                return object3;
            }
            int n2 = (h == null ? (h = com.sun.jna.e.a("com.sun.jna.a")) : h).isAssignableFrom(class_) ? 1 : 0;
            object3 = new HashMap();
            object = Native.c(class_);
            if (object != null) {
                object3.putAll(object);
            }
            object3.put("invoking-method", com.sun.jna.e.c(class_));
            object2 = new h(ay2, n2, (Map)object3);
            Callback callback = (Callback)Proxy.newProxyInstance(class_.getClassLoader(), new Class[]{class_}, (InvocationHandler)object2);
            map.put(callback, null);
            return callback;
        }
    }

    private e(Callback callback, int n2, boolean bl2) {
        super(callback);
        Object object;
        Object object2;
        boolean bl3;
        bu bu2 = Native.d(callback.getClass());
        String string = System.getProperty("os.arch").toLowerCase();
        boolean bl4 = bl3 = "ppc".equals(string) || "powerpc".equals(string);
        if (bl2) {
            object2 = com.sun.jna.e.b(callback);
            object = ((Method)object2).getParameterTypes();
            for (int i2 = 0; i2 < ((Class<?>[])object).length; ++i2) {
                if (bl3 && (object[i2] == Float.TYPE || object[i2] == Double.TYPE)) {
                    bl2 = false;
                    break;
                }
                if (bu2 == null || bu2.a(object[i2]) == null) continue;
                bl2 = false;
                break;
            }
            if (bu2 != null && bu2.b(((Method)object2).getReturnType()) != null) {
                bl2 = false;
            }
        }
        if (bl2) {
            Class<?> class_;
            this.e = com.sun.jna.e.b(callback);
            Class[] arrclass = this.e.getParameterTypes();
            long l2 = Native.createNativeCallback(callback, this.e, arrclass, class_ = this.e.getReturnType(), n2, true);
            this.c = l2 != 0L ? new ay(l2) : null;
        } else {
            this.d = callback instanceof d ? (d)callback : new g(this, com.sun.jna.e.b(callback), bu2);
            Class[] arrclass = this.d.a();
            Class class_ = this.d.b();
            if (bu2 != null) {
                for (int i3 = 0; i3 < arrclass.length; ++i3) {
                    object = bu2.a(arrclass[i3]);
                    if (object == null) continue;
                    arrclass[i3] = object.a();
                }
                object2 = bu2.b(class_);
                if (object2 != null) {
                    class_ = object2.a();
                }
            }
            for (int i4 = 0; i4 < arrclass.length; ++i4) {
                arrclass[i4] = this.b(arrclass[i4]);
                if (com.sun.jna.e.d(arrclass[i4])) continue;
                object = "Callback argument " + arrclass[i4] + " requires custom type conversion";
                throw new IllegalArgumentException((String)object);
            }
            if (!com.sun.jna.e.d(class_ = this.b(class_))) {
                String string2 = "Callback return type " + class_ + " requires custom type conversion";
                throw new IllegalArgumentException(string2);
            }
            long l3 = Native.createNativeCallback(this.d, A, arrclass, class_, n2, false);
            this.c = l3 != 0L ? new ay(l3) : null;
        }
    }

    private Class b(Class class_) {
        if ((i == null ? (i = com.sun.jna.e.a("com.sun.jna.bd")) : i).isAssignableFrom(class_)) {
            bd.a(class_);
            if (!(j == null ? (j = com.sun.jna.e.a("com.sun.jna.bj")) : j).isAssignableFrom(class_)) {
                return k == null ? (k = com.sun.jna.e.a("com.sun.jna.ay")) : k;
            }
        } else {
            if ((l == null ? (l = com.sun.jna.e.a("com.sun.jna.au")) : l).isAssignableFrom(class_)) {
                return av.a(class_).a();
            }
            if (class_ == (m == null ? (m = com.sun.jna.e.a("java.lang.String")) : m) || class_ == (n == null ? (n = com.sun.jna.e.a("com.sun.jna.bw")) : n) || class_ == (o == null ? (o = com.sun.jna.e.a("[Ljava.lang.String;")) : o) || class_ == (p == null ? (p = com.sun.jna.e.a("[Lcom.sun.jna.bw;")) : p) || (q == null ? (q = com.sun.jna.e.a("com.sun.jna.Callback")) : q).isAssignableFrom(class_)) {
                return k == null ? (k = com.sun.jna.e.a("com.sun.jna.ay")) : k;
            }
        }
        return class_;
    }

    private static Method a(Method method) {
        if (method.getParameterTypes().length > 256) {
            String string = "Method signature exceeds the maximum parameter count: " + method;
            throw new UnsupportedOperationException(string);
        }
        return method;
    }

    static Class a(Class class_) {
        if (!(q == null ? (q = com.sun.jna.e.a("com.sun.jna.Callback")) : q).isAssignableFrom(class_)) {
            throw new IllegalArgumentException(class_.getName() + " is not derived from com.sun.jna.Callback");
        }
        if (class_.isInterface()) {
            return class_;
        }
        Class<?>[] arrclass = class_.getInterfaces();
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            if (!(q == null ? com.sun.jna.e.a("com.sun.jna.Callback") : q).isAssignableFrom(arrclass[i2])) continue;
            try {
                com.sun.jna.e.c(arrclass[i2]);
                return arrclass[i2];
            }
            catch (IllegalArgumentException illegalArgumentException) {
                break;
            }
        }
        if ((q == null ? (q = com.sun.jna.e.a("com.sun.jna.Callback")) : q).isAssignableFrom(class_.getSuperclass())) {
            return com.sun.jna.e.a(class_.getSuperclass());
        }
        return class_;
    }

    private static Method b(Callback callback) {
        return com.sun.jna.e.c(com.sun.jna.e.a(callback.getClass()));
    }

    private static Method c(Class class_) {
        Method[] arrmethod = class_.getDeclaredMethods();
        Method[] arrmethod2 = class_.getMethods();
        HashSet<Method> hashSet = new HashSet<Method>(Arrays.asList(arrmethod));
        hashSet.retainAll(Arrays.asList(arrmethod2));
        Method[] arrmethod3 = hashSet.iterator();
        while (arrmethod3.hasNext()) {
            Method method = (Method)arrmethod3.next();
            if (!Callback.b.contains(method.getName())) continue;
            arrmethod3.remove();
        }
        arrmethod3 = hashSet.toArray(new Method[hashSet.size()]);
        if (arrmethod3.length == 1) {
            return com.sun.jna.e.a(arrmethod3[0]);
        }
        for (int i2 = 0; i2 < arrmethod3.length; ++i2) {
            Method method = arrmethod3[i2];
            if (!"callback".equals(method.getName())) continue;
            return com.sun.jna.e.a(method);
        }
        String string = "Callback must implement a single public method, or one public method named 'callback'";
        throw new IllegalArgumentException(string);
    }

    private void a(int n2) {
        this.c.a((long)ay.H, n2);
    }

    public ay a() {
        return this.c.i(0L);
    }

    protected void finalize() {
        this.b();
    }

    protected synchronized void b() {
        if (this.c != null) {
            Native.freeNativeCallback(this.c.J);
            this.c.J = 0L;
            this.c = null;
        }
    }

    private Callback c() {
        return (Callback)this.get();
    }

    private static ay c(Callback callback) {
        InvocationHandler invocationHandler;
        if (Proxy.isProxyClass(callback.getClass()) && (invocationHandler = Proxy.getInvocationHandler(callback)) instanceof h) {
            return ((h)invocationHandler).a();
        }
        return null;
    }

    public static ay a(Callback callback) {
        return com.sun.jna.e.a(callback, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static ay a(Callback callback, boolean bl2) {
        Map map;
        ay ay2 = null;
        if (callback == null) {
            return null;
        }
        ay2 = com.sun.jna.e.c(callback);
        if (ay2 != null) {
            return ay2;
        }
        int n2 = callback instanceof a ? 1 : 0;
        Map map2 = map = a;
        synchronized (map2) {
            e e2 = (e)map.get(callback);
            if (e2 == null) {
                e2 = new e(callback, n2, bl2);
                map.put(callback, e2);
                if (B.containsKey(callback)) {
                    e2.a(1);
                }
            }
            return e2.a();
        }
    }

    private static boolean d(Class class_) {
        return class_ == Void.TYPE || class_ == (s == null ? (s = com.sun.jna.e.a("java.lang.Void")) : s) || class_ == Boolean.TYPE || class_ == (r == null ? (r = com.sun.jna.e.a("java.lang.Boolean")) : r) || class_ == Byte.TYPE || class_ == (t == null ? (t = com.sun.jna.e.a("java.lang.Byte")) : t) || class_ == Short.TYPE || class_ == (u == null ? (u = com.sun.jna.e.a("java.lang.Short")) : u) || class_ == Character.TYPE || class_ == (v == null ? (v = com.sun.jna.e.a("java.lang.Character")) : v) || class_ == Integer.TYPE || class_ == (w == null ? (w = com.sun.jna.e.a("java.lang.Integer")) : w) || class_ == Long.TYPE || class_ == (x == null ? (x = com.sun.jna.e.a("java.lang.Long")) : x) || class_ == Float.TYPE || class_ == (y == null ? (y = com.sun.jna.e.a("java.lang.Float")) : y) || class_ == Double.TYPE || class_ == (z == null ? (z = com.sun.jna.e.a("java.lang.Double")) : z) || (j == null ? (j = com.sun.jna.e.a("com.sun.jna.bj")) : j).isAssignableFrom(class_) && (i == null ? (i = com.sun.jna.e.a("com.sun.jna.bd")) : i).isAssignableFrom(class_) || (k == null ? (k = com.sun.jna.e.a("com.sun.jna.ay")) : k).isAssignableFrom(class_);
    }

    private static ay b(Object object, boolean bl2) {
        if (object != null) {
            aw aw2 = new aw(object.toString(), bl2);
            b.put(object, aw2);
            return aw2.a();
        }
        return null;
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }

    static Callback a(e e2) {
        return e2.c();
    }

    static ay a(Object object, boolean bl2) {
        return com.sun.jna.e.b(object, bl2);
    }

    static {
        try {
            A = (g == null ? (g = com.sun.jna.e.a("com.sun.jna.d")) : g).getMethod("callback", f == null ? (f = com.sun.jna.e.a("[Ljava.lang.Object;")) : f);
        }
        catch (Exception exception) {
            throw new Error("Error looking up CallbackProxy.callback() method");
        }
        B = new WeakHashMap();
    }
}

