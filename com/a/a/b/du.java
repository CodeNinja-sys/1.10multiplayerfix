/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import com.a.a.b.eh;
import java.util.concurrent.TimeUnit;

public final class du {
    private final eh a;
    private boolean b;
    private long c;
    private long d;

    public static du a() {
        return new du();
    }

    public static du a(eh eh2) {
        return new du(eh2);
    }

    public static du b() {
        return new du().d();
    }

    public static du b(eh eh2) {
        return new du(eh2).d();
    }

    du() {
        this(eh.b());
    }

    du(eh eh2) {
        this.a = (eh)cl.a(eh2, (Object)"ticker");
    }

    public boolean c() {
        return this.b;
    }

    public du d() {
        cl.b(!this.b, "This stopwatch is already running.");
        this.b = true;
        this.d = this.a.a();
        return this;
    }

    public du e() {
        long l2 = this.a.a();
        cl.b(this.b, "This stopwatch is already stopped.");
        this.b = false;
        this.c += l2 - this.d;
        return this;
    }

    public du f() {
        this.c = 0L;
        this.b = false;
        return this;
    }

    private long g() {
        return this.b ? this.a.a() - this.d + this.c : this.c;
    }

    public long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.g(), TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long l2 = this.g();
        TimeUnit timeUnit = du.a(l2);
        double d2 = (double)l2 / (double)TimeUnit.NANOSECONDS.convert(1L, timeUnit);
        return String.format("%.4g %s", d2, du.b(timeUnit));
    }

    private static TimeUnit a(long l2) {
        if (TimeUnit.DAYS.convert(l2, TimeUnit.NANOSECONDS) > 0L) {
            return TimeUnit.DAYS;
        }
        if (TimeUnit.HOURS.convert(l2, TimeUnit.NANOSECONDS) > 0L) {
            return TimeUnit.HOURS;
        }
        if (TimeUnit.MINUTES.convert(l2, TimeUnit.NANOSECONDS) > 0L) {
            return TimeUnit.MINUTES;
        }
        if (TimeUnit.SECONDS.convert(l2, TimeUnit.NANOSECONDS) > 0L) {
            return TimeUnit.SECONDS;
        }
        if (TimeUnit.MILLISECONDS.convert(l2, TimeUnit.NANOSECONDS) > 0L) {
            return TimeUnit.MILLISECONDS;
        }
        if (TimeUnit.MICROSECONDS.convert(l2, TimeUnit.NANOSECONDS) > 0L) {
            return TimeUnit.MICROSECONDS;
        }
        return TimeUnit.NANOSECONDS;
    }

    private static String b(TimeUnit timeUnit) {
        switch (timeUnit) {
            case NANOSECONDS: {
                return "ns";
            }
            case MICROSECONDS: {
                return "\u03bcs";
            }
            case MILLISECONDS: {
                return "ms";
            }
            case SECONDS: {
                return "s";
            }
            case MINUTES: {
                return "min";
            }
            case HOURS: {
                return "h";
            }
            case DAYS: {
                return "d";
            }
        }
        throw new AssertionError();
    }
}

