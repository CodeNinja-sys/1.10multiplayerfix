/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.b.z;
import com.c.a.e;
import java.io.File;
import net.minecraft.c.b.aa;
import net.minecraft.c.b.b;
import net.minecraft.c.b.g;

public class q
extends b {
    public q(File file) {
        super(file);
    }

    @Override
    protected aa a(z z2) {
        return new g(z2);
    }

    @Override
    public String[] b() {
        String[] arrstring = new String[this.c().size()];
        int n2 = 0;
        for (g g2 : this.c().values()) {
            arrstring[n2++] = ((e)g2.c()).b();
        }
        return arrstring;
    }

    public int a(e e2) {
        g g2 = (g)this.a((Object)e2);
        return g2 != null ? g2.a() : 0;
    }

    public boolean b(e e2) {
        g g2 = (g)this.a((Object)e2);
        return g2 != null ? g2.b() : false;
    }

    protected String c(e e2) {
        return e2.a().toString();
    }

    public e a(String string) {
        for (g g2 : this.c().values()) {
            if (!string.equalsIgnoreCase(((e)g2.c()).b())) continue;
            return (e)g2.c();
        }
        return null;
    }
}

