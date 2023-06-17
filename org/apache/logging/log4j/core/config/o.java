/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.config.c;
import org.apache.logging.log4j.core.config.v;
import org.apache.logging.log4j.core.g.g;

public class o
extends c {
    public static final String i = "Default";
    public static final String j = "org.apache.logging.log4j.level";

    public o() {
        this.b(i);
        g g2 = org.apache.logging.log4j.core.g.g.a("%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n", null, null, null, null);
        org.apache.logging.log4j.core.a.g g3 = org.apache.logging.log4j.core.a.g.a(g2, null, "SYSTEM_OUT", "Console", "false", "true");
        g3.e();
        this.a(g3);
        v v2 = this.o();
        v2.a(g3, null, null);
        String string = org.apache.logging.log4j.e.b.a().a(j);
        b b2 = string != null && org.apache.logging.log4j.b.valueOf(string) != null ? org.apache.logging.log4j.b.valueOf(string) : org.apache.logging.log4j.b.c;
        v2.a(b2);
    }

    @Override
    protected void i() {
    }
}

