/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.b;

import com.a.b.ab;
import com.a.b.w;
import com.a.b.z;
import com.c.c.b.aa;
import com.c.c.b.ac;
import com.c.c.e.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ae
extends aa {
    private static final d e = org.apache.logging.log4j.c.c();
    public List a;
    public int b;
    public int c;
    public int d;

    public ae() {
    }

    public ae(ae ae2) {
        this.a(ae2);
    }

    public void a(ae ae2) {
        this.a = new ArrayList(ae2.a == null ? new ArrayList() : ae2.a);
        this.b = ae2.b;
        this.c = ae2.c;
        this.d = ae2.d;
    }

    public boolean a() {
        boolean bl2 = this.b * this.c >= this.d && this.b > 0 && this.d > 0 && this.c > 0;
        return bl2;
    }

    public static ae a(String string) {
        ae ae2 = new ae();
        ae2.a = new ArrayList();
        try {
            ab ab2 = new ab();
            z z2 = ab2.a(string).t();
            if (z2.c("templates").p()) {
                Iterator iterator = z2.c("templates").u().iterator();
                while (iterator.hasNext()) {
                    ae2.a.add(ac.a(((w)iterator.next()).t()));
                }
            }
            ae2.b = com.c.c.e.a.a("page", z2, 0);
            ae2.c = com.c.c.e.a.a("size", z2, 0);
            ae2.d = com.c.c.e.a.a("total", z2, 0);
        }
        catch (Exception exception) {
            e.b("Could not parse WorldTemplatePaginatedList: " + exception.getMessage());
        }
        return ae2;
    }
}

