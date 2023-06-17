/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class gm {
    public static void a(CountDownLatch countDownLatch) {
        boolean bl2 = false;
        while (true) {
            try {
                countDownLatch.await();
                return;
            }
            catch (InterruptedException interruptedException) {
                bl2 = true;
                continue;
            }
            break;
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static boolean a(CountDownLatch countDownLatch, long l2, TimeUnit timeUnit) {
        boolean bl2 = false;
        try {
            long l3 = timeUnit.toNanos(l2);
            long l4 = System.nanoTime() + l3;
            while (true) {
                try {
                    boolean bl3 = countDownLatch.await(l3, TimeUnit.NANOSECONDS);
                    return bl3;
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                    l3 = l4 - System.nanoTime();
                    continue;
                }
                break;
            }
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void a(Thread thread) {
        boolean bl2 = false;
        while (true) {
            try {
                thread.join();
                return;
            }
            catch (InterruptedException interruptedException) {
                bl2 = true;
                continue;
            }
            break;
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static Object a(Future future) {
        boolean bl2 = false;
        while (true) {
            try {
                Object v2 = future.get();
                return v2;
            }
            catch (InterruptedException interruptedException) {
                bl2 = true;
                continue;
            }
            break;
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static Object a(Future future, long l2, TimeUnit timeUnit) {
        boolean bl2 = false;
        try {
            long l3 = timeUnit.toNanos(l2);
            long l4 = System.nanoTime() + l3;
            while (true) {
                try {
                    Object v2 = future.get(l3, TimeUnit.NANOSECONDS);
                    return v2;
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                    l3 = l4 - System.nanoTime();
                    continue;
                }
                break;
            }
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void a(Thread thread, long l2, TimeUnit timeUnit) {
        cl.a(thread);
        boolean bl2 = false;
        try {
            long l3 = timeUnit.toNanos(l2);
            long l4 = System.nanoTime() + l3;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.timedJoin(thread, l3);
                    return;
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                    l3 = l4 - System.nanoTime();
                    continue;
                }
                break;
            }
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static Object a(BlockingQueue blockingQueue) {
        boolean bl2 = false;
        while (true) {
            try {
                Object e2 = blockingQueue.take();
                return e2;
            }
            catch (InterruptedException interruptedException) {
                bl2 = true;
                continue;
            }
            break;
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void a(BlockingQueue blockingQueue, Object object) {
        boolean bl2 = false;
        while (true) {
            try {
                blockingQueue.put(object);
                return;
            }
            catch (InterruptedException interruptedException) {
                bl2 = true;
                continue;
            }
            break;
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void a(long l2, TimeUnit timeUnit) {
        boolean bl2 = false;
        try {
            long l3 = timeUnit.toNanos(l2);
            long l4 = System.nanoTime() + l3;
            while (true) {
                try {
                    TimeUnit.NANOSECONDS.sleep(l3);
                    return;
                }
                catch (InterruptedException interruptedException) {
                    bl2 = true;
                    l3 = l4 - System.nanoTime();
                    continue;
                }
                break;
            }
        }
        finally {
            if (bl2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private gm() {
    }
}

