/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.b.z;
import com.c.a.e;
import java.io.File;
import net.minecraft.c.b.aa;
import net.minecraft.c.b.b;
import net.minecraft.c.b.x;

public class u
extends b {
    public u(File file) {
        super(file);
    }

    @Override
    protected aa a(z z2) {
        return new x(z2);
    }

    public boolean a(e e2) {
        return this.d(e2);
    }

    @Override
    public String[] b() {
        String[] arrstring = new String[this.c().size()];
        int n2 = 0;
        for (x x2 : this.c().values()) {
            arrstring[n2++] = ((e)x2.c()).b();
        }
        return arrstring;
    }

    protected String b(e e2) {
        return e2.a().toString();
    }

    public e a(String string) {
        for (x x2 : this.c().values()) {
            if (!string.equalsIgnoreCase(((e)x2.c()).b())) continue;
            return (e)x2.c();
        }
        return null;
    }

    @Override
    protected /* synthetic */ String c(Object object) {
        return this.b((e)object);
    }
}

