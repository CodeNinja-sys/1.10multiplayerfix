/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.o;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import org.apache.a.ag;
import org.apache.a.n;
import org.apache.a.n.f;
import org.apache.a.o.a;
import org.apache.a.o.c;
import org.apache.a.o.d;
import org.apache.a.x;

public final class g {
    private g() {
    }

    public static void a(n n2) {
        try {
            g.b(n2);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public static void b(n n2) {
        InputStream inputStream;
        if (n2 == null) {
            return;
        }
        if (n2.g() && (inputStream = n2.f()) != null) {
            inputStream.close();
        }
    }

    public static void a(x x2, n n2) {
        a.a(x2, "Response");
        g.b(x2.b());
        x2.a(n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] c(n n2) {
        a.a(n2, "Entity");
        InputStream inputStream = n2.f();
        if (inputStream == null) {
            return null;
        }
        try {
            int n3;
            a.a(n2.c() <= Integer.MAX_VALUE, "HTTP entity too large to be buffered in memory");
            int n4 = (int)n2.c();
            if (n4 < 0) {
                n4 = 4096;
            }
            c c2 = new c(n4);
            byte[] arrby = new byte[4096];
            while ((n3 = inputStream.read(arrby)) != -1) {
                c2.a(arrby, 0, n3);
            }
            byte[] arrby2 = c2.b();
            return arrby2;
        }
        finally {
            inputStream.close();
        }
    }

    public static String d(n n2) {
        ag ag2;
        org.apache.a.g[] arrg;
        a.a(n2, "Entity");
        String string = null;
        if (n2.d() != null && (arrg = n2.d().e()).length > 0 && (ag2 = arrg[0].a("charset")) != null) {
            string = ag2.b();
        }
        return string;
    }

    public static String e(n n2) {
        org.apache.a.g[] arrg;
        a.a(n2, "Entity");
        String string = null;
        if (n2.d() != null && (arrg = n2.d().e()).length > 0) {
            string = arrg[0].a();
        }
        return string;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String a(n n2, Charset charset) {
        a.a(n2, "Entity");
        InputStream inputStream = n2.f();
        if (inputStream == null) {
            return null;
        }
        try {
            int n3;
            Object object;
            a.a(n2.c() <= Integer.MAX_VALUE, "HTTP entity too large to be buffered in memory");
            int n4 = (int)n2.c();
            if (n4 < 0) {
                n4 = 4096;
            }
            Charset charset2 = null;
            try {
                object = org.apache.a.h.g.a(n2);
                if (object != null) {
                    charset2 = ((org.apache.a.h.g)object).b();
                }
            }
            catch (UnsupportedCharsetException unsupportedCharsetException) {
                throw new UnsupportedEncodingException(unsupportedCharsetException.getMessage());
            }
            if (charset2 == null) {
                charset2 = charset;
            }
            if (charset2 == null) {
                charset2 = f.t;
            }
            object = new InputStreamReader(inputStream, charset2);
            d d2 = new d(n4);
            char[] arrc = new char[1024];
            while ((n3 = ((Reader)object).read(arrc)) != -1) {
                d2.a(arrc, 0, n3);
            }
            String string = d2.toString();
            return string;
        }
        finally {
            inputStream.close();
        }
    }

    public static String a(n n2, String string) {
        return g.a(n2, string != null ? Charset.forName(string) : null);
    }

    public static String f(n n2) {
        return g.a(n2, (Charset)null);
    }
}

