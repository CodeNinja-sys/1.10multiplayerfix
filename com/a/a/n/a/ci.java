/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.bl;
import com.a.a.d.jl;
import com.a.a.d.jn;
import com.a.a.d.yd;
import com.a.a.d.yk;
import com.a.a.n.a.ap;
import com.a.a.n.a.aq;
import com.a.a.n.a.bc;
import com.a.a.n.a.bt;
import com.a.a.n.a.cg;
import com.a.a.n.a.ch;
import com.a.a.n.a.cj;
import com.a.a.n.a.ck;
import com.a.a.n.a.cl;
import com.a.a.n.a.cm;
import com.a.a.n.a.cn;
import com.a.a.n.a.co;
import com.a.a.n.a.cp;
import com.a.a.n.a.cq;
import com.a.a.n.a.cs;
import com.a.a.n.a.cv;
import com.a.a.n.a.cz;
import com.a.a.n.a.da;
import com.a.a.n.a.db;
import com.a.a.n.a.dd;
import com.a.a.n.a.de;
import com.a.a.n.a.df;
import com.a.a.n.a.dg;
import com.a.a.n.a.dl;
import com.a.a.n.a.du;
import com.a.a.n.a.eo;
import com.a.a.n.a.gk;
import com.a.a.n.a.gm;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ci {
    private static final ap a = new cl();
    private static final yd b = yd.d().a(new co()).a();

    private ci() {
    }

    public static bc a(dl dl2, bl bl2) {
        return new df((dl)com.a.a.b.cl.a(dl2), bl2);
    }

    public static dl a(Object object) {
        return new de(object);
    }

    public static bc b(Object object) {
        return new dd(object);
    }

    public static dl a(Throwable throwable) {
        com.a.a.b.cl.a(throwable);
        return new db(throwable);
    }

    public static dl a() {
        return new cz();
    }

    public static bc a(Exception exception) {
        com.a.a.b.cl.a(exception);
        return new da(exception);
    }

    public static dl a(dl dl2, ch ch2) {
        return ci.a(dl2, ch2, (Executor)du.a());
    }

    public static dl a(dl dl2, ch ch2, Executor executor) {
        com.a.a.b.cl.a(ch2);
        return new cv(dl2, ch2, executor);
    }

    public static dl a(dl dl2, ap ap2) {
        return ci.a(dl2, ap2, (Executor)du.a());
    }

    public static dl a(dl dl2, ap ap2, Executor executor) {
        cq cq2 = new cq(ap2, dl2, null);
        dl2.a(cq2, executor);
        return cq2;
    }

    public static dl b(dl dl2, bl bl2) {
        return ci.a(dl2, bl2, (Executor)du.a());
    }

    public static dl a(dl dl2, bl bl2, Executor executor) {
        com.a.a.b.cl.a(bl2);
        cj cj2 = new cj(bl2);
        return ci.a(dl2, cj2, executor);
    }

    public static Future a(Future future, bl bl2) {
        com.a.a.b.cl.a(future);
        com.a.a.b.cl.a(bl2);
        return new ck(future, bl2);
    }

    public static dl a(dl dl2) {
        return ci.a(dl2, a);
    }

    public static dl a(dl ... arrdl) {
        return ci.a(jl.a(arrdl), true, (Executor)du.a());
    }

    public static dl a(Iterable iterable) {
        return ci.a(jl.a(iterable), true, (Executor)du.a());
    }

    public static dl b(dl dl2) {
        return new dg(dl2);
    }

    public static dl b(dl ... arrdl) {
        return ci.a(jl.a(arrdl), false, (Executor)du.a());
    }

    public static dl b(Iterable iterable) {
        return ci.a(jl.a(iterable), false, (Executor)du.a());
    }

    public static jl c(Iterable iterable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = yk.b();
        jn jn2 = jl.g();
        eo eo2 = new eo(du.a());
        for (dl dl2 : iterable) {
            aq aq2 = aq.a();
            concurrentLinkedQueue.add(aq2);
            dl2.a(new cm(concurrentLinkedQueue, dl2), eo2);
            jn2.c(aq2);
        }
        return jn2.b();
    }

    public static void a(dl dl2, cg cg2) {
        ci.a(dl2, cg2, (Executor)du.a());
    }

    public static void a(dl dl2, cg cg2, Executor executor) {
        com.a.a.b.cl.a(cg2);
        cn cn2 = new cn(dl2, cg2);
        dl2.a(cn2, executor);
    }

    public static Object a(Future future, Class class_) {
        com.a.a.b.cl.a(future);
        com.a.a.b.cl.a(!RuntimeException.class.isAssignableFrom(class_), "Futures.get exception type (%s) must not be a RuntimeException", new Object[]{class_});
        try {
            return future.get();
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw ci.a(class_, (Throwable)interruptedException);
        }
        catch (ExecutionException executionException) {
            ci.a(executionException.getCause(), class_);
            throw new AssertionError();
        }
    }

    public static Object a(Future future, long l2, TimeUnit timeUnit, Class class_) {
        com.a.a.b.cl.a(future);
        com.a.a.b.cl.a((Object)timeUnit);
        com.a.a.b.cl.a(!RuntimeException.class.isAssignableFrom(class_), "Futures.get exception type (%s) must not be a RuntimeException", new Object[]{class_});
        try {
            return future.get(l2, timeUnit);
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw ci.a(class_, (Throwable)interruptedException);
        }
        catch (TimeoutException timeoutException) {
            throw ci.a(class_, (Throwable)timeoutException);
        }
        catch (ExecutionException executionException) {
            ci.a(executionException.getCause(), class_);
            throw new AssertionError();
        }
    }

    private static void a(Throwable throwable, Class class_) {
        if (throwable instanceof Error) {
            throw new bt((Error)throwable);
        }
        if (throwable instanceof RuntimeException) {
            throw new gk(throwable);
        }
        throw ci.a(class_, throwable);
    }

    public static Object a(Future future) {
        com.a.a.b.cl.a(future);
        try {
            return gm.a(future);
        }
        catch (ExecutionException executionException) {
            ci.b(executionException.getCause());
            throw new AssertionError();
        }
    }

    private static void b(Throwable throwable) {
        if (throwable instanceof Error) {
            throw new bt((Error)throwable);
        }
        throw new gk(throwable);
    }

    private static Exception a(Class class_, Throwable throwable) {
        List<Constructor<?>> list = Arrays.asList(class_.getConstructors());
        for (Constructor constructor : ci.a(list)) {
            Exception exception = (Exception)ci.a(constructor, throwable);
            if (exception == null) continue;
            if (exception.getCause() == null) {
                exception.initCause(throwable);
            }
            return exception;
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + class_ + " in response to chained exception", throwable);
    }

    private static List a(List list) {
        return b.a(list);
    }

    private static Object a(Constructor constructor, Throwable throwable) {
        Class<?>[] arrclass = constructor.getParameterTypes();
        Object[] arrobject = new Object[arrclass.length];
        for (int i2 = 0; i2 < arrclass.length; ++i2) {
            Class<?> class_ = arrclass[i2];
            if (class_.equals(String.class)) {
                arrobject[i2] = throwable.toString();
                continue;
            }
            if (class_.equals(Throwable.class)) {
                arrobject[i2] = throwable;
                continue;
            }
            return null;
        }
        try {
            return constructor.newInstance(arrobject);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
        catch (InstantiationException instantiationException) {
            return null;
        }
        catch (IllegalAccessException illegalAccessException) {
            return null;
        }
        catch (InvocationTargetException invocationTargetException) {
            return null;
        }
    }

    private static dl a(jl jl2, boolean bl2, Executor executor) {
        return new cs(jl2, bl2, executor, new cp());
    }
}

