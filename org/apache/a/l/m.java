/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.l;

import java.nio.charset.CodingErrorAction;
import org.apache.a.ac;
import org.apache.a.ak;
import org.apache.a.l.d;
import org.apache.a.l.j;
import org.apache.a.n.f;
import org.apache.a.o.a;

public final class m
implements d {
    private m() {
    }

    public static String a(j j2) {
        a.a(j2, "HTTP parameters");
        String string = (String)j2.a("http.protocol.element-charset");
        if (string == null) {
            string = f.u.name();
        }
        return string;
    }

    public static void a(j j2, String string) {
        a.a(j2, "HTTP parameters");
        j2.a("http.protocol.element-charset", string);
    }

    public static String b(j j2) {
        a.a(j2, "HTTP parameters");
        String string = (String)j2.a("http.protocol.content-charset");
        if (string == null) {
            string = f.t.name();
        }
        return string;
    }

    public static void b(j j2, String string) {
        a.a(j2, "HTTP parameters");
        j2.a("http.protocol.content-charset", string);
    }

    public static ak c(j j2) {
        a.a(j2, "HTTP parameters");
        Object object = j2.a("http.protocol.version");
        if (object == null) {
            return ac.d;
        }
        return (ak)object;
    }

    public static void a(j j2, ak ak2) {
        a.a(j2, "HTTP parameters");
        j2.a("http.protocol.version", ak2);
    }

    public static String d(j j2) {
        a.a(j2, "HTTP parameters");
        return (String)j2.a("http.useragent");
    }

    public static void c(j j2, String string) {
        a.a(j2, "HTTP parameters");
        j2.a("http.useragent", string);
    }

    public static boolean e(j j2) {
        a.a(j2, "HTTP parameters");
        return j2.a("http.protocol.expect-continue", false);
    }

    public static void a(j j2, boolean bl2) {
        a.a(j2, "HTTP parameters");
        j2.b("http.protocol.expect-continue", bl2);
    }

    public static CodingErrorAction f(j j2) {
        a.a(j2, "HTTP parameters");
        Object object = j2.a("http.malformed.input.action");
        if (object == null) {
            return CodingErrorAction.REPORT;
        }
        return (CodingErrorAction)object;
    }

    public static void a(j j2, CodingErrorAction codingErrorAction) {
        a.a(j2, "HTTP parameters");
        j2.a("http.malformed.input.action", codingErrorAction);
    }

    public static CodingErrorAction g(j j2) {
        a.a(j2, "HTTP parameters");
        Object object = j2.a("http.unmappable.input.action");
        if (object == null) {
            return CodingErrorAction.REPORT;
        }
        return (CodingErrorAction)object;
    }

    public static void b(j j2, CodingErrorAction codingErrorAction) {
        a.a(j2, "HTTP parameters");
        j2.a("http.unmappable.input.action", codingErrorAction);
    }
}

