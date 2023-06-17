/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.ab;
import com.a.b.z;
import com.c.c.b.aa;
import com.c.c.e.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class n
extends aa {
    private static final d b = c.c();
    public String a;

    public static n a(String string) {
        ab ab2 = new ab();
        n n2 = new n();
        try {
            z z2 = ab2.a(string).t();
            n2.a = com.c.c.e.a.a("address", z2, null);
        }
        catch (Exception exception) {
            b.b("Could not parse McoServerAddress: " + exception.getMessage());
        }
        return n2;
    }
}

