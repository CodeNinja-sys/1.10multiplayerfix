/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.b.eg;
import com.a.a.d.ov;
import com.a.a.d.yk;
import com.a.a.n.a.dl;
import com.a.a.n.a.dq;
import com.a.a.n.a.dr;
import com.a.a.n.a.dv;
import com.a.a.n.a.dw;
import com.a.a.n.a.dx;
import com.a.a.n.a.dy;
import com.a.a.n.a.dz;
import com.a.a.n.a.eb;
import com.a.a.n.a.ec;
import com.a.a.n.a.ed;
import com.a.a.n.a.gf;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class du {
    private du() {
    }

    public static ExecutorService a(ThreadPoolExecutor threadPoolExecutor, long l2, TimeUnit timeUnit) {
        return new dz().a(threadPoolExecutor, l2, timeUnit);
    }

    public static ScheduledExecutorService a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, long l2, TimeUnit timeUnit) {
        return new dz().a(scheduledThreadPoolExecutor, l2, timeUnit);
    }

    public static void a(ExecutorService executorService, long l2, TimeUnit timeUnit) {
        new dz().a(executorService, l2, timeUnit);
    }

    public static ExecutorService a(ThreadPoolExecutor threadPoolExecutor) {
        return new dz().a(threadPoolExecutor);
    }

    public static ScheduledExecutorService a(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        return new dz().a(scheduledThreadPoolExecutor);
    }

    private static void c(ThreadPoolExecutor threadPoolExecutor) {
        threadPoolExecutor.setThreadFactory(new gf().a(true).a(threadPoolExecutor.getThreadFactory()).a());
    }

    public static dq a() {
        return new ec(null);
    }

    public static dq a(ExecutorService executorService) {
        return executorService instanceof dq ? (dq)executorService : (executorService instanceof ScheduledExecutorService ? new ed((ScheduledExecutorService)executorService) : new eb(executorService));
    }

    public static dr a(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService instanceof dr ? (dr)scheduledExecutorService : new ed(scheduledExecutorService);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    static Object a(dq var0, Collection var1_1, boolean var2_2, long var3_3) {
        cl.a(var0);
        var5_4 = var1_1.size();
        cl.a(var5_4 > 0);
        var6_5 = ov.b(var5_4);
        var7_6 = yk.d();
        var8_7 = null;
        var9_8 = var2_2 != false ? System.nanoTime() : 0L;
        var11_9 = var1_1.iterator();
        var6_5.add(du.a(var0, (Callable)var11_9.next(), var7_6));
        --var5_4;
        var12_10 = 1;
        while (true) lbl-1000:
        // 4 sources

        {
            if ((var13_11 = (Future)var7_6.poll()) == null) {
                if (var5_4 > 0) {
                    --var5_4;
                    var6_5.add(du.a(var0, (Callable)var11_9.next(), var7_6));
                    ++var12_10;
                } else {
                    if (var12_10 == 0) {
                        if (var8_7 != null) throw var8_7;
                        var8_7 = new ExecutionException(null);
                        throw var8_7;
                    }
                    if (var2_2) {
                        var13_11 = (Future)var7_6.poll(var3_3, TimeUnit.NANOSECONDS);
                        if (var13_11 == null) {
                            throw new TimeoutException();
                        }
                        var14_12 = System.nanoTime();
                        var3_3 -= var14_12 - var9_8;
                        var9_8 = var14_12;
                    } else {
                        var13_11 = (Future)var7_6.take();
                    }
                }
            }
            if (var13_11 == null) continue;
            --var12_10;
            try {
                var14_13 = var13_11.get();
                return var14_13;
            }
            catch (ExecutionException var14_14) {
                var8_7 = var14_14;
            }
            catch (RuntimeException var14_15) {
                var8_7 = new ExecutionException(var14_15);
                continue;
            }
            break;
        }
        ** GOTO lbl-1000
        finally {
            var15_16 = var6_5.iterator();
            while (true) {
                if (!var15_16.hasNext()) {
                }
                var16_17 = (Future)var15_16.next();
                var16_17.cancel(true);
            }
        }
    }

    private static dl a(dq dq2, Callable callable, BlockingQueue blockingQueue) {
        dl dl2 = dq2.b(callable);
        dl2.a(new dv(blockingQueue, dl2), du.a());
        return dl2;
    }

    public static ThreadFactory b() {
        if (!du.c()) {
            return Executors.defaultThreadFactory();
        }
        try {
            return (ThreadFactory)Class.forName("com.google.appengine.api.ThreadManager").getMethod("currentRequestThreadFactory", new Class[0]).invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", illegalAccessException);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", classNotFoundException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException("Couldn't invoke ThreadManager.currentRequestThreadFactory", noSuchMethodException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw eg.b(invocationTargetException.getCause());
        }
    }

    private static boolean c() {
        if (System.getProperty("com.google.appengine.runtime.environment") == null) {
            return false;
        }
        try {
            return Class.forName("com.google.apphosting.api.ApiProxy").getMethod("getCurrentEnvironment", new Class[0]).invoke(null, new Object[0]) != null;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
        catch (InvocationTargetException invocationTargetException) {
            return false;
        }
        catch (IllegalAccessException illegalAccessException) {
            return false;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return false;
        }
    }

    static Thread a(String string, Runnable runnable) {
        cl.a(string);
        cl.a(runnable);
        Thread thread = du.b().newThread(runnable);
        try {
            thread.setName(string);
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        return thread;
    }

    static Executor a(Executor executor, com.a.a.b.dx dx2) {
        cl.a(executor);
        cl.a(dx2);
        if (du.c()) {
            return executor;
        }
        return new dw(executor, dx2);
    }

    static ExecutorService a(ExecutorService executorService, com.a.a.b.dx dx2) {
        cl.a(executorService);
        cl.a(dx2);
        if (du.c()) {
            return executorService;
        }
        return new dx(executorService, dx2);
    }

    static ScheduledExecutorService a(ScheduledExecutorService scheduledExecutorService, com.a.a.b.dx dx2) {
        cl.a(scheduledExecutorService);
        cl.a(dx2);
        if (du.c()) {
            return scheduledExecutorService;
        }
        return new dy(scheduledExecutorService, dx2);
    }

    public static boolean b(ExecutorService executorService, long l2, TimeUnit timeUnit) {
        cl.a((Object)timeUnit);
        executorService.shutdown();
        try {
            long l3 = TimeUnit.NANOSECONDS.convert(l2, timeUnit) / 2L;
            if (!executorService.awaitTermination(l3, TimeUnit.NANOSECONDS)) {
                executorService.shutdownNow();
                executorService.awaitTermination(l3, TimeUnit.NANOSECONDS);
            }
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            executorService.shutdownNow();
        }
        return executorService.isTerminated();
    }

    static /* synthetic */ void b(ThreadPoolExecutor threadPoolExecutor) {
        du.c(threadPoolExecutor);
    }
}

