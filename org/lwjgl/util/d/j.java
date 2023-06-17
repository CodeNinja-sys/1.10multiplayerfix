/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.d;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLClassLoader;
import org.lwjgl.util.d.d;
import org.lwjgl.util.d.i;
import org.lwjgl.util.d.k;

public class j
extends URLClassLoader {
    static final String a = j.class.getPackage().getName() + ".";
    static boolean b;
    private static long c;

    public static boolean a(Class class_, String[] arrstring) {
        if (b) {
            return false;
        }
        b = true;
        try {
            j j2 = new j(class_);
            j2.a();
            Class<?> class_2 = j2.loadClass(class_.getName());
            Method method = class_2.getMethod("main", String[].class);
            method.invoke(null, new Object[]{arrstring});
        }
        catch (InvocationTargetException invocationTargetException) {
            Thread.currentThread().getUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), invocationTargetException.getCause());
        }
        catch (Throwable throwable) {
            throw new Error("failed to fork", throwable);
        }
        return true;
    }

    private j(Class class_) {
        super(((URLClassLoader)class_.getClassLoader()).getURLs());
    }

    protected synchronized Class a() {
        String string = i.class.getName();
        String string2 = string.replace('.', '/');
        byte[] arrby = j.a(this.getResourceAsStream(string2.concat(".class")));
        long l2 = System.nanoTime();
        arrby = k.a(arrby);
        long l3 = System.nanoTime();
        c += l3 - l2;
        if (k.a) {
            j.a(string2, l2, l3);
        }
        Class<?> class_ = super.defineClass(string, arrby, 0, arrby.length);
        this.resolveClass(class_);
        return class_;
    }

    protected synchronized Class loadClass(String string, boolean bl2) {
        if (string.startsWith("java.") || string.startsWith("javax.") || string.startsWith("sun.") || string.startsWith("sunw.") || string.startsWith("org.objectweb.asm.")) {
            return super.loadClass(string, bl2);
        }
        String string2 = string.replace('.', '/');
        boolean bl3 = string.startsWith(a);
        if (bl3 && (string.equals(j.class.getName()) || string.equals(k.class.getName()) || string.equals(d.class.getName()))) {
            return super.loadClass(string, bl2);
        }
        byte[] arrby = j.a(this.getResourceAsStream(string2.concat(".class")));
        if (!bl3 || string.substring(a.length()).indexOf(46) != -1) {
            long l2 = System.nanoTime();
            byte[] arrby2 = k.a(string2, arrby);
            long l3 = System.nanoTime();
            c += l3 - l2;
            if (arrby != arrby2) {
                arrby = arrby2;
                if (k.a) {
                    j.a(string2, l2, l3);
                }
            }
        }
        Class<?> class_ = super.defineClass(string, arrby, 0, arrby.length);
        if (bl2) {
            this.resolveClass(class_);
        }
        return class_;
    }

    private static void a(String string, long l2, long l3) {
        StringBuilder stringBuilder = new StringBuilder(j.class.getSimpleName() + ": " + string);
        if (k.b) {
            stringBuilder.append("\n\ttransforming took " + (l3 - l2) / 1000L + " micros (total: " + c / 1000L / 1000L + "ms)");
        }
        org.lwjgl.d.a(stringBuilder);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private static byte[] a(InputStream inputStream) {
        byte[] arrby = new byte[256];
        int n2 = 0;
        while (true) {
            int n3;
            if (arrby.length == n2) {
                arrby = j.a(arrby, n2 * 2);
            }
            if ((n3 = inputStream.read(arrby, n2, arrby.length - n2)) == -1) break;
            n2 += n3;
        }
        try {
            inputStream.close();
            return j.a(arrby, n2);
        }
        catch (IOException iOException) {
            return j.a(arrby, n2);
        }
        catch (IOException iOException) {
            try {
                inputStream.close();
                return j.a(arrby, n2);
            }
            catch (IOException iOException2) {
                return j.a(arrby, n2);
            }
            catch (Throwable throwable) {
                try {
                    inputStream.close();
                    throw throwable;
                }
                catch (IOException iOException3) {
                    // empty catch block
                }
                throw throwable;
            }
        }
    }

    private static byte[] a(byte[] arrby, int n2) {
        byte[] arrby2 = new byte[n2];
        System.arraycopy(arrby, 0, arrby2, 0, Math.min(arrby.length, n2));
        return arrby2;
    }
}

