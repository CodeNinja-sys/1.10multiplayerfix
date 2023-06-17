/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b.a;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class a
implements Runnable {
    private static final Logger a = Logger.getLogger(a.class.getName());
    private static final String b = "com.google.common.base.FinalizableReference";
    private final WeakReference c;
    private final PhantomReference d;
    private final ReferenceQueue e;
    private static final Field f = com.a.a.b.a.a.a();

    public static void a(Class class_, ReferenceQueue referenceQueue, PhantomReference phantomReference) {
        if (!class_.getName().equals(b)) {
            throw new IllegalArgumentException("Expected com.google.common.base.FinalizableReference.");
        }
        a a2 = new a(class_, referenceQueue, phantomReference);
        Thread thread = new Thread(a2);
        thread.setName(a.class.getName());
        thread.setDaemon(true);
        try {
            if (f != null) {
                f.set(thread, null);
            }
        }
        catch (Throwable throwable) {
            a.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", throwable);
        }
        thread.start();
    }

    private a(Class class_, ReferenceQueue referenceQueue, PhantomReference phantomReference) {
        this.e = referenceQueue;
        this.c = new WeakReference<Class>(class_);
        this.d = phantomReference;
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (this.a(this.e.remove())) {
                }
            }
            catch (InterruptedException interruptedException) {
                continue;
            }
            break;
        }
    }

    private boolean a(Reference reference) {
        Method method = this.b();
        if (method == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.d) {
                return false;
            }
            try {
                method.invoke(reference, new Object[0]);
            }
            catch (Throwable throwable) {
                a.log(Level.SEVERE, "Error cleaning up after reference.", throwable);
            }
        } while ((reference = this.e.poll()) != null);
        return true;
    }

    private Method b() {
        Class class_ = (Class)this.c.get();
        if (class_ == null) {
            return null;
        }
        try {
            return class_.getMethod("finalizeReferent", new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new AssertionError((Object)noSuchMethodException);
        }
    }

    public static Field a() {
        try {
            Field field = Thread.class.getDeclaredField("inheritableThreadLocals");
            field.setAccessible(true);
            return field;
        }
        catch (Throwable throwable) {
            a.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals. Reference finalizer threads will inherit thread local values.");
            return null;
        }
    }
}

