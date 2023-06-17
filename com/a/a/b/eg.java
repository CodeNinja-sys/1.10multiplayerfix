/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.b;

import com.a.a.b.cl;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class eg {
    private eg() {
    }

    public static void a(Throwable throwable, Class class_) {
        if (throwable != null && class_.isInstance(throwable)) {
            throw (Throwable)class_.cast(throwable);
        }
    }

    public static void a(Throwable throwable) {
        eg.a(throwable, Error.class);
        eg.a(throwable, RuntimeException.class);
    }

    public static void b(Throwable throwable, Class class_) {
        eg.a(throwable, class_);
        eg.a(throwable);
    }

    public static void a(Throwable throwable, Class class_, Class class_2) {
        cl.a(class_2);
        eg.a(throwable, class_);
        eg.b(throwable, class_2);
    }

    public static RuntimeException b(Throwable throwable) {
        eg.a((Throwable)cl.a(throwable));
        throw new RuntimeException(throwable);
    }

    public static Throwable c(Throwable throwable) {
        Throwable throwable2;
        while ((throwable2 = throwable.getCause()) != null) {
            throwable = throwable2;
        }
        return throwable;
    }

    public static List d(Throwable throwable) {
        cl.a(throwable);
        ArrayList<Throwable> arrayList = new ArrayList<Throwable>(4);
        while (throwable != null) {
            arrayList.add(throwable);
            throwable = throwable.getCause();
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String e(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}

