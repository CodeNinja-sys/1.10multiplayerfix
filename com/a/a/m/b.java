/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.b.cl;
import com.a.a.b.cm;
import com.a.a.b.dg;
import com.a.a.d.gd;
import com.a.a.d.jt;
import com.a.a.d.lo;
import com.a.a.d.lp;
import com.a.a.d.sz;
import com.a.a.m.c;
import com.a.a.m.d;
import com.a.a.m.f;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;

public final class b {
    private static final Logger a = Logger.getLogger(b.class.getName());
    private static final cm b = new c();
    private static final dg c = dg.a(" ").a();
    private static final String d = ".class";
    private final lo e;

    private b(lo lo2) {
        this.e = lo2;
    }

    public static b a(ClassLoader classLoader) {
        f f2 = new f();
        for (Map.Entry entry : com.a.a.m.b.b(classLoader).e()) {
            f2.a((URI)entry.getKey(), (ClassLoader)entry.getValue());
        }
        return new b(f2.a());
    }

    public lo a() {
        return this.e;
    }

    public lo b() {
        return gd.a(this.e).a(d.class).h();
    }

    public lo c() {
        return gd.a(this.e).a(d.class).a(b).h();
    }

    public lo a(String string) {
        cl.a(string);
        lp lp2 = lo.k();
        for (d d2 : this.c()) {
            if (!d2.a().equals(string)) continue;
            lp2.c(d2);
        }
        return lp2.b();
    }

    public lo b(String string) {
        cl.a(string);
        String string2 = string + '.';
        lp lp2 = lo.k();
        for (d d2 : this.c()) {
            if (!d2.c().startsWith(string2)) continue;
            lp2.c(d2);
        }
        return lp2.b();
    }

    static jt b(ClassLoader classLoader) {
        LinkedHashMap linkedHashMap = sz.d();
        ClassLoader classLoader2 = classLoader.getParent();
        if (classLoader2 != null) {
            linkedHashMap.putAll(com.a.a.m.b.b(classLoader2));
        }
        if (classLoader instanceof URLClassLoader) {
            URLClassLoader uRLClassLoader = (URLClassLoader)classLoader;
            for (URL uRL : uRLClassLoader.getURLs()) {
                URI uRI;
                try {
                    uRI = uRL.toURI();
                }
                catch (URISyntaxException uRISyntaxException) {
                    throw new IllegalArgumentException(uRISyntaxException);
                }
                if (linkedHashMap.containsKey(uRI)) continue;
                linkedHashMap.put(uRI, classLoader);
            }
        }
        return jt.b(linkedHashMap);
    }

    static String c(String string) {
        int n2 = string.length() - d.length();
        return string.substring(0, n2).replace('/', '.');
    }

    static /* synthetic */ Logger d() {
        return a;
    }

    static /* synthetic */ dg e() {
        return c;
    }
}

