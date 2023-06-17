/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.ab;
import com.a.b.z;
import com.c.c.b.aa;
import com.c.c.b.y;
import com.c.c.e.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class x
extends aa {
    private static final d d = org.apache.logging.log4j.c.c();
    public long a;
    public int b;
    public y c = y.a;

    public static x a(String string) {
        x x2 = new x();
        try {
            ab ab2 = new ab();
            z z2 = ab2.a(string).t();
            x2.a = com.c.c.e.a.a("startDate", z2, 0L);
            x2.b = com.c.c.e.a.a("daysLeft", z2, 0);
            x2.c = x.b(com.c.c.e.a.a("subscriptionType", z2, y.a.name()));
        }
        catch (Exception exception) {
            d.b("Could not parse Subscription: " + exception.getMessage());
        }
        return x2;
    }

    private static y b(String string) {
        try {
            return y.valueOf(string);
        }
        catch (Exception exception) {
            return y.a;
        }
    }
}

