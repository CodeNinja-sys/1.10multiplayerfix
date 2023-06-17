/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.c;

import java.net.URL;
import java.util.Properties;

public class i {
    private static final Integer a = -1;
    private static final String b = "FactoryPriority";
    private static final String c = "ThreadContextMap";
    private static final String d = "LoggerContextFactory";
    private final Integer e;
    private final String f;
    private final String g;
    private final URL h;

    public i(Properties properties, URL uRL) {
        this.h = uRL;
        String string = properties.getProperty(b);
        this.e = string == null ? a : Integer.valueOf(string);
        this.f = properties.getProperty(d);
        this.g = properties.getProperty(c);
    }

    public Integer a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.g;
    }

    public URL d() {
        return this.h;
    }
}

