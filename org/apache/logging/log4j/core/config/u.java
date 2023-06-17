/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import java.io.File;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.config.f;
import org.apache.logging.log4j.core.config.h;
import org.apache.logging.log4j.core.config.r;

public class u
extends f {
    public static final String[] g = new String[]{".json", ".jsn"};
    private static String[] h = new String[]{"com.fasterxml.jackson.databind.ObjectMapper", "com.fasterxml.jackson.databind.JsonNode", "com.fasterxml.jackson.core.JsonParser"};
    private final File i = null;
    private boolean j;

    public u() {
        try {
            for (String string : h) {
                Class.forName(string);
            }
        }
        catch (ClassNotFoundException classNotFoundException) {
            c.a("Missing dependencies for Json support");
            this.j = false;
            return;
        }
        this.j = true;
    }

    @Override
    protected boolean d() {
        return this.j;
    }

    @Override
    public d a(h h2) {
        if (!this.j) {
            return null;
        }
        return new r(h2);
    }

    @Override
    public String[] c() {
        return g;
    }
}

