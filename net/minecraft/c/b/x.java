/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.b.z;
import com.c.a.e;
import java.util.Date;
import java.util.UUID;
import net.minecraft.c.b.ac;

public class x
extends ac {
    public x(e e2) {
        this(e2, null, null, null, null);
    }

    public x(e e2, Date date, String string, Date date2, String string2) {
        super(e2, date2, string, date2, string2);
    }

    public x(z z2) {
        super(x.b(z2), z2);
    }

    @Override
    protected void a(z z2) {
        if (this.c() != null) {
            z2.a("uuid", ((e)this.c()).a() == null ? "" : ((e)this.c()).a().toString());
            z2.a("name", ((e)this.c()).b());
            super.a(z2);
        }
    }

    private static e b(z z2) {
        if (z2.b("uuid") && z2.b("name")) {
            UUID uUID;
            String string = z2.c("uuid").d();
            try {
                uUID = UUID.fromString(string);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new e(uUID, z2.c("name").d());
        }
        return null;
    }
}

