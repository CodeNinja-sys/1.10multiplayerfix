/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.d;

import io.netty.channel.ar;
import io.netty.channel.cs;
import io.netty.channel.d.d;
import io.netty.channel.d.h;
import io.netty.channel.d.m;
import io.netty.channel.d.n;
import io.netty.channel.d.o;
import io.netty.channel.d.p;
import io.netty.channel.dj;
import io.netty.util.c.ae;
import io.netty.util.c.b.g;
import io.netty.util.c.u;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public final class l
extends dj {
    private static final g d;
    private static final int e = 256;
    private static final boolean f;
    private static final int g = 3;
    private static final int h;
    Selector a;
    private p i;
    private final SelectorProvider j;
    private final AtomicBoolean k = new AtomicBoolean();
    private volatile int l = 50;
    private int m;
    private boolean n;

    l(n n2, ThreadFactory threadFactory, SelectorProvider selectorProvider) {
        super(n2, threadFactory, false);
        if (selectorProvider == null) {
            throw new NullPointerException("selectorProvider");
        }
        this.j = selectorProvider;
        this.a = this.B();
    }

    private Selector B() {
        AbstractSelector abstractSelector;
        try {
            abstractSelector = this.j.openSelector();
        }
        catch (IOException iOException) {
            throw new ar("failed to open a new selector", iOException);
        }
        if (f) {
            return abstractSelector;
        }
        try {
            p p2 = new p();
            Class<?> class_ = Class.forName("sun.nio.ch.SelectorImpl", false, u.p());
            if (!class_.isAssignableFrom(abstractSelector.getClass())) {
                return abstractSelector;
            }
            Field field = class_.getDeclaredField("selectedKeys");
            Field field2 = class_.getDeclaredField("publicSelectedKeys");
            field.setAccessible(true);
            field2.setAccessible(true);
            field.set(abstractSelector, p2);
            field2.set(abstractSelector, p2);
            this.i = p2;
            d.a("Instrumented an optimized java.util.Set into: {}", (Object)abstractSelector);
        }
        catch (Throwable throwable) {
            this.i = null;
            d.a("Failed to instrument an optimized java.util.Set into: {}", (Object)abstractSelector, (Object)throwable);
        }
        return abstractSelector;
    }

    @Override
    protected Queue g() {
        return u.n();
    }

    public void a(SelectableChannel selectableChannel, int n2, o o2) {
        if (selectableChannel == null) {
            throw new NullPointerException("ch");
        }
        if (n2 == 0) {
            throw new IllegalArgumentException("interestOps must be non-zero.");
        }
        if ((n2 & ~selectableChannel.validOps()) != 0) {
            throw new IllegalArgumentException("invalid interestOps: " + n2 + "(validOps: " + selectableChannel.validOps() + ')');
        }
        if (o2 == null) {
            throw new NullPointerException("task");
        }
        if (this.isShutdown()) {
            throw new IllegalStateException("event loop shut down");
        }
        try {
            selectableChannel.register(this.a, n2, o2);
        }
        catch (Exception exception) {
            throw new cs("failed to register a channel", exception);
        }
    }

    public int h() {
        return this.l;
    }

    public void a(int n2) {
        if (n2 <= 0 || n2 > 100) {
            throw new IllegalArgumentException("ioRatio: " + n2 + " (expected: 0 < ioRatio <= 100)");
        }
        this.l = n2;
    }

    public void j() {
        int n2;
        block14: {
            Selector selector;
            if (!this.bt_()) {
                this.execute(new m(this));
                return;
            }
            Selector selector2 = this.a;
            if (selector2 == null) {
                return;
            }
            try {
                selector = this.B();
            }
            catch (Exception exception) {
                d.d("Failed to create a new Selector.", exception);
                return;
            }
            n2 = 0;
            while (true) {
                try {
                    for (SelectionKey selectionKey : selector2.keys()) {
                        Object object;
                        Object object2 = selectionKey.attachment();
                        try {
                            if (!selectionKey.isValid() || selectionKey.channel().keyFor(selector) != null) continue;
                            int n3 = selectionKey.interestOps();
                            selectionKey.cancel();
                            object = selectionKey.channel().register(selector, n3, object2);
                            if (object2 instanceof d) {
                                ((d)object2).d = object;
                            }
                            ++n2;
                        }
                        catch (Exception exception) {
                            d.d("Failed to re-register a Channel to the new Selector.", exception);
                            if (object2 instanceof d) {
                                object = (d)object2;
                                ((d)object).O().b(((d)object).O().h());
                                continue;
                            }
                            object = (o)object2;
                            io.netty.channel.d.l.a((o)object, selectionKey, exception);
                        }
                    }
                }
                catch (ConcurrentModificationException concurrentModificationException) {
                    continue;
                }
                break;
            }
            this.a = selector;
            try {
                selector2.close();
            }
            catch (Throwable throwable) {
                if (!d.f()) break block14;
                d.d("Failed to close the old Selector.", throwable);
            }
        }
        d.c("Migrated " + n2 + " channel(s) to the new Selector.");
    }

    @Override
    protected void e() {
        while (true) {
            boolean bl2 = this.k.getAndSet(false);
            try {
                if (this.s()) {
                    this.l();
                } else {
                    this.b(bl2);
                    if (this.k.get()) {
                        this.a.wakeup();
                    }
                }
                this.m = 0;
                this.n = false;
                int n2 = this.l;
                if (n2 == 100) {
                    this.C();
                    this.v();
                } else {
                    long l2 = System.nanoTime();
                    this.C();
                    long l3 = System.nanoTime() - l2;
                    this.a(l3 * (long)(100 - n2) / (long)n2);
                }
                if (!this.br_()) continue;
                this.D();
                if (!this.x()) continue;
            }
            catch (Throwable throwable) {
                d.d("Unexpected exception in the selector loop.", throwable);
                try {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException interruptedException) {}
                continue;
            }
            break;
        }
    }

    private void C() {
        if (this.i != null) {
            this.a(this.i.a());
        } else {
            this.a(this.a.selectedKeys());
        }
    }

    @Override
    protected void i() {
        try {
            this.a.close();
        }
        catch (IOException iOException) {
            d.d("Failed to close a selector.", iOException);
        }
    }

    void a(SelectionKey selectionKey) {
        selectionKey.cancel();
        ++this.m;
        if (this.m >= 256) {
            this.m = 0;
            this.n = true;
        }
    }

    @Override
    protected Runnable k() {
        Runnable runnable = super.k();
        if (this.n) {
            this.E();
        }
        return runnable;
    }

    private void a(Set set) {
        if (set.isEmpty()) {
            return;
        }
        Iterator<Object> iterator = set.iterator();
        while (true) {
            SelectionKey selectionKey = (SelectionKey)iterator.next();
            Object object = selectionKey.attachment();
            iterator.remove();
            if (object instanceof d) {
                io.netty.channel.d.l.a(selectionKey, (d)object);
            } else {
                o o2 = (o)object;
                io.netty.channel.d.l.a(selectionKey, o2);
            }
            if (!iterator.hasNext()) break;
            if (!this.n) continue;
            this.E();
            set = this.a.selectedKeys();
            if (set.isEmpty()) break;
            iterator = set.iterator();
        }
    }

    private void a(SelectionKey[] arrselectionKey) {
        SelectionKey selectionKey;
        int n2 = 0;
        while ((selectionKey = arrselectionKey[n2]) != null) {
            arrselectionKey[n2] = null;
            Object object = selectionKey.attachment();
            if (object instanceof d) {
                io.netty.channel.d.l.a(selectionKey, (d)object);
            } else {
                o o2 = (o)object;
                io.netty.channel.d.l.a(selectionKey, o2);
            }
            if (this.n) {
                while (arrselectionKey[n2] != null) {
                    arrselectionKey[n2] = null;
                    ++n2;
                }
                this.E();
                arrselectionKey = this.i.a();
                n2 = -1;
            }
            ++n2;
        }
    }

    private static void a(SelectionKey selectionKey, d d2) {
        h h2 = d2.O();
        if (!selectionKey.isValid()) {
            h2.b(h2.h());
            return;
        }
        try {
            int n2 = selectionKey.readyOps();
            if ((n2 & 0x11) != 0 || n2 == 0) {
                h2.j();
                if (!d2.H()) {
                    return;
                }
            }
            if ((n2 & 4) != 0) {
                d2.O().n();
            }
            if ((n2 & 8) != 0) {
                int n3 = selectionKey.interestOps();
                selectionKey.interestOps(n3 &= 0xFFFFFFF7);
                h2.m();
            }
        }
        catch (CancelledKeyException cancelledKeyException) {
            h2.b(h2.h());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(SelectionKey selectionKey, o o2) {
        int n2 = 0;
        try {
            o2.a(selectionKey.channel(), selectionKey);
            n2 = 1;
        }
        catch (Exception exception) {
            selectionKey.cancel();
            io.netty.channel.d.l.a(o2, selectionKey, exception);
            n2 = 2;
        }
        finally {
            switch (n2) {
                case 0: {
                    selectionKey.cancel();
                    io.netty.channel.d.l.a(o2, selectionKey, null);
                    break;
                }
                case 1: {
                    if (selectionKey.isValid()) break;
                    io.netty.channel.d.l.a(o2, selectionKey, null);
                }
            }
        }
    }

    private void D() {
        this.E();
        Set<SelectionKey> set = this.a.keys();
        ArrayList<d> arrayList = new ArrayList<d>(set.size());
        for (SelectionKey object : set) {
            Object object2 = object.attachment();
            if (object2 instanceof d) {
                arrayList.add((d)object2);
                continue;
            }
            object.cancel();
            o o2 = (o)object2;
            io.netty.channel.d.l.a(o2, object, null);
        }
        for (d d2 : arrayList) {
            d2.O().b(d2.O().h());
        }
    }

    private static void a(o o2, SelectionKey selectionKey, Throwable throwable) {
        try {
            o2.a(selectionKey.channel(), throwable);
        }
        catch (Exception exception) {
            d.d("Unexpected exception while running NioTask.channelUnregistered()", exception);
        }
    }

    @Override
    protected void a(boolean bl2) {
        if (!bl2 && this.k.compareAndSet(false, true)) {
            this.a.wakeup();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void l() {
        try {
            this.a.selectNow();
        }
        finally {
            if (this.k.get()) {
                this.a.wakeup();
            }
        }
    }

    private void b(boolean bl2) {
        block10: {
            Selector selector = this.a;
            try {
                int n2 = 0;
                long l2 = System.nanoTime();
                long l3 = l2 + this.b(l2);
                while (true) {
                    long l4;
                    if ((l4 = (l3 - l2 + 500000L) / 1000000L) <= 0L) {
                        if (n2 != 0) break;
                        selector.selectNow();
                        n2 = 1;
                        break;
                    }
                    int n3 = selector.select(l4);
                    ++n2;
                    if (n3 != 0 || bl2 || this.k.get() || this.s() || this.t()) break;
                    if (Thread.interrupted()) {
                        if (d.d()) {
                            d.b("Selector.select() returned prematurely because Thread.currentThread().interrupt() was called. Use NioEventLoop.shutdownGracefully() to shutdown the NioEventLoop.");
                        }
                        n2 = 1;
                        break;
                    }
                    long l5 = System.nanoTime();
                    if (l5 - TimeUnit.MILLISECONDS.toNanos(l4) >= l2) {
                        n2 = 1;
                    } else if (h > 0 && n2 >= h) {
                        d.d("Selector.select() returned prematurely {} times in a row; rebuilding selector.", (Object)n2);
                        this.j();
                        selector = this.a;
                        selector.selectNow();
                        n2 = 1;
                        break;
                    }
                    l2 = l5;
                }
                if (n2 > 3 && d.d()) {
                    d.b("Selector.select() returned prematurely {} times in a row.", (Object)(n2 - 1));
                }
            }
            catch (CancelledKeyException cancelledKeyException) {
                if (!d.d()) break block10;
                d.b(CancelledKeyException.class.getSimpleName() + " raised by a Selector - JDK bug?", cancelledKeyException);
            }
        }
    }

    private void E() {
        this.n = false;
        try {
            this.a.selectNow();
        }
        catch (Throwable throwable) {
            d.d("Failed to update SelectionKeys.", throwable);
        }
    }

    static {
        block5: {
            d = io.netty.util.c.b.h.a(l.class);
            f = ae.a("io.netty.noKeySetOptimization", false);
            String string = "sun.nio.ch.bugLevel";
            try {
                String string2 = ae.b(string);
                if (string2 == null) {
                    System.setProperty(string, "");
                }
            }
            catch (SecurityException securityException) {
                if (!d.d()) break block5;
                d.b("Unable to get/set System Property: {}", (Object)string, (Object)securityException);
            }
        }
        int n2 = ae.a("io.netty.selectorAutoRebuildThreshold", 512);
        if (n2 < 3) {
            n2 = 0;
        }
        h = n2;
        if (d.d()) {
            d.b("-Dio.netty.noKeySetOptimization: {}", (Object)f);
            d.b("-Dio.netty.selectorAutoRebuildThreshold: {}", (Object)h);
        }
    }
}

