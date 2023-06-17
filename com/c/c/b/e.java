/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.a.d.ov;
import com.a.b.ab;
import com.a.b.w;
import com.a.b.z;
import com.c.c.b.aa;
import com.c.c.b.d;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.c;

public class e
extends aa {
    private static final org.apache.logging.log4j.d b = c.c();
    public List a = ov.a();

    public static e a(String string) {
        e e2 = new e();
        try {
            ab ab2 = new ab();
            z z2 = ab2.a(string).t();
            if (z2.c("invites").p()) {
                Iterator iterator = z2.c("invites").u().iterator();
                while (iterator.hasNext()) {
                    e2.a.add(d.a(((w)iterator.next()).t()));
                }
            }
        }
        catch (Exception exception) {
            b.b("Could not parse PendingInvitesList: " + exception.getMessage());
        }
        return e2;
    }
}

