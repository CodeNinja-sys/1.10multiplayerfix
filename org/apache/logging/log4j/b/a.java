/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.b;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.logging.log4j.a.m;
import org.apache.logging.log4j.a.n;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.f;
import org.apache.logging.log4j.i;

public class a
extends org.apache.logging.log4j.c.a {
    private static final char a = ' ';
    private DateFormat i;
    private b j;
    private final boolean k;
    private final boolean l;
    private PrintStream m;
    private final String n;

    public a(String string, b b2, boolean bl2, boolean bl3, boolean bl4, boolean bl5, String string2, n n2, org.apache.logging.log4j.e.b b3, PrintStream printStream) {
        super(string, n2);
        int n3;
        String string3 = b3.a("org.apache.logging.log4j.simplelog." + string + ".level");
        this.j = org.apache.logging.log4j.b.a(string3, b2);
        this.n = bl3 ? ((n3 = string.lastIndexOf(".")) > 0 && n3 < string.length() ? string.substring(n3 + 1) : string) : (bl2 ? string : null);
        this.k = bl4;
        this.l = bl5;
        this.m = printStream;
        if (bl4) {
            try {
                this.i = new SimpleDateFormat(string2);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                this.i = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS zzz");
            }
        }
    }

    public void a(PrintStream printStream) {
        this.m = printStream;
    }

    public b k() {
        return this.j;
    }

    public void b(b b2) {
        if (b2 != null) {
            this.j = b2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(f f2, String string, b b2, m m2, Throwable throwable) {
        Object object;
        Object object2;
        Object[] arrobject;
        StringBuilder stringBuilder = new StringBuilder();
        if (this.k) {
            arrobject = new Date();
            object2 = this.i;
            synchronized (object2) {
                object = this.i.format((Date)arrobject);
            }
            stringBuilder.append((String)object);
            stringBuilder.append(' ');
        }
        stringBuilder.append(b2.toString());
        stringBuilder.append(' ');
        if (this.n != null && this.n.length() > 0) {
            stringBuilder.append(this.n);
            stringBuilder.append(' ');
        }
        stringBuilder.append(m2.a());
        if (this.l && (arrobject = org.apache.logging.log4j.i.b()).size() > 0) {
            stringBuilder.append(' ');
            stringBuilder.append(arrobject.toString());
            stringBuilder.append(' ');
        }
        arrobject = m2.c();
        object = throwable == null && arrobject != null && arrobject[arrobject.length - 1] instanceof Throwable ? (Throwable)arrobject[arrobject.length - 1] : throwable;
        if (object != null) {
            stringBuilder.append(' ');
            object2 = new ByteArrayOutputStream();
            ((Throwable)object).printStackTrace(new PrintStream((OutputStream)object2));
            stringBuilder.append(((ByteArrayOutputStream)object2).toString());
        }
        this.m.println(stringBuilder.toString());
    }

    @Override
    protected boolean b(b b2, f f2, String string) {
        return this.j.a() >= b2.a();
    }

    @Override
    protected boolean b(b b2, f f2, String string, Throwable throwable) {
        return this.j.a() >= b2.a();
    }

    @Override
    protected boolean c(b b2, f f2, String string, Object ... arrobject) {
        return this.j.a() >= b2.a();
    }

    @Override
    protected boolean b(b b2, f f2, Object object, Throwable throwable) {
        return this.j.a() >= b2.a();
    }

    @Override
    protected boolean b(b b2, f f2, m m2, Throwable throwable) {
        return this.j.a() >= b2.a();
    }
}

