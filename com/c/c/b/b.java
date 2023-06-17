/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.ab;
import com.a.b.w;
import com.c.c.b.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class b {
    private static final d b = c.c();
    public List a;

    public static b a(String string) {
        ab ab2 = new ab();
        b b2 = new b();
        b2.a = new ArrayList();
        try {
            w w2 = ab2.a(string).t().c("backups");
            if (w2.p()) {
                Iterator iterator = w2.u().iterator();
                while (iterator.hasNext()) {
                    b2.a.add(com.c.c.b.a.a((w)iterator.next()));
                }
            }
        }
        catch (Exception exception) {
            b.b("Could not parse BackupList: " + exception.getMessage());
        }
        return b2;
    }
}

