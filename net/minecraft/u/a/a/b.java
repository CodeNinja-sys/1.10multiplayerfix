/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import com.a.b.aa;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.e.y;
import net.minecraft.u.a.a.n;
import net.minecraft.u.a.g;
import net.minecraft.u.bw;
import net.minecraft.u.d.a;
import net.minecraft.u.d.k;

public class b
implements g {
    @Override
    public int a() {
        return 165;
    }

    @Override
    public e a(e e2) {
        e e3;
        if ("minecraft:written_book".equals(e2.l("id")) && (e3 = e2.o("tag")).b("pages", 9)) {
            q q2 = e3.c("pages", 8);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                String string = q2.g(i2);
                a a2 = null;
                if (!"null".equals(string) && !bw.b(string)) {
                    if (string.charAt(0) == '\"' && string.charAt(string.length() - 1) == '\"' || string.charAt(0) == '{' && string.charAt(string.length() - 1) == '}') {
                        try {
                            a2 = (a)n.a.a(string, a.class);
                            if (a2 == null) {
                                a2 = new k("");
                            }
                        }
                        catch (aa aa2) {
                            // empty catch block
                        }
                        if (a2 == null) {
                            try {
                                a2 = net.minecraft.u.d.b.a(string);
                            }
                            catch (aa aa3) {
                                // empty catch block
                            }
                        }
                        if (a2 == null) {
                            try {
                                a2 = net.minecraft.u.d.b.b(string);
                            }
                            catch (aa aa4) {
                                // empty catch block
                            }
                        }
                        if (a2 == null) {
                            a2 = new k(string);
                        }
                    } else {
                        a2 = new k(string);
                    }
                } else {
                    a2 = new k("");
                }
                q2.a(i2, new y(net.minecraft.u.d.b.a(a2)));
            }
            e3.a("pages", q2);
        }
        return e2;
    }
}

