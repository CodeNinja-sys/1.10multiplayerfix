/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a;

import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import org.apache.logging.log4j.core.a.c;
import org.apache.logging.log4j.core.a.i;
import org.apache.logging.log4j.core.a.j;
import org.apache.logging.log4j.core.a.k;
import org.apache.logging.log4j.core.a.l;
import org.apache.logging.log4j.core.a.m;
import org.apache.logging.log4j.core.a.y;
import org.apache.logging.log4j.core.d;
import org.apache.logging.log4j.core.d.b;
import org.apache.logging.log4j.core.d.p;
import org.apache.logging.log4j.core.f;

public final class g
extends c {
    private static final String b = "org.fusesource.jansi.WindowsAnsiOutputStream";
    private static i c = new i(null);

    private g(String string, f f2, d d2, y y2, boolean bl2) {
        super(string, f2, d2, bl2, true, y2);
    }

    public static g a(f f2, d d2, String string, String string2, String string3, String string4) {
        if (string2 == null) {
            h.b("No name provided for ConsoleAppender");
            return null;
        }
        if (f2 == null) {
            f2 = org.apache.logging.log4j.core.g.g.a(null, null, null, null, null);
        }
        boolean bl2 = Boolean.parseBoolean(string3);
        boolean bl3 = org.apache.logging.log4j.core.d.b.a(string4, true);
        m m2 = string == null ? m.a : m.valueOf(string);
        return new g(string2, f2, d2, g.a(bl2, m2, f2), bl3);
    }

    private static y a(boolean bl2, m m2, f f2) {
        String string = m2.name();
        OutputStream outputStream = g.a(bl2, m2);
        return y.a(m2.name() + "." + bl2, new j(outputStream, string, f2), c);
    }

    private static OutputStream a(boolean bl2, m m2) {
        String string = Charset.defaultCharset().name();
        PrintStream printStream = null;
        try {
            printStream = m2 == m.a ? (bl2 ? new PrintStream((OutputStream)new l(), true, string) : System.out) : (bl2 ? new PrintStream((OutputStream)new k(), true, string) : System.err);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new IllegalStateException("Unsupported default encoding " + string, unsupportedEncodingException);
        }
        org.apache.logging.log4j.e.b b2 = org.apache.logging.log4j.e.b.a();
        if (!b2.a("os.name").startsWith("Windows") || b2.b("log4j.skipJansi")) {
            return printStream;
        }
        try {
            ClassLoader classLoader = p.a();
            Class<?> class_ = classLoader.loadClass(b);
            Constructor<?> constructor = class_.getConstructor(OutputStream.class);
            return (OutputStream)constructor.newInstance(printStream);
        }
        catch (ClassNotFoundException classNotFoundException) {
            h.a("Jansi is not installed, cannot find {}", b);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            h.f("{} is missing the proper constructor", b);
        }
        catch (Exception exception) {
            h.f("Unable to instantiate {}", b);
        }
        return printStream;
    }
}

