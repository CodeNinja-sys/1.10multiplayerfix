/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util;

import io.netty.util.aa;
import io.netty.util.ac;
import io.netty.util.c.ad;
import io.netty.util.c.ae;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import io.netty.util.c.u;
import java.lang.ref.ReferenceQueue;
import java.util.EnumSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ab {
    private static final String a = "io.netty.leakDetectionLevel";
    private static final io.netty.util.ad b;
    private static io.netty.util.ad c;
    private static final g d;
    private static final int e = 113;
    private final ac f = new ac(this, (Object)null);
    private final ac g = new ac(this, (Object)null);
    private final ReferenceQueue h = new ReferenceQueue();
    private final ConcurrentMap i = u.m();
    private final String j;
    private final int k;
    private final long l;
    private long m;
    private final AtomicBoolean n = new AtomicBoolean();
    private long o;
    private static final String[] p;

    public static void a(boolean bl2) {
        ab.a(bl2 ? io.netty.util.ad.b : io.netty.util.ad.a);
    }

    public static boolean a() {
        return ab.b().ordinal() > io.netty.util.ad.a.ordinal();
    }

    public static void a(io.netty.util.ad ad2) {
        if (ad2 == null) {
            throw new NullPointerException("level");
        }
        c = ad2;
    }

    public static io.netty.util.ad b() {
        return c;
    }

    public ab(Class class_) {
        this(ad.a(class_));
    }

    public ab(String string) {
        this(string, 113, Long.MAX_VALUE);
    }

    public ab(Class class_, int n2, long l2) {
        this(ad.a(class_), n2, l2);
    }

    public ab(String string, int n2, long l2) {
        if (string == null) {
            throw new NullPointerException("resourceType");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("samplingInterval: " + n2 + " (expected: 1+)");
        }
        if (l2 <= 0L) {
            throw new IllegalArgumentException("maxActive: " + l2 + " (expected: 1+)");
        }
        this.j = string;
        this.k = n2;
        this.l = l2;
        ac.a(this.f, this.g);
        ac.b(this.g, this.f);
    }

    public aa a(Object object) {
        io.netty.util.ad ad2 = c;
        if (ad2 == io.netty.util.ad.a) {
            return null;
        }
        if (ad2.ordinal() < io.netty.util.ad.d.ordinal()) {
            if (this.o++ % (long)this.k == 0L) {
                this.b(ad2);
                return new ac(this, object);
            }
            return null;
        }
        this.b(ad2);
        return new ac(this, object);
    }

    private void b(io.netty.util.ad ad2) {
        ac ac2;
        int n2;
        if (!d.g()) {
            ac ac3;
            while ((ac3 = (ac)this.h.poll()) != null) {
                ac3.b();
            }
            return;
        }
        int n3 = n2 = ad2 == io.netty.util.ad.d ? 1 : this.k;
        if (this.m * (long)n2 > this.l && this.n.compareAndSet(false, true)) {
            d.e("LEAK: You are creating too many " + this.j + " instances.  " + this.j + " is a shared resource that must be reused across the JVM," + "so that only a few instances are created.");
        }
        while ((ac2 = (ac)this.h.poll()) != null) {
            String string;
            ac2.clear();
            if (!ac2.b() || this.i.putIfAbsent(string = ac2.toString(), Boolean.TRUE) != null) continue;
            if (string.isEmpty()) {
                d.e("LEAK: {}.release() was not called before it's garbage-collected. Enable advanced leak reporting to find out where the leak occurred. To enable advanced leak reporting, specify the JVM option '-D{}={}' or call {}.setLevel()", this.j, a, io.netty.util.ad.c.name().toLowerCase(), ad.a(this));
                continue;
            }
            d.e("LEAK: {}.release() was not called before it's garbage-collected.{}", (Object)this.j, (Object)string);
        }
    }

    static String a(int n2) {
        StackTraceElement[] arrstackTraceElement;
        StringBuilder stringBuilder = new StringBuilder(4096);
        for (StackTraceElement stackTraceElement : arrstackTraceElement = new Throwable().getStackTrace()) {
            if (n2 > 0) {
                --n2;
                continue;
            }
            String string = stackTraceElement.toString();
            boolean bl2 = false;
            for (String string2 : p) {
                if (!string.startsWith(string2)) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            stringBuilder.append('\t');
            stringBuilder.append(string);
            stringBuilder.append(ad.a);
        }
        return stringBuilder.toString();
    }

    static /* synthetic */ ReferenceQueue a(ab ab2) {
        return ab2.h;
    }

    static /* synthetic */ ac b(ab ab2) {
        return ab2.f;
    }

    static /* synthetic */ long c(ab ab2) {
        return ab2.m++;
    }

    static /* synthetic */ long d(ab ab2) {
        return ab2.m--;
    }

    static {
        boolean bl2;
        b = io.netty.util.ad.b;
        d = io.netty.util.c.b.h.a(ab.class);
        if (ae.b("io.netty.noResourceLeakDetection") != null) {
            bl2 = ae.a("io.netty.noResourceLeakDetection", false);
            d.b("-Dio.netty.noResourceLeakDetection: {}", (Object)bl2);
            d.d("-Dio.netty.noResourceLeakDetection is deprecated. Use '-D{}={}' instead.", (Object)a, (Object)b.name().toLowerCase());
        } else {
            bl2 = false;
        }
        io.netty.util.ad ad2 = bl2 ? io.netty.util.ad.a : b;
        String string = ae.a(a, ad2.name()).trim().toUpperCase();
        io.netty.util.ad ad3 = b;
        for (io.netty.util.ad ad4 : EnumSet.allOf(io.netty.util.ad.class)) {
            if (!string.equals(ad4.name()) && !string.equals(String.valueOf(ad4.ordinal()))) continue;
            ad3 = ad4;
        }
        c = ad3;
        if (d.d()) {
            d.b("-D{}: {}", (Object)a, (Object)ad3.name().toLowerCase());
        }
        p = new String[]{"io.netty.buffer.AbstractByteBufAllocator.toLeakAwareBuffer("};
    }
}

