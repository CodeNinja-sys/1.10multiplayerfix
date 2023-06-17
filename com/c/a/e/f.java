/*
 * Decompiled with CFR 0.150.
 */
package com.c.a.e;

import com.a.a.b.dw;
import com.a.a.d.aad;
import com.a.a.d.mq;
import com.c.a.a;
import com.c.a.e;
import com.c.a.e.b;
import com.c.a.e.c;
import com.c.a.g;
import com.c.a.i;
import java.util.HashSet;
import java.util.List;
import org.apache.logging.log4j.d;

public class f
implements com.c.a.f {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final String b = "https://api.mojang.com/";
    private static final String c = "https://api.mojang.com/profiles/";
    private static final int d = 2;
    private static final int e = 3;
    private static final int f = 100;
    private static final int g = 750;
    private final c h;

    public f(c c2) {
        this.h = c2;
    }

    @Override
    public void a(String[] arrstring, a a2, i i2) {
        HashSet hashSet = aad.a();
        for (String string : arrstring) {
            if (dw.c(string)) continue;
            hashSet.add(string.toLowerCase());
        }
        int n2 = 0;
        for (List list : mq.a((Iterable)hashSet, 2)) {
            boolean bl2;
            int n3 = 0;
            do {
                bl2 = false;
                try {
                    com.c.a.e.b.e e2 = (com.c.a.e.b.e)this.h.a(com.c.a.g.a(c + a2.a().toLowerCase()), list, com.c.a.e.b.e.class);
                    n3 = 0;
                    a.a("Page {} returned {} results, parsing", n2, e2.a().length);
                    HashSet hashSet2 = aad.b(list);
                    for (e e3 : e2.a()) {
                        a.a("Successfully looked up profile {}", e3);
                        hashSet2.remove(e3.b().toLowerCase());
                        i2.a(e3);
                    }
                    Object object = hashSet2.iterator();
                    while (object.hasNext()) {
                        String string = (String)object.next();
                        a.a("Couldn't find profile {}", string);
                        i2.a(new e(null, string), new b("Server did not find the requested profile"));
                    }
                    try {
                        Thread.sleep(100L);
                    }
                    catch (InterruptedException interruptedException) {}
                }
                catch (com.c.a.a.a a3) {
                    if (++n3 == 3) {
                        for (Object object : list) {
                            a.a("Couldn't find profile {} because of a server error", object);
                            i2.a(new e(null, (String)object), a3);
                        }
                        continue;
                    }
                    try {
                        Thread.sleep(750L);
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                    bl2 = true;
                }
            } while (bl2);
        }
    }
}

