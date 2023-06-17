/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.a;

import java.util.UUID;
import net.minecraft.e.e;
import net.minecraft.u.a.g;

public class r
implements g {
    @Override
    public int a() {
        return 108;
    }

    @Override
    public e a(e e2) {
        if (e2.b("UUID", 8)) {
            e2.a("UUID", UUID.fromString(e2.l("UUID")));
        }
        return e2;
    }
}

