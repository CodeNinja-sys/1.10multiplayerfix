/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.b;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.apache.logging.log4j.a.n;
import org.apache.logging.log4j.b.a;
import org.apache.logging.log4j.c.f;
import org.apache.logging.log4j.d;

public class b
implements f {
    protected static final String a = "yyyy/MM/dd HH:mm:ss:SSS zzz";
    protected static final String b = "org.apache.logging.log4j.simplelog.";
    private final Properties c = new Properties();
    private final org.apache.logging.log4j.e.b d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final String i;
    private final org.apache.logging.log4j.b j;
    private final PrintStream k;
    private final ConcurrentMap l = new ConcurrentHashMap();

    public b() {
        PrintStream printStream;
        this.d = new org.apache.logging.log4j.e.b("log4j2.simplelog.properties");
        this.h = this.d.a("org.apache.logging.log4j.simplelog.showContextMap", false);
        this.e = this.d.a("org.apache.logging.log4j.simplelog.showlogname", false);
        this.f = this.d.a("org.apache.logging.log4j.simplelog.showShortLogname", true);
        this.g = this.d.a("org.apache.logging.log4j.simplelog.showdatetime", false);
        String string = this.d.a("org.apache.logging.log4j.simplelog.level");
        this.j = org.apache.logging.log4j.b.a(string, org.apache.logging.log4j.b.c);
        this.i = this.g ? this.d.a("org.apache.logging.log4j.simplelog.dateTimeFormat", a) : null;
        String string2 = this.d.a("org.apache.logging.log4j.simplelog.logFile", "system.err");
        if ("system.err".equalsIgnoreCase(string2)) {
            printStream = System.err;
        } else if ("system.out".equalsIgnoreCase(string2)) {
            printStream = System.out;
        } else {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(string2);
                printStream = new PrintStream(fileOutputStream);
            }
            catch (FileNotFoundException fileNotFoundException) {
                printStream = System.err;
            }
        }
        this.k = printStream;
    }

    @Override
    public d c(String string) {
        return this.b(string, null);
    }

    @Override
    public d b(String string, n n2) {
        if (this.l.containsKey(string)) {
            d d2 = (d)this.l.get(string);
            org.apache.logging.log4j.c.a.a(d2, n2);
            return d2;
        }
        this.l.putIfAbsent(string, new a(string, this.j, this.e, this.f, this.g, this.h, this.i, n2, this.d, this.k));
        return (d)this.l.get(string);
    }

    @Override
    public boolean b(String string) {
        return false;
    }

    @Override
    public Object c() {
        return null;
    }
}

