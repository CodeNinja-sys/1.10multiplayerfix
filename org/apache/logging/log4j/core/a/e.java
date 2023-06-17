/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.logging.log4j.core.a.a;
import org.apache.logging.log4j.core.a.f;
import org.apache.logging.log4j.core.b;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.h;

public final class e
extends a {
    private static final int a = 128;
    private static final String b = "Shutdown";
    private final BlockingQueue c;
    private final boolean d;
    private final org.apache.logging.log4j.core.config.d e;
    private final org.apache.logging.log4j.core.config.b[] f;
    private final String g;
    private final boolean i;
    private org.apache.logging.log4j.core.config.a j;
    private f k;
    private static final AtomicLong l = new AtomicLong(1L);

    private e(String string, d d2, org.apache.logging.log4j.core.config.b[] arrb, String string2, int n2, boolean bl2, boolean bl3, org.apache.logging.log4j.core.config.d d3, boolean bl4) {
        super(string, d2, null, bl3);
        this.c = new ArrayBlockingQueue(n2);
        this.d = bl2;
        this.e = d3;
        this.f = arrb;
        this.g = string2;
        this.i = bl4;
    }

    @Override
    public void e() {
        Map map = this.e.k();
        ArrayList<org.apache.logging.log4j.core.config.a> arrayList = new ArrayList<org.apache.logging.log4j.core.config.a>();
        for (org.apache.logging.log4j.core.config.b b2 : this.f) {
            if (map.containsKey(b2.a())) {
                arrayList.add(new org.apache.logging.log4j.core.config.a((b)map.get(b2.a()), b2.b(), b2.c()));
                continue;
            }
            h.b("No appender named {} was configured", b2);
        }
        if (this.g != null) {
            if (map.containsKey(this.g)) {
                this.j = new org.apache.logging.log4j.core.config.a((b)map.get(this.g), null, null);
            } else {
                h.b("Unable to set up error Appender. No appender named {} was configured", this.g);
            }
        }
        if (arrayList.size() > 0) {
            this.k = new f(this, arrayList, this.c);
            this.k.setName("AsyncAppender-" + this.a());
        } else if (this.g == null) {
            throw new org.apache.logging.log4j.core.config.e("No appenders are available for AsyncAppender " + this.a());
        }
        this.k.start();
        super.e();
    }

    @Override
    public void f() {
        super.f();
        this.k.a();
        try {
            this.k.join();
        }
        catch (InterruptedException interruptedException) {
            h.f("Interrupted while stopping AsyncAppender {}", this.a());
        }
    }

    @Override
    public void a(h h2) {
        if (!this.g()) {
            throw new IllegalStateException("AsyncAppender " + this.a() + " is not active");
        }
        if (h2 instanceof org.apache.logging.log4j.core.e.d) {
            boolean bl2 = false;
            if (this.d) {
                try {
                    this.c.put(org.apache.logging.log4j.core.e.d.a((org.apache.logging.log4j.core.e.d)h2, this.i));
                    bl2 = true;
                }
                catch (InterruptedException interruptedException) {
                    h.f("Interrupted while waiting for a free slot in the AsyncAppender LogEvent-queue {}", this.a());
                }
            } else {
                bl2 = this.c.offer(org.apache.logging.log4j.core.e.d.a((org.apache.logging.log4j.core.e.d)h2, this.i));
                if (!bl2) {
                    this.b("Appender " + this.a() + " is unable to write primary appenders. queue is full");
                }
            }
            if (!bl2 && this.j != null) {
                this.j.a(h2);
            }
        }
    }

    public static e a(org.apache.logging.log4j.core.config.b[] arrb, String string, String string2, String string3, String string4, String string5, d d2, org.apache.logging.log4j.core.config.d d3, String string6) {
        if (string4 == null) {
            h.b("No name provided for AsyncAppender");
            return null;
        }
        if (arrb == null) {
            h.b("No appender references provided to AsyncAppender {}", string4);
        }
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string2, true);
        int n2 = org.apache.logging.log4j.core.a.a.a(string3, 128);
        boolean bl3 = Boolean.parseBoolean(string5);
        boolean bl4 = org.apache.logging.log4j.core.d.b.a(string6, true);
        return new e(string4, d2, arrb, string, n2, bl2, bl4, d3, bl3);
    }

    static /* synthetic */ AtomicLong h() {
        return l;
    }

    static /* synthetic */ org.apache.logging.log4j.core.config.a a(e e2) {
        return e2.j;
    }
}

