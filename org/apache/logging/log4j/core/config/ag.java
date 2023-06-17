/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import org.apache.logging.log4j.core.config.ad;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.config.f;
import org.apache.logging.log4j.core.config.h;

public class ag
extends f {
    public static final String[] g = new String[]{".xml", "*"};

    @Override
    public d a(h h2) {
        return new ad(h2);
    }

    @Override
    public String[] c() {
        return g;
    }
}

