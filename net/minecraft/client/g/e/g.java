/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.e;

import com.a.a.d.ov;
import com.a.a.l.i;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import net.minecraft.client.g.bl;
import net.minecraft.client.g.e.m;
import net.minecraft.client.g.e.q;
import net.minecraft.client.g.e.s;
import net.minecraft.client.g.e.u;

public class g
implements Comparable {
    private final q a;
    private final ReentrantLock b = new ReentrantLock();
    private final List c = ov.a();
    private final s d;
    private final double e;
    private bl f;
    private u g;
    private m h = m.a;
    private boolean i;

    public g(q q2, s s2, double d2) {
        this.a = q2;
        this.d = s2;
        this.e = d2;
    }

    public m a() {
        return this.h;
    }

    public q b() {
        return this.a;
    }

    public u c() {
        return this.g;
    }

    public void a(u u2) {
        this.g = u2;
    }

    public bl d() {
        return this.f;
    }

    public void a(bl bl2) {
        this.f = bl2;
    }

    public void a(m m2) {
        this.b.lock();
        try {
            this.h = m2;
        }
        finally {
            this.b.unlock();
        }
    }

    public void e() {
        this.b.lock();
        try {
            if (this.d == s.a && this.h != m.d) {
                this.a.a(false);
            }
            this.i = true;
            this.h = m.d;
            for (Runnable runnable : this.c) {
                runnable.run();
            }
        }
        finally {
            this.b.unlock();
        }
    }

    public void a(Runnable runnable) {
        this.b.lock();
        try {
            this.c.add(runnable);
            if (this.i) {
                runnable.run();
            }
        }
        finally {
            this.b.unlock();
        }
    }

    public ReentrantLock f() {
        return this.b;
    }

    public s g() {
        return this.d;
    }

    public boolean h() {
        return this.i;
    }

    public int a(g g2) {
        return com.a.a.l.i.a(this.e, g2.e);
    }

    public double i() {
        return this.e;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((g)object);
    }
}

