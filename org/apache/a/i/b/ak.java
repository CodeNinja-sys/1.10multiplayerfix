/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.util.concurrent.FutureTask;
import org.apache.a.c.c.u;
import org.apache.a.i.b.al;

public class ak
extends FutureTask {
    private final u a;
    private final al b;

    public ak(u u2, al al2) {
        super(al2);
        this.a = u2;
        this.b = al2;
    }

    public boolean cancel(boolean bl2) {
        this.b.d();
        if (bl2) {
            this.a.cK_();
        }
        return super.cancel(bl2);
    }

    public long a() {
        return this.b.a();
    }

    public long b() {
        return this.b.b();
    }

    public long c() {
        if (this.isDone()) {
            return this.b.c();
        }
        throw new IllegalStateException("Task is not done yet");
    }

    public long d() {
        if (this.isDone()) {
            return this.c() - this.b();
        }
        throw new IllegalStateException("Task is not done yet");
    }

    public long e() {
        if (this.isDone()) {
            return this.c() - this.a();
        }
        throw new IllegalStateException("Task is not done yet");
    }

    public String toString() {
        return this.a.g().c();
    }
}

