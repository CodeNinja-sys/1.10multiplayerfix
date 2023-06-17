/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.b.z;
import java.util.UUID;
import net.minecraft.c.b.aa;

public class e
extends aa {
    public e(com.c.a.e e2) {
        super(e2);
    }

    public e(z z2) {
        super(e.b(z2), z2);
    }

    @Override
    protected void a(z z2) {
        if (this.c() != null) {
            z2.a("uuid", ((com.c.a.e)this.c()).a() == null ? "" : ((com.c.a.e)this.c()).a().toString());
            z2.a("name", ((com.c.a.e)this.c()).b());
            super.a(z2);
        }
    }

    private static com.c.a.e b(z z2) {
        if (z2.b("uuid") && z2.b("name")) {
            UUID uUID;
            String string = z2.c("uuid").d();
            try {
                uUID = UUID.fromString(string);
            }
            catch (Throwable throwable) {
                return null;
            }
            return new com.c.a.e(uUID, z2.c("name").d());
        }
        return null;
    }
}

