/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import org.apache.a.i.b.w;

public class ao
extends w {
    private static final String[] c = new String[]{"GET", "POST", "HEAD"};

    protected boolean b(String string) {
        for (String string2 : c) {
            if (!string2.equalsIgnoreCase(string)) continue;
            return true;
        }
        return false;
    }
}

