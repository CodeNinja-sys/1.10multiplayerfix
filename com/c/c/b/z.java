/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.ab;
import com.c.c.e.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class z {
    private static final d a = org.apache.logging.log4j.c.c();
    private boolean b;
    private String c = "";
    private String d = "";
    private int e;

    public static z a(String string) {
        z z2 = new z();
        try {
            ab ab2 = new ab();
            com.a.b.z z3 = ab2.a(string).t();
            z2.b = com.c.c.e.a.a("worldClosed", z3, false);
            z2.c = com.c.c.e.a.a("token", z3, null);
            z2.d = com.c.c.e.a.a("uploadEndpoint", z3, null);
            z2.e = com.c.c.e.a.a("port", z3, 8080);
        }
        catch (Exception exception) {
            a.b("Could not parse UploadInfo: " + exception.getMessage());
        }
        return z2;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }

    public boolean c() {
        return this.b;
    }

    public void b(String string) {
        this.c = string;
    }

    public int d() {
        return this.e;
    }
}

