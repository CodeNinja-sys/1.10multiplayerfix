/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.f;

import java.util.List;
import javax.management.ObjectName;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.config.v;
import org.apache.logging.log4j.core.d.a;
import org.apache.logging.log4j.core.f.f;
import org.apache.logging.log4j.core.f.i;

public class e
implements f {
    private final String b;
    private final v c;
    private final ObjectName d;

    public e(String string, v v2) {
        this.b = (String)a.a(string, "contextName");
        this.c = (v)a.a(v2, "loggerConfig");
        try {
            String string2 = i.a(this.b);
            String string3 = i.a(v2.d());
            String string4 = String.format("org.apache.logging.log4j2:type=LoggerContext,ctx=%s,sub=LoggerConfig,name=%s", string2, string3);
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
        return this.c.d();
    }

    @Override
    public String c() {
        return this.c.i().name();
    }

    @Override
    public void a(String string) {
        this.c.a(org.apache.logging.log4j.b.valueOf(string));
    }

    @Override
    public boolean d() {
        return this.c.k();
    }

    @Override
    public void a(boolean bl2) {
        this.c.a(bl2);
    }

    @Override
    public boolean e() {
        return this.c.l();
    }

    @Override
    public String f() {
        return String.valueOf(this.c.aY_());
    }

    @Override
    public String[] g() {
        List list = this.c.h();
        String[] arrstring = new String[list.size()];
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            arrstring[i2] = ((org.apache.logging.log4j.core.config.b)list.get(i2)).a();
        }
        return arrstring;
    }
}

