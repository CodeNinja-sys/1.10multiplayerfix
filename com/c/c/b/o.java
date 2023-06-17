/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.ab;
import com.a.b.t;
import com.a.b.w;
import com.a.b.z;
import com.c.c.b.aa;
import com.c.c.b.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class o
extends aa {
    private static final d b = c.c();
    public List a;

    public static o a(String string) {
        o o2 = new o();
        o2.a = new ArrayList();
        try {
            ab ab2 = new ab();
            z z2 = ab2.a(string).t();
            if (z2.c("servers").p()) {
                t t2 = z2.c("servers").u();
                Iterator iterator = t2.iterator();
                while (iterator.hasNext()) {
                    o2.a.add(i.a(((w)iterator.next()).t()));
                }
            }
        }
        catch (Exception exception) {
            b.b("Could not parse McoServerList: " + exception.getMessage());
        }
        return o2;
    }
}

