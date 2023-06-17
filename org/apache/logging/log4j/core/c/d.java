/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.c;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.core.c.c;

class d
implements Delayed {
    private long b;
    final /* synthetic */ c a;

    public d(c c2) {
        this.a = c2;
    }

    public void a(long l2) {
        this.b = l2 + System.nanoTime();
    }

    @Override
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(this.b - System.nanoTime(), TimeUnit.NANOSECONDS);
    }

    public int a(Delayed delayed) {
        if (this.b < ((d)delayed).b) {
            return -1;
        }
        if (this.b > ((d)delayed).b) {
            return 1;
        }
        return 0;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        d d2 = (d)object;
        return this.b == d2.b;
    }

    public int hashCode() {
        return (int)(this.b ^ this.b >>> 32);
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return this.a((Delayed)object);
    }
}

