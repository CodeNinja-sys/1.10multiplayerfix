/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.b;

import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.b.f;
import org.apache.logging.log4j.core.config.ab;
import org.apache.logging.log4j.core.config.v;
import org.apache.logging.log4j.core.h;

public class d
extends v {
    private f b;

    public d() {
    }

    public d(String string, b b2, boolean bl2) {
        super(string, b2, bl2);
    }

    protected d(String string, List list, org.apache.logging.log4j.core.d d2, b b2, boolean bl2, ab[] arrab, org.apache.logging.log4j.core.config.d d3, boolean bl3) {
        super(string, list, d2, b2, bl2, arrab, d3, bl3);
    }

    @Override
    protected void a(h h2) {
        h2.c();
        h2.f();
        this.b.a(h2);
    }

    void c(h h2) {
        super.a(h2);
    }

    @Override
    public void aZ_() {
        if (this.b == null) {
            this.b = new f(this);
        } else {
            f.a();
        }
        super.aZ_();
    }

    @Override
    public void ba_() {
        f.b();
        super.ba_();
    }

    public static v a(String string, String string2, String string3, String string4, org.apache.logging.log4j.core.config.b[] arrb, ab[] arrab, org.apache.logging.log4j.core.config.d d2, org.apache.logging.log4j.core.d d3) {
        b b2;
        if (string3 == null) {
            a.b("Loggers cannot be configured without a name");
            return null;
        }
        List<org.apache.logging.log4j.core.config.b> list = Arrays.asList(arrb);
        try {
            b2 = org.apache.logging.log4j.b.a(string2, org.apache.logging.log4j.b.c);
        }
        catch (Exception exception) {
            a.b("Invalid Log level specified: {}. Defaulting to Error", string2);
            b2 = org.apache.logging.log4j.b.c;
        }
        String string5 = string3.equals("root") ? "" : string3;
        boolean bl2 = org.apache.logging.log4j.core.d.b.a(string, true);
        return new d(string5, list, d3, b2, bl2, arrab, d2, d.a(string4));
    }

    protected static boolean a(String string) {
        return Boolean.parseBoolean(string);
    }
}

