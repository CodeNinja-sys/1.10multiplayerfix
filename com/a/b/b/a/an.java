/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.ap;
import com.a.b.b.a.ao;
import com.a.b.c.a;
import com.a.b.k;
import java.sql.Timestamp;
import java.util.Date;

final class an
implements ap {
    an() {
    }

    public com.a.b.an a(k k2, a a2) {
        if (a2.a() != Timestamp.class) {
            return null;
        }
        com.a.b.an an2 = k2.a(Date.class);
        return new ao(this, an2);
    }
}

