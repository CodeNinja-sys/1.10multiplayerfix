/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.b.z;
import java.util.Date;
import net.minecraft.c.b.ac;

public class c
extends ac {
    public c(String string) {
        this(string, null, null, null, null);
    }

    public c(String string, Date date, String string2, Date date2, String string3) {
        super(string, date, string2, date2, string3);
    }

    public c(z z2) {
        super(net.minecraft.c.b.c.b(z2), z2);
    }

    private static String b(z z2) {
        return z2.b("ip") ? z2.c("ip").d() : null;
    }

    @Override
    protected void a(z z2) {
        if (this.c() != null) {
            z2.a("ip", (String)this.c());
            super.a(z2);
        }
    }
}

