/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.ab;
import com.a.b.w;
import com.a.b.z;
import com.c.c.b.aa;
import com.c.c.b.ac;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ad
extends aa {
    private static final d b = c.c();
    public List a;

    public static ad a(String string) {
        ad ad2 = new ad();
        ad2.a = new ArrayList();
        try {
            ab ab2 = new ab();
            z z2 = ab2.a(string).t();
            if (z2.c("templates").p()) {
                Iterator iterator = z2.c("templates").u().iterator();
                while (iterator.hasNext()) {
                    ad2.a.add(ac.a(((w)iterator.next()).t()));
                }
            }
        }
        catch (Exception exception) {
            b.b("Could not parse WorldTemplateList: " + exception.getMessage());
        }
        return ad2;
    }
}

