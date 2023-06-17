/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.f;

import javax.management.ObjectName;
import org.apache.logging.log4j.core.b;
import org.apache.logging.log4j.core.f.i;

public class a
implements org.apache.logging.log4j.core.f.b {
    private final String b;
    private final b c;
    private final ObjectName d;

    public a(String string, b b2) {
        this.b = (String)org.apache.logging.log4j.core.d.a.a(string, "contextName");
        this.c = (b)org.apache.logging.log4j.core.d.a.a(b2, "appender");
        try {
            String string2 = i.a(this.b);
            String string3 = i.a(b2.a());
            String string4 = String.format("org.apache.logging.log4j2:type=LoggerContext,ctx=%s,sub=Appender,name=%s", string2, string3);
            this.d = new ObjectName(string4);
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception);
        }
    }

    public ObjectName a() {
        return this.d;
    }

    @Override
    public String b() {
        return this.c.a();
    }

    @Override
    public String c() {
        return String.valueOf(this.c.b());
    }

    @Override
    public boolean d() {
        return this.c.c();
    }

    @Override
    public String e() {
        return String.valueOf(this.c.d());
    }
}

