/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.dx;
import com.a.a.c.cu;
import com.a.a.c.cw;
import com.a.a.c.cx;
import com.a.a.c.cz;

final class cv {
    private static final dx a;

    cv() {
    }

    public static cu a() {
        return (cu)a.a();
    }

    static {
        dx dx2;
        try {
            new cz();
            dx2 = new cw();
        }
        catch (Throwable throwable) {
            dx2 = new cx();
        }
        a = dx2;
    }
}

