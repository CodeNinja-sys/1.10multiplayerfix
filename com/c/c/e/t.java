/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.e;

import com.a.a.c.ab;
import net.minecraft.s.b;

final class t
extends ab {
    t() {
    }

    public String a(String string) {
        String string2 = b.a(string);
        if (string2 == null) {
            throw new Exception("Couldn't get username");
        }
        return string2;
    }
}

