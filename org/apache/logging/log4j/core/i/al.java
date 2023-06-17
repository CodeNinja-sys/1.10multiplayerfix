/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import org.apache.logging.log4j.core.i.ak;

class al
extends ak {
    private final int a;

    public al(int n2) {
        this.a = n2 < 1 ? 1 : n2;
    }

    @Override
    public String b(String string) {
        int n2 = string.length() - 1;
        for (int i2 = this.a; i2 > 0; --i2) {
            if ((n2 = string.lastIndexOf(46, n2 - 1)) != -1) continue;
            return string;
        }
        return string.substring(n2 + 1);
    }
}

