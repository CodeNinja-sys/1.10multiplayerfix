/*
 * Decompiled with CFR 0.150.
 */
package com.a.b.b.a;

import com.a.b.b.a.an;
import com.a.b.d.a;
import com.a.b.d.e;
import java.sql.Timestamp;
import java.util.Date;

class ao
extends com.a.b.an {
    final /* synthetic */ com.a.b.an a;
    final /* synthetic */ an b;

    ao(an an2, com.a.b.an an3) {
        this.b = an2;
        this.a = an3;
    }

    public Timestamp b(a a2) {
        Date date = (Date)this.a.a(a2);
        return date != null ? new Timestamp(date.getTime()) : null;
    }

    public void a(e e2, Timestamp timestamp) {
        this.a.a(e2, (Object)timestamp);
    }

    public /* synthetic */ Object a(a a2) {
        return this.b(a2);
    }
}

