/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import com.a.b.aa;
import com.a.b.k;
import com.a.b.r;
import java.lang.reflect.Type;
import net.minecraft.e.e;
import net.minecraft.u.a.a.o;
import net.minecraft.u.a.g;
import net.minecraft.u.bw;
import net.minecraft.u.d.a;
import net.minecraft.u.d.b;

public class n
implements g {
    public static final k a = new r().a((Type)((Object)a.class), (Object)new o()).i();

    @Override
    public int a() {
        return 101;
    }

    @Override
    public e a(e e2) {
        if ("Sign".equals(e2.l("id"))) {
            this.a(e2, "Text1");
            this.a(e2, "Text2");
            this.a(e2, "Text3");
            this.a(e2, "Text4");
        }
        return e2;
    }

    private void a(e e2, String string) {
        String string2 = e2.l(string);
        a a2 = null;
        if (!"null".equals(string2) && !bw.b(string2)) {
            if (string2.charAt(0) == '\"' && string2.charAt(string2.length() - 1) == '\"' || string2.charAt(0) == '{' && string2.charAt(string2.length() - 1) == '}') {
                try {
                    a2 = (a)a.a(string2, a.class);
                    if (a2 == null) {
                        a2 = new net.minecraft.u.d.k("");
                    }
                }
                catch (aa aa2) {
                    // empty catch block
                }
                if (a2 == null) {
                    try {
                        a2 = b.a(string2);
                    }
                    catch (aa aa3) {
                        // empty catch block
                    }
                }
                if (a2 == null) {
                    try {
                        a2 = b.b(string2);
                    }
                    catch (aa aa4) {
                        // empty catch block
                    }
                }
                if (a2 == null) {
                    a2 = new net.minecraft.u.d.k(string2);
                }
            } else {
                a2 = new net.minecraft.u.d.k(string2);
            }
        } else {
            a2 = new net.minecraft.u.d.k("");
        }
        e2.a(string, b.a(a2));
    }
}

