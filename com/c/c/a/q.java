/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import com.a.b.ab;
import com.a.b.z;
import com.c.c.e.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class q {
    private static final d a = org.apache.logging.log4j.c.c();
    private String b;
    private int c;

    public q(String string) {
        try {
            ab ab2 = new ab();
            z z2 = ab2.a(string).t();
            this.b = com.c.c.e.a.a("errorMsg", z2, "");
            this.c = com.c.c.e.a.a("errorCode", z2, -1);
        }
        catch (Exception exception) {
            a.b("Could not parse RealmsError: " + exception.getMessage());
            a.b("The error was: " + string);
        }
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }
}

