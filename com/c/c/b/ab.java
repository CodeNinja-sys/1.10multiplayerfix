/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.z;
import com.c.c.e.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ab {
    private static final d d = org.apache.logging.log4j.c.c();
    public String a;
    public String b;
    public String c;

    public static ab a(String string) {
        com.a.b.ab ab2 = new com.a.b.ab();
        z z2 = ab2.a(string).t();
        ab ab3 = new ab();
        try {
            ab3.a = com.c.c.e.a.a("downloadLink", z2, "");
            ab3.b = com.c.c.e.a.a("resourcePackUrl", z2, "");
            ab3.c = com.c.c.e.a.a("resourcePackHash", z2, "");
        }
        catch (Exception exception) {
            d.b("Could not parse WorldDownload: " + exception.getMessage());
        }
        return ab3;
    }
}

