/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.b.z;
import java.io.File;
import net.minecraft.c.b.aa;
import net.minecraft.c.b.b;
import net.minecraft.c.b.e;

public class af
extends b {
    public af(File file) {
        super(file);
    }

    @Override
    protected aa a(z z2) {
        return new e(z2);
    }

    @Override
    public String[] b() {
        String[] arrstring = new String[this.c().size()];
        int n2 = 0;
        for (e e2 : this.c().values()) {
            arrstring[n2++] = ((com.c.a.e)e2.c()).b();
        }
        return arrstring;
    }

    protected String a(com.c.a.e e2) {
        return e2.a().toString();
    }

    public com.c.a.e a(String string) {
        for (e e2 : this.c().values()) {
            if (!string.equalsIgnoreCase(((com.c.a.e)e2.c()).b())) continue;
            return (com.c.a.e)e2.c();
        }
        return null;
    }

    @Override
    protected /* synthetic */ String c(Object object) {
        return this.a((com.c.a.e)object);
    }
}

