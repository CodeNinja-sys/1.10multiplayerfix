/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.h;

import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.h.g;

public class c
implements g {
    @Override
    public String a(String string) {
        return System.getenv(string);
    }

    @Override
    public String a(h h2, String string) {
        return System.getenv(string);
    }
}

