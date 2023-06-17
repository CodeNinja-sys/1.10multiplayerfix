/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.ae;
import io.netty.util.c.am;
import io.netty.util.c.an;
import io.netty.util.c.ao;
import io.netty.util.c.b;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.w;
import io.netty.util.c.x;
import io.netty.util.c.y;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

final class v {
    private static final g a;
    private static final Unsafe b;
    private static final boolean c;
    private static final long d;
    private static final long e = 0x100000L;
    private static final boolean f;

    static boolean a() {
        return b != null;
    }

    static void a(Throwable throwable) {
        b.throwException(throwable);
    }

    static void a(ByteBuffer byteBuffer) {
        io.netty.util.c.b.a(byteBuffer);
    }

    static long b(ByteBuffer byteBuffer) {
        return v.d(byteBuffer, d);
    }

    static long b() {
        return b.arrayBaseOffset(byte[].class);
    }

    static Object a(Object object, long l2) {
        return b.getObject(object, l2);
    }

    static Object b(Object object, long l2) {
        return b.getObjectVolatile(object, l2);
    }

    static int c(Object object, long l2) {
        return b.getInt(object, l2);
    }

    private static long d(Object object, long l2) {
        return b.getLong(object, l2);
    }

    static long a(Field field) {
        return b.objectFieldOffset(field);
    }

    static byte a(long l2) {
        return b.getByte(l2);
    }

    static short b(long l2) {
        if (f) {
            return b.getShort(l2);
        }
        if (c) {
            return (short)(v.a(l2) << 8 | v.a(l2 + 1L) & 0xFF);
        }
        return (short)(v.a(l2 + 1L) << 8 | v.a(l2) & 0xFF);
    }

    static int c(long l2) {
        if (f) {
            return b.getInt(l2);
        }
        if (c) {
            return v.a(l2) << 24 | (v.a(l2 + 1L) & 0xFF) << 16 | (v.a(l2 + 2L) & 0xFF) << 8 | v.a(l2 + 3L) & 0xFF;
        }
        return v.a(l2 + 3L) << 24 | (v.a(l2 + 2L) & 0xFF) << 16 | (v.a(l2 + 1L) & 0xFF) << 8 | v.a(l2) & 0xFF;
    }

    static long d(long l2) {
        if (f) {
            return b.getLong(l2);
        }
        if (c) {
            return (long)v.a(l2) << 56 | ((long)v.a(l2 + 1L) & 0xFFL) << 48 | ((long)v.a(l2 + 2L) & 0xFFL) << 40 | ((long)v.a(l2 + 3L) & 0xFFL) << 32 | ((long)v.a(l2 + 4L) & 0xFFL) << 24 | ((long)v.a(l2 + 5L) & 0xFFL) << 16 | ((long)v.a(l2 + 6L) & 0xFFL) << 8 | (long)v.a(l2 + 7L) & 0xFFL;
        }
        return (long)v.a(l2 + 7L) << 56 | ((long)v.a(l2 + 6L) & 0xFFL) << 48 | ((long)v.a(l2 + 5L) & 0xFFL) << 40 | ((long)v.a(l2 + 4L) & 0xFFL) << 32 | ((long)v.a(l2 + 3L) & 0xFFL) << 24 | ((long)v.a(l2 + 2L) & 0xFFL) << 16 | ((long)v.a(l2 + 1L) & 0xFFL) << 8 | (long)v.a(l2) & 0xFFL;
    }

    static void a(Object object, long l2, Object object2) {
        b.putOrderedObject(object, l2, object2);
    }

    static void a(long l2, byte by2) {
        b.putByte(l2, by2);
    }

    static void a(long l2, short s2) {
        if (f) {
            b.putShort(l2, s2);
        } else if (c) {
            v.a(l2, (byte)(s2 >>> 8));
            v.a(l2 + 1L, (byte)s2);
        } else {
            v.a(l2 + 1L, (byte)(s2 >>> 8));
            v.a(l2, (byte)s2);
        }
    }

    static void a(long l2, int n2) {
        if (f) {
            b.putInt(l2, n2);
        } else if (c) {
            v.a(l2, (byte)(n2 >>> 24));
            v.a(l2 + 1L, (byte)(n2 >>> 16));
            v.a(l2 + 2L, (byte)(n2 >>> 8));
            v.a(l2 + 3L, (byte)n2);
        } else {
            v.a(l2 + 3L, (byte)(n2 >>> 24));
            v.a(l2 + 2L, (byte)(n2 >>> 16));
            v.a(l2 + 1L, (byte)(n2 >>> 8));
            v.a(l2, (byte)n2);
        }
    }

    static void a(long l2, long l3) {
        if (f) {
            b.putLong(l2, l3);
        } else if (c) {
            v.a(l2, (byte)(l3 >>> 56));
            v.a(l2 + 1L, (byte)(l3 >>> 48));
            v.a(l2 + 2L, (byte)(l3 >>> 40));
            v.a(l2 + 3L, (byte)(l3 >>> 32));
            v.a(l2 + 4L, (byte)(l3 >>> 24));
            v.a(l2 + 5L, (byte)(l3 >>> 16));
            v.a(l2 + 6L, (byte)(l3 >>> 8));
            v.a(l2 + 7L, (byte)l3);
        } else {
            v.a(l2 + 7L, (byte)(l3 >>> 56));
            v.a(l2 + 6L, (byte)(l3 >>> 48));
            v.a(l2 + 5L, (byte)(l3 >>> 40));
            v.a(l2 + 4L, (byte)(l3 >>> 32));
            v.a(l2 + 3L, (byte)(l3 >>> 24));
            v.a(l2 + 2L, (byte)(l3 >>> 16));
            v.a(l2 + 1L, (byte)(l3 >>> 8));
            v.a(l2, (byte)l3);
        }
    }

    static void a(long l2, long l3, long l4) {
        while (l4 > 0L) {
            long l5 = Math.min(l4, 0x100000L);
            b.copyMemory(l2, l3, l5);
            l4 -= l5;
            l2 += l5;
            l3 += l5;
        }
    }

    static void a(Object object, long l2, Object object2, long l3, long l4) {
        while (l4 > 0L) {
            long l5 = Math.min(l4, 0x100000L);
            b.copyMemory(object, l2, object2, l3, l5);
            l4 -= l5;
            l2 += l5;
            l3 += l5;
        }
    }

    static AtomicReferenceFieldUpdater a(Class class_, String string) {
        return new ao(b, class_, string);
    }

    static AtomicIntegerFieldUpdater b(Class class_, String string) {
        return new am(b, class_, string);
    }

    static AtomicLongFieldUpdater c(Class class_, String string) {
        return new an(b, class_, string);
    }

    static ClassLoader a(Class class_) {
        if (System.getSecurityManager() == null) {
            return class_.getClassLoader();
        }
        return (ClassLoader)AccessController.doPrivileged(new w(class_));
    }

    static ClassLoader c() {
        if (System.getSecurityManager() == null) {
            return Thread.currentThread().getContextClassLoader();
        }
        return (ClassLoader)AccessController.doPrivileged(new x());
    }

    static ClassLoader d() {
        if (System.getSecurityManager() == null) {
            return ClassLoader.getSystemClassLoader();
        }
        return (ClassLoader)AccessController.doPrivileged(new y());
    }

    static int e() {
        return b.addressSize();
    }

    static long e(long l2) {
        return b.allocateMemory(l2);
    }

    static void f(long l2) {
        b.freeMemory(l2);
    }

    private v() {
    }

    static {
        Unsafe unsafe;
        Field field;
        a = h.a(v.class);
        c = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(1);
        try {
            field = Buffer.class.getDeclaredField("address");
            field.setAccessible(true);
            if (field.getLong(ByteBuffer.allocate(1)) != 0L) {
                field = null;
            } else if (field.getLong(byteBuffer) == 0L) {
                field = null;
            }
        }
        catch (Throwable throwable) {
            field = null;
        }
        a.b("java.nio.Buffer.address: {}", (Object)(field != null ? "available" : "unavailable"));
        if (field != null) {
            try {
                Field field2 = Unsafe.class.getDeclaredField("theUnsafe");
                field2.setAccessible(true);
                unsafe = (Unsafe)field2.get(null);
                a.b("sun.misc.Unsafe.theUnsafe: {}", (Object)(unsafe != null ? "available" : "unavailable"));
                try {
                    if (unsafe != null) {
                        unsafe.getClass().getDeclaredMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
                        a.b("sun.misc.Unsafe.copyMemory: available");
                    }
                }
                catch (NoSuchMethodError noSuchMethodError) {
                    a.b("sun.misc.Unsafe.copyMemory: unavailable");
                    throw noSuchMethodError;
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    a.b("sun.misc.Unsafe.copyMemory: unavailable");
                    throw noSuchMethodException;
                }
            }
            catch (Throwable throwable) {
                unsafe = null;
            }
        } else {
            unsafe = null;
        }
        b = unsafe;
        if (unsafe == null) {
            d = -1L;
            f = false;
        } else {
            boolean bl2;
            d = v.a(field);
            try {
                Class<?> class_ = Class.forName("java.nio.Bits", false, ClassLoader.getSystemClassLoader());
                Method method = class_.getDeclaredMethod("unaligned", new Class[0]);
                method.setAccessible(true);
                bl2 = Boolean.TRUE.equals(method.invoke(null, new Object[0]));
            }
            catch (Throwable throwable) {
                String string = ae.a("os.arch", "");
                bl2 = string.matches("^(i[3-6]86|x86(_64)?|x64|amd64)$");
            }
            f = bl2;
            a.b("java.nio.Bits.unaligned: {}", (Object)f);
        }
    }
}

