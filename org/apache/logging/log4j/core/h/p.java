/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.h;

import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.h.g;

public class p
implements g {
    @Override
    public String a(String string) {
        try {
            return System.getProperty(string);
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public String a(h h2, String string) {
        try {
            return System.getProperty(string);
        }
        catch (Exception exception) {
            return null;
        }
    }
}

