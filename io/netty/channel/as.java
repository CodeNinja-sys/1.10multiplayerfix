/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel;

import io.netty.channel.at;
import io.netty.channel.au;
import io.netty.channel.bw;
import java.util.ArrayDeque;
import java.util.Queue;

public final class as {
    private long a;
    private final Queue b = new ArrayDeque();
    private final boolean c;

    public as(boolean bl2) {
        this.c = bl2;
    }

    public as() {
        this(false);
    }

    public as a(bw bw2, int n2) {
        return this.a(bw2, (long)n2);
    }

    public as a(bw bw2, long l2) {
        if (bw2 == null) {
            throw new NullPointerException("promise");
        }
        if (l2 < 0L) {
            throw new IllegalArgumentException("pendingDataSize must be >= 0 but was " + l2);
        }
        long l3 = this.a + l2;
        if (bw2 instanceof au) {
            au au2 = (au)((Object)bw2);
            au2.a(l3);
            this.b.add(au2);
        } else {
            this.b.add(new at(l3, bw2));
        }
        return this;
    }

    public as a(long l2) {
        if (l2 < 0L) {
            throw new IllegalArgumentException("delta must be >= 0 but was " + l2);
        }
        this.a += l2;
        return this;
    }

    public long a() {
        return this.a;
    }

    public as b() {
        this.c(null);
        return this;
    }

    public as c() {
        return this.b();
    }

    public as a(Throwable throwable) {
        au au2;
        this.b();
        while ((au2 = (au)this.b.poll()) != null) {
            if (this.c) {
                au2.bh_().b(throwable);
                continue;
            }
            au2.bh_().a(throwable);
        }
        return this;
    }

    public as b(Throwable throwable) {
        return this.a(throwable);
    }

    public as a(Throwable throwable, Throwable throwable2) {
        au au2;
        this.c(throwable);
        while ((au2 = (au)this.b.poll()) != null) {
            if (this.c) {
                au2.bh_().b(throwable2);
                continue;
            }
            au2.bh_().a(throwable2);
        }
        return this;
    }

    public as b(Throwable throwable, Throwable throwable2) {
        return this.a(throwable, throwable2);
    }

    private void c(Throwable throwable) {
        if (this.b.isEmpty()) {
            this.a = 0L;
            return;
        }
        long l2 = this.a;
        while (true) {
            au au2;
            if ((au2 = (au)this.b.peek()) == null) {
                this.a = 0L;
                break;
            }
            if (au2.bg_() > l2) {
                if (l2 <= 0L || this.b.size() != 1) break;
                this.a = 0L;
                au2.a(au2.bg_() - l2);
                break;
            }
            this.b.remove();
            bw bw2 = au2.bh_();
            if (throwable == null) {
                if (this.c) {
                    bw2.c();
                    continue;
                }
                bw2.b();
                continue;
            }
            if (this.c) {
                bw2.b(throwable);
                continue;
            }
            bw2.a(throwable);
        }
        long l3 = this.a;
        if (l3 >= 0x8000000000L) {
            this.a = 0L;
            for (au au3 : this.b) {
                au3.a(au3.bg_() - l3);
            }
        }
    }
}

