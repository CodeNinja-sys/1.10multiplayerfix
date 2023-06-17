/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.cl;
import com.a.a.d.aad;
import com.a.a.d.yc;
import com.a.a.n.a.fq;
import com.a.a.n.a.gh;
import com.a.a.n.a.gl;
import com.a.a.n.a.gm;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class fp
implements gh {
    private final ExecutorService a;

    public fp(ExecutorService executorService) {
        this.a = (ExecutorService)cl.a(executorService);
    }

    public fp() {
        this(Executors.newCachedThreadPool());
    }

    @Override
    public Object a(Object object, Class class_, long l2, TimeUnit timeUnit) {
        cl.a(object);
        cl.a(class_);
        cl.a((Object)timeUnit);
        cl.a(l2 > 0L, "bad timeout: %s", new Object[]{l2});
        cl.a(class_.isInterface(), (Object)"interfaceType must be an interface type");
        Set set = fp.a(class_);
        fq fq2 = new fq(this, object, l2, timeUnit, set);
        return fp.a(class_, fq2);
    }

    @Override
    public Object a(Callable callable, long l2, TimeUnit timeUnit, boolean bl2) {
        cl.a(callable);
        cl.a((Object)timeUnit);
        cl.a(l2 > 0L, "timeout must be positive: %s", new Object[]{l2});
        Future future = this.a.submit(callable);
        try {
            if (bl2) {
                try {
                    return future.get(l2, timeUnit);
                }
                catch (InterruptedException interruptedException) {
                    future.cancel(true);
                    throw interruptedException;
                }
            }
            return gm.a(future, l2, timeUnit);
        }
        catch (ExecutionException executionException) {
            throw fp.b(executionException, true);
        }
        catch (TimeoutException timeoutException) {
            future.cancel(true);
            throw new gl(timeoutException);
        }
    }

    private static Exception b(Exception exception, boolean bl2) {
        Throwable throwable = exception.getCause();
        if (throwable == null) {
            throw exception;
        }
        if (bl2) {
            StackTraceElement[] arrstackTraceElement = (StackTraceElement[])yc.a((Object[])throwable.getStackTrace(), (Object[])exception.getStackTrace(), StackTraceElement.class);
            throwable.setStackTrace(arrstackTraceElement);
        }
        if (throwable instanceof Exception) {
            throw (Exception)throwable;
        }
        if (throwable instanceof Error) {
            throw (Error)throwable;
        }
        throw exception;
    }

    private static Set a(Class class_) {
        HashSet hashSet = aad.a();
        for (Method method : class_.getMethods()) {
            if (!fp.a(method)) continue;
            hashSet.add(method);
        }
        return hashSet;
    }

    private static boolean a(Method method) {
        for (Class<?> class_ : method.getExceptionTypes()) {
            if (class_ != InterruptedException.class) continue;
            return true;
        }
        return false;
    }

    private static Object a(Class class_, InvocationHandler invocationHandler) {
        Object object = Proxy.newProxyInstance(class_.getClassLoader(), new Class[]{class_}, invocationHandler);
        return class_.cast(object);
    }

    static /* synthetic */ Exception a(Exception exception, boolean bl2) {
        return fp.b(exception, bl2);
    }
}

