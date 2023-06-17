/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.z;
import com.c.c.b.aa;
import com.c.c.e.a;
import java.util.Date;
import org.apache.logging.log4j.c;

public class d
extends aa {
    private static final org.apache.logging.log4j.d f = org.apache.logging.log4j.c.c();
    public String a;
    public String b;
    public String c;
    public String d;
    public Date e;

    public static d a(z z2) {
        d d2 = new d();
        try {
            d2.a = com.c.c.e.a.a("invitationId", z2, "");
            d2.b = com.c.c.e.a.a("worldName", z2, "");
            d2.c = com.c.c.e.a.a("worldOwnerName", z2, "");
            d2.d = com.c.c.e.a.a("worldOwnerUuid", z2, "");
            d2.e = com.c.c.e.a.a("date", z2);
        }
        catch (Exception exception) {
            f.b("Could not parse PendingInvite: " + exception.getMessage());
        }
        return d2;
    }
}

