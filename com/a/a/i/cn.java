/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.ak;
import com.a.a.i.aq;
import com.a.a.i.cc;
import com.a.a.i.ce;
import com.a.a.i.co;
import com.a.a.i.cp;
import com.a.a.i.s;
import com.a.a.i.z;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

public final class cn {
    private cn() {
    }

    public static cc a(URL uRL) {
        return z.a(cn.b(uRL));
    }

    public static s b(URL uRL) {
        return new cp(uRL, null);
    }

    public static cc a(URL uRL, Charset charset) {
        return aq.a(cn.b(uRL, charset));
    }

    public static ak b(URL uRL, Charset charset) {
        return cn.b(uRL).a(charset);
    }

    public static byte[] c(URL uRL) {
        return cn.b(uRL).f();
    }

    public static String c(URL uRL, Charset charset) {
        return cn.b(uRL, charset).d();
    }

    public static Object a(URL uRL, Charset charset, ce ce2) {
        return aq.a(cn.a(uRL, charset), ce2);
    }

    public static List d(URL uRL, Charset charset) {
        return (List)cn.a(uRL, charset, new co());
    }

    public static void a(URL uRL, OutputStream outputStream) {
        cn.b(uRL).a(outputStream);
    }

    public static URL a(String string) {
        ClassLoader classLoader = (ClassLoader)com.a.a.b.cc.b(Thread.currentThread().getContextClassLoader(), cn.class.getClassLoader());
        URL uRL = classLoader.getResource(string);
        cl.a(uRL != null, "resource %s not found.", new Object[]{string});
        return uRL;
    }

    public static URL a(Class class_, String string) {
        URL uRL = class_.getResource(string);
        cl.a(uRL != null, "resource %s relative to %s not found.", new Object[]{string, class_.getName()});
        return uRL;
    }
}

