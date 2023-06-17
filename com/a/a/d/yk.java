/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.acu;
import com.a.a.d.cm;
import com.a.a.d.mq;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

public final class yk {
    private yk() {
    }

    public static ArrayBlockingQueue a(int n2) {
        return new ArrayBlockingQueue(n2);
    }

    public static ArrayDeque a() {
        return new ArrayDeque();
    }

    public static ArrayDeque a(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayDeque(cm.a(iterable));
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        mq.a(arrayDeque, iterable);
        return arrayDeque;
    }

    public static ConcurrentLinkedQueue b() {
        return new ConcurrentLinkedQueue();
    }

    public static ConcurrentLinkedQueue b(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ConcurrentLinkedQueue(cm.a(iterable));
        }
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        mq.a(concurrentLinkedQueue, iterable);
        return concurrentLinkedQueue;
    }

    public static LinkedBlockingDeque c() {
        return new LinkedBlockingDeque();
    }

    public static LinkedBlockingDeque b(int n2) {
        return new LinkedBlockingDeque(n2);
    }

    public static LinkedBlockingDeque c(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingDeque(cm.a(iterable));
        }
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        mq.a(linkedBlockingDeque, iterable);
        return linkedBlockingDeque;
    }

    public static LinkedBlockingQueue d() {
        return new LinkedBlockingQueue();
    }

    public static LinkedBlockingQueue c(int n2) {
        return new LinkedBlockingQueue(n2);
    }

    public static LinkedBlockingQueue d(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedBlockingQueue(cm.a(iterable));
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        mq.a(linkedBlockingQueue, iterable);
        return linkedBlockingQueue;
    }

    public static PriorityBlockingQueue e() {
        return new PriorityBlockingQueue();
    }

    public static PriorityBlockingQueue e(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new PriorityBlockingQueue(cm.a(iterable));
        }
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        mq.a(priorityBlockingQueue, iterable);
        return priorityBlockingQueue;
    }

    public static PriorityQueue f() {
        return new PriorityQueue();
    }

    public static PriorityQueue f(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new PriorityQueue(cm.a(iterable));
        }
        PriorityQueue priorityQueue = new PriorityQueue();
        mq.a(priorityQueue, iterable);
        return priorityQueue;
    }

    public static SynchronousQueue g() {
        return new SynchronousQueue();
    }

    public static int a(BlockingQueue blockingQueue, Collection collection, int n2, long l2, TimeUnit timeUnit) {
        cl.a(collection);
        long l3 = System.nanoTime() + timeUnit.toNanos(l2);
        int n3 = 0;
        while (n3 < n2) {
            if ((n3 += blockingQueue.drainTo(collection, n2 - n3)) >= n2) continue;
            Object e2 = blockingQueue.poll(l3 - System.nanoTime(), TimeUnit.NANOSECONDS);
            if (e2 == null) break;
            collection.add(e2);
            ++n3;
        }
        return n3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int b(BlockingQueue blockingQueue, Collection collection, int n2, long l2, TimeUnit timeUnit) {
        cl.a(collection);
        long l3 = System.nanoTime() + timeUnit.toNanos(l2);
        int n3 = 0;
        boolean bl2 = false;
        try {
            while (n3 < n2) {
                Object e2;
                if ((n3 += blockingQueue.drainTo(collection, n2 - n3)) >= n2) continue;
                while (true) {
                    try {
                        e2 = blockingQueue.poll(l3 - System.nanoTime(), TimeUnit.NANOSECONDS);
                    }
                    catch (InterruptedException interruptedException) {
                        bl2 = true;
                        continue;
                    }
                    break;
                }
                if (e2 == null) {
                    break;
                }
                collection.add(e2);
                ++n3;
            }
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
        return n3;
    }

    public static Queue a(Queue queue) {
        return acu.a(queue, null);
    }

    public static Deque a(Deque deque) {
        return acu.a(deque, null);
    }
}

